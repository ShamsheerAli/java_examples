package java_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class FilesOperations {

	public static void main(String[] args) throws Exception {
		 PrintWriter writer1 = new PrintWriter(new File("C:\\SHAMSHEER\\NumbersFile-1.txt"));
	      Random rand = new Random();
	      int number, count=0; 
	      while(count!=200)
	      {
	            number=rand.nextInt(200)+1;
	            writer1.print(number);
	            count++;
	      
	         writer1.println();
	      }
	      String fileName="C:\\SHAMSHEER\\NumbersFile-1.txt";
	      Scanner inputStream=null;
	      inputStream = new Scanner(new File(fileName));
	      String[] address = new String[500];
	      int i = 0;
	          while (inputStream.hasNextLine()) {
	              String email = inputStream.nextLine();
	              System.out.println(email);

	             char ch1,ch2; //Variables to compare charachters
	             String result ="";//Variable to store the final result
	              for(int j=0; j<address[i].length()-1; j++){
	                  ch1=address[i].charAt(j); // get the first character
	                  ch2=address[i].charAt(j+1); // get the next character 
	                 if(ch1!=ch2) {// compare first and second, second and third ..., and so on; if not equal add to result            
	                 result = result + ch1;
	                 }
	               }
	             char [] res = result.toCharArray();
	             System.out.println(Arrays.toString(res)); // Printing the result
	             i++;
	       }
	      PrintWriter writer2 = new PrintWriter(new File("C:\\SHAMSHEER\\NumbersFile-2.txt"));
	      Random rand2 = new Random();
	      int number2, count2=0;
	      while(count2!=400)
	      {
	            number2=rand2.nextInt(400)+1;
	            writer2.print(number2);
	            count2++;
	      
	         writer2.println();
	      }
	      writer2.close();
	}
}