// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

public interface ResponseInitChainOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.github.jtendermint.jabci.types.ResponseInitChain)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
   */
  boolean hasConsensusParams();
  /**
   * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
   */
  ConsensusParams getConsensusParams();
  /**
   * <code>optional .com.github.jtendermint.jabci.types.ConsensusParams consensus_params = 1;</code>
   */
  ConsensusParamsOrBuilder getConsensusParamsOrBuilder();

  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 2;</code>
   */
  java.util.List<Validator>
      getValidatorsList();
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 2;</code>
   */
  Validator getValidators(int index);
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 2;</code>
   */
  int getValidatorsCount();
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 2;</code>
   */
  java.util.List<? extends ValidatorOrBuilder>
      getValidatorsOrBuilderList();
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Validator validators = 2;</code>
   */
  ValidatorOrBuilder getValidatorsOrBuilder(
          int index);
}
