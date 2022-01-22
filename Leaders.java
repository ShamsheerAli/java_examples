package java_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leaders {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of array");
         int num=sc.nextInt();
         int[] A=new int[num];
         System.out.println("Enter The Elements");
         for(int i=0; i<num; i++)
        	 A[i]=sc.nextInt();
         System.out.println(leaders(A, num));
	}
	static ArrayList<Integer> leaders(int arr[], int n){
		ArrayList<Integer> mylist=new ArrayList<>();
		    for(int i=0; i<arr.length; i++) {
		    	 for(int j=i+1; j<arr.length; j++) {
		    		 if(arr[i]<=arr[j])
		    			 break;
		    		 else if(j==n-1)
		    			 mylist.add(arr[i]);
		    	 }
		    }
		    mylist.add(arr[n-1]);
		return mylist;
    }
}
