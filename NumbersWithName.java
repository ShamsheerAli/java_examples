package java_examples;

import java.util.ArrayList;
import java.util.List;

public class NumbersWithName {

	public static void main(String[] args) {
		String s1[]=solve(15);
		for(int i=0; i<s1.length; i++)
			System.out.println(s1[i]);
		}
	public static String[] solve(int n) {
        List<String> a= new ArrayList<>();
        String[] s=new String[n];
        for(int i=1; i<n+1; i++){
            if(i%3==0 && i%5==0){
               a.add("FizzBuzz"); 
            }else if(i%5==0){
                a.add("Buzz");
            }else if(i%3==0){
                a.add("Fizz");
            }else
               a.add(Integer.toString(i));
        }
        for(int i=0; i<n; i++){
            s[i]=a.get(i);
        }
        return s;
    }
}

