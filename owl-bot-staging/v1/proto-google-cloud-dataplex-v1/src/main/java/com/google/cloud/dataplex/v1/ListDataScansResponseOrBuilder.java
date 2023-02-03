// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/datascans.proto

package com.google.cloud.dataplex.v1;

public interface ListDataScansResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.ListDataScansResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DataScans (`BASIC` view only) under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScan data_scans = 1;</code>
   */
  java.util.List<com.google.cloud.dataplex.v1.DataScan> 
      getDataScansList();
  /**
   * <pre>
   * DataScans (`BASIC` view only) under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScan data_scans = 1;</code>
   */
  com.google.cloud.dataplex.v1.DataScan getDataScans(int index);
  /**
   * <pre>
   * DataScans (`BASIC` view only) under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScan data_scans = 1;</code>
   */
  int getDataScansCount();
  /**
   * <pre>
   * DataScans (`BASIC` view only) under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScan data_scans = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dataplex.v1.DataScanOrBuilder> 
      getDataScansOrBuilderList();
  /**
   * <pre>
   * DataScans (`BASIC` view only) under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScan data_scans = 1;</code>
   */
  com.google.cloud.dataplex.v1.DataScanOrBuilder getDataScansOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}