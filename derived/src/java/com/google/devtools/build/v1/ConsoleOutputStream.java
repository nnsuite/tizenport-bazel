// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/build/v1/build_events.proto

package com.google.devtools.build.v1;

/**
 * <pre>
 * The type of console output stream.
 * </pre>
 *
 * Protobuf enum {@code google.devtools.build.v1.ConsoleOutputStream}
 */
public enum ConsoleOutputStream
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified or unknown.
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <pre>
   * Normal output stream.
   * </pre>
   *
   * <code>STDOUT = 1;</code>
   */
  STDOUT(1),
  /**
   * <pre>
   * Error output stream.
   * </pre>
   *
   * <code>STDERR = 2;</code>
   */
  STDERR(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified or unknown.
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * Normal output stream.
   * </pre>
   *
   * <code>STDOUT = 1;</code>
   */
  public static final int STDOUT_VALUE = 1;
  /**
   * <pre>
   * Error output stream.
   * </pre>
   *
   * <code>STDERR = 2;</code>
   */
  public static final int STDERR_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ConsoleOutputStream valueOf(int value) {
    return forNumber(value);
  }

  public static ConsoleOutputStream forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return STDOUT;
      case 2: return STDERR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ConsoleOutputStream>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ConsoleOutputStream> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ConsoleOutputStream>() {
          public ConsoleOutputStream findValueByNumber(int number) {
            return ConsoleOutputStream.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.devtools.build.v1.BuildEventProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ConsoleOutputStream[] VALUES = values();

  public static ConsoleOutputStream valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ConsoleOutputStream(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.devtools.build.v1.ConsoleOutputStream)
}

