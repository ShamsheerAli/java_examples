package java_examples;

import java.util.ArrayList;
import java.util.Scanner;

public class NumbersToAlphabets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Numbers!!!");
		String num = sc.next();
		ArrayList<String> words = findValues(num);
		int size=words.size();
		System.out.println("The Number Of Words Are: " + size);
		System.out.println(words);
	}

	static String[] codes = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static ArrayList<String> findValues(String num) {
		if (num.length() == 0) {
			ArrayList<String> blank = new ArrayList<>();
			blank.add("");
			return blank;
		}
		char ch = num.charAt(0);
		String ros = num.substring(1);
		ArrayList<String> recursion = findValues(ros);
		ArrayList<String> result = new ArrayList<>();
		String codeforch = codes[ch - '0'];
		for (int i = 0; i < codeforch.length(); i++) {
			char chcode = codeforch.charAt(i);
			for (String value : recursion) {
				result.add(chcode + value);
			}
		}
		return result;
	}
}