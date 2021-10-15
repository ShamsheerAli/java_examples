package java_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
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
	      writer1.close();
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
	      String filePath = "C:\\SHAMSHEER\\NumbersFile-1.txt";
	      String input = "";
	      Scanner sc = new Scanner(new File(filePath));
	      FileWriter writer = new FileWriter("C:\\SHAMSHEER\\NumbersFile-1.txt");
	      Set set = new HashSet();
	      while (sc.hasNextLine()) {
	         input = sc.nextLine();
	         if(set.add(input)) {
	            writer1.append(input+"\n");
	         }
	      }
	      writer1.flush();
	      System.out.println("Contents added............");

	}
}
