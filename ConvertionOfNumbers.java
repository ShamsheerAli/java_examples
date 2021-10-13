package java_examples;
import java.util.Scanner;
public class ConvertionOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Roman Number");
		String str1 = sc.nextLine();
		int len = str1.length();
		str1 = str1 + " ";
		str1 = str1.toUpperCase();
		int value = 0;
		if(str1.contains("IIII")||str1.contains("IIX")||str1.contains("IIV") ) {
			System.out.println("It is wrong");
		}else {
		for (int i = 0; i < len; i++) {  
			char ch = str1.charAt(i);
			switch(ch) {
			case 'M':
				value+=1000;
				break;
			case 'D':
				value+=500;
				break;
			case 'C':
				value+=100;
				break;
			case 'L':
				value+=50;
				break;
			case 'X':
				value+=10;
				break;
			case 'V':
				value+=5;
				break;
			case 'I':
				value+=1;
				break;
			}	
			}
		   if(str1.contains("IV")) {
			   value-=2;
		   }
		   if(str1.contains("IX")) {
			   value-=2;
		   }
		   if(str1.contains("XL")) {
			   value-=20;
		   }
		   if(str1.contains("XC")) {
			   value-=20;
		   }
		   if(str1.contains("CD")) {
			   value-=200;
		   }
		   if(str1.contains("CM")) {
			   value-=200;
		   }
			System.out.println("The Integer Value: " + value);
			String str2= Integer.toBinaryString(value);
			System.out.println("THe Binary Value: "+str2);
		}
	}
}