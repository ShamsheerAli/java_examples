package java_examples;
import java.util.Scanner;
public class AlphabetsToNumbers {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Name!!");
        String names=sc.nextLine();
        String numbers="";
        names= names.toUpperCase();
        char[] ch=names.toCharArray();
        for(int i=0; i<ch.length; i++) {
        	if(ch[i]=='A'||ch[i]=='B'||ch[i]=='C') 
        		numbers+=2;
        	if(ch[i]=='D'||ch[i]=='E'||ch[i]=='F') 
        		numbers+=3;
            if(ch[i]=='G'||ch[i]=='H'||ch[i]=='I') 
        		numbers+=4;
            if(ch[i]=='J'||ch[i]=='K'||ch[i]=='L')
        		numbers+=5;
           	if(ch[i]=='M'||ch[i]=='N'||ch[i]=='O')
        		numbers+=6;
           	if(ch[i]=='P'||ch[i]=='Q'||ch[i]=='R'||ch[i]=='S')
        		numbers+=7;
           	if(ch[i]=='T'||ch[i]=='U'||ch[i]=='V')
        		numbers+=8;
           	if(ch[i]=='W'||ch[i]=='X'||ch[i]=='Y'||ch[i]=='Z') 
        		numbers+=9;
        }
        System.out.println(numbers);	
        System.out.println(Integer.MAX_VALUE);
	}
}