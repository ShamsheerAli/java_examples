package java_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Segregate0and1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size OF Array");
		int num = sc.nextInt();
		int[] a = new int[num];
		System.out.println("Enter The Elements In Array!");
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		segregate(a);
	}
	public static void segregate(int[] a) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0)
				list1.add(a[i]);
			else
				list2.add(a[i]);
		}
		list1.addAll(list2);
		System.out.println(list1);
	}
}