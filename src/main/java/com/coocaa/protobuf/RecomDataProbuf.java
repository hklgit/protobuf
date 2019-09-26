// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nrtrecommend.proto

package com.coocaa.protobuf;

public final class RecomDataProbuf {
  private RecomDataProbuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RecoDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RecoData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string did = 1;</code>
     */
    boolean hasDid();
    /**
     * <code>required string did = 1;</code>
     */
    String getDid();
    /**
     * <code>required string did = 1;</code>
     */
    com.google.protobuf.ByteString
        getDidBytes();

    /**
     * <code>required string data = 2;</code>
     */
    boolean hasData();
    /**
     * <code>required string data = 2;</code>
     */
    String getData();
    /**
     * <code>required string data = 2;</code>
     */
    com.google.protobuf.ByteString
        getDataBytes();

    /**
     * <code>optional .RecoData.Category type = 3 [default = MOVIE];</code>
     */
    boolean hasType();
    /**
     * <code>optional .RecoData.Category type = 3 [default = MOVIE];</code>
     */
    RecomDataProbuf.RecoData.Category getType();
  }
  /**
   * Protobuf type {@code RecoData}
   */
  public  static final class RecoData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RecoData)
      RecoDataOrBuilder {
    // Use RecoData.newBuilder() to construct.
    private RecoData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RecoData() {
      did_ = "";
      data_ = "";
      type_ = 0;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RecoData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              did_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              data_ = bs;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              RecomDataProbuf.RecoData.Category value = RecomDataProbuf.RecoData.Category.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                type_ = rawValue;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RecomDataProbuf.internal_static_RecoData_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RecomDataProbuf.internal_static_RecoData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RecomDataProbuf.RecoData.class, RecomDataProbuf.RecoData.Builder.class);
    }

    /**
     * Protobuf enum {@code RecoData.Category}
     */
    public enum Category
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>MOVIE = 0;</code>
       */
      MOVIE(0),
      /**
       * <code>TV = 1;</code>
       */
      TV(1),
      /**
       * <code>CHILDREN = 2;</code>
       */
      CHILDREN(2),
      ;

      /**
       * <code>MOVIE = 0;</code>
       */
      public static final int MOVIE_VALUE = 0;
      /**
       * <code>TV = 1;</code>
       */
      public static final int TV_VALUE = 1;
      /**
       * <code>CHILDREN = 2;</code>
       */
      public static final int CHILDREN_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @Deprecated
      public static Category valueOf(int value) {
        return forNumber(value);
      }

      public static Category forNumber(int value) {
        switch (value) {
          case 0: return MOVIE;
          case 1: return TV;
          case 2: return CHILDREN;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Category>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Category> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Category>() {
              public Category findValueByNumber(int number) {
                return Category.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return RecomDataProbuf.RecoData.getDescriptor().getEnumTypes().get(0);
      }

      private static final Category[] VALUES = values();

      public static Category valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Category(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:RecoData.Category)
    }

    private int bitField0_;
    public static final int DID_FIELD_NUMBER = 1;
    private volatile Object did_;
    /**
     * <code>required string did = 1;</code>
     */
    public boolean hasDid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string did = 1;</code>
     */
    public String getDid() {
      Object ref = did_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          did_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string did = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDidBytes() {
      Object ref = did_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        did_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DATA_FIELD_NUMBER = 2;
    private volatile Object data_;
    /**
     * <code>required string data = 2;</code>
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string data = 2;</code>
     */
    public String getData() {
      Object ref = data_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          data_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string data = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      Object ref = data_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <code>optional .RecoData.Category type = 3 [default = MOVIE];</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .RecoData.Category type = 3 [default = MOVIE];</code>
     */
    public RecomDataProbuf.RecoData.Category getType() {
      RecomDataProbuf.RecoData.Category result = RecomDataProbuf.RecoData.Category.valueOf(type_);
      return result == null ? RecomDataProbuf.RecoData.Category.MOVIE : result;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasDid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasData()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, did_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, data_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, type_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, did_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, data_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RecomDataProbuf.RecoData)) {
        return super.equals(obj);
      }
      RecomDataProbuf.RecoData other = (RecomDataProbuf.RecoData) obj;

      boolean result = true;
      result = result && (hasDid() == other.hasDid());
      if (hasDid()) {
        result = result && getDid()
            .equals(other.getDid());
      }
      result = result && (hasData() == other.hasData());
      if (hasData()) {
        result = result && getData()
            .equals(other.getData());
      }
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && type_ == other.type_;
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasDid()) {
        hash = (37 * hash) + DID_FIELD_NUMBER;
        hash = (53 * hash) + getDid().hashCode();
      }
      if (hasData()) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
      }
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + type_;
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RecomDataProbuf.RecoData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RecomDataProbuf.RecoData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RecomDataProbuf.RecoData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RecomDataProbuf.RecoData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RecomDataProbuf.RecoData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RecomDataProbuf.RecoData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RecomDataProbuf.RecoData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RecomDataProbuf.RecoData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RecomDataProbuf.RecoData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RecomDataProbuf.RecoData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RecomDataProbuf.RecoData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RecomDataProbuf.RecoData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RecomDataProbuf.RecoData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RecoData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RecoData)
        RecomDataProbuf.RecoDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RecomDataProbuf.internal_static_RecoData_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RecomDataProbuf.internal_static_RecoData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RecomDataProbuf.RecoData.class, RecomDataProbuf.RecoData.Builder.class);
      }

      // Construct using com.coocaa.protobuf.RecomDataProbuf.RecoData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        did_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        data_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RecomDataProbuf.internal_static_RecoData_descriptor;
      }

      public RecomDataProbuf.RecoData getDefaultInstanceForType() {
        return RecomDataProbuf.RecoData.getDefaultInstance();
      }

      public RecomDataProbuf.RecoData build() {
        RecomDataProbuf.RecoData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public RecomDataProbuf.RecoData buildPartial() {
        RecomDataProbuf.RecoData result = new RecomDataProbuf.RecoData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.did_ = did_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.data_ = data_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RecomDataProbuf.RecoData) {
          return mergeFrom((RecomDataProbuf.RecoData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RecomDataProbuf.RecoData other) {
        if (other == RecomDataProbuf.RecoData.getDefaultInstance()) return this;
        if (other.hasDid()) {
          bitField0_ |= 0x00000001;
          did_ = other.did_;
          onChanged();
        }
        if (other.hasData()) {
          bitField0_ |= 0x00000002;
          data_ = other.data_;
          onChanged();
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasDid()) {
          return false;
        }
        if (!hasData()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RecomDataProbuf.RecoData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RecomDataProbuf.RecoData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object did_ = "";
      /**
       * <code>required string did = 1;</code>
       */
      public boolean hasDid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string did = 1;</code>
       */
      public String getDid() {
        Object ref = did_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            did_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string did = 1;</code>
       */
      public com.google.protobuf.ByteString
          getDidBytes() {
        Object ref = did_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          did_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string did = 1;</code>
       */
      public Builder setDid(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        did_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string did = 1;</code>
       */
      public Builder clearDid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        did_ = getDefaultInstance().getDid();
        onChanged();
        return this;
      }
      /**
       * <code>required string did = 1;</code>
       */
      public Builder setDidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        did_ = value;
        onChanged();
        return this;
      }

      private Object data_ = "";
      /**
       * <code>required string data = 2;</code>
       */
      public boolean hasData() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string data = 2;</code>
       */
      public String getData() {
        Object ref = data_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            data_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string data = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDataBytes() {
        Object ref = data_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          data_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string data = 2;</code>
       */
      public Builder setData(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string data = 2;</code>
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000002);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      /**
       * <code>required string data = 2;</code>
       */
      public Builder setDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        data_ = value;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>optional .RecoData.Category type = 3 [default = MOVIE];</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .RecoData.Category type = 3 [default = MOVIE];</code>
       */
      public RecomDataProbuf.RecoData.Category getType() {
        RecomDataProbuf.RecoData.Category result = RecomDataProbuf.RecoData.Category.valueOf(type_);
        return result == null ? RecomDataProbuf.RecoData.Category.MOVIE : result;
      }
      /**
       * <code>optional .RecoData.Category type = 3 [default = MOVIE];</code>
       */
      public Builder setType(RecomDataProbuf.RecoData.Category value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .RecoData.Category type = 3 [default = MOVIE];</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RecoData)
    }

    // @@protoc_insertion_point(class_scope:RecoData)
    private static final RecomDataProbuf.RecoData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RecomDataProbuf.RecoData();
    }

    public static RecomDataProbuf.RecoData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<RecoData>
        PARSER = new com.google.protobuf.AbstractParser<RecoData>() {
      public RecoData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new RecoData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RecoData> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RecoData> getParserForType() {
      return PARSER;
    }

    public RecomDataProbuf.RecoData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RecoData_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RecoData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\022nrtrecommend.proto\"{\n\010RecoData\022\013\n\003did\030" +
      "\001 \002(\t\022\014\n\004data\030\002 \002(\t\022\'\n\004type\030\003 \001(\0162\022.Reco" +
      "Data.Category:\005MOVIE\"+\n\010Category\022\t\n\005MOVI" +
      "E\020\000\022\006\n\002TV\020\001\022\014\n\010CHILDREN\020\002B&\n\023com.coocaa." +
      "protobufB\017RecomDataProbuf"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_RecoData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RecoData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RecoData_descriptor,
        new String[] { "Did", "Data", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
