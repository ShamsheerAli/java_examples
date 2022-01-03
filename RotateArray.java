package java_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter The Size Of The Array");
           int num=sc.nextInt();
           System.out.println("Enter The Rotation Number");
           int m=sc.nextInt();
           int[] a=new int[num];
           System.out.println("Enter The Elements Of Array");
           for(int i=0; i<num; i++) 
        	   a[i]=sc.nextInt();
           List<Integer> mylist1=new ArrayList<>();
           List<Integer> mylist2=new ArrayList<>();
           for(int i=0; i<m; i++) 
        	   mylist1.add(a[i]);
           for(int i=m; i<a.length; i++)
        		   mylist2.add(a[i]);
           for(int i=0; i<mylist1.size(); i++) 
        	   mylist2.add(mylist1.get(i));
           System.out.println(mylist2);
	}

}