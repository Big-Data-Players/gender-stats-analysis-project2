
question4_data = LOAD 'sqoop-question-4p' USING PigStorage('|') AS 
(CountryName:chararray, IndicatorCode:chararray, YearsByCountry:int, Data:float);