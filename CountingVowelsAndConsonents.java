package java_examples;

import java.util.Scanner;

public class CountingVowelsAndConsonents {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter The String");
         String str=sc.nextLine();
         str=str.toLowerCase();
         int count=0;
         int flag=0;
         for(int i=0; i<str.length(); i++) {
        	if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') {
        		count++;
        	}else if(str.charAt(i)>'a'&& str.charAt(i)<'z') {
        		flag++;
        	}
         }
         System.out.println("The Number Of Vowels: "+count);
         System.out.println("The Number Of Consonents: "+flag);
	}

}
