
#in hbase
create "question2_pig","info"


#from pig: 
STORE final_answer into 'hbase://question2_pig2' USING org.apache.pig.backend.hadoop.hbase.HBaseStorage('info:countryName info:average');




