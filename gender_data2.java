// ORM class for table 'gender_data2'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Dec 31 07:07:51 PST 2018
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

public class gender_data2 extends SqoopRecord  implements DBWritable, Writable {
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
    setters.put("CountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CountryCode = (String)value;
      }
    });
    setters.put("IndicatorName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        IndicatorName = (String)value;
      }
    });
    setters.put("IndicatorCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        IndicatorCode = (String)value;
      }
    });
    setters.put("1960", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1960 = (String)value;
      }
    });
    setters.put("1961", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1961 = (String)value;
      }
    });
    setters.put("1962", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1962 = (String)value;
      }
    });
    setters.put("1963", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1963 = (String)value;
      }
    });
    setters.put("1964", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1964 = (String)value;
      }
    });
    setters.put("1965", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1965 = (String)value;
      }
    });
    setters.put("1966", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1966 = (String)value;
      }
    });
    setters.put("1967", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1967 = (String)value;
      }
    });
    setters.put("1968", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1968 = (String)value;
      }
    });
    setters.put("1969", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1969 = (String)value;
      }
    });
    setters.put("1970", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1970 = (String)value;
      }
    });
    setters.put("1971", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1971 = (String)value;
      }
    });
    setters.put("1972", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1972 = (String)value;
      }
    });
    setters.put("1973", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1973 = (String)value;
      }
    });
    setters.put("1974", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1974 = (String)value;
      }
    });
    setters.put("1975", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1975 = (String)value;
      }
    });
    setters.put("1976", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1976 = (String)value;
      }
    });
    setters.put("1977", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1977 = (String)value;
      }
    });
    setters.put("1978", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1978 = (String)value;
      }
    });
    setters.put("1979", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1979 = (String)value;
      }
    });
    setters.put("1980", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1980 = (String)value;
      }
    });
    setters.put("1981", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1981 = (String)value;
      }
    });
    setters.put("1982", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1982 = (String)value;
      }
    });
    setters.put("1983", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1983 = (String)value;
      }
    });
    setters.put("1984", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1984 = (String)value;
      }
    });
    setters.put("1985", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1985 = (String)value;
      }
    });
    setters.put("1986", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1986 = (String)value;
      }
    });
    setters.put("1987", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1987 = (String)value;
      }
    });
    setters.put("1988", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1988 = (String)value;
      }
    });
    setters.put("1989", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1989 = (String)value;
      }
    });
    setters.put("1990", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1990 = (String)value;
      }
    });
    setters.put("1991", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1991 = (String)value;
      }
    });
    setters.put("1992", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1992 = (String)value;
      }
    });
    setters.put("1993", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1993 = (String)value;
      }
    });
    setters.put("1994", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1994 = (String)value;
      }
    });
    setters.put("1995", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1995 = (String)value;
      }
    });
    setters.put("1996", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1996 = (String)value;
      }
    });
    setters.put("1997", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1997 = (String)value;
      }
    });
    setters.put("1998", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1998 = (String)value;
      }
    });
    setters.put("1999", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _1999 = (String)value;
      }
    });
    setters.put("2000", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2000 = (String)value;
      }
    });
    setters.put("2001", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2001 = (String)value;
      }
    });
    setters.put("2002", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2002 = (String)value;
      }
    });
    setters.put("2003", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2003 = (String)value;
      }
    });
    setters.put("2004", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2004 = (String)value;
      }
    });
    setters.put("2005", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2005 = (String)value;
      }
    });
    setters.put("2006", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2006 = (String)value;
      }
    });
    setters.put("2007", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2007 = (String)value;
      }
    });
    setters.put("2008", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2008 = (String)value;
      }
    });
    setters.put("2009", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2009 = (String)value;
      }
    });
    setters.put("2010", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2010 = (String)value;
      }
    });
    setters.put("2011", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2011 = (String)value;
      }
    });
    setters.put("2012", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2012 = (String)value;
      }
    });
    setters.put("2013", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2013 = (String)value;
      }
    });
    setters.put("2014", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2014 = (String)value;
      }
    });
    setters.put("2015", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2015 = (String)value;
      }
    });
    setters.put("2016", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _2016 = (String)value;
      }
    });
  }
  public gender_data2() {
    init0();
  }
  private String CountryName;
  public String get_CountryName() {
    return CountryName;
  }
  public void set_CountryName(String CountryName) {
    this.CountryName = CountryName;
  }
  public gender_data2 with_CountryName(String CountryName) {
    this.CountryName = CountryName;
    return this;
  }
  private String CountryCode;
  public String get_CountryCode() {
    return CountryCode;
  }
  public void set_CountryCode(String CountryCode) {
    this.CountryCode = CountryCode;
  }
  public gender_data2 with_CountryCode(String CountryCode) {
    this.CountryCode = CountryCode;
    return this;
  }
  private String IndicatorName;
  public String get_IndicatorName() {
    return IndicatorName;
  }
  public void set_IndicatorName(String IndicatorName) {
    this.IndicatorName = IndicatorName;
  }
  public gender_data2 with_IndicatorName(String IndicatorName) {
    this.IndicatorName = IndicatorName;
    return this;
  }
  private String IndicatorCode;
  public String get_IndicatorCode() {
    return IndicatorCode;
  }
  public void set_IndicatorCode(String IndicatorCode) {
    this.IndicatorCode = IndicatorCode;
  }
  public gender_data2 with_IndicatorCode(String IndicatorCode) {
    this.IndicatorCode = IndicatorCode;
    return this;
  }
  private String _1960;
  public String get__1960() {
    return _1960;
  }
  public void set__1960(String _1960) {
    this._1960 = _1960;
  }
  public gender_data2 with__1960(String _1960) {
    this._1960 = _1960;
    return this;
  }
  private String _1961;
  public String get__1961() {
    return _1961;
  }
  public void set__1961(String _1961) {
    this._1961 = _1961;
  }
  public gender_data2 with__1961(String _1961) {
    this._1961 = _1961;
    return this;
  }
  private String _1962;
  public String get__1962() {
    return _1962;
  }
  public void set__1962(String _1962) {
    this._1962 = _1962;
  }
  public gender_data2 with__1962(String _1962) {
    this._1962 = _1962;
    return this;
  }
  private String _1963;
  public String get__1963() {
    return _1963;
  }
  public void set__1963(String _1963) {
    this._1963 = _1963;
  }
  public gender_data2 with__1963(String _1963) {
    this._1963 = _1963;
    return this;
  }
  private String _1964;
  public String get__1964() {
    return _1964;
  }
  public void set__1964(String _1964) {
    this._1964 = _1964;
  }
  public gender_data2 with__1964(String _1964) {
    this._1964 = _1964;
    return this;
  }
  private String _1965;
  public String get__1965() {
    return _1965;
  }
  public void set__1965(String _1965) {
    this._1965 = _1965;
  }
  public gender_data2 with__1965(String _1965) {
    this._1965 = _1965;
    return this;
  }
  private String _1966;
  public String get__1966() {
    return _1966;
  }
  public void set__1966(String _1966) {
    this._1966 = _1966;
  }
  public gender_data2 with__1966(String _1966) {
    this._1966 = _1966;
    return this;
  }
  private String _1967;
  public String get__1967() {
    return _1967;
  }
  public void set__1967(String _1967) {
    this._1967 = _1967;
  }
  public gender_data2 with__1967(String _1967) {
    this._1967 = _1967;
    return this;
  }
  private String _1968;
  public String get__1968() {
    return _1968;
  }
  public void set__1968(String _1968) {
    this._1968 = _1968;
  }
  public gender_data2 with__1968(String _1968) {
    this._1968 = _1968;
    return this;
  }
  private String _1969;
  public String get__1969() {
    return _1969;
  }
  public void set__1969(String _1969) {
    this._1969 = _1969;
  }
  public gender_data2 with__1969(String _1969) {
    this._1969 = _1969;
    return this;
  }
  private String _1970;
  public String get__1970() {
    return _1970;
  }
  public void set__1970(String _1970) {
    this._1970 = _1970;
  }
  public gender_data2 with__1970(String _1970) {
    this._1970 = _1970;
    return this;
  }
  private String _1971;
  public String get__1971() {
    return _1971;
  }
  public void set__1971(String _1971) {
    this._1971 = _1971;
  }
  public gender_data2 with__1971(String _1971) {
    this._1971 = _1971;
    return this;
  }
  private String _1972;
  public String get__1972() {
    return _1972;
  }
  public void set__1972(String _1972) {
    this._1972 = _1972;
  }
  public gender_data2 with__1972(String _1972) {
    this._1972 = _1972;
    return this;
  }
  private String _1973;
  public String get__1973() {
    return _1973;
  }
  public void set__1973(String _1973) {
    this._1973 = _1973;
  }
  public gender_data2 with__1973(String _1973) {
    this._1973 = _1973;
    return this;
  }
  private String _1974;
  public String get__1974() {
    return _1974;
  }
  public void set__1974(String _1974) {
    this._1974 = _1974;
  }
  public gender_data2 with__1974(String _1974) {
    this._1974 = _1974;
    return this;
  }
  private String _1975;
  public String get__1975() {
    return _1975;
  }
  public void set__1975(String _1975) {
    this._1975 = _1975;
  }
  public gender_data2 with__1975(String _1975) {
    this._1975 = _1975;
    return this;
  }
  private String _1976;
  public String get__1976() {
    return _1976;
  }
  public void set__1976(String _1976) {
    this._1976 = _1976;
  }
  public gender_data2 with__1976(String _1976) {
    this._1976 = _1976;
    return this;
  }
  private String _1977;
  public String get__1977() {
    return _1977;
  }
  public void set__1977(String _1977) {
    this._1977 = _1977;
  }
  public gender_data2 with__1977(String _1977) {
    this._1977 = _1977;
    return this;
  }
  private String _1978;
  public String get__1978() {
    return _1978;
  }
  public void set__1978(String _1978) {
    this._1978 = _1978;
  }
  public gender_data2 with__1978(String _1978) {
    this._1978 = _1978;
    return this;
  }
  private String _1979;
  public String get__1979() {
    return _1979;
  }
  public void set__1979(String _1979) {
    this._1979 = _1979;
  }
  public gender_data2 with__1979(String _1979) {
    this._1979 = _1979;
    return this;
  }
  private String _1980;
  public String get__1980() {
    return _1980;
  }
  public void set__1980(String _1980) {
    this._1980 = _1980;
  }
  public gender_data2 with__1980(String _1980) {
    this._1980 = _1980;
    return this;
  }
  private String _1981;
  public String get__1981() {
    return _1981;
  }
  public void set__1981(String _1981) {
    this._1981 = _1981;
  }
  public gender_data2 with__1981(String _1981) {
    this._1981 = _1981;
    return this;
  }
  private String _1982;
  public String get__1982() {
    return _1982;
  }
  public void set__1982(String _1982) {
    this._1982 = _1982;
  }
  public gender_data2 with__1982(String _1982) {
    this._1982 = _1982;
    return this;
  }
  private String _1983;
  public String get__1983() {
    return _1983;
  }
  public void set__1983(String _1983) {
    this._1983 = _1983;
  }
  public gender_data2 with__1983(String _1983) {
    this._1983 = _1983;
    return this;
  }
  private String _1984;
  public String get__1984() {
    return _1984;
  }
  public void set__1984(String _1984) {
    this._1984 = _1984;
  }
  public gender_data2 with__1984(String _1984) {
    this._1984 = _1984;
    return this;
  }
  private String _1985;
  public String get__1985() {
    return _1985;
  }
  public void set__1985(String _1985) {
    this._1985 = _1985;
  }
  public gender_data2 with__1985(String _1985) {
    this._1985 = _1985;
    return this;
  }
  private String _1986;
  public String get__1986() {
    return _1986;
  }
  public void set__1986(String _1986) {
    this._1986 = _1986;
  }
  public gender_data2 with__1986(String _1986) {
    this._1986 = _1986;
    return this;
  }
  private String _1987;
  public String get__1987() {
    return _1987;
  }
  public void set__1987(String _1987) {
    this._1987 = _1987;
  }
  public gender_data2 with__1987(String _1987) {
    this._1987 = _1987;
    return this;
  }
  private String _1988;
  public String get__1988() {
    return _1988;
  }
  public void set__1988(String _1988) {
    this._1988 = _1988;
  }
  public gender_data2 with__1988(String _1988) {
    this._1988 = _1988;
    return this;
  }
  private String _1989;
  public String get__1989() {
    return _1989;
  }
  public void set__1989(String _1989) {
    this._1989 = _1989;
  }
  public gender_data2 with__1989(String _1989) {
    this._1989 = _1989;
    return this;
  }
  private String _1990;
  public String get__1990() {
    return _1990;
  }
  public void set__1990(String _1990) {
    this._1990 = _1990;
  }
  public gender_data2 with__1990(String _1990) {
    this._1990 = _1990;
    return this;
  }
  private String _1991;
  public String get__1991() {
    return _1991;
  }
  public void set__1991(String _1991) {
    this._1991 = _1991;
  }
  public gender_data2 with__1991(String _1991) {
    this._1991 = _1991;
    return this;
  }
  private String _1992;
  public String get__1992() {
    return _1992;
  }
  public void set__1992(String _1992) {
    this._1992 = _1992;
  }
  public gender_data2 with__1992(String _1992) {
    this._1992 = _1992;
    return this;
  }
  private String _1993;
  public String get__1993() {
    return _1993;
  }
  public void set__1993(String _1993) {
    this._1993 = _1993;
  }
  public gender_data2 with__1993(String _1993) {
    this._1993 = _1993;
    return this;
  }
  private String _1994;
  public String get__1994() {
    return _1994;
  }
  public void set__1994(String _1994) {
    this._1994 = _1994;
  }
  public gender_data2 with__1994(String _1994) {
    this._1994 = _1994;
    return this;
  }
  private String _1995;
  public String get__1995() {
    return _1995;
  }
  public void set__1995(String _1995) {
    this._1995 = _1995;
  }
  public gender_data2 with__1995(String _1995) {
    this._1995 = _1995;
    return this;
  }
  private String _1996;
  public String get__1996() {
    return _1996;
  }
  public void set__1996(String _1996) {
    this._1996 = _1996;
  }
  public gender_data2 with__1996(String _1996) {
    this._1996 = _1996;
    return this;
  }
  private String _1997;
  public String get__1997() {
    return _1997;
  }
  public void set__1997(String _1997) {
    this._1997 = _1997;
  }
  public gender_data2 with__1997(String _1997) {
    this._1997 = _1997;
    return this;
  }
  private String _1998;
  public String get__1998() {
    return _1998;
  }
  public void set__1998(String _1998) {
    this._1998 = _1998;
  }
  public gender_data2 with__1998(String _1998) {
    this._1998 = _1998;
    return this;
  }
  private String _1999;
  public String get__1999() {
    return _1999;
  }
  public void set__1999(String _1999) {
    this._1999 = _1999;
  }
  public gender_data2 with__1999(String _1999) {
    this._1999 = _1999;
    return this;
  }
  private String _2000;
  public String get__2000() {
    return _2000;
  }
  public void set__2000(String _2000) {
    this._2000 = _2000;
  }
  public gender_data2 with__2000(String _2000) {
    this._2000 = _2000;
    return this;
  }
  private String _2001;
  public String get__2001() {
    return _2001;
  }
  public void set__2001(String _2001) {
    this._2001 = _2001;
  }
  public gender_data2 with__2001(String _2001) {
    this._2001 = _2001;
    return this;
  }
  private String _2002;
  public String get__2002() {
    return _2002;
  }
  public void set__2002(String _2002) {
    this._2002 = _2002;
  }
  public gender_data2 with__2002(String _2002) {
    this._2002 = _2002;
    return this;
  }
  private String _2003;
  public String get__2003() {
    return _2003;
  }
  public void set__2003(String _2003) {
    this._2003 = _2003;
  }
  public gender_data2 with__2003(String _2003) {
    this._2003 = _2003;
    return this;
  }
  private String _2004;
  public String get__2004() {
    return _2004;
  }
  public void set__2004(String _2004) {
    this._2004 = _2004;
  }
  public gender_data2 with__2004(String _2004) {
    this._2004 = _2004;
    return this;
  }
  private String _2005;
  public String get__2005() {
    return _2005;
  }
  public void set__2005(String _2005) {
    this._2005 = _2005;
  }
  public gender_data2 with__2005(String _2005) {
    this._2005 = _2005;
    return this;
  }
  private String _2006;
  public String get__2006() {
    return _2006;
  }
  public void set__2006(String _2006) {
    this._2006 = _2006;
  }
  public gender_data2 with__2006(String _2006) {
    this._2006 = _2006;
    return this;
  }
  private String _2007;
  public String get__2007() {
    return _2007;
  }
  public void set__2007(String _2007) {
    this._2007 = _2007;
  }
  public gender_data2 with__2007(String _2007) {
    this._2007 = _2007;
    return this;
  }
  private String _2008;
  public String get__2008() {
    return _2008;
  }
  public void set__2008(String _2008) {
    this._2008 = _2008;
  }
  public gender_data2 with__2008(String _2008) {
    this._2008 = _2008;
    return this;
  }
  private String _2009;
  public String get__2009() {
    return _2009;
  }
  public void set__2009(String _2009) {
    this._2009 = _2009;
  }
  public gender_data2 with__2009(String _2009) {
    this._2009 = _2009;
    return this;
  }
  private String _2010;
  public String get__2010() {
    return _2010;
  }
  public void set__2010(String _2010) {
    this._2010 = _2010;
  }
  public gender_data2 with__2010(String _2010) {
    this._2010 = _2010;
    return this;
  }
  private String _2011;
  public String get__2011() {
    return _2011;
  }
  public void set__2011(String _2011) {
    this._2011 = _2011;
  }
  public gender_data2 with__2011(String _2011) {
    this._2011 = _2011;
    return this;
  }
  private String _2012;
  public String get__2012() {
    return _2012;
  }
  public void set__2012(String _2012) {
    this._2012 = _2012;
  }
  public gender_data2 with__2012(String _2012) {
    this._2012 = _2012;
    return this;
  }
  private String _2013;
  public String get__2013() {
    return _2013;
  }
  public void set__2013(String _2013) {
    this._2013 = _2013;
  }
  public gender_data2 with__2013(String _2013) {
    this._2013 = _2013;
    return this;
  }
  private String _2014;
  public String get__2014() {
    return _2014;
  }
  public void set__2014(String _2014) {
    this._2014 = _2014;
  }
  public gender_data2 with__2014(String _2014) {
    this._2014 = _2014;
    return this;
  }
  private String _2015;
  public String get__2015() {
    return _2015;
  }
  public void set__2015(String _2015) {
    this._2015 = _2015;
  }
  public gender_data2 with__2015(String _2015) {
    this._2015 = _2015;
    return this;
  }
  private String _2016;
  public String get__2016() {
    return _2016;
  }
  public void set__2016(String _2016) {
    this._2016 = _2016;
  }
  public gender_data2 with__2016(String _2016) {
    this._2016 = _2016;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof gender_data2)) {
      return false;
    }
    gender_data2 that = (gender_data2) o;
    boolean equal = true;
    equal = equal && (this.CountryName == null ? that.CountryName == null : this.CountryName.equals(that.CountryName));
    equal = equal && (this.CountryCode == null ? that.CountryCode == null : this.CountryCode.equals(that.CountryCode));
    equal = equal && (this.IndicatorName == null ? that.IndicatorName == null : this.IndicatorName.equals(that.IndicatorName));
    equal = equal && (this.IndicatorCode == null ? that.IndicatorCode == null : this.IndicatorCode.equals(that.IndicatorCode));
    equal = equal && (this._1960 == null ? that._1960 == null : this._1960.equals(that._1960));
    equal = equal && (this._1961 == null ? that._1961 == null : this._1961.equals(that._1961));
    equal = equal && (this._1962 == null ? that._1962 == null : this._1962.equals(that._1962));
    equal = equal && (this._1963 == null ? that._1963 == null : this._1963.equals(that._1963));
    equal = equal && (this._1964 == null ? that._1964 == null : this._1964.equals(that._1964));
    equal = equal && (this._1965 == null ? that._1965 == null : this._1965.equals(that._1965));
    equal = equal && (this._1966 == null ? that._1966 == null : this._1966.equals(that._1966));
    equal = equal && (this._1967 == null ? that._1967 == null : this._1967.equals(that._1967));
    equal = equal && (this._1968 == null ? that._1968 == null : this._1968.equals(that._1968));
    equal = equal && (this._1969 == null ? that._1969 == null : this._1969.equals(that._1969));
    equal = equal && (this._1970 == null ? that._1970 == null : this._1970.equals(that._1970));
    equal = equal && (this._1971 == null ? that._1971 == null : this._1971.equals(that._1971));
    equal = equal && (this._1972 == null ? that._1972 == null : this._1972.equals(that._1972));
    equal = equal && (this._1973 == null ? that._1973 == null : this._1973.equals(that._1973));
    equal = equal && (this._1974 == null ? that._1974 == null : this._1974.equals(that._1974));
    equal = equal && (this._1975 == null ? that._1975 == null : this._1975.equals(that._1975));
    equal = equal && (this._1976 == null ? that._1976 == null : this._1976.equals(that._1976));
    equal = equal && (this._1977 == null ? that._1977 == null : this._1977.equals(that._1977));
    equal = equal && (this._1978 == null ? that._1978 == null : this._1978.equals(that._1978));
    equal = equal && (this._1979 == null ? that._1979 == null : this._1979.equals(that._1979));
    equal = equal && (this._1980 == null ? that._1980 == null : this._1980.equals(that._1980));
    equal = equal && (this._1981 == null ? that._1981 == null : this._1981.equals(that._1981));
    equal = equal && (this._1982 == null ? that._1982 == null : this._1982.equals(that._1982));
    equal = equal && (this._1983 == null ? that._1983 == null : this._1983.equals(that._1983));
    equal = equal && (this._1984 == null ? that._1984 == null : this._1984.equals(that._1984));
    equal = equal && (this._1985 == null ? that._1985 == null : this._1985.equals(that._1985));
    equal = equal && (this._1986 == null ? that._1986 == null : this._1986.equals(that._1986));
    equal = equal && (this._1987 == null ? that._1987 == null : this._1987.equals(that._1987));
    equal = equal && (this._1988 == null ? that._1988 == null : this._1988.equals(that._1988));
    equal = equal && (this._1989 == null ? that._1989 == null : this._1989.equals(that._1989));
    equal = equal && (this._1990 == null ? that._1990 == null : this._1990.equals(that._1990));
    equal = equal && (this._1991 == null ? that._1991 == null : this._1991.equals(that._1991));
    equal = equal && (this._1992 == null ? that._1992 == null : this._1992.equals(that._1992));
    equal = equal && (this._1993 == null ? that._1993 == null : this._1993.equals(that._1993));
    equal = equal && (this._1994 == null ? that._1994 == null : this._1994.equals(that._1994));
    equal = equal && (this._1995 == null ? that._1995 == null : this._1995.equals(that._1995));
    equal = equal && (this._1996 == null ? that._1996 == null : this._1996.equals(that._1996));
    equal = equal && (this._1997 == null ? that._1997 == null : this._1997.equals(that._1997));
    equal = equal && (this._1998 == null ? that._1998 == null : this._1998.equals(that._1998));
    equal = equal && (this._1999 == null ? that._1999 == null : this._1999.equals(that._1999));
    equal = equal && (this._2000 == null ? that._2000 == null : this._2000.equals(that._2000));
    equal = equal && (this._2001 == null ? that._2001 == null : this._2001.equals(that._2001));
    equal = equal && (this._2002 == null ? that._2002 == null : this._2002.equals(that._2002));
    equal = equal && (this._2003 == null ? that._2003 == null : this._2003.equals(that._2003));
    equal = equal && (this._2004 == null ? that._2004 == null : this._2004.equals(that._2004));
    equal = equal && (this._2005 == null ? that._2005 == null : this._2005.equals(that._2005));
    equal = equal && (this._2006 == null ? that._2006 == null : this._2006.equals(that._2006));
    equal = equal && (this._2007 == null ? that._2007 == null : this._2007.equals(that._2007));
    equal = equal && (this._2008 == null ? that._2008 == null : this._2008.equals(that._2008));
    equal = equal && (this._2009 == null ? that._2009 == null : this._2009.equals(that._2009));
    equal = equal && (this._2010 == null ? that._2010 == null : this._2010.equals(that._2010));
    equal = equal && (this._2011 == null ? that._2011 == null : this._2011.equals(that._2011));
    equal = equal && (this._2012 == null ? that._2012 == null : this._2012.equals(that._2012));
    equal = equal && (this._2013 == null ? that._2013 == null : this._2013.equals(that._2013));
    equal = equal && (this._2014 == null ? that._2014 == null : this._2014.equals(that._2014));
    equal = equal && (this._2015 == null ? that._2015 == null : this._2015.equals(that._2015));
    equal = equal && (this._2016 == null ? that._2016 == null : this._2016.equals(that._2016));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof gender_data2)) {
      return false;
    }
    gender_data2 that = (gender_data2) o;
    boolean equal = true;
    equal = equal && (this.CountryName == null ? that.CountryName == null : this.CountryName.equals(that.CountryName));
    equal = equal && (this.CountryCode == null ? that.CountryCode == null : this.CountryCode.equals(that.CountryCode));
    equal = equal && (this.IndicatorName == null ? that.IndicatorName == null : this.IndicatorName.equals(that.IndicatorName));
    equal = equal && (this.IndicatorCode == null ? that.IndicatorCode == null : this.IndicatorCode.equals(that.IndicatorCode));
    equal = equal && (this._1960 == null ? that._1960 == null : this._1960.equals(that._1960));
    equal = equal && (this._1961 == null ? that._1961 == null : this._1961.equals(that._1961));
    equal = equal && (this._1962 == null ? that._1962 == null : this._1962.equals(that._1962));
    equal = equal && (this._1963 == null ? that._1963 == null : this._1963.equals(that._1963));
    equal = equal && (this._1964 == null ? that._1964 == null : this._1964.equals(that._1964));
    equal = equal && (this._1965 == null ? that._1965 == null : this._1965.equals(that._1965));
    equal = equal && (this._1966 == null ? that._1966 == null : this._1966.equals(that._1966));
    equal = equal && (this._1967 == null ? that._1967 == null : this._1967.equals(that._1967));
    equal = equal && (this._1968 == null ? that._1968 == null : this._1968.equals(that._1968));
    equal = equal && (this._1969 == null ? that._1969 == null : this._1969.equals(that._1969));
    equal = equal && (this._1970 == null ? that._1970 == null : this._1970.equals(that._1970));
    equal = equal && (this._1971 == null ? that._1971 == null : this._1971.equals(that._1971));
    equal = equal && (this._1972 == null ? that._1972 == null : this._1972.equals(that._1972));
    equal = equal && (this._1973 == null ? that._1973 == null : this._1973.equals(that._1973));
    equal = equal && (this._1974 == null ? that._1974 == null : this._1974.equals(that._1974));
    equal = equal && (this._1975 == null ? that._1975 == null : this._1975.equals(that._1975));
    equal = equal && (this._1976 == null ? that._1976 == null : this._1976.equals(that._1976));
    equal = equal && (this._1977 == null ? that._1977 == null : this._1977.equals(that._1977));
    equal = equal && (this._1978 == null ? that._1978 == null : this._1978.equals(that._1978));
    equal = equal && (this._1979 == null ? that._1979 == null : this._1979.equals(that._1979));
    equal = equal && (this._1980 == null ? that._1980 == null : this._1980.equals(that._1980));
    equal = equal && (this._1981 == null ? that._1981 == null : this._1981.equals(that._1981));
    equal = equal && (this._1982 == null ? that._1982 == null : this._1982.equals(that._1982));
    equal = equal && (this._1983 == null ? that._1983 == null : this._1983.equals(that._1983));
    equal = equal && (this._1984 == null ? that._1984 == null : this._1984.equals(that._1984));
    equal = equal && (this._1985 == null ? that._1985 == null : this._1985.equals(that._1985));
    equal = equal && (this._1986 == null ? that._1986 == null : this._1986.equals(that._1986));
    equal = equal && (this._1987 == null ? that._1987 == null : this._1987.equals(that._1987));
    equal = equal && (this._1988 == null ? that._1988 == null : this._1988.equals(that._1988));
    equal = equal && (this._1989 == null ? that._1989 == null : this._1989.equals(that._1989));
    equal = equal && (this._1990 == null ? that._1990 == null : this._1990.equals(that._1990));
    equal = equal && (this._1991 == null ? that._1991 == null : this._1991.equals(that._1991));
    equal = equal && (this._1992 == null ? that._1992 == null : this._1992.equals(that._1992));
    equal = equal && (this._1993 == null ? that._1993 == null : this._1993.equals(that._1993));
    equal = equal && (this._1994 == null ? that._1994 == null : this._1994.equals(that._1994));
    equal = equal && (this._1995 == null ? that._1995 == null : this._1995.equals(that._1995));
    equal = equal && (this._1996 == null ? that._1996 == null : this._1996.equals(that._1996));
    equal = equal && (this._1997 == null ? that._1997 == null : this._1997.equals(that._1997));
    equal = equal && (this._1998 == null ? that._1998 == null : this._1998.equals(that._1998));
    equal = equal && (this._1999 == null ? that._1999 == null : this._1999.equals(that._1999));
    equal = equal && (this._2000 == null ? that._2000 == null : this._2000.equals(that._2000));
    equal = equal && (this._2001 == null ? that._2001 == null : this._2001.equals(that._2001));
    equal = equal && (this._2002 == null ? that._2002 == null : this._2002.equals(that._2002));
    equal = equal && (this._2003 == null ? that._2003 == null : this._2003.equals(that._2003));
    equal = equal && (this._2004 == null ? that._2004 == null : this._2004.equals(that._2004));
    equal = equal && (this._2005 == null ? that._2005 == null : this._2005.equals(that._2005));
    equal = equal && (this._2006 == null ? that._2006 == null : this._2006.equals(that._2006));
    equal = equal && (this._2007 == null ? that._2007 == null : this._2007.equals(that._2007));
    equal = equal && (this._2008 == null ? that._2008 == null : this._2008.equals(that._2008));
    equal = equal && (this._2009 == null ? that._2009 == null : this._2009.equals(that._2009));
    equal = equal && (this._2010 == null ? that._2010 == null : this._2010.equals(that._2010));
    equal = equal && (this._2011 == null ? that._2011 == null : this._2011.equals(that._2011));
    equal = equal && (this._2012 == null ? that._2012 == null : this._2012.equals(that._2012));
    equal = equal && (this._2013 == null ? that._2013 == null : this._2013.equals(that._2013));
    equal = equal && (this._2014 == null ? that._2014 == null : this._2014.equals(that._2014));
    equal = equal && (this._2015 == null ? that._2015 == null : this._2015.equals(that._2015));
    equal = equal && (this._2016 == null ? that._2016 == null : this._2016.equals(that._2016));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CountryName = JdbcWritableBridge.readString(1, __dbResults);
    this.CountryCode = JdbcWritableBridge.readString(2, __dbResults);
    this.IndicatorName = JdbcWritableBridge.readString(3, __dbResults);
    this.IndicatorCode = JdbcWritableBridge.readString(4, __dbResults);
    this._1960 = JdbcWritableBridge.readString(5, __dbResults);
    this._1961 = JdbcWritableBridge.readString(6, __dbResults);
    this._1962 = JdbcWritableBridge.readString(7, __dbResults);
    this._1963 = JdbcWritableBridge.readString(8, __dbResults);
    this._1964 = JdbcWritableBridge.readString(9, __dbResults);
    this._1965 = JdbcWritableBridge.readString(10, __dbResults);
    this._1966 = JdbcWritableBridge.readString(11, __dbResults);
    this._1967 = JdbcWritableBridge.readString(12, __dbResults);
    this._1968 = JdbcWritableBridge.readString(13, __dbResults);
    this._1969 = JdbcWritableBridge.readString(14, __dbResults);
    this._1970 = JdbcWritableBridge.readString(15, __dbResults);
    this._1971 = JdbcWritableBridge.readString(16, __dbResults);
    this._1972 = JdbcWritableBridge.readString(17, __dbResults);
    this._1973 = JdbcWritableBridge.readString(18, __dbResults);
    this._1974 = JdbcWritableBridge.readString(19, __dbResults);
    this._1975 = JdbcWritableBridge.readString(20, __dbResults);
    this._1976 = JdbcWritableBridge.readString(21, __dbResults);
    this._1977 = JdbcWritableBridge.readString(22, __dbResults);
    this._1978 = JdbcWritableBridge.readString(23, __dbResults);
    this._1979 = JdbcWritableBridge.readString(24, __dbResults);
    this._1980 = JdbcWritableBridge.readString(25, __dbResults);
    this._1981 = JdbcWritableBridge.readString(26, __dbResults);
    this._1982 = JdbcWritableBridge.readString(27, __dbResults);
    this._1983 = JdbcWritableBridge.readString(28, __dbResults);
    this._1984 = JdbcWritableBridge.readString(29, __dbResults);
    this._1985 = JdbcWritableBridge.readString(30, __dbResults);
    this._1986 = JdbcWritableBridge.readString(31, __dbResults);
    this._1987 = JdbcWritableBridge.readString(32, __dbResults);
    this._1988 = JdbcWritableBridge.readString(33, __dbResults);
    this._1989 = JdbcWritableBridge.readString(34, __dbResults);
    this._1990 = JdbcWritableBridge.readString(35, __dbResults);
    this._1991 = JdbcWritableBridge.readString(36, __dbResults);
    this._1992 = JdbcWritableBridge.readString(37, __dbResults);
    this._1993 = JdbcWritableBridge.readString(38, __dbResults);
    this._1994 = JdbcWritableBridge.readString(39, __dbResults);
    this._1995 = JdbcWritableBridge.readString(40, __dbResults);
    this._1996 = JdbcWritableBridge.readString(41, __dbResults);
    this._1997 = JdbcWritableBridge.readString(42, __dbResults);
    this._1998 = JdbcWritableBridge.readString(43, __dbResults);
    this._1999 = JdbcWritableBridge.readString(44, __dbResults);
    this._2000 = JdbcWritableBridge.readString(45, __dbResults);
    this._2001 = JdbcWritableBridge.readString(46, __dbResults);
    this._2002 = JdbcWritableBridge.readString(47, __dbResults);
    this._2003 = JdbcWritableBridge.readString(48, __dbResults);
    this._2004 = JdbcWritableBridge.readString(49, __dbResults);
    this._2005 = JdbcWritableBridge.readString(50, __dbResults);
    this._2006 = JdbcWritableBridge.readString(51, __dbResults);
    this._2007 = JdbcWritableBridge.readString(52, __dbResults);
    this._2008 = JdbcWritableBridge.readString(53, __dbResults);
    this._2009 = JdbcWritableBridge.readString(54, __dbResults);
    this._2010 = JdbcWritableBridge.readString(55, __dbResults);
    this._2011 = JdbcWritableBridge.readString(56, __dbResults);
    this._2012 = JdbcWritableBridge.readString(57, __dbResults);
    this._2013 = JdbcWritableBridge.readString(58, __dbResults);
    this._2014 = JdbcWritableBridge.readString(59, __dbResults);
    this._2015 = JdbcWritableBridge.readString(60, __dbResults);
    this._2016 = JdbcWritableBridge.readString(61, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CountryName = JdbcWritableBridge.readString(1, __dbResults);
    this.CountryCode = JdbcWritableBridge.readString(2, __dbResults);
    this.IndicatorName = JdbcWritableBridge.readString(3, __dbResults);
    this.IndicatorCode = JdbcWritableBridge.readString(4, __dbResults);
    this._1960 = JdbcWritableBridge.readString(5, __dbResults);
    this._1961 = JdbcWritableBridge.readString(6, __dbResults);
    this._1962 = JdbcWritableBridge.readString(7, __dbResults);
    this._1963 = JdbcWritableBridge.readString(8, __dbResults);
    this._1964 = JdbcWritableBridge.readString(9, __dbResults);
    this._1965 = JdbcWritableBridge.readString(10, __dbResults);
    this._1966 = JdbcWritableBridge.readString(11, __dbResults);
    this._1967 = JdbcWritableBridge.readString(12, __dbResults);
    this._1968 = JdbcWritableBridge.readString(13, __dbResults);
    this._1969 = JdbcWritableBridge.readString(14, __dbResults);
    this._1970 = JdbcWritableBridge.readString(15, __dbResults);
    this._1971 = JdbcWritableBridge.readString(16, __dbResults);
    this._1972 = JdbcWritableBridge.readString(17, __dbResults);
    this._1973 = JdbcWritableBridge.readString(18, __dbResults);
    this._1974 = JdbcWritableBridge.readString(19, __dbResults);
    this._1975 = JdbcWritableBridge.readString(20, __dbResults);
    this._1976 = JdbcWritableBridge.readString(21, __dbResults);
    this._1977 = JdbcWritableBridge.readString(22, __dbResults);
    this._1978 = JdbcWritableBridge.readString(23, __dbResults);
    this._1979 = JdbcWritableBridge.readString(24, __dbResults);
    this._1980 = JdbcWritableBridge.readString(25, __dbResults);
    this._1981 = JdbcWritableBridge.readString(26, __dbResults);
    this._1982 = JdbcWritableBridge.readString(27, __dbResults);
    this._1983 = JdbcWritableBridge.readString(28, __dbResults);
    this._1984 = JdbcWritableBridge.readString(29, __dbResults);
    this._1985 = JdbcWritableBridge.readString(30, __dbResults);
    this._1986 = JdbcWritableBridge.readString(31, __dbResults);
    this._1987 = JdbcWritableBridge.readString(32, __dbResults);
    this._1988 = JdbcWritableBridge.readString(33, __dbResults);
    this._1989 = JdbcWritableBridge.readString(34, __dbResults);
    this._1990 = JdbcWritableBridge.readString(35, __dbResults);
    this._1991 = JdbcWritableBridge.readString(36, __dbResults);
    this._1992 = JdbcWritableBridge.readString(37, __dbResults);
    this._1993 = JdbcWritableBridge.readString(38, __dbResults);
    this._1994 = JdbcWritableBridge.readString(39, __dbResults);
    this._1995 = JdbcWritableBridge.readString(40, __dbResults);
    this._1996 = JdbcWritableBridge.readString(41, __dbResults);
    this._1997 = JdbcWritableBridge.readString(42, __dbResults);
    this._1998 = JdbcWritableBridge.readString(43, __dbResults);
    this._1999 = JdbcWritableBridge.readString(44, __dbResults);
    this._2000 = JdbcWritableBridge.readString(45, __dbResults);
    this._2001 = JdbcWritableBridge.readString(46, __dbResults);
    this._2002 = JdbcWritableBridge.readString(47, __dbResults);
    this._2003 = JdbcWritableBridge.readString(48, __dbResults);
    this._2004 = JdbcWritableBridge.readString(49, __dbResults);
    this._2005 = JdbcWritableBridge.readString(50, __dbResults);
    this._2006 = JdbcWritableBridge.readString(51, __dbResults);
    this._2007 = JdbcWritableBridge.readString(52, __dbResults);
    this._2008 = JdbcWritableBridge.readString(53, __dbResults);
    this._2009 = JdbcWritableBridge.readString(54, __dbResults);
    this._2010 = JdbcWritableBridge.readString(55, __dbResults);
    this._2011 = JdbcWritableBridge.readString(56, __dbResults);
    this._2012 = JdbcWritableBridge.readString(57, __dbResults);
    this._2013 = JdbcWritableBridge.readString(58, __dbResults);
    this._2014 = JdbcWritableBridge.readString(59, __dbResults);
    this._2015 = JdbcWritableBridge.readString(60, __dbResults);
    this._2016 = JdbcWritableBridge.readString(61, __dbResults);
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
    JdbcWritableBridge.writeString(CountryCode, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(IndicatorName, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(IndicatorCode, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1960, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1961, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1962, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1963, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1964, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1965, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1966, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1967, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1968, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1969, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1970, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1971, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1972, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1973, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1974, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1975, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1976, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1977, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1978, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1979, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1980, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1981, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1982, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1983, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1984, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1985, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1986, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1987, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1988, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1989, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1990, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1991, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1992, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1993, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1994, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1995, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1996, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1997, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1998, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1999, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2000, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2001, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2002, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2003, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2004, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2005, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2006, 51 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2007, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2008, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2009, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2010, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2011, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2012, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2013, 58 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2014, 59 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2015, 60 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2016, 61 + __off, 12, __dbStmt);
    return 61;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CountryName, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CountryCode, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(IndicatorName, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(IndicatorCode, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1960, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1961, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1962, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1963, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1964, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1965, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1966, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1967, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1968, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1969, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1970, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1971, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1972, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1973, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1974, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1975, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1976, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1977, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1978, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1979, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1980, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1981, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1982, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1983, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1984, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1985, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1986, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1987, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1988, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1989, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1990, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1991, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1992, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1993, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1994, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1995, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1996, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1997, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1998, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_1999, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2000, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2001, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2002, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2003, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2004, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2005, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2006, 51 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2007, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2008, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2009, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2010, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2011, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2012, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2013, 58 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2014, 59 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2015, 60 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(_2016, 61 + __off, 12, __dbStmt);
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
        this.CountryCode = null;
    } else {
    this.CountryCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.IndicatorName = null;
    } else {
    this.IndicatorName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.IndicatorCode = null;
    } else {
    this.IndicatorCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1960 = null;
    } else {
    this._1960 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1961 = null;
    } else {
    this._1961 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1962 = null;
    } else {
    this._1962 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1963 = null;
    } else {
    this._1963 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1964 = null;
    } else {
    this._1964 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1965 = null;
    } else {
    this._1965 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1966 = null;
    } else {
    this._1966 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1967 = null;
    } else {
    this._1967 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1968 = null;
    } else {
    this._1968 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1969 = null;
    } else {
    this._1969 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1970 = null;
    } else {
    this._1970 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1971 = null;
    } else {
    this._1971 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1972 = null;
    } else {
    this._1972 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1973 = null;
    } else {
    this._1973 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1974 = null;
    } else {
    this._1974 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1975 = null;
    } else {
    this._1975 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1976 = null;
    } else {
    this._1976 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1977 = null;
    } else {
    this._1977 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1978 = null;
    } else {
    this._1978 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1979 = null;
    } else {
    this._1979 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1980 = null;
    } else {
    this._1980 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1981 = null;
    } else {
    this._1981 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1982 = null;
    } else {
    this._1982 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1983 = null;
    } else {
    this._1983 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1984 = null;
    } else {
    this._1984 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1985 = null;
    } else {
    this._1985 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1986 = null;
    } else {
    this._1986 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1987 = null;
    } else {
    this._1987 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1988 = null;
    } else {
    this._1988 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1989 = null;
    } else {
    this._1989 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1990 = null;
    } else {
    this._1990 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1991 = null;
    } else {
    this._1991 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1992 = null;
    } else {
    this._1992 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1993 = null;
    } else {
    this._1993 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1994 = null;
    } else {
    this._1994 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1995 = null;
    } else {
    this._1995 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1996 = null;
    } else {
    this._1996 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1997 = null;
    } else {
    this._1997 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1998 = null;
    } else {
    this._1998 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._1999 = null;
    } else {
    this._1999 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2000 = null;
    } else {
    this._2000 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2001 = null;
    } else {
    this._2001 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2002 = null;
    } else {
    this._2002 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2003 = null;
    } else {
    this._2003 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2004 = null;
    } else {
    this._2004 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2005 = null;
    } else {
    this._2005 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2006 = null;
    } else {
    this._2006 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2007 = null;
    } else {
    this._2007 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2008 = null;
    } else {
    this._2008 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2009 = null;
    } else {
    this._2009 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2010 = null;
    } else {
    this._2010 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2011 = null;
    } else {
    this._2011 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2012 = null;
    } else {
    this._2012 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2013 = null;
    } else {
    this._2013 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2014 = null;
    } else {
    this._2014 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2015 = null;
    } else {
    this._2015 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this._2016 = null;
    } else {
    this._2016 = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CountryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CountryName);
    }
    if (null == this.CountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CountryCode);
    }
    if (null == this.IndicatorName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IndicatorName);
    }
    if (null == this.IndicatorCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IndicatorCode);
    }
    if (null == this._1960) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1960);
    }
    if (null == this._1961) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1961);
    }
    if (null == this._1962) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1962);
    }
    if (null == this._1963) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1963);
    }
    if (null == this._1964) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1964);
    }
    if (null == this._1965) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1965);
    }
    if (null == this._1966) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1966);
    }
    if (null == this._1967) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1967);
    }
    if (null == this._1968) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1968);
    }
    if (null == this._1969) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1969);
    }
    if (null == this._1970) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1970);
    }
    if (null == this._1971) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1971);
    }
    if (null == this._1972) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1972);
    }
    if (null == this._1973) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1973);
    }
    if (null == this._1974) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1974);
    }
    if (null == this._1975) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1975);
    }
    if (null == this._1976) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1976);
    }
    if (null == this._1977) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1977);
    }
    if (null == this._1978) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1978);
    }
    if (null == this._1979) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1979);
    }
    if (null == this._1980) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1980);
    }
    if (null == this._1981) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1981);
    }
    if (null == this._1982) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1982);
    }
    if (null == this._1983) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1983);
    }
    if (null == this._1984) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1984);
    }
    if (null == this._1985) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1985);
    }
    if (null == this._1986) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1986);
    }
    if (null == this._1987) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1987);
    }
    if (null == this._1988) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1988);
    }
    if (null == this._1989) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1989);
    }
    if (null == this._1990) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1990);
    }
    if (null == this._1991) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1991);
    }
    if (null == this._1992) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1992);
    }
    if (null == this._1993) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1993);
    }
    if (null == this._1994) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1994);
    }
    if (null == this._1995) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1995);
    }
    if (null == this._1996) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1996);
    }
    if (null == this._1997) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1997);
    }
    if (null == this._1998) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1998);
    }
    if (null == this._1999) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1999);
    }
    if (null == this._2000) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2000);
    }
    if (null == this._2001) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2001);
    }
    if (null == this._2002) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2002);
    }
    if (null == this._2003) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2003);
    }
    if (null == this._2004) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2004);
    }
    if (null == this._2005) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2005);
    }
    if (null == this._2006) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2006);
    }
    if (null == this._2007) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2007);
    }
    if (null == this._2008) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2008);
    }
    if (null == this._2009) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2009);
    }
    if (null == this._2010) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2010);
    }
    if (null == this._2011) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2011);
    }
    if (null == this._2012) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2012);
    }
    if (null == this._2013) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2013);
    }
    if (null == this._2014) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2014);
    }
    if (null == this._2015) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2015);
    }
    if (null == this._2016) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2016);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.CountryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CountryName);
    }
    if (null == this.CountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CountryCode);
    }
    if (null == this.IndicatorName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IndicatorName);
    }
    if (null == this.IndicatorCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IndicatorCode);
    }
    if (null == this._1960) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1960);
    }
    if (null == this._1961) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1961);
    }
    if (null == this._1962) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1962);
    }
    if (null == this._1963) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1963);
    }
    if (null == this._1964) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1964);
    }
    if (null == this._1965) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1965);
    }
    if (null == this._1966) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1966);
    }
    if (null == this._1967) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1967);
    }
    if (null == this._1968) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1968);
    }
    if (null == this._1969) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1969);
    }
    if (null == this._1970) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1970);
    }
    if (null == this._1971) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1971);
    }
    if (null == this._1972) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1972);
    }
    if (null == this._1973) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1973);
    }
    if (null == this._1974) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1974);
    }
    if (null == this._1975) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1975);
    }
    if (null == this._1976) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1976);
    }
    if (null == this._1977) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1977);
    }
    if (null == this._1978) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1978);
    }
    if (null == this._1979) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1979);
    }
    if (null == this._1980) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1980);
    }
    if (null == this._1981) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1981);
    }
    if (null == this._1982) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1982);
    }
    if (null == this._1983) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1983);
    }
    if (null == this._1984) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1984);
    }
    if (null == this._1985) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1985);
    }
    if (null == this._1986) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1986);
    }
    if (null == this._1987) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1987);
    }
    if (null == this._1988) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1988);
    }
    if (null == this._1989) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1989);
    }
    if (null == this._1990) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1990);
    }
    if (null == this._1991) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1991);
    }
    if (null == this._1992) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1992);
    }
    if (null == this._1993) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1993);
    }
    if (null == this._1994) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1994);
    }
    if (null == this._1995) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1995);
    }
    if (null == this._1996) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1996);
    }
    if (null == this._1997) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1997);
    }
    if (null == this._1998) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1998);
    }
    if (null == this._1999) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _1999);
    }
    if (null == this._2000) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2000);
    }
    if (null == this._2001) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2001);
    }
    if (null == this._2002) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2002);
    }
    if (null == this._2003) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2003);
    }
    if (null == this._2004) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2004);
    }
    if (null == this._2005) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2005);
    }
    if (null == this._2006) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2006);
    }
    if (null == this._2007) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2007);
    }
    if (null == this._2008) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2008);
    }
    if (null == this._2009) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2009);
    }
    if (null == this._2010) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2010);
    }
    if (null == this._2011) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2011);
    }
    if (null == this._2012) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2012);
    }
    if (null == this._2013) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2013);
    }
    if (null == this._2014) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2014);
    }
    if (null == this._2015) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2015);
    }
    if (null == this._2016) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _2016);
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
    __sb.append(FieldFormatter.escapeAndEnclose(CountryCode==null?"null":CountryCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IndicatorName==null?"null":IndicatorName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IndicatorCode==null?"null":IndicatorCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1960==null?"null":_1960, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1961==null?"null":_1961, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1962==null?"null":_1962, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1963==null?"null":_1963, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1964==null?"null":_1964, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1965==null?"null":_1965, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1966==null?"null":_1966, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1967==null?"null":_1967, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1968==null?"null":_1968, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1969==null?"null":_1969, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1970==null?"null":_1970, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1971==null?"null":_1971, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1972==null?"null":_1972, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1973==null?"null":_1973, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1974==null?"null":_1974, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1975==null?"null":_1975, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1976==null?"null":_1976, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1977==null?"null":_1977, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1978==null?"null":_1978, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1979==null?"null":_1979, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1980==null?"null":_1980, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1981==null?"null":_1981, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1982==null?"null":_1982, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1983==null?"null":_1983, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1984==null?"null":_1984, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1985==null?"null":_1985, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1986==null?"null":_1986, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1987==null?"null":_1987, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1988==null?"null":_1988, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1989==null?"null":_1989, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1990==null?"null":_1990, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1991==null?"null":_1991, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1992==null?"null":_1992, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1993==null?"null":_1993, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1994==null?"null":_1994, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1995==null?"null":_1995, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1996==null?"null":_1996, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1997==null?"null":_1997, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1998==null?"null":_1998, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1999==null?"null":_1999, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2000==null?"null":_2000, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2001==null?"null":_2001, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2002==null?"null":_2002, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2003==null?"null":_2003, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2004==null?"null":_2004, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2005==null?"null":_2005, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2006==null?"null":_2006, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2007==null?"null":_2007, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2008==null?"null":_2008, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2009==null?"null":_2009, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2010==null?"null":_2010, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2011==null?"null":_2011, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2012==null?"null":_2012, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2013==null?"null":_2013, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2014==null?"null":_2014, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2015==null?"null":_2015, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2016==null?"null":_2016, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CountryName==null?"null":CountryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CountryCode==null?"null":CountryCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IndicatorName==null?"null":IndicatorName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IndicatorCode==null?"null":IndicatorCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1960==null?"null":_1960, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1961==null?"null":_1961, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1962==null?"null":_1962, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1963==null?"null":_1963, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1964==null?"null":_1964, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1965==null?"null":_1965, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1966==null?"null":_1966, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1967==null?"null":_1967, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1968==null?"null":_1968, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1969==null?"null":_1969, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1970==null?"null":_1970, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1971==null?"null":_1971, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1972==null?"null":_1972, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1973==null?"null":_1973, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1974==null?"null":_1974, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1975==null?"null":_1975, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1976==null?"null":_1976, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1977==null?"null":_1977, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1978==null?"null":_1978, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1979==null?"null":_1979, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1980==null?"null":_1980, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1981==null?"null":_1981, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1982==null?"null":_1982, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1983==null?"null":_1983, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1984==null?"null":_1984, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1985==null?"null":_1985, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1986==null?"null":_1986, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1987==null?"null":_1987, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1988==null?"null":_1988, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1989==null?"null":_1989, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1990==null?"null":_1990, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1991==null?"null":_1991, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1992==null?"null":_1992, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1993==null?"null":_1993, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1994==null?"null":_1994, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1995==null?"null":_1995, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1996==null?"null":_1996, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1997==null?"null":_1997, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1998==null?"null":_1998, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_1999==null?"null":_1999, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2000==null?"null":_2000, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2001==null?"null":_2001, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2002==null?"null":_2002, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2003==null?"null":_2003, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2004==null?"null":_2004, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2005==null?"null":_2005, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2006==null?"null":_2006, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2007==null?"null":_2007, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2008==null?"null":_2008, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2009==null?"null":_2009, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2010==null?"null":_2010, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2011==null?"null":_2011, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2012==null?"null":_2012, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2013==null?"null":_2013, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2014==null?"null":_2014, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2015==null?"null":_2015, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_2016==null?"null":_2016, delimiters));
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
    if (__cur_str.equals("null")) { this.CountryCode = null; } else {
      this.CountryCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.IndicatorName = null; } else {
      this.IndicatorName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.IndicatorCode = null; } else {
      this.IndicatorCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1960 = null; } else {
      this._1960 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1961 = null; } else {
      this._1961 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1962 = null; } else {
      this._1962 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1963 = null; } else {
      this._1963 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1964 = null; } else {
      this._1964 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1965 = null; } else {
      this._1965 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1966 = null; } else {
      this._1966 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1967 = null; } else {
      this._1967 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1968 = null; } else {
      this._1968 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1969 = null; } else {
      this._1969 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1970 = null; } else {
      this._1970 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1971 = null; } else {
      this._1971 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1972 = null; } else {
      this._1972 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1973 = null; } else {
      this._1973 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1974 = null; } else {
      this._1974 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1975 = null; } else {
      this._1975 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1976 = null; } else {
      this._1976 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1977 = null; } else {
      this._1977 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1978 = null; } else {
      this._1978 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1979 = null; } else {
      this._1979 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1980 = null; } else {
      this._1980 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1981 = null; } else {
      this._1981 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1982 = null; } else {
      this._1982 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1983 = null; } else {
      this._1983 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1984 = null; } else {
      this._1984 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1985 = null; } else {
      this._1985 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1986 = null; } else {
      this._1986 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1987 = null; } else {
      this._1987 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1988 = null; } else {
      this._1988 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1989 = null; } else {
      this._1989 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1990 = null; } else {
      this._1990 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1991 = null; } else {
      this._1991 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1992 = null; } else {
      this._1992 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1993 = null; } else {
      this._1993 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1994 = null; } else {
      this._1994 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1995 = null; } else {
      this._1995 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1996 = null; } else {
      this._1996 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1997 = null; } else {
      this._1997 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1998 = null; } else {
      this._1998 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1999 = null; } else {
      this._1999 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2000 = null; } else {
      this._2000 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2001 = null; } else {
      this._2001 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2002 = null; } else {
      this._2002 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2003 = null; } else {
      this._2003 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2004 = null; } else {
      this._2004 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2005 = null; } else {
      this._2005 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2006 = null; } else {
      this._2006 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2007 = null; } else {
      this._2007 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2008 = null; } else {
      this._2008 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2009 = null; } else {
      this._2009 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2010 = null; } else {
      this._2010 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2011 = null; } else {
      this._2011 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2012 = null; } else {
      this._2012 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2013 = null; } else {
      this._2013 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2014 = null; } else {
      this._2014 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2015 = null; } else {
      this._2015 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2016 = null; } else {
      this._2016 = __cur_str;
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
    if (__cur_str.equals("null")) { this.CountryCode = null; } else {
      this.CountryCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.IndicatorName = null; } else {
      this.IndicatorName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.IndicatorCode = null; } else {
      this.IndicatorCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1960 = null; } else {
      this._1960 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1961 = null; } else {
      this._1961 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1962 = null; } else {
      this._1962 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1963 = null; } else {
      this._1963 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1964 = null; } else {
      this._1964 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1965 = null; } else {
      this._1965 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1966 = null; } else {
      this._1966 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1967 = null; } else {
      this._1967 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1968 = null; } else {
      this._1968 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1969 = null; } else {
      this._1969 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1970 = null; } else {
      this._1970 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1971 = null; } else {
      this._1971 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1972 = null; } else {
      this._1972 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1973 = null; } else {
      this._1973 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1974 = null; } else {
      this._1974 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1975 = null; } else {
      this._1975 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1976 = null; } else {
      this._1976 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1977 = null; } else {
      this._1977 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1978 = null; } else {
      this._1978 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1979 = null; } else {
      this._1979 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1980 = null; } else {
      this._1980 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1981 = null; } else {
      this._1981 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1982 = null; } else {
      this._1982 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1983 = null; } else {
      this._1983 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1984 = null; } else {
      this._1984 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1985 = null; } else {
      this._1985 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1986 = null; } else {
      this._1986 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1987 = null; } else {
      this._1987 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1988 = null; } else {
      this._1988 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1989 = null; } else {
      this._1989 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1990 = null; } else {
      this._1990 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1991 = null; } else {
      this._1991 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1992 = null; } else {
      this._1992 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1993 = null; } else {
      this._1993 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1994 = null; } else {
      this._1994 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1995 = null; } else {
      this._1995 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1996 = null; } else {
      this._1996 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1997 = null; } else {
      this._1997 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1998 = null; } else {
      this._1998 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._1999 = null; } else {
      this._1999 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2000 = null; } else {
      this._2000 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2001 = null; } else {
      this._2001 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2002 = null; } else {
      this._2002 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2003 = null; } else {
      this._2003 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2004 = null; } else {
      this._2004 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2005 = null; } else {
      this._2005 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2006 = null; } else {
      this._2006 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2007 = null; } else {
      this._2007 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2008 = null; } else {
      this._2008 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2009 = null; } else {
      this._2009 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2010 = null; } else {
      this._2010 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2011 = null; } else {
      this._2011 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2012 = null; } else {
      this._2012 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2013 = null; } else {
      this._2013 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2014 = null; } else {
      this._2014 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2015 = null; } else {
      this._2015 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._2016 = null; } else {
      this._2016 = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    gender_data2 o = (gender_data2) super.clone();
    return o;
  }

  public void clone0(gender_data2 o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("CountryName", this.CountryName);
    __sqoop$field_map.put("CountryCode", this.CountryCode);
    __sqoop$field_map.put("IndicatorName", this.IndicatorName);
    __sqoop$field_map.put("IndicatorCode", this.IndicatorCode);
    __sqoop$field_map.put("1960", this._1960);
    __sqoop$field_map.put("1961", this._1961);
    __sqoop$field_map.put("1962", this._1962);
    __sqoop$field_map.put("1963", this._1963);
    __sqoop$field_map.put("1964", this._1964);
    __sqoop$field_map.put("1965", this._1965);
    __sqoop$field_map.put("1966", this._1966);
    __sqoop$field_map.put("1967", this._1967);
    __sqoop$field_map.put("1968", this._1968);
    __sqoop$field_map.put("1969", this._1969);
    __sqoop$field_map.put("1970", this._1970);
    __sqoop$field_map.put("1971", this._1971);
    __sqoop$field_map.put("1972", this._1972);
    __sqoop$field_map.put("1973", this._1973);
    __sqoop$field_map.put("1974", this._1974);
    __sqoop$field_map.put("1975", this._1975);
    __sqoop$field_map.put("1976", this._1976);
    __sqoop$field_map.put("1977", this._1977);
    __sqoop$field_map.put("1978", this._1978);
    __sqoop$field_map.put("1979", this._1979);
    __sqoop$field_map.put("1980", this._1980);
    __sqoop$field_map.put("1981", this._1981);
    __sqoop$field_map.put("1982", this._1982);
    __sqoop$field_map.put("1983", this._1983);
    __sqoop$field_map.put("1984", this._1984);
    __sqoop$field_map.put("1985", this._1985);
    __sqoop$field_map.put("1986", this._1986);
    __sqoop$field_map.put("1987", this._1987);
    __sqoop$field_map.put("1988", this._1988);
    __sqoop$field_map.put("1989", this._1989);
    __sqoop$field_map.put("1990", this._1990);
    __sqoop$field_map.put("1991", this._1991);
    __sqoop$field_map.put("1992", this._1992);
    __sqoop$field_map.put("1993", this._1993);
    __sqoop$field_map.put("1994", this._1994);
    __sqoop$field_map.put("1995", this._1995);
    __sqoop$field_map.put("1996", this._1996);
    __sqoop$field_map.put("1997", this._1997);
    __sqoop$field_map.put("1998", this._1998);
    __sqoop$field_map.put("1999", this._1999);
    __sqoop$field_map.put("2000", this._2000);
    __sqoop$field_map.put("2001", this._2001);
    __sqoop$field_map.put("2002", this._2002);
    __sqoop$field_map.put("2003", this._2003);
    __sqoop$field_map.put("2004", this._2004);
    __sqoop$field_map.put("2005", this._2005);
    __sqoop$field_map.put("2006", this._2006);
    __sqoop$field_map.put("2007", this._2007);
    __sqoop$field_map.put("2008", this._2008);
    __sqoop$field_map.put("2009", this._2009);
    __sqoop$field_map.put("2010", this._2010);
    __sqoop$field_map.put("2011", this._2011);
    __sqoop$field_map.put("2012", this._2012);
    __sqoop$field_map.put("2013", this._2013);
    __sqoop$field_map.put("2014", this._2014);
    __sqoop$field_map.put("2015", this._2015);
    __sqoop$field_map.put("2016", this._2016);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CountryName", this.CountryName);
    __sqoop$field_map.put("CountryCode", this.CountryCode);
    __sqoop$field_map.put("IndicatorName", this.IndicatorName);
    __sqoop$field_map.put("IndicatorCode", this.IndicatorCode);
    __sqoop$field_map.put("1960", this._1960);
    __sqoop$field_map.put("1961", this._1961);
    __sqoop$field_map.put("1962", this._1962);
    __sqoop$field_map.put("1963", this._1963);
    __sqoop$field_map.put("1964", this._1964);
    __sqoop$field_map.put("1965", this._1965);
    __sqoop$field_map.put("1966", this._1966);
    __sqoop$field_map.put("1967", this._1967);
    __sqoop$field_map.put("1968", this._1968);
    __sqoop$field_map.put("1969", this._1969);
    __sqoop$field_map.put("1970", this._1970);
    __sqoop$field_map.put("1971", this._1971);
    __sqoop$field_map.put("1972", this._1972);
    __sqoop$field_map.put("1973", this._1973);
    __sqoop$field_map.put("1974", this._1974);
    __sqoop$field_map.put("1975", this._1975);
    __sqoop$field_map.put("1976", this._1976);
    __sqoop$field_map.put("1977", this._1977);
    __sqoop$field_map.put("1978", this._1978);
    __sqoop$field_map.put("1979", this._1979);
    __sqoop$field_map.put("1980", this._1980);
    __sqoop$field_map.put("1981", this._1981);
    __sqoop$field_map.put("1982", this._1982);
    __sqoop$field_map.put("1983", this._1983);
    __sqoop$field_map.put("1984", this._1984);
    __sqoop$field_map.put("1985", this._1985);
    __sqoop$field_map.put("1986", this._1986);
    __sqoop$field_map.put("1987", this._1987);
    __sqoop$field_map.put("1988", this._1988);
    __sqoop$field_map.put("1989", this._1989);
    __sqoop$field_map.put("1990", this._1990);
    __sqoop$field_map.put("1991", this._1991);
    __sqoop$field_map.put("1992", this._1992);
    __sqoop$field_map.put("1993", this._1993);
    __sqoop$field_map.put("1994", this._1994);
    __sqoop$field_map.put("1995", this._1995);
    __sqoop$field_map.put("1996", this._1996);
    __sqoop$field_map.put("1997", this._1997);
    __sqoop$field_map.put("1998", this._1998);
    __sqoop$field_map.put("1999", this._1999);
    __sqoop$field_map.put("2000", this._2000);
    __sqoop$field_map.put("2001", this._2001);
    __sqoop$field_map.put("2002", this._2002);
    __sqoop$field_map.put("2003", this._2003);
    __sqoop$field_map.put("2004", this._2004);
    __sqoop$field_map.put("2005", this._2005);
    __sqoop$field_map.put("2006", this._2006);
    __sqoop$field_map.put("2007", this._2007);
    __sqoop$field_map.put("2008", this._2008);
    __sqoop$field_map.put("2009", this._2009);
    __sqoop$field_map.put("2010", this._2010);
    __sqoop$field_map.put("2011", this._2011);
    __sqoop$field_map.put("2012", this._2012);
    __sqoop$field_map.put("2013", this._2013);
    __sqoop$field_map.put("2014", this._2014);
    __sqoop$field_map.put("2015", this._2015);
    __sqoop$field_map.put("2016", this._2016);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
