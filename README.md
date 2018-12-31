# gender-stats-analysis-project2
Gender Statistics Analysis using Hadoop tools: Sqoop, Hive, Pig, Hbase, MapReduce and OLAP tools
# How to Run the program

# Business Requirements
1. What is the average increase of females who graduated, from the year 2010 - 2016?
2. List the average increase in fmale education in the U.S. from teh year 2000.
3. List the % change of male emplyment from the year 2000.
4. List the % change of female emplyment from the year 2000.
5. What is the average % of female Labor force in the Philippines, from the year 2000 - 2016?



#Setup Cluster (Gcloud)
1. Create cluster
2. Add hbase and oozie initialization scripts
3. Install sqoop and unzip tar
`wget https://www.apache.org/dist/sqoop/1.4.7/sqoop-1.4.7.bin__hadoop-2.6.0.tar.gz`
`tar -zxfv <tar file location> `
4. Move the unzipped folder to sqoop dir
`sudo mv sqoop-1.4.7.bin__hadoop-2.6.0 /usr/lib/sqoop`
Add environment variables to 
5. Copy mysql connector to sqoop lib
`cp /usr/share/java/mysql-connector-java* /usr/lib/sqoop/lib/`
6. Add environment variables to end of .bashrc profile
`export SQOOP_HOME=¡usr/lib/sqoop`
`export PATH=$PATH:$SQOOP_HOME/bin`
7.