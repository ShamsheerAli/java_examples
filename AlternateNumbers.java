package java_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlternateNumbers {
	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter The length Of Array");
           int len=sc.nextInt();
           int[] a=new int[len];
           int[] result=new int[len];
           List<Integer> mylist1=new ArrayList<>();
           List<Integer> mylist2=new ArrayList<>();
           System.out.println("Enter The Numbers");
           for(int i=0; i<a.length; i++) {
        	   a[i]=sc.nextInt();
           }
           for(int i=0; i<a.length; i++) {
        	   if(a[i]>=0) {
        		   mylist1.add(a[i]);
        	   }else
        		 mylist2.add(a[i]);  
           }
           int i = 0, j = 0, k = 0;
           while (i < mylist1.size() && j < mylist2.size())
           {
               result[k++] = mylist1.get(i++);
               result[k++] = mylist2.get(j++);
           }
           while (i < mylist1.size())
               result[k++] = mylist1.get(i++);
           while (j < mylist2.size())
               result[k++] = mylist2.get(j++);
          for(int l=0; l<result.length; l++) {
        	  System.out.println(result[l]);
          }
	}
}