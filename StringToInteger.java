package java_examples;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
      Scanner sc1=new Scanner(System.in);
      System.out.println("Enter The First String");
      String str1=sc1.nextLine();
      Scanner sc2=new Scanner(System.in);
      System.out.println("Enter The Second String");
      String str2=sc2.nextLine();
      int a=Integer.parseInt(str1);
      int b=Integer.parseInt(str2);
      System.out.println(a+b);
	}

}
