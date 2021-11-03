//Program to Convert CSV File to JSON File
package java_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JsonToCsv {

	public static void main(String[] args) throws Exception {
	 Scanner sc=new Scanner(new File("C:\\SHAMSHEER\\Emp_JSON.txt"));
	 String json=sc.nextLine();
	 System.out.println(sc);
	 System.out.println(json);
	}

}
