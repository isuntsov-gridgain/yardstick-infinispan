// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/yardstickframework/infinispan/protobuf/person.proto

package org.yardstickframework.infinispan.protobuf;

public final class PersonProtobuf {
  private PersonProtobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PersonOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 id = 1;
    /**
     * <code>required int32 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required int32 id = 1;</code>
     */
    int getId();

    // optional int32 ordId = 2;
    /**
     * <code>optional int32 ordId = 2;</code>
     */
    boolean hasOrdId();
    /**
     * <code>optional int32 ordId = 2;</code>
     */
    int getOrdId();

    // required string firstName = 3;
    /**
     * <code>required string firstName = 3;</code>
     */
    boolean hasFirstName();
    /**
     * <code>required string firstName = 3;</code>
     */
    java.lang.String getFirstName();
    /**
     * <code>required string firstName = 3;</code>
     */
    com.google.protobuf.ByteString
        getFirstNameBytes();

    // required string lastName = 4;
    /**
     * <code>required string lastName = 4;</code>
     */
    boolean hasLastName();
    /**
     * <code>required string lastName = 4;</code>
     */
    java.lang.String getLastName();
    /**
     * <code>required string lastName = 4;</code>
     */
    com.google.protobuf.ByteString
        getLastNameBytes();

    // required double salary = 5;
    /**
     * <code>required double salary = 5;</code>
     */
    boolean hasSalary();
    /**
     * <code>required double salary = 5;</code>
     */
    double getSalary();
  }
  /**
   * Protobuf type {@code org.yardstickframework.infinispan.Person}
   */
  public static final class Person extends
      com.google.protobuf.GeneratedMessage
      implements PersonOrBuilder {
    // Use Person.newBuilder() to construct.
    private Person(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Person(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Person defaultInstance;
    public static Person getDefaultInstance() {
      return defaultInstance;
    }

    public Person getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Person(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              ordId_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              firstName_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              lastName_ = input.readBytes();
              break;
            }
            case 41: {
              bitField0_ |= 0x00000010;
              salary_ = input.readDouble();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.yardstickframework.infinispan.protobuf.PersonProtobuf.internal_static_org_yardstickframework_infinispan_Person_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.yardstickframework.infinispan.protobuf.PersonProtobuf.internal_static_org_yardstickframework_infinispan_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person.class, org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person.Builder.class);
    }

    public static com.google.protobuf.Parser<Person> PARSER =
        new com.google.protobuf.AbstractParser<Person>() {
      public Person parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Person(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Person> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>required int32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    // optional int32 ordId = 2;
    public static final int ORDID_FIELD_NUMBER = 2;
    private int ordId_;
    /**
     * <code>optional int32 ordId = 2;</code>
     */
    public boolean hasOrdId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 ordId = 2;</code>
     */
    public int getOrdId() {
      return ordId_;
    }

    // required string firstName = 3;
    public static final int FIRSTNAME_FIELD_NUMBER = 3;
    private java.lang.Object firstName_;
    /**
     * <code>required string firstName = 3;</code>
     */
    public boolean hasFirstName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string firstName = 3;</code>
     */
    public java.lang.String getFirstName() {
      java.lang.Object ref = firstName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          firstName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string firstName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string lastName = 4;
    public static final int LASTNAME_FIELD_NUMBER = 4;
    private java.lang.Object lastName_;
    /**
     * <code>required string lastName = 4;</code>
     */
    public boolean hasLastName() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string lastName = 4;</code>
     */
    public java.lang.String getLastName() {
      java.lang.Object ref = lastName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          lastName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string lastName = 4;</code>
     */
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      java.lang.Object ref = lastName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required double salary = 5;
    public static final int SALARY_FIELD_NUMBER = 5;
    private double salary_;
    /**
     * <code>required double salary = 5;</code>
     */
    public boolean hasSalary() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required double salary = 5;</code>
     */
    public double getSalary() {
      return salary_;
    }

    private void initFields() {
      id_ = 0;
      ordId_ = 0;
      firstName_ = "";
      lastName_ = "";
      salary_ = 0D;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFirstName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLastName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSalary()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, ordId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getFirstNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getLastNameBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeDouble(5, salary_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, ordId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getFirstNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getLastNameBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(5, salary_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.yardstickframework.infinispan.Person}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.yardstickframework.infinispan.protobuf.PersonProtobuf.PersonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.yardstickframework.infinispan.protobuf.PersonProtobuf.internal_static_org_yardstickframework_infinispan_Person_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.yardstickframework.infinispan.protobuf.PersonProtobuf.internal_static_org_yardstickframework_infinispan_Person_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person.class, org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person.Builder.class);
      }

      // Construct using org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        ordId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        firstName_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        lastName_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        salary_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.yardstickframework.infinispan.protobuf.PersonProtobuf.internal_static_org_yardstickframework_infinispan_Person_descriptor;
      }

      public org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person getDefaultInstanceForType() {
        return org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person.getDefaultInstance();
      }

      public org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person build() {
        org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person buildPartial() {
        org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person result = new org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.ordId_ = ordId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.firstName_ = firstName_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.lastName_ = lastName_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.salary_ = salary_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person) {
          return mergeFrom((org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person other) {
        if (other == org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasOrdId()) {
          setOrdId(other.getOrdId());
        }
        if (other.hasFirstName()) {
          bitField0_ |= 0x00000004;
          firstName_ = other.firstName_;
          onChanged();
        }
        if (other.hasLastName()) {
          bitField0_ |= 0x00000008;
          lastName_ = other.lastName_;
          onChanged();
        }
        if (other.hasSalary()) {
          setSalary(other.getSalary());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (!hasFirstName()) {
          
          return false;
        }
        if (!hasLastName()) {
          
          return false;
        }
        if (!hasSalary()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.yardstickframework.infinispan.protobuf.PersonProtobuf.Person) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 id = 1;
      private int id_ ;
      /**
       * <code>required int32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      // optional int32 ordId = 2;
      private int ordId_ ;
      /**
       * <code>optional int32 ordId = 2;</code>
       */
      public boolean hasOrdId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 ordId = 2;</code>
       */
      public int getOrdId() {
        return ordId_;
      }
      /**
       * <code>optional int32 ordId = 2;</code>
       */
      public Builder setOrdId(int value) {
        bitField0_ |= 0x00000002;
        ordId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 ordId = 2;</code>
       */
      public Builder clearOrdId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        ordId_ = 0;
        onChanged();
        return this;
      }

      // required string firstName = 3;
      private java.lang.Object firstName_ = "";
      /**
       * <code>required string firstName = 3;</code>
       */
      public boolean hasFirstName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string firstName = 3;</code>
       */
      public java.lang.String getFirstName() {
        java.lang.Object ref = firstName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          firstName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string firstName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getFirstNameBytes() {
        java.lang.Object ref = firstName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          firstName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string firstName = 3;</code>
       */
      public Builder setFirstName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        firstName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string firstName = 3;</code>
       */
      public Builder clearFirstName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        firstName_ = getDefaultInstance().getFirstName();
        onChanged();
        return this;
      }
      /**
       * <code>required string firstName = 3;</code>
       */
      public Builder setFirstNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        firstName_ = value;
        onChanged();
        return this;
      }

      // required string lastName = 4;
      private java.lang.Object lastName_ = "";
      /**
       * <code>required string lastName = 4;</code>
       */
      public boolean hasLastName() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string lastName = 4;</code>
       */
      public java.lang.String getLastName() {
        java.lang.Object ref = lastName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          lastName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string lastName = 4;</code>
       */
      public com.google.protobuf.ByteString
          getLastNameBytes() {
        java.lang.Object ref = lastName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lastName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string lastName = 4;</code>
       */
      public Builder setLastName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        lastName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string lastName = 4;</code>
       */
      public Builder clearLastName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        lastName_ = getDefaultInstance().getLastName();
        onChanged();
        return this;
      }
      /**
       * <code>required string lastName = 4;</code>
       */
      public Builder setLastNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        lastName_ = value;
        onChanged();
        return this;
      }

      // required double salary = 5;
      private double salary_ ;
      /**
       * <code>required double salary = 5;</code>
       */
      public boolean hasSalary() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required double salary = 5;</code>
       */
      public double getSalary() {
        return salary_;
      }
      /**
       * <code>required double salary = 5;</code>
       */
      public Builder setSalary(double value) {
        bitField0_ |= 0x00000010;
        salary_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double salary = 5;</code>
       */
      public Builder clearSalary() {
        bitField0_ = (bitField0_ & ~0x00000010);
        salary_ = 0D;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:org.yardstickframework.infinispan.Person)
    }

    static {
      defaultInstance = new Person(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:org.yardstickframework.infinispan.Person)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_org_yardstickframework_infinispan_Person_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_yardstickframework_infinispan_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7org/yardstickframework/infinispan/prot" +
      "obuf/person.proto\022!org.yardstickframewor" +
      "k.infinispan\"X\n\006Person\022\n\n\002id\030\001 \002(\005\022\r\n\005or" +
      "dId\030\002 \001(\005\022\021\n\tfirstName\030\003 \002(\t\022\020\n\010lastName" +
      "\030\004 \002(\t\022\016\n\006salary\030\005 \002(\001B<\n*org.yardstickf" +
      "ramework.infinispan.protobufB\016PersonProt" +
      "obuf"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_org_yardstickframework_infinispan_Person_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_org_yardstickframework_infinispan_Person_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_org_yardstickframework_infinispan_Person_descriptor,
              new java.lang.String[] { "Id", "OrdId", "FirstName", "LastName", "Salary", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
