package java_examples;

import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter The Target");
       int target=sc.nextInt();
       System.out.println("Enter The Length");
       int len=sc.nextInt();
       int a[]=new int[len];
       System.out.println("Enter The Elements");
       for(int i=0; i<len; i++)
    	   a[i]=sc.nextInt();
       for(int i=0; i<len; i++) {
    	   for(int j=0; j<len; j++) {
    		   if(a[i]+a[j]==target)
    			   System.out.println("["+i+","+j+"]");
    	   }
       }
	}

}
