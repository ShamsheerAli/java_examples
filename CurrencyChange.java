package java_examples;
import java.util.Scanner;
// Here is the program to calculate the current change.
public class CurrencyChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Bill Amount: ");
		double amount = sc.nextDouble();
		System.out.println("Enter The Currency!");
		double currency = sc.nextDouble();
		double remain = 0;
		String change = "";
		remain=currency-amount;
		System.out.println("The Remaining Amount Is: "+remain);
		for (int i = 0; i < remain; i++) {
			if(remain>=2000) {
				remain=remain-2000;
				change+="2000 + ";
			}
			if (remain >= 500 && remain < 2000) {
				remain = remain - 500;
				change += "500 +";
			}
			if (remain >= 200 && remain < 500) {
				remain = remain - 200;
				change += "200 +";
			}
			if (remain >= 100 && remain < 200) {
				remain = remain - 100;
				change += "100 +";
			}
			if (remain >= 50 && remain < 100) {
				remain = remain - 50;
				change += "50 +";
			}
			if (remain >= 20 && remain < 50) {
				remain = remain - 20;
				change += "20 +";
			}
			if (remain >= 10 && remain < 20) {
				remain = remain - 10;
				change += "10 +";
			}
			if (remain >= 5 && remain < 10) {
				remain = remain - 5;         
				change += "5 +";
			}
			if (remain >= 2 && remain < 5) {
				remain = remain - 2;
				change += "2 +";
			}
			if (remain >= 1 && remain < 2) {
				remain = remain - 1;
				change += "1 \n";
			}
			i=0;
		}
		System.out.println("The Change Given To Customer: "+change);
	}
}