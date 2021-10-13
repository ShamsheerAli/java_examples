package java_examples;
import java.io.BufferedWriter; 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AataAmounts {
	public static void main(String[] args) {
		File myfile = new File("C:\\SHAMSHEER\\File.txt");
		System.out.println("File Created");
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter The Date"); String date = sc.next();
		 * System.out.println("Enter The Amount Of Aata Sales"); 
		 * int aata =sc.nextInt(); 
		 * System.out.println("Enter The Amount Of Grinder Sales"); 
		 * int grinder = sc.nextInt();
		 */
		List<Integer> aataAmount = new ArrayList<>();
		List<Integer> grinderAmount = new ArrayList<>();
		try {
			FileWriter writer = new FileWriter("C:\\SHAMSHEER\\File.txt", true);
			/*
			 * BufferedWriter b= new BufferedWriter(writer);
			 * b.write(date+","+aata+","+grinder); 7 b.newLine(); b.close(); writer.close();
			 */
			System.out.println("Data Entered Successfully");
			Scanner reader = new Scanner(myfile);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				String[] words = data.split(",");
				aataAmount.add(Integer.parseInt(words[1]));
				grinderAmount.add(Integer.parseInt(words[2]));
			}
			System.out.println("AataAmount: " + aataAmount);
			System.out.println("GrinderAmount: " + grinderAmount);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < aataAmount.size(); i++) {
			sum1 += aataAmount.get(i);
		}
		for (int j = 0; j < grinderAmount.size(); j++) {
			sum2 += grinderAmount.get(j);
		}
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Do You Want Monthly Report? (Y/N)");
		String input = sc2.nextLine();
		input=input.toUpperCase();
		switch(input) {
		case "Y":
		System.out.println("The Total Of Aata Amounts: " + sum1);
		System.out.println("The Total Of Grinder Amounts: " + sum2);
		break;
		case "N":
		System.out.println("Its OK!!");
		break;
		default:
			System.out.println("Enter The Correct Option!!!");
		}

	}
}