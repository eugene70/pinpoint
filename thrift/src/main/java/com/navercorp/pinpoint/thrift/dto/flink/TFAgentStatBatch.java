/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto.flink;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-02-12")
public class TFAgentStatBatch implements org.apache.thrift.TBase<TFAgentStatBatch, TFAgentStatBatch._Fields>, java.io.Serializable, Cloneable, Comparable<TFAgentStatBatch> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFAgentStatBatch");

  private static final org.apache.thrift.protocol.TField AGENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("agentId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField START_TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("startTimestamp", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField AGENT_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("agentStats", org.apache.thrift.protocol.TType.LIST, (short)10);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TFAgentStatBatchStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TFAgentStatBatchTupleSchemeFactory();

  private java.lang.String agentId; // required
  private long startTimestamp; // required
  private java.util.List<TFAgentStat> agentStats; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AGENT_ID((short)1, "agentId"),
    START_TIMESTAMP((short)2, "startTimestamp"),
    AGENT_STATS((short)10, "agentStats");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // AGENT_ID
          return AGENT_ID;
        case 2: // START_TIMESTAMP
          return START_TIMESTAMP;
        case 10: // AGENT_STATS
          return AGENT_STATS;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STARTTIMESTAMP_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AGENT_ID, new org.apache.thrift.meta_data.FieldMetaData("agentId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.START_TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("startTimestamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.AGENT_STATS, new org.apache.thrift.meta_data.FieldMetaData("agentStats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TFAgentStat.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFAgentStatBatch.class, metaDataMap);
  }

  public TFAgentStatBatch() {
  }

  public TFAgentStatBatch(
    java.lang.String agentId,
    long startTimestamp,
    java.util.List<TFAgentStat> agentStats)
  {
    this();
    this.agentId = agentId;
    this.startTimestamp = startTimestamp;
    setStartTimestampIsSet(true);
    this.agentStats = agentStats;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFAgentStatBatch(TFAgentStatBatch other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAgentId()) {
      this.agentId = other.agentId;
    }
    this.startTimestamp = other.startTimestamp;
    if (other.isSetAgentStats()) {
      java.util.List<TFAgentStat> __this__agentStats = new java.util.ArrayList<TFAgentStat>(other.agentStats.size());
      for (TFAgentStat other_element : other.agentStats) {
        __this__agentStats.add(new TFAgentStat(other_element));
      }
      this.agentStats = __this__agentStats;
    }
  }

  public TFAgentStatBatch deepCopy() {
    return new TFAgentStatBatch(this);
  }

  @Override
  public void clear() {
    this.agentId = null;
    setStartTimestampIsSet(false);
    this.startTimestamp = 0;
    this.agentStats = null;
  }

  public java.lang.String getAgentId() {
    return this.agentId;
  }

  public void setAgentId(java.lang.String agentId) {
    this.agentId = agentId;
  }

  public void unsetAgentId() {
    this.agentId = null;
  }

  /** Returns true if field agentId is set (has been assigned a value) and false otherwise */
  public boolean isSetAgentId() {
    return this.agentId != null;
  }

  public void setAgentIdIsSet(boolean value) {
    if (!value) {
      this.agentId = null;
    }
  }

  public long getStartTimestamp() {
    return this.startTimestamp;
  }

  public void setStartTimestamp(long startTimestamp) {
    this.startTimestamp = startTimestamp;
    setStartTimestampIsSet(true);
  }

  public void unsetStartTimestamp() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STARTTIMESTAMP_ISSET_ID);
  }

  /** Returns true if field startTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTimestamp() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STARTTIMESTAMP_ISSET_ID);
  }

  public void setStartTimestampIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STARTTIMESTAMP_ISSET_ID, value);
  }

  public int getAgentStatsSize() {
    return (this.agentStats == null) ? 0 : this.agentStats.size();
  }

  public java.util.Iterator<TFAgentStat> getAgentStatsIterator() {
    return (this.agentStats == null) ? null : this.agentStats.iterator();
  }

  public void addToAgentStats(TFAgentStat elem) {
    if (this.agentStats == null) {
      this.agentStats = new java.util.ArrayList<TFAgentStat>();
    }
    this.agentStats.add(elem);
  }

  public java.util.List<TFAgentStat> getAgentStats() {
    return this.agentStats;
  }

  public void setAgentStats(java.util.List<TFAgentStat> agentStats) {
    this.agentStats = agentStats;
  }

  public void unsetAgentStats() {
    this.agentStats = null;
  }

  /** Returns true if field agentStats is set (has been assigned a value) and false otherwise */
  public boolean isSetAgentStats() {
    return this.agentStats != null;
  }

  public void setAgentStatsIsSet(boolean value) {
    if (!value) {
      this.agentStats = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case AGENT_ID:
      if (value == null) {
        unsetAgentId();
      } else {
        setAgentId((java.lang.String)value);
      }
      break;

    case START_TIMESTAMP:
      if (value == null) {
        unsetStartTimestamp();
      } else {
        setStartTimestamp((java.lang.Long)value);
      }
      break;

    case AGENT_STATS:
      if (value == null) {
        unsetAgentStats();
      } else {
        setAgentStats((java.util.List<TFAgentStat>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case AGENT_ID:
      return getAgentId();

    case START_TIMESTAMP:
      return getStartTimestamp();

    case AGENT_STATS:
      return getAgentStats();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case AGENT_ID:
      return isSetAgentId();
    case START_TIMESTAMP:
      return isSetStartTimestamp();
    case AGENT_STATS:
      return isSetAgentStats();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TFAgentStatBatch)
      return this.equals((TFAgentStatBatch)that);
    return false;
  }

  public boolean equals(TFAgentStatBatch that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_agentId = true && this.isSetAgentId();
    boolean that_present_agentId = true && that.isSetAgentId();
    if (this_present_agentId || that_present_agentId) {
      if (!(this_present_agentId && that_present_agentId))
        return false;
      if (!this.agentId.equals(that.agentId))
        return false;
    }

    boolean this_present_startTimestamp = true;
    boolean that_present_startTimestamp = true;
    if (this_present_startTimestamp || that_present_startTimestamp) {
      if (!(this_present_startTimestamp && that_present_startTimestamp))
        return false;
      if (this.startTimestamp != that.startTimestamp)
        return false;
    }

    boolean this_present_agentStats = true && this.isSetAgentStats();
    boolean that_present_agentStats = true && that.isSetAgentStats();
    if (this_present_agentStats || that_present_agentStats) {
      if (!(this_present_agentStats && that_present_agentStats))
        return false;
      if (!this.agentStats.equals(that.agentStats))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAgentId()) ? 131071 : 524287);
    if (isSetAgentId())
      hashCode = hashCode * 8191 + agentId.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(startTimestamp);

    hashCode = hashCode * 8191 + ((isSetAgentStats()) ? 131071 : 524287);
    if (isSetAgentStats())
      hashCode = hashCode * 8191 + agentStats.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TFAgentStatBatch other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAgentId()).compareTo(other.isSetAgentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAgentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.agentId, other.agentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStartTimestamp()).compareTo(other.isSetStartTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startTimestamp, other.startTimestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAgentStats()).compareTo(other.isSetAgentStats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAgentStats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.agentStats, other.agentStats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TFAgentStatBatch(");
    boolean first = true;

    sb.append("agentId:");
    if (this.agentId == null) {
      sb.append("null");
    } else {
      sb.append(this.agentId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("startTimestamp:");
    sb.append(this.startTimestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("agentStats:");
    if (this.agentStats == null) {
      sb.append("null");
    } else {
      sb.append(this.agentStats);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TFAgentStatBatchStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFAgentStatBatchStandardScheme getScheme() {
      return new TFAgentStatBatchStandardScheme();
    }
  }

  private static class TFAgentStatBatchStandardScheme extends org.apache.thrift.scheme.StandardScheme<TFAgentStatBatch> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFAgentStatBatch struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AGENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.agentId = iprot.readString();
              struct.setAgentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.startTimestamp = iprot.readI64();
              struct.setStartTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // AGENT_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.agentStats = new java.util.ArrayList<TFAgentStat>(_list32.size);
                TFAgentStat _elem33;
                for (int _i34 = 0; _i34 < _list32.size; ++_i34)
                {
                  _elem33 = new TFAgentStat();
                  _elem33.read(iprot);
                  struct.agentStats.add(_elem33);
                }
                iprot.readListEnd();
              }
              struct.setAgentStatsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFAgentStatBatch struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.agentId != null) {
        oprot.writeFieldBegin(AGENT_ID_FIELD_DESC);
        oprot.writeString(struct.agentId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(START_TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.startTimestamp);
      oprot.writeFieldEnd();
      if (struct.agentStats != null) {
        oprot.writeFieldBegin(AGENT_STATS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.agentStats.size()));
          for (TFAgentStat _iter35 : struct.agentStats)
          {
            _iter35.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFAgentStatBatchTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFAgentStatBatchTupleScheme getScheme() {
      return new TFAgentStatBatchTupleScheme();
    }
  }

  private static class TFAgentStatBatchTupleScheme extends org.apache.thrift.scheme.TupleScheme<TFAgentStatBatch> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFAgentStatBatch struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAgentId()) {
        optionals.set(0);
      }
      if (struct.isSetStartTimestamp()) {
        optionals.set(1);
      }
      if (struct.isSetAgentStats()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetAgentId()) {
        oprot.writeString(struct.agentId);
      }
      if (struct.isSetStartTimestamp()) {
        oprot.writeI64(struct.startTimestamp);
      }
      if (struct.isSetAgentStats()) {
        {
          oprot.writeI32(struct.agentStats.size());
          for (TFAgentStat _iter36 : struct.agentStats)
          {
            _iter36.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFAgentStatBatch struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.agentId = iprot.readString();
        struct.setAgentIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.startTimestamp = iprot.readI64();
        struct.setStartTimestampIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.agentStats = new java.util.ArrayList<TFAgentStat>(_list37.size);
          TFAgentStat _elem38;
          for (int _i39 = 0; _i39 < _list37.size; ++_i39)
          {
            _elem38 = new TFAgentStat();
            _elem38.read(iprot);
            struct.agentStats.add(_elem38);
          }
        }
        struct.setAgentStatsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
