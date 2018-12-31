# Create database
CREATE DATABASE IF NOT EXISTS genderdb;
USE genderdb;

# Create q5data table
CREATE TABLE IF NOT EXISTS q5data(CountryName varchar(50), IndicatorName varchar(500),
YearsByCountry varchar(50),Data double)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY '|';

# Load data into q5data table
load data local inpath 'LData/Project2/q5_sqoop_view/part-m-00000' into table q5data;

# Create table with Average of data
CREATE OR REPLACE VIEW q5_avg AS
SELECT CountryName, (avg(Data)) 
FROM q5data
Group BY CountryName;

# Convert hive table to .csv
hive -e 'select * from genderdb.q5data' | sed 's/[\t]/,/g' LData/Project2/q5_hive_data.csv

# Averaged .csv (Final)
hive -e 'select * from genderdb.q5_avg' | sed 's/[\t]/,/g' 
LData/Project2/q5_hive_avg.csv

# Move to shared folder
sudo cp LData/Project2/q5_hive_data.csv /media/sf_vbshared/ 
sudo cp LData/Project2/q5_hive_avg.csv /media/sf_vbshared/ 