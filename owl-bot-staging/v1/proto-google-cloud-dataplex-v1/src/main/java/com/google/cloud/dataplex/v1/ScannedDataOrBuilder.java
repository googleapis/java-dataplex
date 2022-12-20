// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/processing.proto

package com.google.cloud.dataplex.v1;

public interface ScannedDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.ScannedData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The range denoted by values of an incremental field
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.ScannedData.IncrementalField incremental_field = 1;</code>
   * @return Whether the incrementalField field is set.
   */
  boolean hasIncrementalField();
  /**
   * <pre>
   * The range denoted by values of an incremental field
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.ScannedData.IncrementalField incremental_field = 1;</code>
   * @return The incrementalField.
   */
  com.google.cloud.dataplex.v1.ScannedData.IncrementalField getIncrementalField();
  /**
   * <pre>
   * The range denoted by values of an incremental field
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.ScannedData.IncrementalField incremental_field = 1;</code>
   */
  com.google.cloud.dataplex.v1.ScannedData.IncrementalFieldOrBuilder getIncrementalFieldOrBuilder();

  public com.google.cloud.dataplex.v1.ScannedData.DataRangeCase getDataRangeCase();
}
