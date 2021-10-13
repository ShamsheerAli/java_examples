package java_examples;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JTree;

public class TreesImplementation {

	public static void main(String[] args) {
		NavigableSet<String> tree = new TreeSet<String>();
		System.out.println("  TREE HAS BEEN INITITALZED");
		String con = "a";
		do {
			System.out.println("    *** MENU ***");
			System.out.println("    2. Add Element in Tree");
			System.out.println("    3. Delete Element in Tree");
			System.out.println("    4. Search Element in Tree");
			System.out.println("    5. Display Element in Tree");
			System.out.println("    X. Exit the Menu");
			System.out.println("\n  Enter you selection: ");
			Scanner sc = new Scanner(System.in);
			con = sc.nextLine();
			switch (con) {
			case "2":
				String con2 = "";
				System.out.println("    *** SUB - MENU ***");
				System.out.println("    a. Add Element at the begining of Tree");
				System.out.println("    b. Add Element at the end of Tree");
				System.out.println("    c. Add Element at a position of Tree");
				System.out.println("    z. Exit the Menu");
				System.out.println("Enter The Operation");
				Scanner sc3 = new Scanner(System.in);
				con2 = sc3.next();
				switch (con2) {
				case "a":
					Scanner sc1 = new Scanner(System.in);
					System.out.println("How Many Elements Do U Want To Add?");
					int a = sc1.nextInt();
					for (int i = 0; i < a; i++) {
						String input = sc1.next();
						tree.add(input);
					}
					System.out.println("Elements Added Successfully");
					break;

				case "b":
					Scanner s1 = new Scanner(System.in);
					System.out.println("How Many Elements Do U Want To Add?");
					int b = s1.nextInt();
					for (int i = 0; i < b; i++) {
						String input2 = s1.next();
						tree.add(input2);
					}
					break;

				case "c":
					Scanner s2 = new Scanner(System.in);
					System.out.println("How Many Elements Do U Want To Add?");
					int c = s2.nextInt();
					Scanner s21 = new Scanner(System.in);
					System.out.println("Enter The Index");
					int ind = s21.nextInt();
					for (int i = 0; i < c; i++) {
						String input3 = s2.next();
						tree.add(input3);
					}
					break;

				case "d":
					Scanner s3 = new Scanner(System.in);
					System.out.println("How Many Elements Do U Want To Add?");
					int d = s3.nextInt();
					for (int i = 0; i < d; i++) {
						String input4 = s3.next();
						tree.add(input4);
					}
					break;
				case "z":
					break;
				default:
					System.out.println("The character entered is not not valid, please Enter The Valid character!");
					break;
				}
				break;
			case "3":
				String con3 = "";
				System.out.println("    *** SUB - MENU ***");
				System.out.println("    a. Delete Element at the begining of Tree");
				System.out.println("    b. Delete Element at the end of Tree");
				System.out.println("    c. Delete Element at a position of Tree");
				System.out.println("    z. Exit the Menu");
				System.out.println("Enter The Operation");
				Scanner sc5 = new Scanner(System.in);
				con3 = sc5.next();
				switch (con3) {
				case "a":
					tree.pollFirst();
					System.out.println("After Deleting At Begining:\n " + tree);
					break;
				case "b":
					tree.pollLast();
					System.out.println("After Deleting At End:\n " + tree);
					break;
				case "c":
					Scanner sc2 = new Scanner(System.in);
					System.out.println("Enter The Position You Want to Delete");
					int rem = sc2.nextInt();
					for(int i=0; i<tree.size(); i++) {
				
					}
					System.out.println("After Deleting At A Point:\n " + tree);
					break;
				case "z":
					break;
				default:
					System.out.println("Enter The Correct Option");
				}
				break;
			case "4":
				Scanner sc6 = new Scanner(System.in);
				System.out.println("Enter The Element To be Searched");
				String str5 = sc6.nextLine();
				String str_arr =tree.toString();
				String[] arr=str_arr.split("");
				for(int i=0; i<str_arr.length(); i++)
				if (arr[i]==str5)
					System.out.println("The Element Found At: "+str_arr.indexOf(i));
				else
					System.out.println("No Element Found");
				break;
			case "5":
				System.out.println(tree);
				break;
			case "x":
				break;
			default:
				System.out.println("Enter The Coorect Option!");
			}
		} while (con != "x" || con != "X");
		System.out.println("Exit");
	}
}