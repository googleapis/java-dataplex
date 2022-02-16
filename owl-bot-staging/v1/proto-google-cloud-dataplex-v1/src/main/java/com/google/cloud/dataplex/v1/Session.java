// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/analyze.proto

package com.google.cloud.dataplex.v1;

/**
 * <pre>
 * Represents an active analyze session running for a user.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.Session}
 */
public final class Session extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.Session)
    SessionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Session.newBuilder() to construct.
  private Session(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Session() {
    name_ = "";
    userId_ = "";
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Session();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Session(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (createTime_ != null) {
              subBuilder = createTime_.toBuilder();
            }
            createTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(createTime_);
              createTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            state_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataplex.v1.AnalyzeProto.internal_static_google_cloud_dataplex_v1_Session_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.AnalyzeProto.internal_static_google_cloud_dataplex_v1_Session_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.Session.class, com.google.cloud.dataplex.v1.Session.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Output only. The relative resource name of the content, of the form:
   * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/environment/{environment_id}/sessions/{session_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The relative resource name of the content, of the form:
   * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/environment/{environment_id}/sessions/{session_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object userId_;
  /**
   * <pre>
   * Output only. Email of user running the session.
   * </pre>
   *
   * <code>string user_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Email of user running the session.
   * </pre>
   *
   * <code>string user_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * Output only. Session start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   * <pre>
   * Output only. Session start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * Output only. Session start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return getCreateTime();
  }

  public static final int STATE_FIELD_NUMBER = 4;
  private int state_;
  /**
   * <code>.google.cloud.dataplex.v1.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <code>.google.cloud.dataplex.v1.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  @java.lang.Override public com.google.cloud.dataplex.v1.State getState() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dataplex.v1.State result = com.google.cloud.dataplex.v1.State.valueOf(state_);
    return result == null ? com.google.cloud.dataplex.v1.State.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userId_);
    }
    if (createTime_ != null) {
      output.writeMessage(3, getCreateTime());
    }
    if (state_ != com.google.cloud.dataplex.v1.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, state_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userId_);
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCreateTime());
    }
    if (state_ != com.google.cloud.dataplex.v1.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, state_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.dataplex.v1.Session)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.Session other = (com.google.cloud.dataplex.v1.Session) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
    }
    if (state_ != other.state_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.Session parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.Session parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.Session parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.Session parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.Session parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.Session parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.Session parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.Session parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.Session parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.Session parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.Session parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.Session parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.dataplex.v1.Session prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Represents an active analyze session running for a user.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.Session}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.Session)
      com.google.cloud.dataplex.v1.SessionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataplex.v1.AnalyzeProto.internal_static_google_cloud_dataplex_v1_Session_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.AnalyzeProto.internal_static_google_cloud_dataplex_v1_Session_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.Session.class, com.google.cloud.dataplex.v1.Session.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.Session.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      userId_ = "";

      if (createTimeBuilder_ == null) {
        createTime_ = null;
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }
      state_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataplex.v1.AnalyzeProto.internal_static_google_cloud_dataplex_v1_Session_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.Session getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.Session.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.Session build() {
      com.google.cloud.dataplex.v1.Session result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.Session buildPartial() {
      com.google.cloud.dataplex.v1.Session result = new com.google.cloud.dataplex.v1.Session(this);
      result.name_ = name_;
      result.userId_ = userId_;
      if (createTimeBuilder_ == null) {
        result.createTime_ = createTime_;
      } else {
        result.createTime_ = createTimeBuilder_.build();
      }
      result.state_ = state_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dataplex.v1.Session) {
        return mergeFrom((com.google.cloud.dataplex.v1.Session)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.Session other) {
      if (other == com.google.cloud.dataplex.v1.Session.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.dataplex.v1.Session parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataplex.v1.Session) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Output only. The relative resource name of the content, of the form:
     * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/environment/{environment_id}/sessions/{session_id}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The relative resource name of the content, of the form:
     * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/environment/{environment_id}/sessions/{session_id}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The relative resource name of the content, of the form:
     * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/environment/{environment_id}/sessions/{session_id}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The relative resource name of the content, of the form:
     * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/environment/{environment_id}/sessions/{session_id}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The relative resource name of the content, of the form:
     * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/environment/{environment_id}/sessions/{session_id}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <pre>
     * Output only. Email of user running the session.
     * </pre>
     *
     * <code>string user_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Email of user running the session.
     * </pre>
     *
     * <code>string user_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Email of user running the session.
     * </pre>
     *
     * <code>string user_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Email of user running the session.
     * </pre>
     *
     * <code>string user_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Email of user running the session.
     * </pre>
     *
     * <code>string user_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createTimeBuilder_;
    /**
     * <pre>
     * Output only. Session start time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return createTimeBuilder_ != null || createTime_ != null;
    }
    /**
     * <pre>
     * Output only. Session start time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. Session start time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
        onChanged();
      } else {
        createTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Session start time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
        onChanged();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Session start time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (createTime_ != null) {
          createTime_ =
            com.google.protobuf.Timestamp.newBuilder(createTime_).mergeFrom(value).buildPartial();
        } else {
          createTime_ = value;
        }
        onChanged();
      } else {
        createTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Session start time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearCreateTime() {
      if (createTimeBuilder_ == null) {
        createTime_ = null;
        onChanged();
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Session start time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {
      
      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. Session start time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      }
    }
    /**
     * <pre>
     * Output only. Session start time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(),
                getParentForChildren(),
                isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }

    private int state_ = 0;
    /**
     * <code>.google.cloud.dataplex.v1.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.google.cloud.dataplex.v1.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.dataplex.v1.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloud.dataplex.v1.State getState() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dataplex.v1.State result = com.google.cloud.dataplex.v1.State.valueOf(state_);
      return result == null ? com.google.cloud.dataplex.v1.State.UNRECOGNIZED : result;
    }
    /**
     * <code>.google.cloud.dataplex.v1.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.cloud.dataplex.v1.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.dataplex.v1.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      
      state_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.Session)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.Session)
  private static final com.google.cloud.dataplex.v1.Session DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.Session();
  }

  public static com.google.cloud.dataplex.v1.Session getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Session>
      PARSER = new com.google.protobuf.AbstractParser<Session>() {
    @java.lang.Override
    public Session parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Session(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Session> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Session> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.Session getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

