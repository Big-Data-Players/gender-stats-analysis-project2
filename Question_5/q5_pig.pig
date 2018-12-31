data = LOAD 'HData/q5_sqoop_view/part-m-00000' USING PigStorage('|') AS (CountryName:chararray,IndicatorName:chararray,YearsByCountry:chararray,Data:float);

-- Using pig-x local
data = LOAD '/home/cloudera/LData/Project2/q5_sqoop_view/part-m-00000' USING PigStorage('|') AS (CountryName:chararray,IndicatorName:chararray,YearsByCountry:chararray,Data:float);


-- Using pig on GCloud
data = LOAD 'HData/q5_sqoop_view' USING PigStorage('|') AS (CountryName:chararray,IndicatorName:chararray,YearsByCountry:chararray,Data:float);

-- Group data into bags
group_data = Group data all;

-- Calculate average of the data
avg_data = foreach group_data generate (data.CountryName, data.IndicatorName, data.YearsByCountry), AVG(data.Data) AS average;




