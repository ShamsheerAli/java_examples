package java_examples;
import java.util.Iterator;
import java.util.Scanner;
public class ProductArrayPuzzle {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter The Digits in Array");
        for(int i=0; i<n; i++) 
        	a[i]=sc.nextInt();
        long[] value=productExceptSelf(a, n);
        for(int i=0; i<value.length; i++)
        	System.out.println(value[i]);
	}
	public static long[] productExceptSelf(int nums[], int n) 
	{
		long count[]=new long[n];
		for(int i=0; i<nums.length; i++) {
			   count[i]=1;
			for(int j=0; j<nums.length; j++) {
				if(i!=j)
					count[i]*=nums[j];
			}
		}
		return count;
	} 
}
