package java_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArrayGroup {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The Size");
           int n=sc.nextInt();
           int[] a=new int[n];
           System.out.println("Enter The Elements");
           for(int i=0; i<n; i++)
        	   a[i]=sc.nextInt();
           System.out.println("Enter The size of group");
           int k=sc.nextInt();
           reverseArray(a, k);
	}
       static void reverseArray(int[] A,int k ) {
    	   List<Integer> mylist1=new ArrayList<>();
    	   List<Integer> mylist2=new ArrayList<>();
    	   for(int i=0; i<A.length; i++) {
    		   if(i<k)
    			   mylist1.add(A[i]);
    		   else
    			   mylist2.add(A[i]);
    	   }
    	   for(int i=mylist1.size()-1; i>=0; i--)
    	   System.out.print(mylist1.get(i)+" ");
    	   for(int i=mylist2.size()-1; i>=0; i--)
    	   System.out.print(mylist2.get(i)+" ");
       }
}
