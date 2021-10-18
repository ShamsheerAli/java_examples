package java_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
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
	      Scanner scanner = new Scanner(new File("C:\\SHAMSHEER\\NumbersFile-1.txt"));
	      int [] duplicates1 = new int [200];
	      Set<Integer> duplicatesSet1=new HashSet<>();
	      List<Integer> duplicatesList1=new ArrayList<>();
	      int i = 0;
	      while(scanner.hasNextInt())
	      {
	           duplicates1[i++] = scanner.nextInt();
	      }
	      for(int j=0; j<duplicates1.length;j++) {
	    	  duplicatesSet1.add(duplicates1[j++]);
	    	  System.out.println(duplicates1[j]);
	      }
	      duplicatesList1.addAll(duplicatesSet1);
	      Collections.sort(duplicatesList1);
	      System.out.println("...................."+duplicatesSet1);
	      System.out.println("--------------------"+duplicatesList1);
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