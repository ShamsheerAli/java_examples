package java_examples;
import java.util.Scanner;
public class StairCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No.Of Stairs");
		int num = sc.nextInt();
		System.out.println("The No.Of Ways Are: " + countingways(num));
		sc.close();
		System.out.println("The Possible Ways Are: ");
		stairsPaths(num, "");
	}
	static int countingways(int num) {
		return total_steps(num + 1);
	}
	static int total_steps(int n) {
		if (n <= 1)
			return n;
		return total_steps(n - 1) + total_steps(n - 2);
	}
	public static void stairsPaths(int n, String path) {
		if(n<0)	
			return;
		if(n==0) {
			System.out.println(path);
			return;
		}
		stairsPaths(n-1, path + n+ "-");
		stairsPaths(n-2, path + n+ "-");
	}
}