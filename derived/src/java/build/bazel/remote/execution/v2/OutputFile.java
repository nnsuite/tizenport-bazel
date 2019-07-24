// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

/**
 * <pre>
 * An `OutputFile` is similar to a
 * [FileNode][build.bazel.remote.execution.v2.FileNode], but it is used as an
 * output in an `ActionResult`. It allows a full file path rather than
 * only a name.
 * `OutputFile` is binary-compatible with `FileNode`.
 * </pre>
 *
 * Protobuf type {@code build.bazel.remote.execution.v2.OutputFile}
 */
public  final class OutputFile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.bazel.remote.execution.v2.OutputFile)
    OutputFileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OutputFile.newBuilder() to construct.
  private OutputFile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OutputFile() {
    path_ = "";
    isExecutable_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OutputFile(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            path_ = s;
            break;
          }
          case 18: {
            build.bazel.remote.execution.v2.Digest.Builder subBuilder = null;
            if (digest_ != null) {
              subBuilder = digest_.toBuilder();
            }
            digest_ = input.readMessage(build.bazel.remote.execution.v2.Digest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(digest_);
              digest_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            isExecutable_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_OutputFile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_OutputFile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.bazel.remote.execution.v2.OutputFile.class, build.bazel.remote.execution.v2.OutputFile.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object path_;
  /**
   * <pre>
   * The full path of the file relative to the input root, including the
   * filename. The path separator is a forward slash `/`. Since this is a
   * relative path, it MUST NOT begin with a leading forward slash.
   * </pre>
   *
   * <code>string path = 1;</code>
   */
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The full path of the file relative to the input root, including the
   * filename. The path separator is a forward slash `/`. Since this is a
   * relative path, it MUST NOT begin with a leading forward slash.
   * </pre>
   *
   * <code>string path = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIGEST_FIELD_NUMBER = 2;
  private build.bazel.remote.execution.v2.Digest digest_;
  /**
   * <pre>
   * The digest of the file's content.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
   */
  public boolean hasDigest() {
    return digest_ != null;
  }
  /**
   * <pre>
   * The digest of the file's content.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
   */
  public build.bazel.remote.execution.v2.Digest getDigest() {
    return digest_ == null ? build.bazel.remote.execution.v2.Digest.getDefaultInstance() : digest_;
  }
  /**
   * <pre>
   * The digest of the file's content.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
   */
  public build.bazel.remote.execution.v2.DigestOrBuilder getDigestOrBuilder() {
    return getDigest();
  }

  public static final int IS_EXECUTABLE_FIELD_NUMBER = 4;
  private boolean isExecutable_;
  /**
   * <pre>
   * True if file is executable, false otherwise.
   * </pre>
   *
   * <code>bool is_executable = 4;</code>
   */
  public boolean getIsExecutable() {
    return isExecutable_;
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
    if (!getPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
    }
    if (digest_ != null) {
      output.writeMessage(2, getDigest());
    }
    if (isExecutable_ != false) {
      output.writeBool(4, isExecutable_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
    }
    if (digest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDigest());
    }
    if (isExecutable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isExecutable_);
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
    if (!(obj instanceof build.bazel.remote.execution.v2.OutputFile)) {
      return super.equals(obj);
    }
    build.bazel.remote.execution.v2.OutputFile other = (build.bazel.remote.execution.v2.OutputFile) obj;

    boolean result = true;
    result = result && getPath()
        .equals(other.getPath());
    result = result && (hasDigest() == other.hasDigest());
    if (hasDigest()) {
      result = result && getDigest()
          .equals(other.getDigest());
    }
    result = result && (getIsExecutable()
        == other.getIsExecutable());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    if (hasDigest()) {
      hash = (37 * hash) + DIGEST_FIELD_NUMBER;
      hash = (53 * hash) + getDigest().hashCode();
    }
    hash = (37 * hash) + IS_EXECUTABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsExecutable());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.bazel.remote.execution.v2.OutputFile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.OutputFile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.OutputFile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.OutputFile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.OutputFile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.OutputFile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.OutputFile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.OutputFile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.OutputFile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.OutputFile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.OutputFile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.OutputFile parseFrom(
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
  public static Builder newBuilder(build.bazel.remote.execution.v2.OutputFile prototype) {
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
   * An `OutputFile` is similar to a
   * [FileNode][build.bazel.remote.execution.v2.FileNode], but it is used as an
   * output in an `ActionResult`. It allows a full file path rather than
   * only a name.
   * `OutputFile` is binary-compatible with `FileNode`.
   * </pre>
   *
   * Protobuf type {@code build.bazel.remote.execution.v2.OutputFile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.bazel.remote.execution.v2.OutputFile)
      build.bazel.remote.execution.v2.OutputFileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_OutputFile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_OutputFile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.bazel.remote.execution.v2.OutputFile.class, build.bazel.remote.execution.v2.OutputFile.Builder.class);
    }

    // Construct using build.bazel.remote.execution.v2.OutputFile.newBuilder()
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
      path_ = "";

      if (digestBuilder_ == null) {
        digest_ = null;
      } else {
        digest_ = null;
        digestBuilder_ = null;
      }
      isExecutable_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_OutputFile_descriptor;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.OutputFile getDefaultInstanceForType() {
      return build.bazel.remote.execution.v2.OutputFile.getDefaultInstance();
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.OutputFile build() {
      build.bazel.remote.execution.v2.OutputFile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.OutputFile buildPartial() {
      build.bazel.remote.execution.v2.OutputFile result = new build.bazel.remote.execution.v2.OutputFile(this);
      result.path_ = path_;
      if (digestBuilder_ == null) {
        result.digest_ = digest_;
      } else {
        result.digest_ = digestBuilder_.build();
      }
      result.isExecutable_ = isExecutable_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.bazel.remote.execution.v2.OutputFile) {
        return mergeFrom((build.bazel.remote.execution.v2.OutputFile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.bazel.remote.execution.v2.OutputFile other) {
      if (other == build.bazel.remote.execution.v2.OutputFile.getDefaultInstance()) return this;
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (other.hasDigest()) {
        mergeDigest(other.getDigest());
      }
      if (other.getIsExecutable() != false) {
        setIsExecutable(other.getIsExecutable());
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
      build.bazel.remote.execution.v2.OutputFile parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.bazel.remote.execution.v2.OutputFile) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <pre>
     * The full path of the file relative to the input root, including the
     * filename. The path separator is a forward slash `/`. Since this is a
     * relative path, it MUST NOT begin with a leading forward slash.
     * </pre>
     *
     * <code>string path = 1;</code>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The full path of the file relative to the input root, including the
     * filename. The path separator is a forward slash `/`. Since this is a
     * relative path, it MUST NOT begin with a leading forward slash.
     * </pre>
     *
     * <code>string path = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The full path of the file relative to the input root, including the
     * filename. The path separator is a forward slash `/`. Since this is a
     * relative path, it MUST NOT begin with a leading forward slash.
     * </pre>
     *
     * <code>string path = 1;</code>
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The full path of the file relative to the input root, including the
     * filename. The path separator is a forward slash `/`. Since this is a
     * relative path, it MUST NOT begin with a leading forward slash.
     * </pre>
     *
     * <code>string path = 1;</code>
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The full path of the file relative to the input root, including the
     * filename. The path separator is a forward slash `/`. Since this is a
     * relative path, it MUST NOT begin with a leading forward slash.
     * </pre>
     *
     * <code>string path = 1;</code>
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
      onChanged();
      return this;
    }

    private build.bazel.remote.execution.v2.Digest digest_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder> digestBuilder_;
    /**
     * <pre>
     * The digest of the file's content.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
     */
    public boolean hasDigest() {
      return digestBuilder_ != null || digest_ != null;
    }
    /**
     * <pre>
     * The digest of the file's content.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
     */
    public build.bazel.remote.execution.v2.Digest getDigest() {
      if (digestBuilder_ == null) {
        return digest_ == null ? build.bazel.remote.execution.v2.Digest.getDefaultInstance() : digest_;
      } else {
        return digestBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The digest of the file's content.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
     */
    public Builder setDigest(build.bazel.remote.execution.v2.Digest value) {
      if (digestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        digest_ = value;
        onChanged();
      } else {
        digestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the file's content.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
     */
    public Builder setDigest(
        build.bazel.remote.execution.v2.Digest.Builder builderForValue) {
      if (digestBuilder_ == null) {
        digest_ = builderForValue.build();
        onChanged();
      } else {
        digestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the file's content.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
     */
    public Builder mergeDigest(build.bazel.remote.execution.v2.Digest value) {
      if (digestBuilder_ == null) {
        if (digest_ != null) {
          digest_ =
            build.bazel.remote.execution.v2.Digest.newBuilder(digest_).mergeFrom(value).buildPartial();
        } else {
          digest_ = value;
        }
        onChanged();
      } else {
        digestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the file's content.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
     */
    public Builder clearDigest() {
      if (digestBuilder_ == null) {
        digest_ = null;
        onChanged();
      } else {
        digest_ = null;
        digestBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the file's content.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
     */
    public build.bazel.remote.execution.v2.Digest.Builder getDigestBuilder() {
      
      onChanged();
      return getDigestFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The digest of the file's content.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
     */
    public build.bazel.remote.execution.v2.DigestOrBuilder getDigestOrBuilder() {
      if (digestBuilder_ != null) {
        return digestBuilder_.getMessageOrBuilder();
      } else {
        return digest_ == null ?
            build.bazel.remote.execution.v2.Digest.getDefaultInstance() : digest_;
      }
    }
    /**
     * <pre>
     * The digest of the file's content.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder> 
        getDigestFieldBuilder() {
      if (digestBuilder_ == null) {
        digestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder>(
                getDigest(),
                getParentForChildren(),
                isClean());
        digest_ = null;
      }
      return digestBuilder_;
    }

    private boolean isExecutable_ ;
    /**
     * <pre>
     * True if file is executable, false otherwise.
     * </pre>
     *
     * <code>bool is_executable = 4;</code>
     */
    public boolean getIsExecutable() {
      return isExecutable_;
    }
    /**
     * <pre>
     * True if file is executable, false otherwise.
     * </pre>
     *
     * <code>bool is_executable = 4;</code>
     */
    public Builder setIsExecutable(boolean value) {
      
      isExecutable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if file is executable, false otherwise.
     * </pre>
     *
     * <code>bool is_executable = 4;</code>
     */
    public Builder clearIsExecutable() {
      
      isExecutable_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:build.bazel.remote.execution.v2.OutputFile)
  }

  // @@protoc_insertion_point(class_scope:build.bazel.remote.execution.v2.OutputFile)
  private static final build.bazel.remote.execution.v2.OutputFile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.bazel.remote.execution.v2.OutputFile();
  }

  public static build.bazel.remote.execution.v2.OutputFile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OutputFile>
      PARSER = new com.google.protobuf.AbstractParser<OutputFile>() {
    @java.lang.Override
    public OutputFile parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OutputFile(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OutputFile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OutputFile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.bazel.remote.execution.v2.OutputFile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

