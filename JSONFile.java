package java_examples;

import java.util.Scanner;

public class JSONFile {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name");
        String emp_name=sc.nextLine();
        System.out.println("Enter Emplyee Age");
        String emp_age=sc.nextLine();
        System.out.println("Enter Employee Phone Number");
        String emp_num=sc.nextLine();
        System.out.println("Enter Employee Email Id");
        String emp_email=sc.nextLine();
        
        System.out.println(emp_name+"-"+emp_age+"-"+emp_num+"-"+emp_email);
	}

}
