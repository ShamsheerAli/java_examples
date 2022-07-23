package java_examples;

import java.util.Arrays;

public class BuyingCars {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int n=a.length;
	     System.out.println(solves(a,n));
	}
	public static int solves(int[] prices, int k) {
        Arrays.sort(prices);
        int a=0;
        int count=0;
        for(int i=0; i<prices.length; i++){
              a=a+prices[i];
              if(k<a)
                 break;
              count++;
        }
        return count;
    }
}
