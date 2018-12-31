data = LOAD 'q5_sqoop_view' USING PigStorage('|') AS (CountryName:chararray,IndicatorName:chararray,YearsByCountry:chararray,Data:float);

-- Group data into bags
group_data = Group data BY CountryName;

-- Calculate average of the data
avg_data = foreach group_data generate group, AVG(data.Data) AS average;




