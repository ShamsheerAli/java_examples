package java_examples;

import java.util.Scanner;

public class Ceiling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value You Want");
		int x = sc.nextInt();
		System.out.println("Enter The Size OF Array");
		int num = sc.nextInt();
		int[] a = new int[num];
		System.out.println("Enter The Elements In Array!");
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] > x) {
				System.out.println("The Ceiling of x is: " + a[i]);
				break;
			}
		}
		for (int i = a.length - 1; i > 0; i--) {
			if (a[i] < x) {
				System.out.println("The Floor Of x is: " + a[i]);
				break;
			}
		}
	}
}