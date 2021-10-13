package java_examples;
import java.util.Scanner;
public class CombinationsOfANumber {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,6,6,7};
	   	int sum = 0;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a Number");
		int value = sc1.nextInt();
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				if(numbers[i]==numbers[j])
					break; 
				 sum =  numbers[i] + numbers[j];
				 if (sum == value) { 
					System.out.println(numbers[i] + "," + numbers[j]);
				} 
			}
		}  
	}
}
