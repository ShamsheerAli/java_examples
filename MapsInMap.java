package java_examples;

import java.util.HashMap;
import java.util.Map;

public class MapsInMap {

	public static void main(String[] args) {
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
       
      /* { "Gallup": { "WA": 7, "CA": 15, "UT": -30 },
    	   "SurveyUSA": { "CA": 14, "CO": 2, "CT": 13, "FL": 0 },
    	   "Omniscient": { "AK": -14.0, "WA": -2.3, "CA": 20.9 } } */
	}

}
