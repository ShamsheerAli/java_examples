 //Program to Convert Json File to Csv File
package java_examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonToCsv {
	public static void main(String[] args) throws Exception {
		try  
		{      
		FileReader fr=new FileReader("C:\\SHAMSHEER\\Emp_JSON.txt");    
		BufferedReader br=new BufferedReader(fr);  
		StringBuffer sb=new StringBuffer();      
		String line;  
		while((line=br.readLine())!=null)  
		{  
		sb.append(line);        
		sb.append("\n");       
		}  
		fr.close();  
		System.out.println("Contents of File: ");  
		System.out.println(sb.toString()); 
		}  
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}  
	}
}