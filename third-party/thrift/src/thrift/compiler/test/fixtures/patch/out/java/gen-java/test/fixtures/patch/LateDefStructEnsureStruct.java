/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.patch;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import com.google.common.collect.*;
import java.util.*;
import javax.annotation.Nullable;
import org.apache.thrift.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;
import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.MoreObjects.ToStringHelper;

@SwiftGenerated
@com.facebook.swift.codec.ThriftStruct(value="LateDefStructEnsureStruct", builder=LateDefStructEnsureStruct.Builder.class)
public final class LateDefStructEnsureStruct implements com.facebook.thrift.payload.ThriftSerializable {
    @ThriftConstructor
    public LateDefStructEnsureStruct(
    ) {
    }
    
    
    
    public static class Builder {
    
    public Builder() { }
        public Builder(LateDefStructEnsureStruct other) {
        }
    
        @ThriftConstructor
        public LateDefStructEnsureStruct build() {
            LateDefStructEnsureStruct result = new LateDefStructEnsureStruct (
            );
            return result;
        }
    }
        
    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("LateDefStructEnsureStruct");
static {
      com.facebook.thrift.type.TypeRegistry.add(new com.facebook.thrift.type.Type(
        new com.facebook.thrift.type.UniversalName("test.dev/fixtures/patch/LateDefStructEnsureStruct"),
        LateDefStructEnsureStruct.class, LateDefStructEnsureStruct::read0));
    }
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        return helper.toString();
    }
    
    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        LateDefStructEnsureStruct other = (LateDefStructEnsureStruct)o;
    
        return
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<LateDefStructEnsureStruct> asReader() {
      return LateDefStructEnsureStruct::read0;
    }
    
    public static LateDefStructEnsureStruct read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(LateDefStructEnsureStruct.NAMES_TO_IDS, LateDefStructEnsureStruct.THRIFT_NAMES_TO_IDS, LateDefStructEnsureStruct.FIELD_METADATA);
      LateDefStructEnsureStruct.Builder builder = new LateDefStructEnsureStruct.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        default:
          TProtocolUtil.skip(oprot, __field.type);
          break;
        }
        oprot.readFieldEnd();
      }
      oprot.readStructEnd();
      return builder.build();
    }
    
    public void write0(TProtocol oprot) throws TException {
      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _LateDefStructEnsureStructLazy {
        private static final LateDefStructEnsureStruct _DEFAULT = new LateDefStructEnsureStruct.Builder().build();
    }
    
    public static LateDefStructEnsureStruct defaultInstance() {
        return  _LateDefStructEnsureStructLazy._DEFAULT;
    }
}