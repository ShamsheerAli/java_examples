 //Program to Convert Json File to Csv File
package java_examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
		//System.out.println(data);
		List<String> mylist=new ArrayList<>();
		mylist.add(data);
		System.out.println(mylist);
		String str1="";
		String str2="";
		String str3="";
		for(int i=0;i<mylist.size();i++) {
			for(int j=i+1;j<mylist.size(); j++) {
				for(int k=j+1;k<mylist.size();k++) {
					
				}
			}
		}
	}
}