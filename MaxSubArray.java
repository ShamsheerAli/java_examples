package java_examples;

import java.util.Scanner;

public class MaxSubArray {

	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int N = scan.nextInt();
        int[] arr = new int[ N ];
        /* Accept N elements */
        System.out.println("Enter "+ N +" elements");
        for (int i = 0; i < N; i++)
            arr[i] = scan.nextInt();
        System.out.println("Max sub array sum  = "+ max_sum(arr));
    }
    public static int max_sum(int[] arr)
    {
        int N = arr.length, max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++)
        {
            int sum = 0;
            for (int j = i; j < N; j++)
            {
                sum += arr[j];
                if (sum > max)
                    max = sum;
            }
        }
        return max;    
    }
}
