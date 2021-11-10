 //Program to Convert CSV File to JSON File
package java_examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JsonToCsv {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\SHAMSHEER\\Emp_JSON.txt"));
		StringBuilder stringBuilder = new StringBuilder();
		String line = null;
		String ls = System.getProperty("line.separator");
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(ls);
		}
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		reader.close();
		String content = stringBuilder.toString();
		content=content.replace("\t", "");
		content=content.replace("[", "");
		content=content.replace("]", "");
		content=content.replace("{", "");
		content=content.replace("}", "");
		content=content.replace("\"", "");
		content=content.replace(",", "");
		content=content.replace(" ", "");
		
		String[] data=content.split(":");
		String[] data2=new String[data.length];
		List<String> dataList=new ArrayList<>();
		List<String> dataList2=new ArrayList<>();
		  for(int i=0; i<data.length; i++) {
			  dataList.add(data[i]);
          }
		  System.out.println(dataList);     
		  for(String value:dataList) {
			  if(value=="Employee_Name, IsmailShaik")
				  dataList2.add(value);
          }
		  System.out.println(dataList2);
	}
}