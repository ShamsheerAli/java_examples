//Given Array wiil be squared and then sorted
package java_examples;

import java.util.Arrays;
import java.util.Scanner;

public class SquareAndSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of Array");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		a = solve(a);
		for (int i = 0; i < n; i++)
			System.out.println(a[i]);
	}

	public static int[] solve(int[] nums) {
		int[] a = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			a[i] = nums[i] * nums[i];
		}
		Arrays.sort(a);
		return a;
	}
}
