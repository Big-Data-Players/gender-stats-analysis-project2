data = LOAD '/home/cloudera/LData/Project2/Q5/sqoop-import/part-m-00000' USING PigStorage('|') AS (CountryName:chararray,CountryCode:chararray,IndicatorName:chararray,IndicatorCode:chararray,y2000: float,y2001: float,y2002: float,y2003: float,y2004: float,y2005: float,y2006: float,y2007: float,y2008: float,y2009: float,y2010: float,y2011: float,y2012: float,y2013: float,y2014: float,y2015: float,y2016: float);

-- For Rikens Remote Desktop CLoudera
data = LOAD 'Hdata/q5-sqoop-view' USING PigStorage('|') AS (CountryName:chararray,CountryCode:chararray,IndicatorName:chararray,IndicatorCode:chararray,y2000: float,y2001: float,y2002: float,y2003: float,y2004: float,y2005: float,y2006: float,y2007: float,y2008: float,y2009: float,y2010: float,y2011: float,y2012: float,y2013: float,y2014: float,y2015: float,y2016: float);

data_limit_No_Null = foreach data generate CountryName,($4 is not null?($4,1):(0.0F,0)),
($5 is not null?($5,1):(0.0F,0)),($6 is not null?($6,1):(0.0F,0)),
($7 is not null?($7,1):(0.0F,0)),($8 is not null?($8,1):(0.0F,0)),
($9 is not null?($9,1):(0.0F,0)),($10 is not null?($10,1):(0.0F,0)),
($11 is not null?($11,1):(0.0F,0)),($12 is not null?($12,1):(0.0F,0)),
($13 is not null?($13,1):(0.0F,0)),($14 is not null?($14,1):(0.0F,0)),
($15 is not null?($15,1):(0.0F,0)),($16 is not null?($16,1):(0.0F,0)),
($17 is not null?($17,1):(0.0F,0)),($18 is not null?($18,1):(0.0F,0)),
($19 is not null?($19,1):(0.0F,0)),($20 is not null?($20,1):(0.0F,0));

key_value_data = foreach data_limit_No_Null generate CountryName,
$1.($0)+$2.($0)+$3.($0)+$4.($0)+$5.($0)+$6.($0)+
$7.($0)+$8.($0)+$9.($0)+$10.($0)+$11.($0)+$12.($0)+
$13.($0)+$14.($0)+$15.($0)+$16.($0)+$17.($0),
$1.($1)+$2.($1)+$3.($1)+$4.($1)+$5.($1)+$6.($1)+
$7.($1)+$8.($1)+$9.($1)+$10.($1)+$11.($1)+$12.($1)+
$13.($1)+$14.($1)+$15.($1)+$16.($1)+$17.($1);

avg_data = foreach key_value_data generate $0,($2 != 0?$1/$2:0) AS average;

filter_remove = FILTER avg_data BY average != 0.0;


-- final_answer = FILTER filter_remove BY average<30; 
-- USING org.apache.pig.backend.hadoop.hbase.HBaseStorage('info:countryName info:average');



