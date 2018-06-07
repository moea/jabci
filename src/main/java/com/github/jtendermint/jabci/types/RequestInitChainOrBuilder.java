// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

public interface RequestInitChainOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.github.jtendermint.jabci.types.RequestInitChain)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 time = 1;</code>
   */
  long getTime();

  /**
   * <code>optional string chain_id = 2;</code>
   */
  String getChainId();
  /**
   * <code>optional string chain_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getChainIdBytes();

  /**
   * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
   */
  boolean hasConsensusParams();
  /**
   * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
   */
  ConsensusParams getConsensusParams();
  /**
   * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 3;</code>
   */
  ConsensusParamsOrBuilder getConsensusParamsOrBuilder();

  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
   */
  java.util.List<Validator>
      getValidatorsList();
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
   */
  Validator getValidators(int index);
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
   */
  int getValidatorsCount();
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
   */
  java.util.List<? extends ValidatorOrBuilder>
      getValidatorsOrBuilderList();
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 4;</code>
   */
  ValidatorOrBuilder getValidatorsOrBuilder(
          int index);

  /**
   * <code>optional bytes app_state_bytes = 5;</code>
   */
  com.google.protobuf.ByteString getAppStateBytes();
}
