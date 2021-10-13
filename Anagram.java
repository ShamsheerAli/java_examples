package java_examples;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram { // Anagrams: If 2 Strings have same no.of Elements & Same Elements, sequence can be different	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First String");
		String str1 = sc.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter The Second String");
		String str2 = sc2.nextLine();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() != str2.length()) {
			System.out.println("Both Are Not Anagrams");
		} else {                                                           
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			// System.out.println(ch1);
			// System.out.println(ch2);
			if (Arrays.equals(ch1, ch2)) {
				System.out.println("Both Are Anagrams");
			} else
				System.out.println("Both Are Not Anagrams");
		}
	}
}