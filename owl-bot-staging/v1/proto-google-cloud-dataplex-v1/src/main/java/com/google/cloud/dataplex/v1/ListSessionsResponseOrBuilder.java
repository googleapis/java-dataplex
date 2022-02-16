// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/service.proto

package com.google.cloud.dataplex.v1;

public interface ListSessionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.ListSessionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Sessions under a given environment.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Session sessions = 1;</code>
   */
  java.util.List<com.google.cloud.dataplex.v1.Session> 
      getSessionsList();
  /**
   * <pre>
   * Sessions under a given environment.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Session sessions = 1;</code>
   */
  com.google.cloud.dataplex.v1.Session getSessions(int index);
  /**
   * <pre>
   * Sessions under a given environment.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Session sessions = 1;</code>
   */
  int getSessionsCount();
  /**
   * <pre>
   * Sessions under a given environment.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Session sessions = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dataplex.v1.SessionOrBuilder> 
      getSessionsOrBuilderList();
  /**
   * <pre>
   * Sessions under a given environment.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Session sessions = 1;</code>
   */
  com.google.cloud.dataplex.v1.SessionOrBuilder getSessionsOrBuilder(
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
}
