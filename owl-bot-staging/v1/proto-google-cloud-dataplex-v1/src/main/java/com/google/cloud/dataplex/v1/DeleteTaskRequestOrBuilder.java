// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/service.proto

package com.google.cloud.dataplex.v1;

public interface DeleteTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.DeleteTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the task:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/task/{task_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the task:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/task/{task_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
