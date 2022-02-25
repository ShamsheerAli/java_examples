package java_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayPuzzle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size OF Array");
		int num = sc.nextInt();
		int[] a = new int[num];
		System.out.println("Enter The Elements In Array!");
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		puzzle(a);
	}
	public static void puzzle(int[] a) {
		List<Integer> list=new ArrayList<>();
		for(int i=0; i<a.length; i++) {
			int count=1;
			for(int j=0; j<a.length;j++) {
				if(i==j)
					continue;
				else
					count=count*a[j];
			}
			list.add(count);
		}
		System.out.println(list);
	}

}
