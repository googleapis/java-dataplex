// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/service.proto

package com.google.cloud.dataplex.v1;

public interface UpdateTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.UpdateTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Required. Update description.
   * Only fields specified in `update_mask` are updated.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Task task = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the task field is set.
   */
  boolean hasTask();
  /**
   * <pre>
   * Required. Update description.
   * Only fields specified in `update_mask` are updated.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Task task = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The task.
   */
  com.google.cloud.dataplex.v1.Task getTask();
  /**
   * <pre>
   * Required. Update description.
   * Only fields specified in `update_mask` are updated.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Task task = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataplex.v1.TaskOrBuilder getTaskOrBuilder();

  /**
   * <pre>
   * Optional. Only validate the request, but do not perform mutations.
   * The default is false.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}