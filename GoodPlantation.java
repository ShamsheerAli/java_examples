package java_examples;

import java.util.Scanner;

public class GoodPlantation {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter The No.Of plants");
         int n=sc.nextInt();
         System.out.println("Enter The Good Days");
         int G=sc.nextInt();
         System.out.println("Enter The Bad Days");
         int B=sc.nextInt();
         if(n<=G)
        	 System.out.println(n);
         else
        	 System.out.println(G);
	}

}
