// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/datascans.proto

package com.google.cloud.dataplex.v1;

public interface RunDataScanResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.RunDataScanResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DataScanJob created by RunDataScan API.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanJob job = 1;</code>
   * @return Whether the job field is set.
   */
  boolean hasJob();
  /**
   * <pre>
   * DataScanJob created by RunDataScan API.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanJob job = 1;</code>
   * @return The job.
   */
  com.google.cloud.dataplex.v1.DataScanJob getJob();
  /**
   * <pre>
   * DataScanJob created by RunDataScan API.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataScanJob job = 1;</code>
   */
  com.google.cloud.dataplex.v1.DataScanJobOrBuilder getJobOrBuilder();
}
