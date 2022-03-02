/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/metadata.proto

package com.google.cloud.dataplex.v1;

public interface DeletePartitionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.DeletePartitionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the partition.
   * format:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}/partitions/{partition_value_path}`.
   * The {partition_value_path} segment consists of an ordered sequence of
   * partition values separated by "/". All values must be provided.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the partition.
   * format:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}/partitions/{partition_value_path}`.
   * The {partition_value_path} segment consists of an ordered sequence of
   * partition values separated by "/". All values must be provided.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The etag associated with the partition if it was previously retrieved.
   * </pre>
   *
   * <code>string etag = 2 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  @java.lang.Deprecated
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. The etag associated with the partition if it was previously retrieved.
   * </pre>
   *
   * <code>string etag = 2 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getEtagBytes();
}
