package java_examples;
import java.util.Scanner;
public class ReverseStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Sentence");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		String str1 = "";
		char[] ch2 = new char[20];
		String[] str2 = str.split(" ");
		for (int i = ch.length - 1; i >= 0; i--) {       
			str1 += ch[i];
		}
		System.out.println(str1);                     //First Output
		for (int j = str2.length - 1; j >= 0; j--) {
			System.out.print(str2[j] + " ");           //Second Output
		}
		System.out.println("                              ");
		
		for (int k = 0; k < str2.length; k++) {
			ch2 = str2[k].toCharArray();
			for (int l = ch2.length - 1; l >= 0; l--) {
				
				System.out.print(ch2[l]);        //Third Output
			}
			System.out.print(" ");  
		}
	}
}