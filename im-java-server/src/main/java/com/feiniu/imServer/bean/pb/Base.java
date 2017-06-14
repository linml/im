// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base.proto
package com.feiniu.imServer.bean.pb;

public final class Base {
  private Base() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  /**
   * Protobuf enum {@code EuMsgPush}
   *
   * <pre>
   * ��Ϣ��������
   * </pre>
   */
  public enum EuMsgPush
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>MP_NEWORDER = 1;</code>
     */
    MP_NEWORDER(0, 1),
    /**
     * <code>MP_PAYORDER = 2;</code>
     */
    MP_PAYORDER(1, 2),
    /**
     * <code>MP_RETURNORDER = 3;</code>
     */
    MP_RETURNORDER(2, 3),
    /**
     * <code>MP_GOODSCOMMENT = 4;</code>
     */
    MP_GOODSCOMMENT(3, 4),
    ;

    /**
     * <code>MP_NEWORDER = 1;</code>
     */
    public static final int MP_NEWORDER_VALUE = 1;
    /**
     * <code>MP_PAYORDER = 2;</code>
     */
    public static final int MP_PAYORDER_VALUE = 2;
    /**
     * <code>MP_RETURNORDER = 3;</code>
     */
    public static final int MP_RETURNORDER_VALUE = 3;
    /**
     * <code>MP_GOODSCOMMENT = 4;</code>
     */
    public static final int MP_GOODSCOMMENT_VALUE = 4;


    public final int getNumber() { return value; }

    public static EuMsgPush valueOf(int value) {
      switch (value) {
        case 1: return MP_NEWORDER;
        case 2: return MP_PAYORDER;
        case 3: return MP_RETURNORDER;
        case 4: return MP_GOODSCOMMENT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EuMsgPush>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EuMsgPush>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EuMsgPush>() {
            public EuMsgPush findValueByNumber(int number) {
              return EuMsgPush.valueOf(number);
            }
          };

    private final int value;

    private EuMsgPush(int index, int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:EuMsgPush)
  }

  /**
   * Protobuf enum {@code CSCmdID}
   *
   * <pre>
   * Э������(��������ͻ���֮��)
   * </pre>
   */
  public enum CSCmdID
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>CS_CID_MSGPUSH_IND = 40961;</code>
     *
     * <pre>
     * ��Ϣ����
     * </pre>
     */
    CS_CID_MSGPUSH_IND(0, 40961),
    ;

    /**
     * <code>CS_CID_MSGPUSH_IND = 40961;</code>
     *
     * <pre>
     * ��Ϣ����
     * </pre>
     */
    public static final int CS_CID_MSGPUSH_IND_VALUE = 40961;


    public final int getNumber() { return value; }

    public static CSCmdID valueOf(int value) {
      switch (value) {
        case 40961: return CS_CID_MSGPUSH_IND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CSCmdID>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<CSCmdID>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CSCmdID>() {
            public CSCmdID findValueByNumber(int number) {
              return CSCmdID.valueOf(number);
            }
          };

    private final int value;

    private CSCmdID(int index, int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CSCmdID)
  }

  /**
   * Protobuf enum {@code SSCmdID}
   *
   * <pre>
   * Э������(�������������֮��)
   * </pre>
   */
  public enum SSCmdID
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>SS_CID_MSG_PUSH = 61441;</code>
     *
     * <pre>
     * MsgNotify���͸�ImServer	
     * </pre>
     */
    SS_CID_MSG_PUSH(0, 61441),
    ;

    /**
     * <code>SS_CID_MSG_PUSH = 61441;</code>
     *
     * <pre>
     * MsgNotify���͸�ImServer	
     * </pre>
     */
    public static final int SS_CID_MSG_PUSH_VALUE = 61441;


    public final int getNumber() { return value; }

    public static SSCmdID valueOf(int value) {
      switch (value) {
        case 61441: return SS_CID_MSG_PUSH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SSCmdID>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<SSCmdID>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SSCmdID>() {
            public SSCmdID findValueByNumber(int number) {
              return SSCmdID.valueOf(number);
            }
          };

    private final int value;

    private SSCmdID(int index, int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:SSCmdID)
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}