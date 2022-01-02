package java_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleFractions {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the numerator");
          float n=sc.nextInt();
          System.out.println("Enter The Denomirator");
          float d=sc.nextInt();
          float total=n/d;
          String str=Float.toString(total);
          char[] ch=str.toCharArray();
          int j=0;
          List<Character> mylist=new ArrayList<>();
          for(int i=0; i<ch.length;i++) {
        	  if(ch[i]=='.') {
        		  j=i+1;
        	  }
          }
          for(int i=j; i<ch.length; i++) {
        	  mylist.add(ch[i]);
          }
         
         for(int i=0; i<mylist.size(); i++) {
        	 if(mylist.size()==1) {
           	  System.out.println(ch[i]+"."+mylist.get(i));
             }else if(mylist.get(i)==mylist.get(i+1)) {
              System.out.println(ch[i]+"."+mylist.get(i));
              break;
             }
         }
         System.out.println(total);
	}
}