// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

/**
 * Protobuf type {@code com.github.jtendermint.jabci.types.Evidence}
 */
public  final class Evidence extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.jtendermint.jabci.types.Evidence)
    EvidenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Evidence.newBuilder() to construct.
  private Evidence(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Evidence() {
    type_ = "";
    height_ = 0L;
    totalVotingPower_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Evidence(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 18: {
            com.github.jtendermint.jabci.types.Validator.Builder subBuilder = null;
            if (validator_ != null) {
              subBuilder = validator_.toBuilder();
            }
            validator_ = input.readMessage(com.github.jtendermint.jabci.types.Validator.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(validator_);
              validator_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            height_ = input.readInt64();
            break;
          }
          case 34: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (time_ != null) {
              subBuilder = time_.toBuilder();
            }
            time_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(time_);
              time_ = subBuilder.buildPartial();
            }

            break;
          }
          case 40: {

            totalVotingPower_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_Evidence_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_Evidence_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.jtendermint.jabci.types.Evidence.class, com.github.jtendermint.jabci.types.Evidence.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 1;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATOR_FIELD_NUMBER = 2;
  private com.github.jtendermint.jabci.types.Validator validator_;
  /**
   * <code>.com.github.jtendermint.jabci.types.Validator validator = 2;</code>
   */
  public boolean hasValidator() {
    return validator_ != null;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.Validator validator = 2;</code>
   */
  public com.github.jtendermint.jabci.types.Validator getValidator() {
    return validator_ == null ? com.github.jtendermint.jabci.types.Validator.getDefaultInstance() : validator_;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.Validator validator = 2;</code>
   */
  public com.github.jtendermint.jabci.types.ValidatorOrBuilder getValidatorOrBuilder() {
    return getValidator();
  }

  public static final int HEIGHT_FIELD_NUMBER = 3;
  private long height_;
  /**
   * <code>int64 height = 3;</code>
   */
  public long getHeight() {
    return height_;
  }

  public static final int TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp time_;
  /**
   * <code>.google.protobuf.Timestamp time = 4;</code>
   */
  public boolean hasTime() {
    return time_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp time = 4;</code>
   */
  public com.google.protobuf.Timestamp getTime() {
    return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
  }
  /**
   * <code>.google.protobuf.Timestamp time = 4;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
    return getTime();
  }

  public static final int TOTAL_VOTING_POWER_FIELD_NUMBER = 5;
  private long totalVotingPower_;
  /**
   * <code>int64 total_voting_power = 5;</code>
   */
  public long getTotalVotingPower() {
    return totalVotingPower_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (validator_ != null) {
      output.writeMessage(2, getValidator());
    }
    if (height_ != 0L) {
      output.writeInt64(3, height_);
    }
    if (time_ != null) {
      output.writeMessage(4, getTime());
    }
    if (totalVotingPower_ != 0L) {
      output.writeInt64(5, totalVotingPower_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (validator_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValidator());
    }
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, height_);
    }
    if (time_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getTime());
    }
    if (totalVotingPower_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, totalVotingPower_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.jtendermint.jabci.types.Evidence)) {
      return super.equals(obj);
    }
    com.github.jtendermint.jabci.types.Evidence other = (com.github.jtendermint.jabci.types.Evidence) obj;

    boolean result = true;
    result = result && getType()
        .equals(other.getType());
    result = result && (hasValidator() == other.hasValidator());
    if (hasValidator()) {
      result = result && getValidator()
          .equals(other.getValidator());
    }
    result = result && (getHeight()
        == other.getHeight());
    result = result && (hasTime() == other.hasTime());
    if (hasTime()) {
      result = result && getTime()
          .equals(other.getTime());
    }
    result = result && (getTotalVotingPower()
        == other.getTotalVotingPower());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (hasValidator()) {
      hash = (37 * hash) + VALIDATOR_FIELD_NUMBER;
      hash = (53 * hash) + getValidator().hashCode();
    }
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    if (hasTime()) {
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
    }
    hash = (37 * hash) + TOTAL_VOTING_POWER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalVotingPower());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.jtendermint.jabci.types.Evidence parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.Evidence parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.Evidence parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.Evidence parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.Evidence parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.Evidence parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.Evidence parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.Evidence parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.Evidence parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.Evidence parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.Evidence parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.Evidence parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.jtendermint.jabci.types.Evidence prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.github.jtendermint.jabci.types.Evidence}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.jtendermint.jabci.types.Evidence)
      com.github.jtendermint.jabci.types.EvidenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_Evidence_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_Evidence_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.jtendermint.jabci.types.Evidence.class, com.github.jtendermint.jabci.types.Evidence.Builder.class);
    }

    // Construct using com.github.jtendermint.jabci.types.Evidence.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = "";

      if (validatorBuilder_ == null) {
        validator_ = null;
      } else {
        validator_ = null;
        validatorBuilder_ = null;
      }
      height_ = 0L;

      if (timeBuilder_ == null) {
        time_ = null;
      } else {
        time_ = null;
        timeBuilder_ = null;
      }
      totalVotingPower_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_Evidence_descriptor;
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.Evidence getDefaultInstanceForType() {
      return com.github.jtendermint.jabci.types.Evidence.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.Evidence build() {
      com.github.jtendermint.jabci.types.Evidence result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.Evidence buildPartial() {
      com.github.jtendermint.jabci.types.Evidence result = new com.github.jtendermint.jabci.types.Evidence(this);
      result.type_ = type_;
      if (validatorBuilder_ == null) {
        result.validator_ = validator_;
      } else {
        result.validator_ = validatorBuilder_.build();
      }
      result.height_ = height_;
      if (timeBuilder_ == null) {
        result.time_ = time_;
      } else {
        result.time_ = timeBuilder_.build();
      }
      result.totalVotingPower_ = totalVotingPower_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.jtendermint.jabci.types.Evidence) {
        return mergeFrom((com.github.jtendermint.jabci.types.Evidence)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.jtendermint.jabci.types.Evidence other) {
      if (other == com.github.jtendermint.jabci.types.Evidence.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (other.hasValidator()) {
        mergeValidator(other.getValidator());
      }
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.hasTime()) {
        mergeTime(other.getTime());
      }
      if (other.getTotalVotingPower() != 0L) {
        setTotalVotingPower(other.getTotalVotingPower());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.jtendermint.jabci.types.Evidence parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.jtendermint.jabci.types.Evidence) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 1;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private com.github.jtendermint.jabci.types.Validator validator_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.Validator, com.github.jtendermint.jabci.types.Validator.Builder, com.github.jtendermint.jabci.types.ValidatorOrBuilder> validatorBuilder_;
    /**
     * <code>.com.github.jtendermint.jabci.types.Validator validator = 2;</code>
     */
    public boolean hasValidator() {
      return validatorBuilder_ != null || validator_ != null;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.Validator validator = 2;</code>
     */
    public com.github.jtendermint.jabci.types.Validator getValidator() {
      if (validatorBuilder_ == null) {
        return validator_ == null ? com.github.jtendermint.jabci.types.Validator.getDefaultInstance() : validator_;
      } else {
        return validatorBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.Validator validator = 2;</code>
     */
    public Builder setValidator(com.github.jtendermint.jabci.types.Validator value) {
      if (validatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        validator_ = value;
        onChanged();
      } else {
        validatorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.Validator validator = 2;</code>
     */
    public Builder setValidator(
        com.github.jtendermint.jabci.types.Validator.Builder builderForValue) {
      if (validatorBuilder_ == null) {
        validator_ = builderForValue.build();
        onChanged();
      } else {
        validatorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.Validator validator = 2;</code>
     */
    public Builder mergeValidator(com.github.jtendermint.jabci.types.Validator value) {
      if (validatorBuilder_ == null) {
        if (validator_ != null) {
          validator_ =
            com.github.jtendermint.jabci.types.Validator.newBuilder(validator_).mergeFrom(value).buildPartial();
        } else {
          validator_ = value;
        }
        onChanged();
      } else {
        validatorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.Validator validator = 2;</code>
     */
    public Builder clearValidator() {
      if (validatorBuilder_ == null) {
        validator_ = null;
        onChanged();
      } else {
        validator_ = null;
        validatorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.Validator validator = 2;</code>
     */
    public com.github.jtendermint.jabci.types.Validator.Builder getValidatorBuilder() {
      
      onChanged();
      return getValidatorFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.Validator validator = 2;</code>
     */
    public com.github.jtendermint.jabci.types.ValidatorOrBuilder getValidatorOrBuilder() {
      if (validatorBuilder_ != null) {
        return validatorBuilder_.getMessageOrBuilder();
      } else {
        return validator_ == null ?
            com.github.jtendermint.jabci.types.Validator.getDefaultInstance() : validator_;
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.Validator validator = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.Validator, com.github.jtendermint.jabci.types.Validator.Builder, com.github.jtendermint.jabci.types.ValidatorOrBuilder> 
        getValidatorFieldBuilder() {
      if (validatorBuilder_ == null) {
        validatorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.jtendermint.jabci.types.Validator, com.github.jtendermint.jabci.types.Validator.Builder, com.github.jtendermint.jabci.types.ValidatorOrBuilder>(
                getValidator(),
                getParentForChildren(),
                isClean());
        validator_ = null;
      }
      return validatorBuilder_;
    }

    private long height_ ;
    /**
     * <code>int64 height = 3;</code>
     */
    public long getHeight() {
      return height_;
    }
    /**
     * <code>int64 height = 3;</code>
     */
    public Builder setHeight(long value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 height = 3;</code>
     */
    public Builder clearHeight() {
      
      height_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp time_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public boolean hasTime() {
      return timeBuilder_ != null || time_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public com.google.protobuf.Timestamp getTime() {
      if (timeBuilder_ == null) {
        return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      } else {
        return timeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public Builder setTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        time_ = value;
        onChanged();
      } else {
        timeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public Builder setTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeBuilder_ == null) {
        time_ = builderForValue.build();
        onChanged();
      } else {
        timeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public Builder mergeTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (time_ != null) {
          time_ =
            com.google.protobuf.Timestamp.newBuilder(time_).mergeFrom(value).buildPartial();
        } else {
          time_ = value;
        }
        onChanged();
      } else {
        timeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public Builder clearTime() {
      if (timeBuilder_ == null) {
        time_ = null;
        onChanged();
      } else {
        time_ = null;
        timeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeBuilder() {
      
      onChanged();
      return getTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
      if (timeBuilder_ != null) {
        return timeBuilder_.getMessageOrBuilder();
      } else {
        return time_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeFieldBuilder() {
      if (timeBuilder_ == null) {
        timeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTime(),
                getParentForChildren(),
                isClean());
        time_ = null;
      }
      return timeBuilder_;
    }

    private long totalVotingPower_ ;
    /**
     * <code>int64 total_voting_power = 5;</code>
     */
    public long getTotalVotingPower() {
      return totalVotingPower_;
    }
    /**
     * <code>int64 total_voting_power = 5;</code>
     */
    public Builder setTotalVotingPower(long value) {
      
      totalVotingPower_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 total_voting_power = 5;</code>
     */
    public Builder clearTotalVotingPower() {
      
      totalVotingPower_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.github.jtendermint.jabci.types.Evidence)
  }

  // @@protoc_insertion_point(class_scope:com.github.jtendermint.jabci.types.Evidence)
  private static final com.github.jtendermint.jabci.types.Evidence DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.jtendermint.jabci.types.Evidence();
  }

  public static com.github.jtendermint.jabci.types.Evidence getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Evidence>
      PARSER = new com.google.protobuf.AbstractParser<Evidence>() {
    @java.lang.Override
    public Evidence parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Evidence(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Evidence> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Evidence> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.jtendermint.jabci.types.Evidence getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

