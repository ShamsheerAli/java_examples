//Program to Covert CSV File To JSON File
package java_examples;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JSONFile {

	public static void main(String[] args) throws Exception {
		PrintWriter writer = new PrintWriter("C:\\SHAMSHEER\\Emp_JSON.txt");
		writer.write("{\n");
		writer.write("\t" + "\"" + "Employee_Data" + "\"" + ":" + " " + "[\n");
		Scanner reader = new Scanner(new File("C:\\SHAMSHEER\\Emp_Data2.txt"));
		String data = "";
		List<String> list = new ArrayList<>();
		while (reader.hasNext()) {
			data = reader.nextLine();
			list.add(data);
		}
		String a = "";
		String[] fileData = list.toArray(new String[0]);
		for (String value : fileData)
			a += value;
		String[] fileDetails = a.split(",");
		String[] emp_details2 = Arrays.copyOfRange(fileDetails, 4, fileDetails.length);
		String[] sample = Arrays.copyOfRange(fileDetails, 0, 4);
		List<String> letters = Arrays.asList(sample);
		List<String> results = new ArrayList<>();
		int counter = 0;
		for (int i = 0; i < emp_details2.length; i++) {
			results.add(letters.get(counter++));
			if (counter == letters.size()) {
				counter = 0;
			}
		}
		String[] emp_details = results.toArray(new String[0]);
		int count = 1;
		for (int i = 0; i < emp_details2.length; i++) {
			if (i == 0 || i % 4 == 0)
				writer.write("\t\t {\n");
			writer.write("\t\t\t" + "\"" + emp_details[i] + "\"" + " : " + "\"" + emp_details2[i] + "\"\n");
			if (count % 4 == 0)
				writer.write("\t\t },\n");
			count++;
		}
		writer.write("\t]\n");
		writer.write("}\n");
		writer.close();
	}
}