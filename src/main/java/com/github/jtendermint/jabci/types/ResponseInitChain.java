// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

/**
 * Protobuf type {@code com.github.jtendermint.jabci.types.ResponseInitChain}
 */
public  final class ResponseInitChain extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.jtendermint.jabci.types.ResponseInitChain)
    ResponseInitChainOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponseInitChain.newBuilder() to construct.
  private ResponseInitChain(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseInitChain() {
    validators_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResponseInitChain(
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
            com.github.jtendermint.jabci.types.ConsensusParams.Builder subBuilder = null;
            if (consensusParams_ != null) {
              subBuilder = consensusParams_.toBuilder();
            }
            consensusParams_ = input.readMessage(com.github.jtendermint.jabci.types.ConsensusParams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(consensusParams_);
              consensusParams_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              validators_ = new java.util.ArrayList<com.github.jtendermint.jabci.types.ValidatorUpdate>();
              mutable_bitField0_ |= 0x00000002;
            }
            validators_.add(
                input.readMessage(com.github.jtendermint.jabci.types.ValidatorUpdate.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        validators_ = java.util.Collections.unmodifiableList(validators_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseInitChain_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseInitChain_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.jtendermint.jabci.types.ResponseInitChain.class, com.github.jtendermint.jabci.types.ResponseInitChain.Builder.class);
  }

  private int bitField0_;
  public static final int CONSENSUS_PARAMS_FIELD_NUMBER = 1;
  private com.github.jtendermint.jabci.types.ConsensusParams consensusParams_;
  /**
   * <code>.com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
   */
  public boolean hasConsensusParams() {
    return consensusParams_ != null;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
   */
  public com.github.jtendermint.jabci.types.ConsensusParams getConsensusParams() {
    return consensusParams_ == null ? com.github.jtendermint.jabci.types.ConsensusParams.getDefaultInstance() : consensusParams_;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
   */
  public com.github.jtendermint.jabci.types.ConsensusParamsOrBuilder getConsensusParamsOrBuilder() {
    return getConsensusParams();
  }

  public static final int VALIDATORS_FIELD_NUMBER = 2;
  private java.util.List<com.github.jtendermint.jabci.types.ValidatorUpdate> validators_;
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
   */
  public java.util.List<com.github.jtendermint.jabci.types.ValidatorUpdate> getValidatorsList() {
    return validators_;
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
   */
  public java.util.List<? extends com.github.jtendermint.jabci.types.ValidatorUpdateOrBuilder> 
      getValidatorsOrBuilderList() {
    return validators_;
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
   */
  public int getValidatorsCount() {
    return validators_.size();
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
   */
  public com.github.jtendermint.jabci.types.ValidatorUpdate getValidators(int index) {
    return validators_.get(index);
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
   */
  public com.github.jtendermint.jabci.types.ValidatorUpdateOrBuilder getValidatorsOrBuilder(
      int index) {
    return validators_.get(index);
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
    if (consensusParams_ != null) {
      output.writeMessage(1, getConsensusParams());
    }
    for (int i = 0; i < validators_.size(); i++) {
      output.writeMessage(2, validators_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (consensusParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConsensusParams());
    }
    for (int i = 0; i < validators_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, validators_.get(i));
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
    if (!(obj instanceof com.github.jtendermint.jabci.types.ResponseInitChain)) {
      return super.equals(obj);
    }
    com.github.jtendermint.jabci.types.ResponseInitChain other = (com.github.jtendermint.jabci.types.ResponseInitChain) obj;

    boolean result = true;
    result = result && (hasConsensusParams() == other.hasConsensusParams());
    if (hasConsensusParams()) {
      result = result && getConsensusParams()
          .equals(other.getConsensusParams());
    }
    result = result && getValidatorsList()
        .equals(other.getValidatorsList());
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
    if (hasConsensusParams()) {
      hash = (37 * hash) + CONSENSUS_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getConsensusParams().hashCode();
    }
    if (getValidatorsCount() > 0) {
      hash = (37 * hash) + VALIDATORS_FIELD_NUMBER;
      hash = (53 * hash) + getValidatorsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.jtendermint.jabci.types.ResponseInitChain parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ResponseInitChain parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseInitChain parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ResponseInitChain parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseInitChain parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ResponseInitChain parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseInitChain parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ResponseInitChain parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseInitChain parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ResponseInitChain parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseInitChain parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ResponseInitChain parseFrom(
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
  public static Builder newBuilder(com.github.jtendermint.jabci.types.ResponseInitChain prototype) {
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
   * Protobuf type {@code com.github.jtendermint.jabci.types.ResponseInitChain}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.jtendermint.jabci.types.ResponseInitChain)
      com.github.jtendermint.jabci.types.ResponseInitChainOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseInitChain_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseInitChain_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.jtendermint.jabci.types.ResponseInitChain.class, com.github.jtendermint.jabci.types.ResponseInitChain.Builder.class);
    }

    // Construct using com.github.jtendermint.jabci.types.ResponseInitChain.newBuilder()
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
        getValidatorsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (consensusParamsBuilder_ == null) {
        consensusParams_ = null;
      } else {
        consensusParams_ = null;
        consensusParamsBuilder_ = null;
      }
      if (validatorsBuilder_ == null) {
        validators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        validatorsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseInitChain_descriptor;
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ResponseInitChain getDefaultInstanceForType() {
      return com.github.jtendermint.jabci.types.ResponseInitChain.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ResponseInitChain build() {
      com.github.jtendermint.jabci.types.ResponseInitChain result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ResponseInitChain buildPartial() {
      com.github.jtendermint.jabci.types.ResponseInitChain result = new com.github.jtendermint.jabci.types.ResponseInitChain(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (consensusParamsBuilder_ == null) {
        result.consensusParams_ = consensusParams_;
      } else {
        result.consensusParams_ = consensusParamsBuilder_.build();
      }
      if (validatorsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          validators_ = java.util.Collections.unmodifiableList(validators_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.validators_ = validators_;
      } else {
        result.validators_ = validatorsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.github.jtendermint.jabci.types.ResponseInitChain) {
        return mergeFrom((com.github.jtendermint.jabci.types.ResponseInitChain)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.jtendermint.jabci.types.ResponseInitChain other) {
      if (other == com.github.jtendermint.jabci.types.ResponseInitChain.getDefaultInstance()) return this;
      if (other.hasConsensusParams()) {
        mergeConsensusParams(other.getConsensusParams());
      }
      if (validatorsBuilder_ == null) {
        if (!other.validators_.isEmpty()) {
          if (validators_.isEmpty()) {
            validators_ = other.validators_;
            bitField0_ = (bitField0_ & ~0x00000002);
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
            bitField0_ = (bitField0_ & ~0x00000002);
            validatorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValidatorsFieldBuilder() : null;
          } else {
            validatorsBuilder_.addAllMessages(other.validators_);
          }
        }
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
      com.github.jtendermint.jabci.types.ResponseInitChain parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.jtendermint.jabci.types.ResponseInitChain) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.github.jtendermint.jabci.types.ConsensusParams consensusParams_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.ConsensusParams, com.github.jtendermint.jabci.types.ConsensusParams.Builder, com.github.jtendermint.jabci.types.ConsensusParamsOrBuilder> consensusParamsBuilder_;
    /**
     * <code>.com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
     */
    public boolean hasConsensusParams() {
      return consensusParamsBuilder_ != null || consensusParams_ != null;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
     */
    public com.github.jtendermint.jabci.types.ConsensusParams getConsensusParams() {
      if (consensusParamsBuilder_ == null) {
        return consensusParams_ == null ? com.github.jtendermint.jabci.types.ConsensusParams.getDefaultInstance() : consensusParams_;
      } else {
        return consensusParamsBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
     */
    public Builder setConsensusParams(com.github.jtendermint.jabci.types.ConsensusParams value) {
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
     * <code>.com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
     */
    public Builder setConsensusParams(
        com.github.jtendermint.jabci.types.ConsensusParams.Builder builderForValue) {
      if (consensusParamsBuilder_ == null) {
        consensusParams_ = builderForValue.build();
        onChanged();
      } else {
        consensusParamsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
     */
    public Builder mergeConsensusParams(com.github.jtendermint.jabci.types.ConsensusParams value) {
      if (consensusParamsBuilder_ == null) {
        if (consensusParams_ != null) {
          consensusParams_ =
            com.github.jtendermint.jabci.types.ConsensusParams.newBuilder(consensusParams_).mergeFrom(value).buildPartial();
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
     * <code>.com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
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
     * <code>.com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
     */
    public com.github.jtendermint.jabci.types.ConsensusParams.Builder getConsensusParamsBuilder() {
      
      onChanged();
      return getConsensusParamsFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
     */
    public com.github.jtendermint.jabci.types.ConsensusParamsOrBuilder getConsensusParamsOrBuilder() {
      if (consensusParamsBuilder_ != null) {
        return consensusParamsBuilder_.getMessageOrBuilder();
      } else {
        return consensusParams_ == null ?
            com.github.jtendermint.jabci.types.ConsensusParams.getDefaultInstance() : consensusParams_;
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.ConsensusParams, com.github.jtendermint.jabci.types.ConsensusParams.Builder, com.github.jtendermint.jabci.types.ConsensusParamsOrBuilder> 
        getConsensusParamsFieldBuilder() {
      if (consensusParamsBuilder_ == null) {
        consensusParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.jtendermint.jabci.types.ConsensusParams, com.github.jtendermint.jabci.types.ConsensusParams.Builder, com.github.jtendermint.jabci.types.ConsensusParamsOrBuilder>(
                getConsensusParams(),
                getParentForChildren(),
                isClean());
        consensusParams_ = null;
      }
      return consensusParamsBuilder_;
    }

    private java.util.List<com.github.jtendermint.jabci.types.ValidatorUpdate> validators_ =
      java.util.Collections.emptyList();
    private void ensureValidatorsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        validators_ = new java.util.ArrayList<com.github.jtendermint.jabci.types.ValidatorUpdate>(validators_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.jtendermint.jabci.types.ValidatorUpdate, com.github.jtendermint.jabci.types.ValidatorUpdate.Builder, com.github.jtendermint.jabci.types.ValidatorUpdateOrBuilder> validatorsBuilder_;

    /**
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public java.util.List<com.github.jtendermint.jabci.types.ValidatorUpdate> getValidatorsList() {
      if (validatorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(validators_);
      } else {
        return validatorsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public int getValidatorsCount() {
      if (validatorsBuilder_ == null) {
        return validators_.size();
      } else {
        return validatorsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public com.github.jtendermint.jabci.types.ValidatorUpdate getValidators(int index) {
      if (validatorsBuilder_ == null) {
        return validators_.get(index);
      } else {
        return validatorsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public Builder setValidators(
        int index, com.github.jtendermint.jabci.types.ValidatorUpdate value) {
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
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public Builder setValidators(
        int index, com.github.jtendermint.jabci.types.ValidatorUpdate.Builder builderForValue) {
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
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public Builder addValidators(com.github.jtendermint.jabci.types.ValidatorUpdate value) {
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
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public Builder addValidators(
        int index, com.github.jtendermint.jabci.types.ValidatorUpdate value) {
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
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public Builder addValidators(
        com.github.jtendermint.jabci.types.ValidatorUpdate.Builder builderForValue) {
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
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public Builder addValidators(
        int index, com.github.jtendermint.jabci.types.ValidatorUpdate.Builder builderForValue) {
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
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public Builder addAllValidators(
        java.lang.Iterable<? extends com.github.jtendermint.jabci.types.ValidatorUpdate> values) {
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
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public Builder clearValidators() {
      if (validatorsBuilder_ == null) {
        validators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        validatorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
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
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public com.github.jtendermint.jabci.types.ValidatorUpdate.Builder getValidatorsBuilder(
        int index) {
      return getValidatorsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public com.github.jtendermint.jabci.types.ValidatorUpdateOrBuilder getValidatorsOrBuilder(
        int index) {
      if (validatorsBuilder_ == null) {
        return validators_.get(index);  } else {
        return validatorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public java.util.List<? extends com.github.jtendermint.jabci.types.ValidatorUpdateOrBuilder> 
         getValidatorsOrBuilderList() {
      if (validatorsBuilder_ != null) {
        return validatorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(validators_);
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public com.github.jtendermint.jabci.types.ValidatorUpdate.Builder addValidatorsBuilder() {
      return getValidatorsFieldBuilder().addBuilder(
          com.github.jtendermint.jabci.types.ValidatorUpdate.getDefaultInstance());
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public com.github.jtendermint.jabci.types.ValidatorUpdate.Builder addValidatorsBuilder(
        int index) {
      return getValidatorsFieldBuilder().addBuilder(
          index, com.github.jtendermint.jabci.types.ValidatorUpdate.getDefaultInstance());
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.ValidatorUpdate validators = 2;</code>
     */
    public java.util.List<com.github.jtendermint.jabci.types.ValidatorUpdate.Builder> 
         getValidatorsBuilderList() {
      return getValidatorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.jtendermint.jabci.types.ValidatorUpdate, com.github.jtendermint.jabci.types.ValidatorUpdate.Builder, com.github.jtendermint.jabci.types.ValidatorUpdateOrBuilder> 
        getValidatorsFieldBuilder() {
      if (validatorsBuilder_ == null) {
        validatorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.github.jtendermint.jabci.types.ValidatorUpdate, com.github.jtendermint.jabci.types.ValidatorUpdate.Builder, com.github.jtendermint.jabci.types.ValidatorUpdateOrBuilder>(
                validators_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        validators_ = null;
      }
      return validatorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.github.jtendermint.jabci.types.ResponseInitChain)
  }

  // @@protoc_insertion_point(class_scope:com.github.jtendermint.jabci.types.ResponseInitChain)
  private static final com.github.jtendermint.jabci.types.ResponseInitChain DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.jtendermint.jabci.types.ResponseInitChain();
  }

  public static com.github.jtendermint.jabci.types.ResponseInitChain getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseInitChain>
      PARSER = new com.google.protobuf.AbstractParser<ResponseInitChain>() {
    @java.lang.Override
    public ResponseInitChain parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResponseInitChain(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponseInitChain> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseInitChain> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.jtendermint.jabci.types.ResponseInitChain getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

