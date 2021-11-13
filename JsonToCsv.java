 //Program to Convert Json File to Csv File
package java_examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonToCsv {
	public static void main(String[] args) throws Exception {
		String data="";
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
		data= sb.toString(); 
		}  
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}  
		System.out.println(data);
		for(int i=0;i<data.length();i++) {
			System.out.println(data.charAt(i));
			if(i==1)
				break;
		}
	}
}