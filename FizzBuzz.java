package java_examples;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		int N=15;
		System.out.println(solvez(N));
	}
	 public static String[] solvez(int n) {
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