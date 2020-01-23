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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 *
 *
 * <pre>
 * AutoprovisioningNodePoolDefaults contains defaults for a node pool created
 * by NAP.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.AutoprovisioningNodePoolDefaults}
 */
public final class AutoprovisioningNodePoolDefaults extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.AutoprovisioningNodePoolDefaults)
    AutoprovisioningNodePoolDefaultsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AutoprovisioningNodePoolDefaults.newBuilder() to construct.
  private AutoprovisioningNodePoolDefaults(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutoprovisioningNodePoolDefaults() {
    oauthScopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    serviceAccount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutoprovisioningNodePoolDefaults();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AutoprovisioningNodePoolDefaults(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                oauthScopes_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              oauthScopes_.add(s);
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              serviceAccount_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        oauthScopes_ = oauthScopes_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_AutoprovisioningNodePoolDefaults_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_AutoprovisioningNodePoolDefaults_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.AutoprovisioningNodePoolDefaults.class,
            com.google.container.v1.AutoprovisioningNodePoolDefaults.Builder.class);
  }

  public static final int OAUTH_SCOPES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList oauthScopes_;
  /**
   *
   *
   * <pre>
   * Scopes that are used by NAP when creating node pools. If oauth_scopes are
   * specified, service_account should be empty.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 1;</code>
   *
   * @return A list containing the oauthScopes.
   */
  public com.google.protobuf.ProtocolStringList getOauthScopesList() {
    return oauthScopes_;
  }
  /**
   *
   *
   * <pre>
   * Scopes that are used by NAP when creating node pools. If oauth_scopes are
   * specified, service_account should be empty.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 1;</code>
   *
   * @return The count of oauthScopes.
   */
  public int getOauthScopesCount() {
    return oauthScopes_.size();
  }
  /**
   *
   *
   * <pre>
   * Scopes that are used by NAP when creating node pools. If oauth_scopes are
   * specified, service_account should be empty.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The oauthScopes at the given index.
   */
  public java.lang.String getOauthScopes(int index) {
    return oauthScopes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Scopes that are used by NAP when creating node pools. If oauth_scopes are
   * specified, service_account should be empty.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the oauthScopes at the given index.
   */
  public com.google.protobuf.ByteString getOauthScopesBytes(int index) {
    return oauthScopes_.getByteString(index);
  }

  public static final int SERVICE_ACCOUNT_FIELD_NUMBER = 2;
  private volatile java.lang.Object serviceAccount_;
  /**
   *
   *
   * <pre>
   * The Google Cloud Platform Service Account to be used by the node VMs. If
   * service_account is specified, scopes should be empty.
   * </pre>
   *
   * <code>string service_account = 2;</code>
   *
   * @return The serviceAccount.
   */
  public java.lang.String getServiceAccount() {
    java.lang.Object ref = serviceAccount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceAccount_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The Google Cloud Platform Service Account to be used by the node VMs. If
   * service_account is specified, scopes should be empty.
   * </pre>
   *
   * <code>string service_account = 2;</code>
   *
   * @return The bytes for serviceAccount.
   */
  public com.google.protobuf.ByteString getServiceAccountBytes() {
    java.lang.Object ref = serviceAccount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceAccount_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < oauthScopes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, oauthScopes_.getRaw(i));
    }
    if (!getServiceAccountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serviceAccount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < oauthScopes_.size(); i++) {
        dataSize += computeStringSizeNoTag(oauthScopes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getOauthScopesList().size();
    }
    if (!getServiceAccountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serviceAccount_);
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
    if (!(obj instanceof com.google.container.v1.AutoprovisioningNodePoolDefaults)) {
      return super.equals(obj);
    }
    com.google.container.v1.AutoprovisioningNodePoolDefaults other =
        (com.google.container.v1.AutoprovisioningNodePoolDefaults) obj;

    if (!getOauthScopesList().equals(other.getOauthScopesList())) return false;
    if (!getServiceAccount().equals(other.getServiceAccount())) return false;
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
    if (getOauthScopesCount() > 0) {
      hash = (37 * hash) + OAUTH_SCOPES_FIELD_NUMBER;
      hash = (53 * hash) + getOauthScopesList().hashCode();
    }
    hash = (37 * hash) + SERVICE_ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getServiceAccount().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.AutoprovisioningNodePoolDefaults parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AutoprovisioningNodePoolDefaults parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AutoprovisioningNodePoolDefaults parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AutoprovisioningNodePoolDefaults parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AutoprovisioningNodePoolDefaults parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AutoprovisioningNodePoolDefaults parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AutoprovisioningNodePoolDefaults parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AutoprovisioningNodePoolDefaults parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.AutoprovisioningNodePoolDefaults parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AutoprovisioningNodePoolDefaults parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.AutoprovisioningNodePoolDefaults parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AutoprovisioningNodePoolDefaults parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.container.v1.AutoprovisioningNodePoolDefaults prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * AutoprovisioningNodePoolDefaults contains defaults for a node pool created
   * by NAP.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.AutoprovisioningNodePoolDefaults}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.AutoprovisioningNodePoolDefaults)
      com.google.container.v1.AutoprovisioningNodePoolDefaultsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AutoprovisioningNodePoolDefaults_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AutoprovisioningNodePoolDefaults_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.AutoprovisioningNodePoolDefaults.class,
              com.google.container.v1.AutoprovisioningNodePoolDefaults.Builder.class);
    }

    // Construct using com.google.container.v1.AutoprovisioningNodePoolDefaults.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      oauthScopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      serviceAccount_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AutoprovisioningNodePoolDefaults_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.AutoprovisioningNodePoolDefaults getDefaultInstanceForType() {
      return com.google.container.v1.AutoprovisioningNodePoolDefaults.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.AutoprovisioningNodePoolDefaults build() {
      com.google.container.v1.AutoprovisioningNodePoolDefaults result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.AutoprovisioningNodePoolDefaults buildPartial() {
      com.google.container.v1.AutoprovisioningNodePoolDefaults result =
          new com.google.container.v1.AutoprovisioningNodePoolDefaults(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        oauthScopes_ = oauthScopes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.oauthScopes_ = oauthScopes_;
      result.serviceAccount_ = serviceAccount_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1.AutoprovisioningNodePoolDefaults) {
        return mergeFrom((com.google.container.v1.AutoprovisioningNodePoolDefaults) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.AutoprovisioningNodePoolDefaults other) {
      if (other == com.google.container.v1.AutoprovisioningNodePoolDefaults.getDefaultInstance())
        return this;
      if (!other.oauthScopes_.isEmpty()) {
        if (oauthScopes_.isEmpty()) {
          oauthScopes_ = other.oauthScopes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureOauthScopesIsMutable();
          oauthScopes_.addAll(other.oauthScopes_);
        }
        onChanged();
      }
      if (!other.getServiceAccount().isEmpty()) {
        serviceAccount_ = other.serviceAccount_;
        onChanged();
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
      com.google.container.v1.AutoprovisioningNodePoolDefaults parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.container.v1.AutoprovisioningNodePoolDefaults) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList oauthScopes_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureOauthScopesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        oauthScopes_ = new com.google.protobuf.LazyStringArrayList(oauthScopes_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Scopes that are used by NAP when creating node pools. If oauth_scopes are
     * specified, service_account should be empty.
     * </pre>
     *
     * <code>repeated string oauth_scopes = 1;</code>
     *
     * @return A list containing the oauthScopes.
     */
    public com.google.protobuf.ProtocolStringList getOauthScopesList() {
      return oauthScopes_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Scopes that are used by NAP when creating node pools. If oauth_scopes are
     * specified, service_account should be empty.
     * </pre>
     *
     * <code>repeated string oauth_scopes = 1;</code>
     *
     * @return The count of oauthScopes.
     */
    public int getOauthScopesCount() {
      return oauthScopes_.size();
    }
    /**
     *
     *
     * <pre>
     * Scopes that are used by NAP when creating node pools. If oauth_scopes are
     * specified, service_account should be empty.
     * </pre>
     *
     * <code>repeated string oauth_scopes = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The oauthScopes at the given index.
     */
    public java.lang.String getOauthScopes(int index) {
      return oauthScopes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Scopes that are used by NAP when creating node pools. If oauth_scopes are
     * specified, service_account should be empty.
     * </pre>
     *
     * <code>repeated string oauth_scopes = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the oauthScopes at the given index.
     */
    public com.google.protobuf.ByteString getOauthScopesBytes(int index) {
      return oauthScopes_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Scopes that are used by NAP when creating node pools. If oauth_scopes are
     * specified, service_account should be empty.
     * </pre>
     *
     * <code>repeated string oauth_scopes = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The oauthScopes to set.
     * @return This builder for chaining.
     */
    public Builder setOauthScopes(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOauthScopesIsMutable();
      oauthScopes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Scopes that are used by NAP when creating node pools. If oauth_scopes are
     * specified, service_account should be empty.
     * </pre>
     *
     * <code>repeated string oauth_scopes = 1;</code>
     *
     * @param value The oauthScopes to add.
     * @return This builder for chaining.
     */
    public Builder addOauthScopes(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOauthScopesIsMutable();
      oauthScopes_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Scopes that are used by NAP when creating node pools. If oauth_scopes are
     * specified, service_account should be empty.
     * </pre>
     *
     * <code>repeated string oauth_scopes = 1;</code>
     *
     * @param values The oauthScopes to add.
     * @return This builder for chaining.
     */
    public Builder addAllOauthScopes(java.lang.Iterable<java.lang.String> values) {
      ensureOauthScopesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, oauthScopes_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Scopes that are used by NAP when creating node pools. If oauth_scopes are
     * specified, service_account should be empty.
     * </pre>
     *
     * <code>repeated string oauth_scopes = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOauthScopes() {
      oauthScopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Scopes that are used by NAP when creating node pools. If oauth_scopes are
     * specified, service_account should be empty.
     * </pre>
     *
     * <code>repeated string oauth_scopes = 1;</code>
     *
     * @param value The bytes of the oauthScopes to add.
     * @return This builder for chaining.
     */
    public Builder addOauthScopesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureOauthScopesIsMutable();
      oauthScopes_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object serviceAccount_ = "";
    /**
     *
     *
     * <pre>
     * The Google Cloud Platform Service Account to be used by the node VMs. If
     * service_account is specified, scopes should be empty.
     * </pre>
     *
     * <code>string service_account = 2;</code>
     *
     * @return The serviceAccount.
     */
    public java.lang.String getServiceAccount() {
      java.lang.Object ref = serviceAccount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceAccount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Platform Service Account to be used by the node VMs. If
     * service_account is specified, scopes should be empty.
     * </pre>
     *
     * <code>string service_account = 2;</code>
     *
     * @return The bytes for serviceAccount.
     */
    public com.google.protobuf.ByteString getServiceAccountBytes() {
      java.lang.Object ref = serviceAccount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceAccount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Platform Service Account to be used by the node VMs. If
     * service_account is specified, scopes should be empty.
     * </pre>
     *
     * <code>string service_account = 2;</code>
     *
     * @param value The serviceAccount to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAccount(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      serviceAccount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Platform Service Account to be used by the node VMs. If
     * service_account is specified, scopes should be empty.
     * </pre>
     *
     * <code>string service_account = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceAccount() {

      serviceAccount_ = getDefaultInstance().getServiceAccount();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Platform Service Account to be used by the node VMs. If
     * service_account is specified, scopes should be empty.
     * </pre>
     *
     * <code>string service_account = 2;</code>
     *
     * @param value The bytes for serviceAccount to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAccountBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      serviceAccount_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.container.v1.AutoprovisioningNodePoolDefaults)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.AutoprovisioningNodePoolDefaults)
  private static final com.google.container.v1.AutoprovisioningNodePoolDefaults DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.AutoprovisioningNodePoolDefaults();
  }

  public static com.google.container.v1.AutoprovisioningNodePoolDefaults getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoprovisioningNodePoolDefaults> PARSER =
      new com.google.protobuf.AbstractParser<AutoprovisioningNodePoolDefaults>() {
        @java.lang.Override
        public AutoprovisioningNodePoolDefaults parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AutoprovisioningNodePoolDefaults(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AutoprovisioningNodePoolDefaults> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoprovisioningNodePoolDefaults> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.AutoprovisioningNodePoolDefaults getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
