// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/datascans.proto

package com.google.cloud.dataplex.v1;

/**
 * <pre>
 * List DataScanJobs response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.ListDataScanJobsResponse}
 */
public final class ListDataScanJobsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.ListDataScanJobsResponse)
    ListDataScanJobsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDataScanJobsResponse.newBuilder() to construct.
  private ListDataScanJobsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDataScanJobsResponse() {
    dataScanJobs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDataScanJobsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataplex.v1.DataScansProto.internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.DataScansProto.internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.ListDataScanJobsResponse.class, com.google.cloud.dataplex.v1.ListDataScanJobsResponse.Builder.class);
  }

  public static final int DATA_SCAN_JOBS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dataplex.v1.DataScanJob> dataScanJobs_;
  /**
   * <pre>
   * DataScanJobs (metadata only) under a given dataScan.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dataplex.v1.DataScanJob> getDataScanJobsList() {
    return dataScanJobs_;
  }
  /**
   * <pre>
   * DataScanJobs (metadata only) under a given dataScan.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dataplex.v1.DataScanJobOrBuilder> 
      getDataScanJobsOrBuilderList() {
    return dataScanJobs_;
  }
  /**
   * <pre>
   * DataScanJobs (metadata only) under a given dataScan.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
   */
  @java.lang.Override
  public int getDataScanJobsCount() {
    return dataScanJobs_.size();
  }
  /**
   * <pre>
   * DataScanJobs (metadata only) under a given dataScan.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.DataScanJob getDataScanJobs(int index) {
    return dataScanJobs_.get(index);
  }
  /**
   * <pre>
   * DataScanJobs (metadata only) under a given dataScan.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.DataScanJobOrBuilder getDataScanJobsOrBuilder(
      int index) {
    return dataScanJobs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < dataScanJobs_.size(); i++) {
      output.writeMessage(1, dataScanJobs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dataScanJobs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dataScanJobs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.dataplex.v1.ListDataScanJobsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.ListDataScanJobsResponse other = (com.google.cloud.dataplex.v1.ListDataScanJobsResponse) obj;

    if (!getDataScanJobsList()
        .equals(other.getDataScanJobsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getDataScanJobsCount() > 0) {
      hash = (37 * hash) + DATA_SCAN_JOBS_FIELD_NUMBER;
      hash = (53 * hash) + getDataScanJobsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.ListDataScanJobsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.ListDataScanJobsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.ListDataScanJobsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.ListDataScanJobsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.ListDataScanJobsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.ListDataScanJobsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.ListDataScanJobsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.ListDataScanJobsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.ListDataScanJobsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.ListDataScanJobsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.ListDataScanJobsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.ListDataScanJobsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataplex.v1.ListDataScanJobsResponse prototype) {
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
   * List DataScanJobs response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.ListDataScanJobsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.ListDataScanJobsResponse)
      com.google.cloud.dataplex.v1.ListDataScanJobsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataplex.v1.DataScansProto.internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.DataScansProto.internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.ListDataScanJobsResponse.class, com.google.cloud.dataplex.v1.ListDataScanJobsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.ListDataScanJobsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dataScanJobsBuilder_ == null) {
        dataScanJobs_ = java.util.Collections.emptyList();
      } else {
        dataScanJobs_ = null;
        dataScanJobsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataplex.v1.DataScansProto.internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.ListDataScanJobsResponse getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.ListDataScanJobsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.ListDataScanJobsResponse build() {
      com.google.cloud.dataplex.v1.ListDataScanJobsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.ListDataScanJobsResponse buildPartial() {
      com.google.cloud.dataplex.v1.ListDataScanJobsResponse result = new com.google.cloud.dataplex.v1.ListDataScanJobsResponse(this);
      int from_bitField0_ = bitField0_;
      if (dataScanJobsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dataScanJobs_ = java.util.Collections.unmodifiableList(dataScanJobs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dataScanJobs_ = dataScanJobs_;
      } else {
        result.dataScanJobs_ = dataScanJobsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.dataplex.v1.ListDataScanJobsResponse) {
        return mergeFrom((com.google.cloud.dataplex.v1.ListDataScanJobsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.ListDataScanJobsResponse other) {
      if (other == com.google.cloud.dataplex.v1.ListDataScanJobsResponse.getDefaultInstance()) return this;
      if (dataScanJobsBuilder_ == null) {
        if (!other.dataScanJobs_.isEmpty()) {
          if (dataScanJobs_.isEmpty()) {
            dataScanJobs_ = other.dataScanJobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataScanJobsIsMutable();
            dataScanJobs_.addAll(other.dataScanJobs_);
          }
          onChanged();
        }
      } else {
        if (!other.dataScanJobs_.isEmpty()) {
          if (dataScanJobsBuilder_.isEmpty()) {
            dataScanJobsBuilder_.dispose();
            dataScanJobsBuilder_ = null;
            dataScanJobs_ = other.dataScanJobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataScanJobsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataScanJobsFieldBuilder() : null;
          } else {
            dataScanJobsBuilder_.addAllMessages(other.dataScanJobs_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.cloud.dataplex.v1.DataScanJob m =
                  input.readMessage(
                      com.google.cloud.dataplex.v1.DataScanJob.parser(),
                      extensionRegistry);
              if (dataScanJobsBuilder_ == null) {
                ensureDataScanJobsIsMutable();
                dataScanJobs_.add(m);
              } else {
                dataScanJobsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();

              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.dataplex.v1.DataScanJob> dataScanJobs_ =
      java.util.Collections.emptyList();
    private void ensureDataScanJobsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dataScanJobs_ = new java.util.ArrayList<com.google.cloud.dataplex.v1.DataScanJob>(dataScanJobs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dataplex.v1.DataScanJob, com.google.cloud.dataplex.v1.DataScanJob.Builder, com.google.cloud.dataplex.v1.DataScanJobOrBuilder> dataScanJobsBuilder_;

    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public java.util.List<com.google.cloud.dataplex.v1.DataScanJob> getDataScanJobsList() {
      if (dataScanJobsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dataScanJobs_);
      } else {
        return dataScanJobsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public int getDataScanJobsCount() {
      if (dataScanJobsBuilder_ == null) {
        return dataScanJobs_.size();
      } else {
        return dataScanJobsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public com.google.cloud.dataplex.v1.DataScanJob getDataScanJobs(int index) {
      if (dataScanJobsBuilder_ == null) {
        return dataScanJobs_.get(index);
      } else {
        return dataScanJobsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public Builder setDataScanJobs(
        int index, com.google.cloud.dataplex.v1.DataScanJob value) {
      if (dataScanJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataScanJobsIsMutable();
        dataScanJobs_.set(index, value);
        onChanged();
      } else {
        dataScanJobsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public Builder setDataScanJobs(
        int index, com.google.cloud.dataplex.v1.DataScanJob.Builder builderForValue) {
      if (dataScanJobsBuilder_ == null) {
        ensureDataScanJobsIsMutable();
        dataScanJobs_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataScanJobsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public Builder addDataScanJobs(com.google.cloud.dataplex.v1.DataScanJob value) {
      if (dataScanJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataScanJobsIsMutable();
        dataScanJobs_.add(value);
        onChanged();
      } else {
        dataScanJobsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public Builder addDataScanJobs(
        int index, com.google.cloud.dataplex.v1.DataScanJob value) {
      if (dataScanJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataScanJobsIsMutable();
        dataScanJobs_.add(index, value);
        onChanged();
      } else {
        dataScanJobsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public Builder addDataScanJobs(
        com.google.cloud.dataplex.v1.DataScanJob.Builder builderForValue) {
      if (dataScanJobsBuilder_ == null) {
        ensureDataScanJobsIsMutable();
        dataScanJobs_.add(builderForValue.build());
        onChanged();
      } else {
        dataScanJobsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public Builder addDataScanJobs(
        int index, com.google.cloud.dataplex.v1.DataScanJob.Builder builderForValue) {
      if (dataScanJobsBuilder_ == null) {
        ensureDataScanJobsIsMutable();
        dataScanJobs_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataScanJobsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public Builder addAllDataScanJobs(
        java.lang.Iterable<? extends com.google.cloud.dataplex.v1.DataScanJob> values) {
      if (dataScanJobsBuilder_ == null) {
        ensureDataScanJobsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dataScanJobs_);
        onChanged();
      } else {
        dataScanJobsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public Builder clearDataScanJobs() {
      if (dataScanJobsBuilder_ == null) {
        dataScanJobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataScanJobsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public Builder removeDataScanJobs(int index) {
      if (dataScanJobsBuilder_ == null) {
        ensureDataScanJobsIsMutable();
        dataScanJobs_.remove(index);
        onChanged();
      } else {
        dataScanJobsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public com.google.cloud.dataplex.v1.DataScanJob.Builder getDataScanJobsBuilder(
        int index) {
      return getDataScanJobsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public com.google.cloud.dataplex.v1.DataScanJobOrBuilder getDataScanJobsOrBuilder(
        int index) {
      if (dataScanJobsBuilder_ == null) {
        return dataScanJobs_.get(index);  } else {
        return dataScanJobsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dataplex.v1.DataScanJobOrBuilder> 
         getDataScanJobsOrBuilderList() {
      if (dataScanJobsBuilder_ != null) {
        return dataScanJobsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dataScanJobs_);
      }
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public com.google.cloud.dataplex.v1.DataScanJob.Builder addDataScanJobsBuilder() {
      return getDataScanJobsFieldBuilder().addBuilder(
          com.google.cloud.dataplex.v1.DataScanJob.getDefaultInstance());
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public com.google.cloud.dataplex.v1.DataScanJob.Builder addDataScanJobsBuilder(
        int index) {
      return getDataScanJobsFieldBuilder().addBuilder(
          index, com.google.cloud.dataplex.v1.DataScanJob.getDefaultInstance());
    }
    /**
     * <pre>
     * DataScanJobs (metadata only) under a given dataScan.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataScanJob data_scan_jobs = 1;</code>
     */
    public java.util.List<com.google.cloud.dataplex.v1.DataScanJob.Builder> 
         getDataScanJobsBuilderList() {
      return getDataScanJobsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dataplex.v1.DataScanJob, com.google.cloud.dataplex.v1.DataScanJob.Builder, com.google.cloud.dataplex.v1.DataScanJobOrBuilder> 
        getDataScanJobsFieldBuilder() {
      if (dataScanJobsBuilder_ == null) {
        dataScanJobsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataplex.v1.DataScanJob, com.google.cloud.dataplex.v1.DataScanJob.Builder, com.google.cloud.dataplex.v1.DataScanJobOrBuilder>(
                dataScanJobs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dataScanJobs_ = null;
      }
      return dataScanJobsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.ListDataScanJobsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.ListDataScanJobsResponse)
  private static final com.google.cloud.dataplex.v1.ListDataScanJobsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.ListDataScanJobsResponse();
  }

  public static com.google.cloud.dataplex.v1.ListDataScanJobsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDataScanJobsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDataScanJobsResponse>() {
    @java.lang.Override
    public ListDataScanJobsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ListDataScanJobsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDataScanJobsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.ListDataScanJobsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

