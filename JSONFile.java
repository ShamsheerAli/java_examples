package java_examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JSONFile {

	public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name");
        String emp_name=sc.nextLine();
        System.out.println("Enter Emplyee Age");
        String emp_age=sc.nextLine();
        System.out.println("Enter Employee Phone Number");
        String emp_num=sc.nextLine();
        System.out.println("Enter Employee Email Id");
        String emp_email=sc.nextLine();*/
        
        System.out.println("{");
        System.out.println("\t"+"\""+"Employee_Data:"+"\""+" "+"[");
        
        System.out.println("\t\t {");
       /* Map<String, String> details=new HashMap<>();
        details.put("Name", emp_name);
        details.put("Age", emp_age);
        details.put("Phone", emp_num);
        details.put("Email", emp_email);*/
        System.out.println("\t\t },");
        
        System.out.println("\t]");
        System.out.println("}");
	}

}
