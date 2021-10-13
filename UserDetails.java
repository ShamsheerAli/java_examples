package java_examples;
import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class UserDetails {

	public static void main(String[] args) {
		File userFile = new File("C:\\SHAMSHEER\\UserDetails.txt");
		int option = 1;
		do {
			System.out.println("*********MENU**********");
			System.out.println("1. Create User");
			System.out.println("2. Update Password");
			System.out.println("3. Delete User");
			System.out.println("4. Validate User");
			System.out.println("5. Exit");
			System.out.println("Enter Your Options!!");
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			switch (option) {
			case 1:
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter The UserName");
				String userName = sc1.nextLine();
				System.out.println("Enter The Password(Password Should contain Uppercase, Lowercase, Number, Symbol)");
				String password = sc1.nextLine();
				try {
					FileWriter writer = new FileWriter("C:\\SHAMSHEER\\UserDetails.txt", true);

					BufferedWriter b = new BufferedWriter(writer);
					b.newLine();
					b.write(userName);
					b.newLine();
					b.write(password);
					b.close();
					writer.close();

				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter The Username To change The Password!!");
				String change = sc2.nextLine();
				try {
					BufferedReader br = new BufferedReader(new FileReader("C:\\SHAMSHEER\\UserDetails.txt"));
					if ((change = br.readLine()) != null) {
						System.out.println("Enter the old password");
						String old = sc2.nextLine();
						System.out.println("Enter The new password!");
						String newPassword = sc2.nextLine();
						Path path = Paths.get("C:\\SHAMSHEER\\UserDetails.txt");
						Stream<String> lines = Files.lines(path);
						List<String> replaced = lines.map(line -> line.replaceAll(old, newPassword))
								.collect(Collectors.toList());
						Files.write(path, replaced);
						lines.close();
						System.out.println("Your Password Had Updated");
					} else
						System.out.println("Give the valid username!");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Enter The Username You Want To Delete!!");
				String deleteUser = sc3.nextLine();
				try {
					BufferedReader br = new BufferedReader(new FileReader("C:\\SHAMSHEER\\UserDetails.txt"));
					if ((change = br.readLine()) != null) {
						System.out.println("Enter the password");
						String deletePassword = sc3.nextLine();
						Path path = Paths.get("C:\\SHAMSHEER\\UserDetails.txt");
						Stream<String> lines = Files.lines(path);
						List<String> replaced = lines.map(line -> line.replaceAll(deleteUser, " "))
								.collect(Collectors.toList());
						Files.write(path, replaced);
						lines.close();
						System.out.println("UserName Had Been Deleted Successfully");
					} else
						System.out.println("Give the valid username!");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				Scanner sc4 = new Scanner(System.in);
				System.out.println("Enter The UserName To Validate");
				String validate = sc4.nextLine();
				System.out.println("Enter The Password!!");
				String valPassword = sc4.nextLine();
				try {
					BufferedReader br = new BufferedReader(new FileReader("C:\\SHAMSHEER\\UserDetails.txt"));
					if ((validate = br.readLine()) != null && (valPassword = br.readLine()) != null) {
						System.out.println("Your Details Are Validated!!");
					} else
						System.out.println("The Username or Password You have entered is incorrect!!");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
		} while (option != 5);
		System.out.println("Exit");
	}
}