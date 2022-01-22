package java_examples;

import java.util.Scanner;

public class MaxSum {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter The Size Of Array");
          int len=sc.nextInt();
          int[] a=new int[len];
          System.out.println("Enter The Elements!!!");
          for(int i=0; i<len; i++)
        	  a[i]=sc.nextInt();
          int h=0;
          int hi=0;
          for(int i=0; i<len; i++) {
        	  if(a[i]>h) {
        	  h=a[i];
        	  hi=i;
        	  }
          }
          int last=hi-2;
          int first=hi+2;
          System.out.println("hhhhh "+h);
          System.out.println("hiii"+hi);
          System.out.println(last);
          System.out.println(first);
          int add1=0;
          int add2=0;
          if(last>=0) {
        	  for(int i=0; i<=last; i++)
        		  add1+=a[i];
          }
          System.out.println(add1);
          if(first>0) {
        	  for(int i=first; i<len; i++)
        	      add2+=a[i];
          }
          System.out.println(add2);
          if(add1>add2)
        	  h=h+add1;
          else
        	  h=h+add2;
          
          System.out.println(h);
	}
}