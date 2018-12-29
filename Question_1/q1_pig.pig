data = LOAD 'sqoop-import-project2' USING PigStorage('|')  AS
(CountryName:chararray,CountryCode:chararray,IndicatorName:chararray,IndicatorCode:chararray,
y2010: float,y2011: float,y2012: float,y2013: float,y2014: float,y2015: float,y2016: float);

data_limit_No_Null = foreach data generate CountryName,($4 is not null?($4,1):(0.0F,0)),
($5 is not null?($5,1):(0.0F,0)),($6 is not null?($6,1):(0.0F,0)),
($7 is not null?($7,1):(0.0F,0)),($8 is not null?($8,1):(0.0F,0)),
($9 is not null?($9,1):(0.0F,0)),($10 is not null?($10,1):(0.0F,0));

key_value_data = foreach data_limit_No_Null generate CountryName,
$1.($0)+$2.($0)+$3.($0)+$4.($0)+$5.($0)+$6.($0),$1.($1)+$2.($1)+$3.($1)+$4.($1)+$5.($1)+$6.($1);

avg_data = foreach  key_value_data generate $0,($2 != 0?$1/$2:0) AS average;

filter_remove = FILTER avg_data BY average != 0.0;

final_answer = FILTER filter_remove BY average<30; 

USING org.apache.pig.backend.hadoop.hbase.HBaseStorage('info:countryName info:average');

