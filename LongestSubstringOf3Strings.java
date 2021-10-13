package java_examples;

import java.util.Scanner;

public class LongestSubstringOf3Strings {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter The 1st String");
		String str1 = sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter The 2nd String");
		String str2 = sc2.nextLine();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter The 3rd String");
		String str3 = sc3.nextLine();
		char[] empty_str1 = new char[20]; // this can be char array
		// String empty_str2 = "";
		// System.out.println(str1);
		// System.out.println(str2);
		// System.out.println(str3);
		// define two empty strings here.
		int m = 0;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					i++;
					j++;
					int k = i;
					int l = j;
					for (; l < str2.length(); l++, k++) {
						if (str1.charAt(k) == str2.charAt(l)) {
							empty_str1[m++] = str1.charAt(l-1);	
							break;
						}
					}
				}
			}
		}
		System.out.println(empty_str1);
	}
}