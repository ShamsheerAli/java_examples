package java_examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsInMap {

	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter The state Edge");
       String se=sc.next();
       System.out.println(get_edges(se));
	}
      static Map<String,Integer> get_edges(String a){
    	  Map<String,Integer> map1=new HashMap<>();
          map1.put("WA", 7);
          map1.put("CA", 15);
          map1.put("UT", -30);
      Map<String,Integer> map2=new HashMap<>();
          map2.put("CA", 14);
          map2.put("CO", 2);
          map2.put("CT", 13);
          map2.put("FL", 0);
      Map<String,Integer> map3=new HashMap<>();
          map3.put("AK", -14);
          map3.put("WA", -2);
          map3.put("CA", -20);
      Map<String,Map<String,Integer>> mymap=new HashMap<>();
          mymap.put("Gallup",map1);
          mymap.put("SurveyUSA", map2);
          mymap.put("Omniscient", map3);
      Map<String,Integer> result=new HashMap<>();         
      for(Map.Entry<String, Map<String,Integer>> map:mymap.entrySet()) {
    	  String state=map.getKey();
    	  Map<String,Integer> child=map.getValue();
    	  for(Map.Entry<String, Integer> states:child.entrySet()) {
    		  String keys=states.getKey();
    		  int values=states.getValue();
    		  if(keys==a) {
    			  result.put(keys, values);
    		  }
    		  System.out.println(keys);
    	  }
      }
		return result;	  
      }
}
