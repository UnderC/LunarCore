// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedInt;

public final class DelMailScRspOuterClass {
  /**
   * Protobuf type {@code DelMailScRsp}
   */
  public static final class DelMailScRsp extends ProtoMessage<DelMailScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 10;</code>
     */
    private int retcode;

    /**
     * <code>repeated uint32 id_list = 14;</code>
     */
    private final RepeatedInt idList = RepeatedInt.newEmptyInstance();

    private DelMailScRsp() {
    }

    /**
     * @return a new empty instance of {@code DelMailScRsp}
     */
    public static DelMailScRsp newInstance() {
      return new DelMailScRsp();
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return this
     */
    public DelMailScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @param value the retcode to set
     * @return this
     */
    public DelMailScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated uint32 id_list = 14;</code>
     * @return whether the idList field is set
     */
    public boolean hasIdList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 id_list = 14;</code>
     * @return this
     */
    public DelMailScRsp clearIdList() {
      bitField0_ &= ~0x00000002;
      idList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 id_list = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getIdList() {
      return idList;
    }

    /**
     * <code>repeated uint32 id_list = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableIdList() {
      bitField0_ |= 0x00000002;
      return idList;
    }

    /**
     * <code>repeated uint32 id_list = 14;</code>
     * @param value the idList to add
     * @return this
     */
    public DelMailScRsp addIdList(final int value) {
      bitField0_ |= 0x00000002;
      idList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 id_list = 14;</code>
     * @param values the idList to add
     * @return this
     */
    public DelMailScRsp addAllIdList(final int... values) {
      bitField0_ |= 0x00000002;
      idList.addAll(values);
      return this;
    }

    @Override
    public DelMailScRsp copyFrom(final DelMailScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        idList.copyFrom(other.idList);
      }
      return this;
    }

    @Override
    public DelMailScRsp mergeFrom(final DelMailScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasIdList()) {
        getMutableIdList().addAll(other.idList);
      }
      return this;
    }

    @Override
    public DelMailScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      idList.clear();
      return this;
    }

    @Override
    public DelMailScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      idList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof DelMailScRsp)) {
        return false;
      }
      DelMailScRsp other = (DelMailScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasIdList() || idList.equals(other.idList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < idList.length(); i++) {
          output.writeRawByte((byte) 112);
          output.writeUInt32NoTag(idList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * idList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(idList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DelMailScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // idList [packed=true]
            input.readPackedUInt32(idList, tag);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
          case 112: {
            // idList [packed=false]
            tag = input.readRepeatedUInt32(idList, tag);
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.idList, idList);
      }
      output.endObject();
    }

    @Override
    public DelMailScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1194185639:
          case 1652577602: {
            if (input.isAtField(FieldNames.idList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(idList);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public DelMailScRsp clone() {
      return new DelMailScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DelMailScRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DelMailScRsp(), data).checkInitialized();
    }

    public static DelMailScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DelMailScRsp(), input).checkInitialized();
    }

    public static DelMailScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DelMailScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating DelMailScRsp messages
     */
    public static MessageFactory<DelMailScRsp> getFactory() {
      return DelMailScRspFactory.INSTANCE;
    }

    private enum DelMailScRspFactory implements MessageFactory<DelMailScRsp> {
      INSTANCE;

      @Override
      public DelMailScRsp create() {
        return DelMailScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName idList = FieldName.forField("idList", "id_list");
    }
  }
}