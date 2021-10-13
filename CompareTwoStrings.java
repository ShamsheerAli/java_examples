package java_examples;

import java.util.Scanner;

public class CompareTwoStrings {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1 = sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the second String");
		String str2 = sc2.nextLine();

		int[] flag = new int[50];
		int[] flag2 = new int[50];
		for (int i = 0; i < str1.length(); i++) {
			flag[i] = 1;
			for (int j = 0; j < i; j++) {
				flag[j]=1;
				if (str1.charAt(i) == str1.charAt(j)) {
					flag[i] = flag[i] + 1;
				}else
				System.out.println(str1.charAt(i) + " - " + flag[i]);
			}
		}
		String comm_char = "";
		String diff_char = "";
		for (int a = 0; a < str1.length(); a++) {
			for (int b = 0; b < str2.length(); b++) {
				if (flag[a] == 1) {
					if (str1.charAt(a) == str2.charAt(b)) {
						comm_char = comm_char + str1.charAt(a);
					} else 
 						diff_char = diff_char + str1.charAt(b);
				}
			}
		}
		System.out.println("commom characters: "+comm_char);
		System.out.println("uncommon characters: "+diff_char);
	}
	/*
	 * char[] ch = str1.toCharArray(); char[] ch2 = str2.toCharArray(); for (int i =
	 * 0; i < ch.length; i++) { int count=0; for (int j = 0; j < ch2.length; j++) {
	 * if (ch[i] == ch2[j]) { count=1; char c2 = ch[i]; System.out.println(c2); } }
	 * /*if(count==0) { char c=ch[i]; System.out.println(c); } }
	 */
}
