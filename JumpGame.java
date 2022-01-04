package java_examples;

import java.util.Scanner;

public class JumpGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The size Of Array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter The Elements in array");
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		   System.out.println(canReach(a,n ));

	}
	 static int canReach(int[] A, int N) {
         for(int i=0; i<A.length; i++){
             if(A[i]==0) {
            	  return 0;
             }
             else if(A[i]!=0){
            	 i+=A[i];
                 if(i>=N-1) {
                   return 1;
                   
                 }
               i--;
             }
         }
		return 0;
   }
}