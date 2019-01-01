
#in hbase
create "q5table","info"

# EXECUTE IN PIG (grunt shell): 
STORE avg_data into 'hbase://q5table' USING org.apache.pig.backend.hadoop.hbase.HBaseStorage('info:countryName info:average');




