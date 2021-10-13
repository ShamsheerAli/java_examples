package java_examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class CountingTheAlphabetsInString {

	/*public static void main(String[] args) {

		
		List<String> myList = Arrays.asList("s","a", "m", "s", "h", "e","e", "r","a","l", "i");
		Map<String, Integer> myMap = new HashMap<>();
		Set<String> mySet = new LinkedHashSet<>();
		
		for (String value : myList) {
			mySet.add(value);
			Integer currentValue = myMap.get(value) != null ? myMap.get(value) : 0;
			myMap.put(value, ++currentValue);

		}
		
		System.out.println(myList);
		System.out.println(mySet);
		System.out.println(myMap);
		
		/*List<String> distinctList = myList.stream()
				                          .distinct()
				                          .collect(Collectors.toList());
		System.out.println(distinctList);
		myList.stream()
		       .filter(eachValue -> !eachValue.equalsIgnoreCase("a"))
		       .map(eachVal -> eachVal.toUpperCase())
		       .forEach(val -> System.out.println(val));
		                                            

	} */

	public static void main(String args[]) {
        String str;
        int i, length, counter[] = new int[256],flag;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        str = scanner.nextLine();
        length = str.length();
        for (i = 0; i < length; i++) {
        	int value=(int) str.charAt(i);
        	counter[value]++;        	
        }                    
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
    }	
}