package java_examples;

import java.util.Arrays;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
        Scanner user_input = new Scanner( System.in ); 
   String variable;
   System.out.print("Enter Variable:");
     variable = user_input.next();
         Separate(variable);
         
  }

  public static void Separate(String str) {
         String number = "";
         String letter = "";
     String symbol = "";
         for (int i = 0; i < str.length(); i++) {
                char a = str.charAt(i);
                if (Character.isDigit(a)) {
                      number = number + a;
                } else {
                      letter = letter + a;
        }
         }
         char[] str1=letter.toCharArray();
         char[] str2=number.toCharArray();
         Arrays.sort(str1);
         Arrays.sort(str2);
         System.out.println("Alphabets in string:"+new String(str1));
         System.out.println("Numbers in String:"+new String(str2));   
  }
}
