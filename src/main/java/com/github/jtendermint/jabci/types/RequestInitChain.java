// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

/**
 * Protobuf type {@code com.github.jtendermint.jabci.types.RequestInitChain}
 */
public  final class RequestInitChain extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.jtendermint.jabci.types.RequestInitChain)
    RequestInitChainOrBuilder {
  // Use RequestInitChain.newBuilder() to construct.
  private RequestInitChain(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestInitChain() {
    time_ = 0L;
    chainId_ = "";
    validators_ = java.util.Collections.emptyList();
    appStateBytes_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RequestInitChain(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            time_ = input.readInt64();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            chainId_ = s;
            break;
          }
          case 26: {
            ConsensusParams.Builder subBuilder = null;
            if (consensusParams_ != null) {
              subBuilder = consensusParams_.toBuilder();
            }
            consensusParams_ = input.readMessage(ConsensusParams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(consensusParams_);
              consensusParams_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              validators_ = new java.util.ArrayList<Validator>();
              mutable_bitField0_ |= 0x00000008;
            }
            validators_.add(
                input.readMessage(Validator.parser(), extensionRegistry));
            break;
          }
          case 42: {

            appStateBytes_ = input.readBytes();
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        validators_ = java.util.Collections.unmodifiableList(validators_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Types.internal_static_com_github_jtendermint_jabci_types_RequestInitChain_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Types.internal_static_com_github_jtendermint_jabci_types_RequestInitChain_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            RequestInitChain.class, RequestInitChain.Builder.class);
  }

  private int bitField0_;
  public static final int TIME_FIELD_NUMBER = 1;
  private long time_;
  /**
   * <code>optional int64 time = 1;</code>
   */
  public long getTime() {
    return time_;
  }

  public static final int CHAIN_ID_FIELD_NUMBER = 2;
  private volatile Object chainId_;
  /**
   * <code>optional string chain_id = 2;</code>
   */
  public String getChainId() {
    Object ref = chainId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      chainId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string chain_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getChainIdBytes() {
    Object ref = chainId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      chainId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONSENSUS_PARAMS_FIELD_NUMBER = 3;
  private ConsensusParams consensusParams_;
  /**
   * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
   */
  public boolean hasConsensusParams() {
    return consensusParams_ != null;
  }
  /**
   * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
   */
  public ConsensusParams getConsensusParams() {
    return consensusParams_ == null ? ConsensusParams.getDefaultInstance() : consensusParams_;
  }
  /**
   * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
   */
  public ConsensusParamsOrBuilder getConsensusParamsOrBuilder() {
    return getConsensusParams();
  }

  public static final int VALIDATORS_FIELD_NUMBER = 4;
  private java.util.List<Validator> validators_;
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
   */
  public java.util.List<Validator> getValidatorsList() {
    return validators_;
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
   */
  public java.util.List<? extends ValidatorOrBuilder>
      getValidatorsOrBuilderList() {
    return validators_;
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
   */
  public int getValidatorsCount() {
    return validators_.size();
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
   */
  public Validator getValidators(int index) {
    return validators_.get(index);
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
   */
  public ValidatorOrBuilder getValidatorsOrBuilder(
      int index) {
    return validators_.get(index);
  }

  public static final int APP_STATE_BYTES_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString appStateBytes_;
  /**
   * <code>optional bytes app_state_bytes = 5;</code>
   */
  public com.google.protobuf.ByteString getAppStateBytes() {
    return appStateBytes_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (time_ != 0L) {
      output.writeInt64(1, time_);
    }
    if (!getChainIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, chainId_);
    }
    if (consensusParams_ != null) {
      output.writeMessage(3, getConsensusParams());
    }
    for (int i = 0; i < validators_.size(); i++) {
      output.writeMessage(4, validators_.get(i));
    }
    if (!appStateBytes_.isEmpty()) {
      output.writeBytes(5, appStateBytes_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (time_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, time_);
    }
    if (!getChainIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, chainId_);
    }
    if (consensusParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getConsensusParams());
    }
    for (int i = 0; i < validators_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, validators_.get(i));
    }
    if (!appStateBytes_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, appStateBytes_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof RequestInitChain)) {
      return super.equals(obj);
    }
    RequestInitChain other = (RequestInitChain) obj;

    boolean result = true;
    result = result && (getTime()
        == other.getTime());
    result = result && getChainId()
        .equals(other.getChainId());
    result = result && (hasConsensusParams() == other.hasConsensusParams());
    if (hasConsensusParams()) {
      result = result && getConsensusParams()
          .equals(other.getConsensusParams());
    }
    result = result && getValidatorsList()
        .equals(other.getValidatorsList());
    result = result && getAppStateBytes()
        .equals(other.getAppStateBytes());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTime());
    hash = (37 * hash) + CHAIN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChainId().hashCode();
    if (hasConsensusParams()) {
      hash = (37 * hash) + CONSENSUS_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getConsensusParams().hashCode();
    }
    if (getValidatorsCount() > 0) {
      hash = (37 * hash) + VALIDATORS_FIELD_NUMBER;
      hash = (53 * hash) + getValidatorsList().hashCode();
    }
    hash = (37 * hash) + APP_STATE_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + getAppStateBytes().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static RequestInitChain parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RequestInitChain parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RequestInitChain parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RequestInitChain parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RequestInitChain parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RequestInitChain parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static RequestInitChain parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static RequestInitChain parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static RequestInitChain parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RequestInitChain parseFrom(
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
  public static Builder newBuilder(RequestInitChain prototype) {
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
   * Protobuf type {@code com.github.jtendermint.jabci.types.RequestInitChain}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.jtendermint.jabci.types.RequestInitChain)
      RequestInitChainOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Types.internal_static_com_github_jtendermint_jabci_types_RequestInitChain_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Types.internal_static_com_github_jtendermint_jabci_types_RequestInitChain_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestInitChain.class, RequestInitChain.Builder.class);
    }

    // Construct using com.github.jtendermint.jabci.types.RequestInitChain.newBuilder()
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
        getValidatorsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      time_ = 0L;

      chainId_ = "";

      if (consensusParamsBuilder_ == null) {
        consensusParams_ = null;
      } else {
        consensusParams_ = null;
        consensusParamsBuilder_ = null;
      }
      if (validatorsBuilder_ == null) {
        validators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        validatorsBuilder_.clear();
      }
      appStateBytes_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Types.internal_static_com_github_jtendermint_jabci_types_RequestInitChain_descriptor;
    }

    public RequestInitChain getDefaultInstanceForType() {
      return RequestInitChain.getDefaultInstance();
    }

    public RequestInitChain build() {
      RequestInitChain result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public RequestInitChain buildPartial() {
      RequestInitChain result = new RequestInitChain(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.time_ = time_;
      result.chainId_ = chainId_;
      if (consensusParamsBuilder_ == null) {
        result.consensusParams_ = consensusParams_;
      } else {
        result.consensusParams_ = consensusParamsBuilder_.build();
      }
      if (validatorsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          validators_ = java.util.Collections.unmodifiableList(validators_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.validators_ = validators_;
      } else {
        result.validators_ = validatorsBuilder_.build();
      }
      result.appStateBytes_ = appStateBytes_;
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
      if (other instanceof RequestInitChain) {
        return mergeFrom((RequestInitChain)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(RequestInitChain other) {
      if (other == RequestInitChain.getDefaultInstance()) return this;
      if (other.getTime() != 0L) {
        setTime(other.getTime());
      }
      if (!other.getChainId().isEmpty()) {
        chainId_ = other.chainId_;
        onChanged();
      }
      if (other.hasConsensusParams()) {
        mergeConsensusParams(other.getConsensusParams());
      }
      if (validatorsBuilder_ == null) {
        if (!other.validators_.isEmpty()) {
          if (validators_.isEmpty()) {
            validators_ = other.validators_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureValidatorsIsMutable();
            validators_.addAll(other.validators_);
          }
          onChanged();
        }
      } else {
        if (!other.validators_.isEmpty()) {
          if (validatorsBuilder_.isEmpty()) {
            validatorsBuilder_.dispose();
            validatorsBuilder_ = null;
            validators_ = other.validators_;
            bitField0_ = (bitField0_ & ~0x00000008);
            validatorsBuilder_ =
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValidatorsFieldBuilder() : null;
          } else {
            validatorsBuilder_.addAllMessages(other.validators_);
          }
        }
      }
      if (other.getAppStateBytes() != com.google.protobuf.ByteString.EMPTY) {
        setAppStateBytes(other.getAppStateBytes());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      RequestInitChain parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (RequestInitChain) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long time_ ;
    /**
     * <code>optional int64 time = 1;</code>
     */
    public long getTime() {
      return time_;
    }
    /**
     * <code>optional int64 time = 1;</code>
     */
    public Builder setTime(long value) {

      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 time = 1;</code>
     */
    public Builder clearTime() {

      time_ = 0L;
      onChanged();
      return this;
    }

    private Object chainId_ = "";
    /**
     * <code>optional string chain_id = 2;</code>
     */
    public String getChainId() {
      Object ref = chainId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        chainId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string chain_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getChainIdBytes() {
      Object ref = chainId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        chainId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string chain_id = 2;</code>
     */
    public Builder setChainId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      chainId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string chain_id = 2;</code>
     */
    public Builder clearChainId() {

      chainId_ = getDefaultInstance().getChainId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string chain_id = 2;</code>
     */
    public Builder setChainIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      chainId_ = value;
      onChanged();
      return this;
    }

    private ConsensusParams consensusParams_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        ConsensusParams, ConsensusParams.Builder, ConsensusParamsOrBuilder> consensusParamsBuilder_;
    /**
     * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
     */
    public boolean hasConsensusParams() {
      return consensusParamsBuilder_ != null || consensusParams_ != null;
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
     */
    public ConsensusParams getConsensusParams() {
      if (consensusParamsBuilder_ == null) {
        return consensusParams_ == null ? ConsensusParams.getDefaultInstance() : consensusParams_;
      } else {
        return consensusParamsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
     */
    public Builder setConsensusParams(ConsensusParams value) {
      if (consensusParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        consensusParams_ = value;
        onChanged();
      } else {
        consensusParamsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
     */
    public Builder setConsensusParams(
        ConsensusParams.Builder builderForValue) {
      if (consensusParamsBuilder_ == null) {
        consensusParams_ = builderForValue.build();
        onChanged();
      } else {
        consensusParamsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
     */
    public Builder mergeConsensusParams(ConsensusParams value) {
      if (consensusParamsBuilder_ == null) {
        if (consensusParams_ != null) {
          consensusParams_ =
            ConsensusParams.newBuilder(consensusParams_).mergeFrom(value).buildPartial();
        } else {
          consensusParams_ = value;
        }
        onChanged();
      } else {
        consensusParamsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
     */
    public Builder clearConsensusParams() {
      if (consensusParamsBuilder_ == null) {
        consensusParams_ = null;
        onChanged();
      } else {
        consensusParams_ = null;
        consensusParamsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
     */
    public ConsensusParams.Builder getConsensusParamsBuilder() {

      onChanged();
      return getConsensusParamsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
     */
    public ConsensusParamsOrBuilder getConsensusParamsOrBuilder() {
      if (consensusParamsBuilder_ != null) {
        return consensusParamsBuilder_.getMessageOrBuilder();
      } else {
        return consensusParams_ == null ?
            ConsensusParams.getDefaultInstance() : consensusParams_;
      }
    }
    /**
     * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ConsensusParams, ConsensusParams.Builder, ConsensusParamsOrBuilder>
        getConsensusParamsFieldBuilder() {
      if (consensusParamsBuilder_ == null) {
        consensusParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ConsensusParams, ConsensusParams.Builder, ConsensusParamsOrBuilder>(
                getConsensusParams(),
                getParentForChildren(),
                isClean());
        consensusParams_ = null;
      }
      return consensusParamsBuilder_;
    }

    private java.util.List<Validator> validators_ =
      java.util.Collections.emptyList();
    private void ensureValidatorsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        validators_ = new java.util.ArrayList<Validator>(validators_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        Validator, Validator.Builder, ValidatorOrBuilder> validatorsBuilder_;

    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public java.util.List<Validator> getValidatorsList() {
      if (validatorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(validators_);
      } else {
        return validatorsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public int getValidatorsCount() {
      if (validatorsBuilder_ == null) {
        return validators_.size();
      } else {
        return validatorsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public Validator getValidators(int index) {
      if (validatorsBuilder_ == null) {
        return validators_.get(index);
      } else {
        return validatorsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public Builder setValidators(
        int index, Validator value) {
      if (validatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValidatorsIsMutable();
        validators_.set(index, value);
        onChanged();
      } else {
        validatorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public Builder setValidators(
        int index, Validator.Builder builderForValue) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        validators_.set(index, builderForValue.build());
        onChanged();
      } else {
        validatorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public Builder addValidators(Validator value) {
      if (validatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValidatorsIsMutable();
        validators_.add(value);
        onChanged();
      } else {
        validatorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public Builder addValidators(
        int index, Validator value) {
      if (validatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValidatorsIsMutable();
        validators_.add(index, value);
        onChanged();
      } else {
        validatorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public Builder addValidators(
        Validator.Builder builderForValue) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        validators_.add(builderForValue.build());
        onChanged();
      } else {
        validatorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public Builder addValidators(
        int index, Validator.Builder builderForValue) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        validators_.add(index, builderForValue.build());
        onChanged();
      } else {
        validatorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public Builder addAllValidators(
        Iterable<? extends Validator> values) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, validators_);
        onChanged();
      } else {
        validatorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public Builder clearValidators() {
      if (validatorsBuilder_ == null) {
        validators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        validatorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public Builder removeValidators(int index) {
      if (validatorsBuilder_ == null) {
        ensureValidatorsIsMutable();
        validators_.remove(index);
        onChanged();
      } else {
        validatorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public Validator.Builder getValidatorsBuilder(
        int index) {
      return getValidatorsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public ValidatorOrBuilder getValidatorsOrBuilder(
        int index) {
      if (validatorsBuilder_ == null) {
        return validators_.get(index);  } else {
        return validatorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public java.util.List<? extends ValidatorOrBuilder>
         getValidatorsOrBuilderList() {
      if (validatorsBuilder_ != null) {
        return validatorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(validators_);
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public Validator.Builder addValidatorsBuilder() {
      return getValidatorsFieldBuilder().addBuilder(
          Validator.getDefaultInstance());
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public Validator.Builder addValidatorsBuilder(
        int index) {
      return getValidatorsFieldBuilder().addBuilder(
          index, Validator.getDefaultInstance());
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
     */
    public java.util.List<Validator.Builder>
         getValidatorsBuilderList() {
      return getValidatorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Validator, Validator.Builder, ValidatorOrBuilder>
        getValidatorsFieldBuilder() {
      if (validatorsBuilder_ == null) {
        validatorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            Validator, Validator.Builder, ValidatorOrBuilder>(
                validators_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        validators_ = null;
      }
      return validatorsBuilder_;
    }

    private com.google.protobuf.ByteString appStateBytes_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes app_state_bytes = 5;</code>
     */
    public com.google.protobuf.ByteString getAppStateBytes() {
      return appStateBytes_;
    }
    /**
     * <code>optional bytes app_state_bytes = 5;</code>
     */
    public Builder setAppStateBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }

      appStateBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes app_state_bytes = 5;</code>
     */
    public Builder clearAppStateBytes() {

      appStateBytes_ = getDefaultInstance().getAppStateBytes();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.github.jtendermint.jabci.types.RequestInitChain)
  }

  // @@protoc_insertion_point(class_scope:com.github.jtendermint.jabci.types.RequestInitChain)
  private static final RequestInitChain DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RequestInitChain();
  }

  public static RequestInitChain getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestInitChain>
      PARSER = new com.google.protobuf.AbstractParser<RequestInitChain>() {
    public RequestInitChain parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestInitChain(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestInitChain> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<RequestInitChain> getParserForType() {
    return PARSER;
  }

  public RequestInitChain getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

