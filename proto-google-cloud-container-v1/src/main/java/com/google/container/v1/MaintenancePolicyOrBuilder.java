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

public interface MaintenancePolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.MaintenancePolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies the maintenance window in which maintenance may be performed.
   * </pre>
   *
   * <code>.google.container.v1.MaintenanceWindow window = 1;</code>
   *
   * @return Whether the window field is set.
   */
  boolean hasWindow();
  /**
   *
   *
   * <pre>
   * Specifies the maintenance window in which maintenance may be performed.
   * </pre>
   *
   * <code>.google.container.v1.MaintenanceWindow window = 1;</code>
   *
   * @return The window.
   */
  com.google.container.v1.MaintenanceWindow getWindow();
  /**
   *
   *
   * <pre>
   * Specifies the maintenance window in which maintenance may be performed.
   * </pre>
   *
   * <code>.google.container.v1.MaintenanceWindow window = 1;</code>
   */
  com.google.container.v1.MaintenanceWindowOrBuilder getWindowOrBuilder();

  /**
   *
   *
   * <pre>
   * A hash identifying the version of this policy, so that updates to fields of
   * the policy won't accidentally undo intermediate changes (and so that users
   * of the API unaware of some fields won't accidentally remove other fields).
   * Make a &lt;code&gt;get()&lt;/code&gt; request to the cluster to get the current
   * resource version and include it with requests to set the policy.
   * </pre>
   *
   * <code>string resource_version = 3;</code>
   *
   * @return The resourceVersion.
   */
  java.lang.String getResourceVersion();
  /**
   *
   *
   * <pre>
   * A hash identifying the version of this policy, so that updates to fields of
   * the policy won't accidentally undo intermediate changes (and so that users
   * of the API unaware of some fields won't accidentally remove other fields).
   * Make a &lt;code&gt;get()&lt;/code&gt; request to the cluster to get the current
   * resource version and include it with requests to set the policy.
   * </pre>
   *
   * <code>string resource_version = 3;</code>
   *
   * @return The bytes for resourceVersion.
   */
  com.google.protobuf.ByteString getResourceVersionBytes();
}
