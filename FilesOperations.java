package java_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

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
	      int number2, count2=0; 
	      while(count!=200)
	      {
	            number2=rand.nextInt(200)+1;
	            writer2.print(number2);
	            count2++;
	      
	         writer2.println();
	      }
	      writer2.close();
	}
}
