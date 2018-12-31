Q3_data = LOAD 'Q3_MALE_EMP/part-m-00000' USING PigStorage('|') AS 
(CountryName:chararray, IndicatorCode:chararray, y2000:double, y2001:double,
y2002:double,y2003:double,y2004:double,y2005:double,y2006:double,
y2007:double,y2008:double,y2009:double,y2010:double,y2011:double,
y2012:double,y2013:double,y2014:double,y2015:double,y2016:double);


REGISTER '/home/cloudera/workspace/BDPquestion3/target/Question3UDF-0.0.1-SNAPSHOT.jar'

userFunction = FOREACH Q3_data GENERATE CountryName,
com.BDP.Question3UDF($2,$3,$4,$5,$6,$7,$8,$9,$10,$11,$12,$13,$14,$15,$16,$17);
filter_udf = FILTER userFunction BY SIZE($1)!=0;

dump userFunction;

---------- JAVA ----------


package com.revature;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;
import org.apache.pig.data.TupleFactory;
public class UserDefineFunction extends EvalFunc<Tuple>{
    @Override
    public Tuple exec(Tuple arg0) throws IOException {
        List<Double> finalDifference = new ArrayList<Double>();
        double difference = 0;
        if(arg0.size() < 2){
            return arg0;
        }else{
            for(int i = 0; i < arg0.size() - 1; i++){
                if(arg0.get(i) != null && arg0.get(i + 1) != null){
                difference = (Double)arg0.get(i + 1) - (Double)arg0.get(i); 
                finalDifference.add(difference);
                }
            }
            return TupleFactory.getInstance().newTuple(finalDifference);
        }
    }
}