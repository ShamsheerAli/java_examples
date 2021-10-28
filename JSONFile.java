package java_examples;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JSONFile {

	public static void main(String[] args) throws Exception {
		PrintWriter writer=new PrintWriter("C:\\SHAMSHEER\\Emp_JSON.txt");
		writer.write("{\n");
		writer.write("\t"+"\""+"Employee_Data:"+"\""+" "+"[\n");
		String option="";
         do {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name");
        String emp_name=sc.nextLine();
        System.out.println("Enter Employee Age");
        String emp_age=sc.nextLine();
        System.out.println("Enter Employee Phone Number");
        String emp_num=sc.nextLine();
        System.out.println("Enter Employee Email Id");
        String emp_email=sc.nextLine();
        
        writer.write("\t\t {\n");
        Map<String, String> details=new HashMap<>();
        details.put("Name", emp_name);
        details.put("Age", emp_age);
        details.put("Phone", emp_num);
        details.put("Email", emp_email);
        for (Map.Entry<String, String> map : details.entrySet()) {
			writer.write("\t\t\t"+"\""+ map.getKey()+"\""+" : " + "\"" + map.getValue()+"\"\n");
		}
        writer.write("\t\t },\n");
        
        writer.write("\t]\n");
        writer.write("}\n");
        System.out.println("Do You want enter Details(Y or N)");
        option=sc.next();
         }while(option=="N"||option=="n");
         writer.close();
	}
}
