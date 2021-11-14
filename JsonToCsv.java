//Program to Convert Json File to Csv File
package java_examples;

import java.io.File;
import java.util.Scanner;

public class JsonToCsv {
	public static void main(String[] args) throws Exception {
		String str1 = "";
		String str2 = "";
		String str3 = "";
		int count = 0;
		Scanner reader = new Scanner(new File("C:\\SHAMSHEER\\Emp_JSON.txt"));
		while (reader.hasNextLine()) {
			reader.toString();
			str1 = reader.nextLine();
			str2 = str1;
			str3 = str2;
			if (str3 == ":")
				count++;
		}
		System.out.println(count);
		System.out.println(str3);
	}
}