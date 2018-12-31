data = LOAD 'output/project2/female_grads_view' USING PigStorage('|')  AS
(CountryName:chararray,CountryCode:chararray,IndicatorName:chararray,IndicatorCode:chararray,y1960:float,y1961: float,y1962: float,y1963: float,y1964: float,y1965: float,y1966: float,y1967: float,y1968: float,y1969: float,y1970: float,y1971: float,y1972: float,y1973: float,y1974: float,y1975: float,y1976: float,y1977: float,y1978: float,y1979: float,y1980: float,y1981: float,y1982: float,y1983: float,y1984: float,y1985: float,y1986: float,y1987: float,y1988: float,y1989: float,y1990: float,y1991: float,y1992: float,y1993: float,y1994: float,y1995: float,y1996: float,y1997: float,y1998: float,y1999: float,y2000: float,y2001: float,y2002: float,y2003: float,y2004: float,y2005: float,y2006: float,y2007: float,y2008: float,y2009: float,y2010: float,y2011: float,y2012: float,y2013: float,y2014: float,y2015: float,y2016: float);

data_limit_No_Null = foreach data generate CountryName,($55 is not null?($55,1) : (0.0F,0)),($56 is not null?($56,1): (0.0F,0)),($57 is not null?($57,1):(0.0F,0)),($58 is not null?($58,1):(0.0F,0)),($59 is not null?($59,1):(0.0F,0)),($60 is not null?($60,1):(0.0F,0));

key_value_data = foreach data_limit_No_Null generate CountryName,$1.($0)+$2.($0)+$3.($0)+$4.($0)+$5.($0)+$6.($0),$1.($1)+$2.($1)+$3.($1)+$4.($1)+$5.($1)+$6.($1);

avg_data = foreach  key_value_data generate $0,($2 != 0?$1/$2:0) AS average;

filter_remove = FILTER avg_data BY average != 0.0;

final_answer = FILTER filter_remove BY average<30; 


#HBase
STORE final_answer into 'hbase://question1_pig' USING org.apache.pig.backend.hadoop.hbase.HBaseStorage('info:countryName info:average');

