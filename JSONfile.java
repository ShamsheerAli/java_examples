package java_examples;

import java.util.ArrayList;
import java.util.List;

public class JSONfile {
   public static void main(String args[]) {
	   List<String> a = new ArrayList<String>();
	   a.add("so 1");
	   a.add("so 2");
	   a.add("so 3");
	   JSONArray jray = new JSONArray(a);

	   System.out.println(jray.toString()); 
   }
}
