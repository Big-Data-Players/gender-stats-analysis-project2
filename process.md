# 1. Create Table in mySql
```
create table gender_data(CountryName varchar
(50),CountryCode varchar
(20),IndicatorName varchar
(150),IndicatorCode varchar
(30),`1960` float(50,4),
`1961` float(50,4),`1962` float(50,4),`1963` float(50,4),`1964`float(50,4),`1965` float(50,4),`1966` float(50,4),
`1967` float(50,4),`1968` float(50,4),`1969` float(50,4),`1970`float(50,4),`1971` float(50,4),`1972` float(50,4),
`1973` float(50,4),`1974` float(50,4),`1975` float(50,4),`1976`float(50,4),`1977` float(50,4),`1978` float(50,4),
`1979` float(50,4),`1980` float(50,4),`1981` float(50,4),`1982`float(50,4),`1983` float(50,4),`1984` float(50,4),
`1985` float(50,4),`1986` float(50,4),`1987` float(50,4),`1988`float(50,4),`1989` float(50,4),`1990` float(50,4),
`1991` float(50,4),`1992` float(50,4),`1993` float(50,4),`1994`float(50,4),`1995` float(50,4),`1996` float(50,4),
`1997` float(50,4),`1998` float(50,4),`1999` float(50,4),`2000`float(50,4),`2001` float(50,4),`2002` float(50,4),
`2003` float(50,4),`2004` float(50,4),`2005` float(50,4),`2006`float(50,4),`2007` float(50,4),`2008` float(50,4),
`2009` float(50,4),`2010` float(50,4),`2011` float(50,4),`2012`float(50,4),`2013` float(50,4),`2014` float(50,4),
`2015` float(50,4),`2016` float(50,4));
```
# 2. Export Data into MySql using Sqoop
```
sqoop export --connect jdbc:mysql://localhost/gender_stat_db --username root --password cloudera --table gender_data --export-dir Hdata/GenderData -m 1 --enclosed-by '\"';
```
### *Seperate fields by " "*
`--enclosed-by '\"'` - this seperates the fields that are surrounded by " ". It automatically removes the quotes. 
# 3. Create Views(using indicator code)
*All columns using indicator code `SE.TER.CMPL.FE.ZS`*
```
create or replace view femaleGrads_all_cols as
    select * from gender_data
    where IndicatorCode = "SE.TER.CMPL.FE.ZS";
```
# 4. Import Data into HDFS using Scoop (using view)
```
sqoop import --connect jdbc:mysql://localhost/gender_stat_db --username root --password cloudera --table femaleGrads_all_cols --target-dir Hdata/GenderData/GenderData_FemaleGrads_View -m 1 --fields-terminated-by '|';
```
# 5. Store Output/Result back to (PIG)

## Create a new script
1. Create new pig script `touch femaleGrads.pig`
2. In terminal, type `pig`
3. Open the file `femaleGrads.pig` and type the following:

### Load data
```
data = LOAD 'Hdata/GenderData/GenderData_FemaleGrads_View/part-m-00000' USING PigStorage('|') AS (CountryName:chararray,CountryCode:chararray,IndicatorName:chararray,IndicatorCode:chararray,y1960:float,
y1961: float,y1962: float,y1963: float,y1964: float,y1965: float,y1966: float,
y1967: float,y1968: float,y1969: float,y1970: float,y1971: float,y1972: float,
y1973: float,y1974: float,y1975: float,y1976: float,y1977: float,y1978: float,
y1979: float,y1980: float,y1981: float,y1982: float,y1983: float,y1984: float,
y1985: float,y1986: float,y1987: float,y1988: float,y1989: float,y1990: float,
y1991: float,y1992: float,y1993: float,y1994: float,y1995: float,y1996: float,
y1997: float,y1998: float,y1999: float,y2000: float,y2001: float,y2002: float,
y2003: float,y2004: float,y2005: float,y2006: float,y2007: float,y2008: float,
y2009: float,y2010: float,y2011: float,y2012: float,y2013: float,y2014: float,
y2015: float,y2016: float);
```
### Limit data, and output sum of the years
```
data_limit = limit data 50;
```
### Replaces the nulls 
*output: (CountryName, value,1 or if null: 0.0,0)*
```
data_limit_No_Null = foreach data_limit generate CountryName,($55 is not null?($55,1) : (0.0F,0)),($56 is not null?($56,1): (0.0F,0)),($57 is not null?($57,1):(0.0F,0)),($58 is not null?($58,1):(0.0F,0)),($59 is not null?($59,1):(0.0F,0)),($60 is not null?($60,1):(0.0F,0));
```

### Sum the data, and show the number of data points for each country
*output: (CountryName,sums_of_country,number_of_data_points)*
```
key_value_data = foreach data_limit_No_Null generate CountryName,$1.($0)+$2.($0)+$3.($0)+$4.($0)+$5.($0)+$6.($0),$1.($1)+$2.($1)+$3.($1)+$4.($1)+$5.($1)+$6.($1);
```

### Averages of Each Country 
*output: (CountryName,sums_of_country,average_of_country)*
```
averages = foreach key_value_data generate CountryName,($1/$2 is not null?($1/2): );
```

### Remove rows that do not have any averages
```
clean_null_averages = FILTER averages BY ($1 IS NOT NULL);
```
### Create a table called question1_pig into hbase with all data
*Follow all the pig script from the text file I uploaded up in this chat.Then in the pig hit this command.*
```
STORE final_answer into 'hbase://question1_pig' USING org.apache.pig.backend.hadoop.hbase.HBaseStorage('info:countryName info:average');
```

# Extra Commands Used 

## Alter Column Type
`ALTER TABLE table_name MODIFY COLUMN column_name datatype;`

## Check Max length for a row
`select char_length(string)`

update table set column = NULL where column = '';