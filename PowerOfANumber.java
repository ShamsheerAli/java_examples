//Program to konw the powers Of Two Numbers
package java_examples;

import java.util.Scanner;

public class PowerOfANumber {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter The Value Of a");
		int a = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter The Value Of b");
		int b = sc2.nextInt();
		double result1 = Math.pow(a, b);
		double result2 = Math.pow(b, a);
		System.out.println(a+"^"+b+"="+result1);
		System.out.println(b+"^"+a+"="+result2);
		if (result1 > result2)
			System.out.println(a+"^"+b+"="+result1 + " Is Bigger");
		else
			System.out.println(b+"^"+a+"="+result2 + " Is Bigger");
	}

}
