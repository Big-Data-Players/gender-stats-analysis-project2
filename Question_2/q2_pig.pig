data = LOAD 'sqoop-question-2/part-m-00000' USING PigStorage('|') AS(CountryName:chararray,CountryCode:chararray,
IndicatorName:chararray,IndicatorCode:chararray,y1960:float,y1961: float,y1962: float,y1963: float,
y1964: float,y1965: float,y1966: float,y1967: float,y1968: float,y1969: float,y1970: float,y1971: float,
y1972: float,y1973: float,y1974: float,y1975: float,y1976: float,y1977: float,y1978: float,y1979: float,
y1980: float,y1981: float,y1982: float,y1983: float,y1984: float,y1985: float,y1986: float,y1987: float,
y1988: float,y1989: float,y1990: float,y1991: float,y1992: float,y1993: float,y1994: float,y1995: float,
y1996: float,y1997: float,y1998: float,y1999: float,y2000: float,y2001: float,y2002: float,y2003: float,
y2004: float,y2005: float,y2006: float,y2007: float,y2008: float,y2009: float,y2010: float,y2011: float,
y2012: float,y2013: float,y2014: float,y2015: float,y2016: float);

REGISTER '/home/cloudera/workspace/UDFPig/target/UDFPig-0.0.1-SNAPSHOT.jar'

final_answer = FOREACH data generate com.rikenm.main.UdfPig($44,$45,$46,$47,$48,$49,$50,$51,$52,$53,$54,$55,$56,$57,$58,$59,$60);

dump final_answer;



-------------------UDF----------------
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.io.Text;
import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;


public class UdfPig extends EvalFunc<String> {
	
	private Text result = new Text();
	
	

	@Override
	public String exec(Tuple strList) throws IOException {
		// TODO Auto-generated method stub
		
		/*List<String> myList = new ArrayList<>();
		
		for (int i = 0 ; i < strList.size(); i++) {
			
			if(strList.get != null){
				Object str = strList.get(i);
			}
			
		}
		*/
		
		
		if(strList.size() < 2){ 
			
			return "0.0";
			
		}else{
			
			int innerCount = 0;
			float previous = 0.0F;
			int outerCount = 0;
		    List<Float> floatArray = new ArrayList<Float>();
		    float finalAnswer = 0.0F;
			
			
			for (int i = 0 ; i < strList.size(); i++) {
				
				
			
				if(strList.get(i) != null){
					Float value = (Float) strList.get(i);
					
					if(innerCount >= 1){

						try{floatArray.add(((value) - previous)/outerCount);}
						catch(Exception e){
							System.out.println("---The value that cause the error is-- :  "+value);
						}
						
					}
					
					try{previous = value;}
					catch(Exception e){
						System.out.println("---The value that cause the error is 1st-- :  "+value);
					}
					
					outerCount = 1;
					innerCount++;
					
				}else{
					
					outerCount++;
					
				}
				
			}
			// do average 
			if(floatArray.size() < 2){
				return "0.0";
			}
			
			
			for(float f: floatArray){
				finalAnswer += f;
				
			}
			
			
			
			
			
			

			
			return Float.toString(finalAnswer/floatArray.size());
		} 
		
	} 
	
	
	
}






-------------

-------------Pom.xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.rikenm</groupId>
  <artifactId>UDFPig</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  
  
  <properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<hadoop.version>0.20.2</hadoop.version>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
   	 	<maven.compiler.source>1.8</maven.compiler.source>
    	<maven.compiler.target>1.8</maven.compiler.target>
	</properties>
	
   <dependencies> 
	
      <dependency>            
         <groupId>org.apache.pig</groupId>            
         <artifactId>pig</artifactId>            
         <version>0.15.0</version> 
             
      </dependency> 
		
      <dependency>        
         <groupId>org.apache.hadoop</groupId>            
         <artifactId>hadoop-core</artifactId>            
         <version>0.20.2</version>     
      </dependency> 
      
   </dependencies>  
  
</project>


---------
