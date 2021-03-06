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
// source: google/cloud/dataplex/v1/content.proto

package com.google.cloud.dataplex.v1;

public final class ContentProto {
  private ContentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_CreateContentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_CreateContentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_UpdateContentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_UpdateContentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DeleteContentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DeleteContentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_ListContentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListContentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_ListContentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListContentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_GetContentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_GetContentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/dataplex/v1/content.proto"
          + "\022\030google.cloud.dataplex.v1\032\034google/api/a"
          + "nnotations.proto\032\027google/api/client.prot"
          + "o\032\037google/api/field_behavior.proto\032\031goog"
          + "le/api/resource.proto\032&google/cloud/data"
          + "plex/v1/analyze.proto\032\033google/protobuf/e"
          + "mpty.proto\032 google/protobuf/field_mask.p"
          + "roto\"\241\001\n\024CreateContentRequest\0224\n\006parent\030"
          + "\001 \001(\tB$\340A\002\372A\036\n\034dataplex.googleapis.com/L"
          + "ake\0227\n\007content\030\002 \001(\0132!.google.cloud.data"
          + "plex.v1.ContentB\003\340A\002\022\032\n\rvalidate_only\030\003 "
          + "\001(\010B\003\340A\001\"\241\001\n\024UpdateContentRequest\0224\n\013upd"
          + "ate_mask\030\001 \001(\0132\032.google.protobuf.FieldMa"
          + "skB\003\340A\002\0227\n\007content\030\002 \001(\0132!.google.cloud."
          + "dataplex.v1.ContentB\003\340A\002\022\032\n\rvalidate_onl"
          + "y\030\003 \001(\010B\003\340A\001\"M\n\024DeleteContentRequest\0225\n\004"
          + "name\030\001 \001(\tB\'\340A\002\372A!\n\037dataplex.googleapis."
          + "com/Content\"\220\001\n\022ListContentRequest\0224\n\006pa"
          + "rent\030\001 \001(\tB$\340A\002\372A\036\n\034dataplex.googleapis."
          + "com/Lake\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage"
          + "_token\030\003 \001(\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\"b"
          + "\n\023ListContentResponse\0222\n\007content\030\001 \003(\0132!"
          + ".google.cloud.dataplex.v1.Content\022\027\n\017nex"
          + "t_page_token\030\002 \001(\t\"\330\001\n\021GetContentRequest"
          + "\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037dataplex.googlea"
          + "pis.com/Content\022J\n\004view\030\002 \001(\01627.google.c"
          + "loud.dataplex.v1.GetContentRequest.Conte"
          + "ntViewB\003\340A\001\"@\n\013ContentView\022\034\n\030CONTENT_VI"
          + "EW_UNSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\010\n\004FULL\020\0022\362\007"
          + "\n\016ContentService\022\276\001\n\rCreateContent\022..goo"
          + "gle.cloud.dataplex.v1.CreateContentReque"
          + "st\032!.google.cloud.dataplex.v1.Content\"Z\202"
          + "\323\344\223\002C\"8/v1/{parent=projects/*/locations/"
          + "*/lakes/*}/contentitems:\007content\332A\016paren"
          + "t,content\022\314\001\n\rUpdateContent\022..google.clo"
          + "ud.dataplex.v1.UpdateContentRequest\032!.go"
          + "ogle.cloud.dataplex.v1.Content\"h\202\323\344\223\002L2A"
          + "/v1/{content.name=projects/*/locations/*"
          + "/lakes/*/contentitems/**}:\007content\332A\023con"
          + "tent,update_mask\022\241\001\n\rDeleteContent\022..goo"
          + "gle.cloud.dataplex.v1.DeleteContentReque"
          + "st\032\026.google.protobuf.Empty\"H\202\323\344\223\002;*9/v1/"
          + "{name=projects/*/locations/*/lakes/*/con"
          + "tentitems/**}\332A\004name\022\246\001\n\nGetContent\022+.go"
          + "ogle.cloud.dataplex.v1.GetContentRequest"
          + "\032!.google.cloud.dataplex.v1.Content\"H\202\323\344"
          + "\223\002;\0229/v1/{name=projects/*/locations/*/la"
          + "kes/*/contentitems/**}\332A\004name\022\265\001\n\013ListCo"
          + "ntent\022,.google.cloud.dataplex.v1.ListCon"
          + "tentRequest\032-.google.cloud.dataplex.v1.L"
          + "istContentResponse\"I\202\323\344\223\002:\0228/v1/{parent="
          + "projects/*/locations/*/lakes/*}/contenti"
          + "tems\332A\006parent\032K\312A\027dataplex.googleapis.co"
          + "m\322A.https://www.googleapis.com/auth/clou"
          + "d-platformBp\n\034com.google.cloud.dataplex."
          + "v1B\014ContentProtoP\001Z@google.golang.org/ge"
          + "nproto/googleapis/cloud/dataplex/v1;data"
          + "plexb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dataplex.v1.AnalyzeProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dataplex_v1_CreateContentRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataplex_v1_CreateContentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_CreateContentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Content", "ValidateOnly",
            });
    internal_static_google_cloud_dataplex_v1_UpdateContentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataplex_v1_UpdateContentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_UpdateContentRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Content", "ValidateOnly",
            });
    internal_static_google_cloud_dataplex_v1_DeleteContentRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataplex_v1_DeleteContentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DeleteContentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dataplex_v1_ListContentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dataplex_v1_ListContentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_ListContentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_dataplex_v1_ListContentResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dataplex_v1_ListContentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_ListContentResponse_descriptor,
            new java.lang.String[] {
              "Content", "NextPageToken",
            });
    internal_static_google_cloud_dataplex_v1_GetContentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dataplex_v1_GetContentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_GetContentRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dataplex.v1.AnalyzeProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
