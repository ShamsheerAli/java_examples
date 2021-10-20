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
		 PrintWriter writer1 = new PrintWriter(new File("C:\\SHAMSHEER\\RandomNumList-1.txt"));
	      Random rand = new Random();
	      int number, count=0; 
	      while(count!=20)
	      {
	            number=rand.nextInt(20)+1;
	            writer1.print(number);
	            count++;
	      
	         writer1.println();
	      }
	      writer1.close();
	      Scanner scanner = new Scanner(new File("C:\\SHAMSHEER\\RandomNumList-1.txt"));
	      int [] duplicates1 = new int [20];
	      Set<Integer> duplicatesSet1=new HashSet<>();
	      List<Integer> duplicatesList1=new ArrayList<>();
	      int i = 0;
	      while(scanner.hasNextInt())
	      {
	           duplicates1[i++] = scanner.nextInt();
	      }
	      for(int j=0; j<duplicates1.length;j++) {
	    	  duplicatesSet1.add(duplicates1[j++]);
	    	  //System.out.println(duplicates1[j]);
	      }
	      duplicatesList1.addAll(duplicatesSet1);
	      Collections.sort(duplicatesList1);
	      //System.out.println("--------------------"+duplicatesList1);
	      FileWriter newWriter=new FileWriter("C:\\SHAMSHEER\\UniqueNumList-1.txt");
	      for (Integer values1: duplicatesList1) {
	    	  newWriter.write(values1+System.lineSeparator());
	      }
	      newWriter.close();
	      System.out.println("Unique Numbers In File-1: "+ duplicatesList1.size());
	      PrintWriter writer2 = new PrintWriter(new File("C:\\SHAMSHEER\\RandomNumList-2.txt"));
	      Random rand2 = new Random();
	      int number2, count2=0;
	      while(count2!=40)
	      {
	            number2=rand2.nextInt(40)+1;
	            writer2.print(number2);
	            count2++;
	      
	         writer2.println();
	      }
	      writer2.close();
	      Scanner sc = new Scanner(new File("C:\\SHAMSHEER\\RandomNumList-2.txt"));
	      int [] duplicates2 = new int [40];
	      Set<Integer> duplicatesSet2=new HashSet<>();
	      List<Integer> duplicatesList2=new ArrayList<>();
	      int a = 0;
	      while(sc.hasNextInt()) 
	      {
	           duplicates2[a++] = sc.nextInt();
	      }
	      for(int j=0; j<duplicates2.length;j++) {
	    	  duplicatesSet2.add(duplicates2[j++]);
	    	 // System.out.println(duplicates2[j]);
	      }
	      duplicatesList2.addAll(duplicatesSet2);
	      Collections.sort(duplicatesList2);
	    //  System.out.println("--------------------"+duplicatesList2);
	      FileWriter newWriter2=new FileWriter("C:\\SHAMSHEER\\UniqueNumList-2.txt");
	      for (Integer values: duplicatesList2) {
	    	  newWriter2.write(values+System.lineSeparator());
	      }
	      System.out.println("Unique Numbers in File 2: "+ duplicatesList2.size());
	      newWriter2.close();
	      
	      List<Integer> finalList=new ArrayList<>();
	      for(Integer values: duplicatesList1) {
	    	  if(duplicatesList2.contains(values)) {
	    	finalList.add(values);
	      }
	      }
	      FileWriter newWriter3=new FileWriter("C:\\SHAMSHEER\\CommonNumList.txt");
	      for (Integer values: finalList) {
	    	  newWriter3.write(values+System.lineSeparator());
	      }
	      newWriter3.close();
	      System.out.println("Numbers That Are In both file: "+ finalList.size());
	      
	      List<Integer> duplicateofboth=new ArrayList<>();
	      for(Integer values: duplicatesList2) {
	    	  if(duplicatesList1.contains(values)) {
	    		  duplicateofboth.add(values);
	    	  }
	      }
	      List<Integer> uniquesInFile1=new ArrayList<>();
	      List<Integer> uniquesInFile2=new ArrayList<>();
	      for(Integer values: duplicatesList1) {
	    	  if(duplicateofboth.contains(values)) {
	    		  continue;
	    	  }else
	    		  uniquesInFile1.add(values);
	      }
	      for(Integer values: duplicatesList2) {
	    	  if(duplicateofboth.contains(values)) {
	    		  continue;
	    	  }else
	    		  uniquesInFile2.add(values);
	      }
	      System.out.println("Numbers That Are In File-1,But not In File-2: "+uniquesInFile1.size());
	      System.out.println("Numbers That Are In File-2,But not In File-1: "+uniquesInFile2.size());
	}
}