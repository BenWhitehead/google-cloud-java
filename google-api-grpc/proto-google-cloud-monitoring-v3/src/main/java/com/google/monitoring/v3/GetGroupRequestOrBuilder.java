// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/group_service.proto

package com.google.monitoring.v3;

public interface GetGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.GetGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The group to retrieve. The format is
   * `"projects/{project_id_or_number}/groups/{group_id}"`.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The group to retrieve. The format is
   * `"projects/{project_id_or_number}/groups/{group_id}"`.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}