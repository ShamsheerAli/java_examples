package java_examples;

import java.util.Random; 
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String special = "!@#$";
		String numbers = "1234567890";
		String str = capital + lower + special + numbers;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length Of The Password (8-10)");
		int length = sc.nextInt();
		System.out.println("Enter The Number Of Passwords You Want!!");
		int num = sc.nextInt();
		Random random = new Random();
		char[] password = new char[length];
		password[0] = capital.charAt(random.nextInt(capital.length()));
		password[1] = lower.charAt(random.nextInt(lower.length()));
		password[2] = special.charAt(random.nextInt(special.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));
		for (int j = 0; j < num; j++) {
			for (int i = 4; i < length; i++) {
				password[i] = str.charAt(random.nextInt(str.length()));
			}
			System.out.println(password);
		}
	}
}