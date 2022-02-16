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
// source: google/cloud/dataplex/v1/analyze.proto

package com.google.cloud.dataplex.v1;

public final class AnalyzeProto {
  private AnalyzeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Environment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_ComputeResources_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_ComputeResources_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_OsImageRuntime_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_OsImageRuntime_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_OsImageRuntime_PropertiesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_OsImageRuntime_PropertiesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Environment_SessionSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Environment_SessionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Environment_SessionStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Environment_SessionStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Environment_Endpoints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Environment_Endpoints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Environment_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Environment_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Content_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Content_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Content_SqlScript_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Content_SqlScript_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Content_Notebook_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Content_Notebook_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Content_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Content_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_Session_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_Session_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/dataplex/v1/analyze.proto"
          + "\022\030google.cloud.dataplex.v1\032\034google/api/a"
          + "nnotations.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\032(go"
          + "ogle/cloud/dataplex/v1/resources.proto\032\036"
          + "google/protobuf/duration.proto\032\037google/p"
          + "rotobuf/timestamp.proto\"\231\r\n\013Environment\022"
          + "9\n\004name\030\001 \001(\tB+\340A\003\372A%\n#dataplex.googleap"
          + "is.com/Environment\022\031\n\014display_name\030\002 \001(\t"
          + "B\003\340A\001\022\020\n\003uid\030\003 \001(\tB\003\340A\003\0224\n\013create_time\030\004"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\005 \001(\0132\032.google.protobuf.Tim"
          + "estampB\003\340A\003\022F\n\006labels\030\006 \003(\01321.google.clo"
          + "ud.dataplex.v1.Environment.LabelsEntryB\003"
          + "\340A\001\022\030\n\013description\030\007 \001(\tB\003\340A\001\0223\n\005state\030\010"
          + " \001(\0162\037.google.cloud.dataplex.v1.StateB\003\340"
          + "A\003\022Z\n\023infrastructure_spec\030d \001(\01328.google"
          + ".cloud.dataplex.v1.Environment.Infrastru"
          + "ctureSpecB\003\340A\002\022L\n\014session_spec\030e \001(\01321.g"
          + "oogle.cloud.dataplex.v1.Environment.Sess"
          + "ionSpecB\003\340A\001\022P\n\016session_status\030f \001(\01323.g"
          + "oogle.cloud.dataplex.v1.Environment.Sess"
          + "ionStatusB\003\340A\003\022H\n\tendpoints\030\310\001 \001(\0132/.goo"
          + "gle.cloud.dataplex.v1.Environment.Endpoi"
          + "ntsB\003\340A\003\032\345\004\n\022InfrastructureSpec\022a\n\007compu"
          + "te\0302 \001(\0132I.google.cloud.dataplex.v1.Envi"
          + "ronment.InfrastructureSpec.ComputeResour"
          + "cesB\003\340A\001H\000\022`\n\010os_image\030d \001(\0132G.google.cl"
          + "oud.dataplex.v1.Environment.Infrastructu"
          + "reSpec.OsImageRuntimeB\003\340A\002H\001\032c\n\020ComputeR"
          + "esources\022\031\n\014disk_size_gb\030\001 \001(\005B\003\340A\001\022\027\n\nn"
          + "ode_count\030\002 \001(\005B\003\340A\001\022\033\n\016max_node_count\030\003"
          + " \001(\005B\003\340A\001\032\214\002\n\016OsImageRuntime\022\032\n\rimage_ve"
          + "rsion\030\001 \001(\tB\003\340A\002\022\033\n\016java_libraries\030\002 \003(\t"
          + "B\003\340A\001\022\034\n\017python_packages\030\003 \003(\tB\003\340A\001\022p\n\np"
          + "roperties\030\004 \003(\0132W.google.cloud.dataplex."
          + "v1.Environment.InfrastructureSpec.OsImag"
          + "eRuntime.PropertiesEntryB\003\340A\001\0321\n\017Propert"
          + "iesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001"
          + "B\013\n\tresourcesB\t\n\007runtime\032j\n\013SessionSpec\022"
          + "9\n\021max_idle_duration\030\001 \001(\0132\031.google.prot"
          + "obuf.DurationB\003\340A\001\022 \n\023enable_fast_startu"
          + "p\030\002 \001(\010B\003\340A\001\032$\n\rSessionStatus\022\023\n\006active\030"
          + "\001 \001(\010B\003\340A\003\0325\n\tEndpoints\022\026\n\tnotebooks\030\001 \001"
          + "(\tB\003\340A\003\022\020\n\003sql\030\002 \001(\tB\003\340A\003\032-\n\013LabelsEntry"
          + "\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:y\352Av\n#d"
          + "ataplex.googleapis.com/Environment\022Oproj"
          + "ects/{project}/locations/{location}/lake"
          + "s/{lake}/environments/{environment}\"\246\007\n\007"
          + "Content\0225\n\004name\030\001 \001(\tB\'\340A\003\372A!\n\037dataplex."
          + "googleapis.com/Content\022\020\n\003uid\030\002 \001(\tB\003\340A\003"
          + "\022\021\n\004path\030\003 \001(\tB\003\340A\002\0224\n\013create_time\030\004 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\0224\n\013upd"
          + "ate_time\030\005 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\003\340A\003\022B\n\006labels\030\006 \003(\0132-.google.cloud.d"
          + "ataplex.v1.Content.LabelsEntryB\003\340A\001\022\030\n\013d"
          + "escription\030\007 \001(\tB\003\340A\001\022\030\n\tdata_text\030\t \001(\t"
          + "B\003\340A\002H\000\022A\n\nsql_script\030d \001(\0132+.google.clo"
          + "ud.dataplex.v1.Content.SqlScriptH\001\022>\n\010no"
          + "tebook\030e \001(\0132*.google.cloud.dataplex.v1."
          + "Content.NotebookH\001\032\221\001\n\tSqlScript\022L\n\006engi"
          + "ne\030\001 \001(\01627.google.cloud.dataplex.v1.Cont"
          + "ent.SqlScript.QueryEngineB\003\340A\002\"6\n\013QueryE"
          + "ngine\022\034\n\030QUERY_ENGINE_UNSPECIFIED\020\000\022\t\n\005S"
          + "PARK\020\002\032\223\001\n\010Notebook\022O\n\013kernel_type\030\001 \001(\016"
          + "25.google.cloud.dataplex.v1.Content.Note"
          + "book.KernelTypeB\003\340A\002\"6\n\nKernelType\022\033\n\027KE"
          + "RNEL_TYPE_UNSPECIFIED\020\000\022\013\n\007PYTHON3\020\001\032-\n\013"
          + "LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:"
          + "\0028\001:l\352Ai\n\037dataplex.googleapis.com/Conten"
          + "t\022Fprojects/{project}/locations/{locatio"
          + "n}/lakes/{lake}/content/{content}B\006\n\004dat"
          + "aB\t\n\007content\"\315\002\n\007Session\0225\n\004name\030\001 \001(\tB\'"
          + "\340A\003\372A!\n\037dataplex.googleapis.com/Session\022"
          + "\024\n\007user_id\030\002 \001(\tB\003\340A\003\0224\n\013create_time\030\003 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\0223\n\005s"
          + "tate\030\004 \001(\0162\037.google.cloud.dataplex.v1.St"
          + "ateB\003\340A\003:\211\001\352A\205\001\n\037dataplex.googleapis.com"
          + "/Session\022bprojects/{project}/locations/{"
          + "location}/lakes/{lake}/environments/{env"
          + "ironment}/sessions/{session}Bp\n\034com.goog"
          + "le.cloud.dataplex.v1B\014AnalyzeProtoP\001Z@go"
          + "ogle.golang.org/genproto/googleapis/clou"
          + "d/dataplex/v1;dataplexb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dataplex.v1.ResourcesProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dataplex_v1_Environment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataplex_v1_Environment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Environment_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Description",
              "State",
              "InfrastructureSpec",
              "SessionSpec",
              "SessionStatus",
              "Endpoints",
            });
    internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_descriptor =
        internal_static_google_cloud_dataplex_v1_Environment_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_descriptor,
            new java.lang.String[] {
              "Compute", "OsImage", "Resources", "Runtime",
            });
    internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_ComputeResources_descriptor =
        internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_ComputeResources_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_ComputeResources_descriptor,
            new java.lang.String[] {
              "DiskSizeGb", "NodeCount", "MaxNodeCount",
            });
    internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_OsImageRuntime_descriptor =
        internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_OsImageRuntime_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_OsImageRuntime_descriptor,
            new java.lang.String[] {
              "ImageVersion", "JavaLibraries", "PythonPackages", "Properties",
            });
    internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_OsImageRuntime_PropertiesEntry_descriptor =
        internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_OsImageRuntime_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_OsImageRuntime_PropertiesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Environment_InfrastructureSpec_OsImageRuntime_PropertiesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dataplex_v1_Environment_SessionSpec_descriptor =
        internal_static_google_cloud_dataplex_v1_Environment_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dataplex_v1_Environment_SessionSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Environment_SessionSpec_descriptor,
            new java.lang.String[] {
              "MaxIdleDuration", "EnableFastStartup",
            });
    internal_static_google_cloud_dataplex_v1_Environment_SessionStatus_descriptor =
        internal_static_google_cloud_dataplex_v1_Environment_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_dataplex_v1_Environment_SessionStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Environment_SessionStatus_descriptor,
            new java.lang.String[] {
              "Active",
            });
    internal_static_google_cloud_dataplex_v1_Environment_Endpoints_descriptor =
        internal_static_google_cloud_dataplex_v1_Environment_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_dataplex_v1_Environment_Endpoints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Environment_Endpoints_descriptor,
            new java.lang.String[] {
              "Notebooks", "Sql",
            });
    internal_static_google_cloud_dataplex_v1_Environment_LabelsEntry_descriptor =
        internal_static_google_cloud_dataplex_v1_Environment_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_dataplex_v1_Environment_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Environment_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dataplex_v1_Content_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataplex_v1_Content_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Content_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "Path",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Description",
              "DataText",
              "SqlScript",
              "Notebook",
              "Data",
              "Content",
            });
    internal_static_google_cloud_dataplex_v1_Content_SqlScript_descriptor =
        internal_static_google_cloud_dataplex_v1_Content_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_Content_SqlScript_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Content_SqlScript_descriptor,
            new java.lang.String[] {
              "Engine",
            });
    internal_static_google_cloud_dataplex_v1_Content_Notebook_descriptor =
        internal_static_google_cloud_dataplex_v1_Content_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dataplex_v1_Content_Notebook_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Content_Notebook_descriptor,
            new java.lang.String[] {
              "KernelType",
            });
    internal_static_google_cloud_dataplex_v1_Content_LabelsEntry_descriptor =
        internal_static_google_cloud_dataplex_v1_Content_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_dataplex_v1_Content_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Content_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dataplex_v1_Session_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataplex_v1_Session_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_Session_descriptor,
            new java.lang.String[] {
              "Name", "UserId", "CreateTime", "State",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dataplex.v1.ResourcesProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
