package java_examples;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortAndRemoveDuplicatesInSLL {

	public static void main(String[] args) {
     LinkedList<Integer> list1=new LinkedList<>();
        list1.add(20);
        list1.add(0,34);
        list1.addFirst(66);
        list1.addLast(2);
     LinkedList<Integer> list2=new LinkedList<>();
        list2.add(23);
        list2.addFirst(66);
        list2.addLast(2);
        list2.add(1,45);
        list2.addAll(list1);
      System.out.println("The List Before Sorting:\n "+list2);  
      Collections.sort(list2);
      System.out.println("The Sorted List:\n "+list2); 
    LinkedList<Integer> mylist=new LinkedList<>();
       for(Integer value:list2) {
    	   if(!mylist.contains(value))
    		   mylist.add(value);
       }
      System.out.println("List After Removing Duplicates:\n "+mylist);
	}
}
