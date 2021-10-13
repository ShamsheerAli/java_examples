package java_examples;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter The No Of Elements...");
          int num=sc.nextInt();
          int[] a=new int[num];
          Scanner sc1= new Scanner(System.in);
          System.out.println("Enter The Elements");
          for(int i=0; i<num;i++) {
        	  a[i]=sc1.nextInt();
          }
          System.out.println("Enter The Value To be Searched....");
          int n=sc.nextInt();
          int low=0;
          int high=num-1;
          int mid=0;
          while(low<=high) {
        	  mid=(low+high)/2;
        	  if(a[mid]==n) {
        		  System.out.println("The Element Searched At Index :"+mid);
        		  break;
        	  }else if(a[mid]>n) {
        		  high=mid-1;
        	  }else if(a[mid]<n) {
        		  low=mid+1;
        	  }
          }
          if(low>high)
        	  System.out.println("The Element Is Not Found!!!");
	}
}