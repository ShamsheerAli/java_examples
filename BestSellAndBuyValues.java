//Program to sell and buy the house
package java_examples;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class BestSellAndBuyValues {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The no.of Elements");
        int a=sc.nextInt();
        int[] arr2=new int[a];
        int[] arr=new int[a];
        System.out.println("Enter "+a+" Elements");
        for(int i=0; i<a; i++) {
        	arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        int index=0;
        for(int j=1; j<arr.length; j++) {
                if(arr[j]<min) { 
        		min=arr[j];
                index=j;
                }else if(arr[j]>max)
                	max=arr[j];
        }
        System.out.println("Best Rate To Buy:  "+min);
       // System.out.println("Best Rate TO Sell: "+max);
        //System.out.println(index);
        int maxvalue=arr[index];
        for(int k=index; k<arr.length; k++) {
        	if(arr[k]>maxvalue)      
        		maxvalue=arr[k];
        }
        System.out.println("Best Value To Sell: "+maxvalue);
       /* for(int k=0; k<arr.length;k++) {
        	for(int l=0; l<arr2.length;l++) {
        	if(min<arr[k])
        		arr2[l]=arr[k];
        	else if(min==arr[k])
        		break;
        	System.out.println(arr[l]);
        	}
        }*/
	}
}