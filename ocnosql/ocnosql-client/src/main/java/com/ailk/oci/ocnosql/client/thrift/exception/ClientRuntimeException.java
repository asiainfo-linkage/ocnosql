/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ailk.oci.ocnosql.client.thrift.exception;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.TException;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
public class ClientRuntimeException extends TException implements org.apache.thrift.TBase<ClientRuntimeException, ClientRuntimeException._Fields>, java.io.Serializable, Cloneable, Comparable<ClientRuntimeException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClientRuntimeException");

  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ERRORMESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("errormessage", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ClientRuntimeExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ClientRuntimeExceptionTupleSchemeFactory());
  }

  public String code; // required
  public String errormessage; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CODE((short)1, "code"),
    ERRORMESSAGE((short)2, "errormessage");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CODE
          return CODE;
        case 2: // ERRORMESSAGE
          return ERRORMESSAGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERRORMESSAGE, new org.apache.thrift.meta_data.FieldMetaData("errormessage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClientRuntimeException.class, metaDataMap);
  }

  public ClientRuntimeException() {
  }

  public ClientRuntimeException(
    String code,
    String errormessage)
  {
    this();
    this.code = code;
    this.errormessage = errormessage;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClientRuntimeException(ClientRuntimeException other) {
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetErrormessage()) {
      this.errormessage = other.errormessage;
    }
  }

  public ClientRuntimeException deepCopy() {
    return new ClientRuntimeException(this);
  }

  @Override
  public void clear() {
    this.code = null;
    this.errormessage = null;
  }

  public String getCode() {
    return this.code;
  }

  public ClientRuntimeException setCode(String code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  public String getErrormessage() {
    return this.errormessage;
  }

  public ClientRuntimeException setErrormessage(String errormessage) {
    this.errormessage = errormessage;
    return this;
  }

  public void unsetErrormessage() {
    this.errormessage = null;
  }

  /** Returns true if field errormessage is set (has been assigned a value) and false otherwise */
  public boolean isSetErrormessage() {
    return this.errormessage != null;
  }

  public void setErrormessageIsSet(boolean value) {
    if (!value) {
      this.errormessage = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((String)value);
      }
      break;

    case ERRORMESSAGE:
      if (value == null) {
        unsetErrormessage();
      } else {
        setErrormessage((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CODE:
      return getCode();

    case ERRORMESSAGE:
      return getErrormessage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CODE:
      return isSetCode();
    case ERRORMESSAGE:
      return isSetErrormessage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ClientRuntimeException)
      return this.equals((ClientRuntimeException)that);
    return false;
  }

  public boolean equals(ClientRuntimeException that) {
    if (that == null)
      return false;

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_errormessage = true && this.isSetErrormessage();
    boolean that_present_errormessage = true && that.isSetErrormessage();
    if (this_present_errormessage || that_present_errormessage) {
      if (!(this_present_errormessage && that_present_errormessage))
        return false;
      if (!this.errormessage.equals(that.errormessage))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ClientRuntimeException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrormessage()).compareTo(other.isSetErrormessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrormessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errormessage, other.errormessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ClientRuntimeException(");
    boolean first = true;

    sb.append("code:");
    if (this.code == null) {
      sb.append("null");
    } else {
      sb.append(this.code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("errormessage:");
    if (this.errormessage == null) {
      sb.append("null");
    } else {
      sb.append(this.errormessage);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ClientRuntimeExceptionStandardSchemeFactory implements SchemeFactory {
    public ClientRuntimeExceptionStandardScheme getScheme() {
      return new ClientRuntimeExceptionStandardScheme();
    }
  }

  private static class ClientRuntimeExceptionStandardScheme extends StandardScheme<ClientRuntimeException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ClientRuntimeException struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERRORMESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errormessage = iprot.readString();
              struct.setErrormessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ClientRuntimeException struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.code != null) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeString(struct.code);
        oprot.writeFieldEnd();
      }
      if (struct.errormessage != null) {
        oprot.writeFieldBegin(ERRORMESSAGE_FIELD_DESC);
        oprot.writeString(struct.errormessage);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClientRuntimeExceptionTupleSchemeFactory implements SchemeFactory {
    public ClientRuntimeExceptionTupleScheme getScheme() {
      return new ClientRuntimeExceptionTupleScheme();
    }
  }

  private static class ClientRuntimeExceptionTupleScheme extends TupleScheme<ClientRuntimeException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClientRuntimeException struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCode()) {
        optionals.set(0);
      }
      if (struct.isSetErrormessage()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCode()) {
        oprot.writeString(struct.code);
      }
      if (struct.isSetErrormessage()) {
        oprot.writeString(struct.errormessage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClientRuntimeException struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.code = iprot.readString();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.errormessage = iprot.readString();
        struct.setErrormessageIsSet(true);
      }
    }
  }

}

