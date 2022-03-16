package java_examples;

import java.util.Scanner;

public class Demo{
	   void sorting(int my_arr[]){
	      boolean swapped = true;
	      int start = 0;
	      int end = my_arr.length;
	      while (swapped == true) {
	         swapped = false;
	         for (int i = start; i < end - 1; ++i) {
	            if (my_arr[i] > my_arr[i + 1]) {
	               int temp = my_arr[i];
	               my_arr[i] = my_arr[i + 1];
	               my_arr[i + 1] = temp;
	               swapped = true;
	            }
	         }
	         if (swapped == false)
	            break;
	         swapped = false;
	         end = end - 1;
	         for (int i = end - 1; i >= start; i--) {
	            if (my_arr[i] > my_arr[i + 1]) {
	               int temp = my_arr[i];
	               my_arr[i] = my_arr[i + 1];
	               my_arr[i + 1] = temp;
	               swapped = true;
	            }
	         }
	         start = start + 1;
	      }
	   }
	   void print_values(int my_arr[]){
	      for (int i = 0; i < my_arr.length; i++)
	      System.out.print(my_arr[i]);
	   }  
	   public static void main(String[] args){
	      Demo my_object = new Demo();
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter The Size");
	      int n=sc.nextInt();
	      int my_arr[] = new int[n];
	      System.out.println("Enter The Elements");
	      for(int i=0; i<n; i++)
	    	  my_arr[i]=sc.nextInt();
	      my_object.sorting(my_arr);
	      my_object.print_values(my_arr);
	   }
	}