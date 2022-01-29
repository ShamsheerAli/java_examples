package java_examples;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length");
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;
		System.out.println("Enter The Elements!!");
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = 0; j < n; j++) {
				if (a[i] == a[j])
					count = count + 1;
			}
			if (count > n / 2) {
				System.out.println("The Majority Element Is: " + a[i]);
				break;
			}
			if (i == n - 1)
				System.out.println("There Is No Mojority Element!!");
		}
	}
}