/*
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package org.yardstickframework.infinispan;

import org.infinispan.*;
import org.infinispan.client.hotrod.*;
import org.infinispan.query.*;
import org.infinispan.query.Search;
import org.infinispan.query.dsl.*;
import org.yardstickframework.*;
import org.yardstickframework.infinispan.protobuf.*;
import org.yardstickframework.infinispan.querymodel.*;
import org.yardstickframework.infinispan.util.*;

import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

import static org.yardstickframework.BenchmarkUtils.*;

/**
 * Infinispan benchmark that performs query operations.
 */
public class InfinispanSqlQueryBenchmark extends InfinispanAbstractBenchmark {
    /** Number of threads that populate the cache for query test. */
    private static final int POPULATE_QUERY_THREAD_NUM = Runtime.getRuntime().availableProcessors() * 2;

    /** */
    public InfinispanSqlQueryBenchmark() {
        super("queryCache");
    }

    /** {@inheritDoc} */
    @Override public void setUp(final BenchmarkConfiguration cfg) throws Exception {
        super.setUp(cfg);

        println(cfg, "Populating query data...");

        long start = System.nanoTime();

        final AtomicInteger cnt = new AtomicInteger(0);

        // Populate persons.
        InfinispanBenchmarkUtils.runMultiThreaded(new InfinispanBenchmarkRunnable() {
            @Override public void run(int threadIdx) throws Exception {
                for (int i = threadIdx; i < args.range() && !Thread.currentThread().isInterrupted();
                     i += POPULATE_QUERY_THREAD_NUM) {
                    cache.put(i, createPerson(i, "firstName" + i, "lastName" + i, i * 1000));

                    int populatedPersons = cnt.incrementAndGet();

                    if (populatedPersons % 100000 == 0)
                        println(cfg, "Populated persons: " + populatedPersons);
                }
            }
        }, POPULATE_QUERY_THREAD_NUM, "populate-query-person");

        println(cfg, "Finished populating query data in " + ((System.nanoTime() - start) / 1_000_000) + "ms.");
    }

    /** {@inheritDoc} */
    @Override public void test() throws Exception {
        double salary = ThreadLocalRandom.current().nextDouble() * args.range() * 1000;

        double maxSalary = salary + 1000;

        if (args.clientMode()) {
            QueryFactory qf = org.infinispan.client.hotrod.Search.getQueryFactory((RemoteCache<Object, Object>)cache);

            Query qry = qf.from(PersonProtobuf.Person.class).having("salary").
                between(salary, maxSalary).toBuilder().build();

            for (PersonProtobuf.Person p : qry.<PersonProtobuf.Person>list()) {
                if (p.getSalary() < salary || p.getSalary() > maxSalary)
                    throw new Exception("Invalid person retrieved [min=" + salary + ", max=" + maxSalary +
                        ", person=" + p + ']');
            }
        }
        else {
            SearchManager searchMgr = Search.getSearchManager((Cache<Object, Object>)cache);

            QueryFactory qf = searchMgr.getQueryFactory();

            Query qry = qf.from(Person.class).having("salary").between(salary, maxSalary).toBuilder().build();

            for (Person p : qry.<Person>list()) {
                if (p.getSalary() < salary || p.getSalary() > maxSalary)
                    throw new Exception("Invalid person retrieved [min=" + salary + ", max=" + maxSalary +
                        ", person=" + p + ']');
            }
        }
    }

    /**
     * @param id Id.
     * @param firstName First name.
     * @param lastName Last name.
     * @param salary Salary.
     * @return Person.
     */
    private Object createPerson(int id, String firstName, String lastName, double salary) {
        if (args.clientMode())
            return PersonProtobuf.Person.newBuilder().
                setId(id).
                setFirstName(firstName).
                setLastName(lastName).
                setSalary(salary).
                build();
        else
            return new Person(id, firstName, lastName, salary);
    }
}
