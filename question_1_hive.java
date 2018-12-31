// ORM class for table 'question_1_hive'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Dec 31 00:41:45 PST 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class question_1_hive extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("CountryName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CountryName = (String)value;
      }
    });
    setters.put("IndicatorCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        IndicatorCode = (String)value;
      }
    });
    setters.put("YearsByCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        YearsByCountry = (Integer)value;
      }
    });
    setters.put("Data", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Data = (Float)value;
      }
    });
  }
  public question_1_hive() {
    init0();
  }
  private String CountryName;
  public String get_CountryName() {
    return CountryName;
  }
  public void set_CountryName(String CountryName) {
    this.CountryName = CountryName;
  }
  public question_1_hive with_CountryName(String CountryName) {
    this.CountryName = CountryName;
    return this;
  }
  private String IndicatorCode;
  public String get_IndicatorCode() {
    return IndicatorCode;
  }
  public void set_IndicatorCode(String IndicatorCode) {
    this.IndicatorCode = IndicatorCode;
  }
  public question_1_hive with_IndicatorCode(String IndicatorCode) {
    this.IndicatorCode = IndicatorCode;
    return this;
  }
  private Integer YearsByCountry;
  public Integer get_YearsByCountry() {
    return YearsByCountry;
  }
  public void set_YearsByCountry(Integer YearsByCountry) {
    this.YearsByCountry = YearsByCountry;
  }
  public question_1_hive with_YearsByCountry(Integer YearsByCountry) {
    this.YearsByCountry = YearsByCountry;
    return this;
  }
  private Float Data;
  public Float get_Data() {
    return Data;
  }
  public void set_Data(Float Data) {
    this.Data = Data;
  }
  public question_1_hive with_Data(Float Data) {
    this.Data = Data;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof question_1_hive)) {
      return false;
    }
    question_1_hive that = (question_1_hive) o;
    boolean equal = true;
    equal = equal && (this.CountryName == null ? that.CountryName == null : this.CountryName.equals(that.CountryName));
    equal = equal && (this.IndicatorCode == null ? that.IndicatorCode == null : this.IndicatorCode.equals(that.IndicatorCode));
    equal = equal && (this.YearsByCountry == null ? that.YearsByCountry == null : this.YearsByCountry.equals(that.YearsByCountry));
    equal = equal && (this.Data == null ? that.Data == null : this.Data.equals(that.Data));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof question_1_hive)) {
      return false;
    }
    question_1_hive that = (question_1_hive) o;
    boolean equal = true;
    equal = equal && (this.CountryName == null ? that.CountryName == null : this.CountryName.equals(that.CountryName));
    equal = equal && (this.IndicatorCode == null ? that.IndicatorCode == null : this.IndicatorCode.equals(that.IndicatorCode));
    equal = equal && (this.YearsByCountry == null ? that.YearsByCountry == null : this.YearsByCountry.equals(that.YearsByCountry));
    equal = equal && (this.Data == null ? that.Data == null : this.Data.equals(that.Data));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CountryName = JdbcWritableBridge.readString(1, __dbResults);
    this.IndicatorCode = JdbcWritableBridge.readString(2, __dbResults);
    this.YearsByCountry = JdbcWritableBridge.readInteger(3, __dbResults);
    this.Data = JdbcWritableBridge.readFloat(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CountryName = JdbcWritableBridge.readString(1, __dbResults);
    this.IndicatorCode = JdbcWritableBridge.readString(2, __dbResults);
    this.YearsByCountry = JdbcWritableBridge.readInteger(3, __dbResults);
    this.Data = JdbcWritableBridge.readFloat(4, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CountryName, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(IndicatorCode, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(YearsByCountry, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(Data, 4 + __off, 7, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CountryName, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(IndicatorCode, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(YearsByCountry, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(Data, 4 + __off, 7, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CountryName = null;
    } else {
    this.CountryName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.IndicatorCode = null;
    } else {
    this.IndicatorCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YearsByCountry = null;
    } else {
    this.YearsByCountry = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Data = null;
    } else {
    this.Data = Float.valueOf(__dataIn.readFloat());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CountryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CountryName);
    }
    if (null == this.IndicatorCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IndicatorCode);
    }
    if (null == this.YearsByCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.YearsByCountry);
    }
    if (null == this.Data) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Data);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.CountryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CountryName);
    }
    if (null == this.IndicatorCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IndicatorCode);
    }
    if (null == this.YearsByCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.YearsByCountry);
    }
    if (null == this.Data) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.Data);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 124, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(CountryName==null?"null":CountryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IndicatorCode==null?"null":IndicatorCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YearsByCountry==null?"null":"" + YearsByCountry, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data==null?"null":"" + Data, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CountryName==null?"null":CountryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IndicatorCode==null?"null":IndicatorCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YearsByCountry==null?"null":"" + YearsByCountry, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data==null?"null":"" + Data, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 124, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CountryName = null; } else {
      this.CountryName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.IndicatorCode = null; } else {
      this.IndicatorCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YearsByCountry = null; } else {
      this.YearsByCountry = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Data = null; } else {
      this.Data = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CountryName = null; } else {
      this.CountryName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.IndicatorCode = null; } else {
      this.IndicatorCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YearsByCountry = null; } else {
      this.YearsByCountry = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Data = null; } else {
      this.Data = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    question_1_hive o = (question_1_hive) super.clone();
    return o;
  }

  public void clone0(question_1_hive o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("CountryName", this.CountryName);
    __sqoop$field_map.put("IndicatorCode", this.IndicatorCode);
    __sqoop$field_map.put("YearsByCountry", this.YearsByCountry);
    __sqoop$field_map.put("Data", this.Data);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CountryName", this.CountryName);
    __sqoop$field_map.put("IndicatorCode", this.IndicatorCode);
    __sqoop$field_map.put("YearsByCountry", this.YearsByCountry);
    __sqoop$field_map.put("Data", this.Data);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
