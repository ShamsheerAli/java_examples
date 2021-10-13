package java_examples;
import java.util.Collections; 
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class LinkedListImplementation {
	public static void main(String[] args) {
		LinkedList<String> mylist = new LinkedList<>();
		System.out.println("    LINKED LIST HAS BEEN INITITALZED");
		String con = "a";
		do {
			System.out.println("    *** MENU ***");
			System.out.println("    2. Add Element in List");
			System.out.println("    3. Delete Element in List");
			System.out.println("    4. Search Element in List");
			System.out.println("    5. Display Element in List");
			System.out.println("    X. Exit the Menu");
			System.out.println("\n  Enter you selection: ");
			Scanner sc = new Scanner(System.in);
			con = sc.nextLine();
			switch (con) {
			case "2":
				String con2 = "";
				System.out.println("    *** SUB - MENU ***");
				System.out.println("    a. Add Element at the begining of list");
				System.out.println("    b. Add Element at the end of list");
				System.out.println("    c. Add Element at a position of list");
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
						mylist.add(input);
					}
					System.out.println("Elements Added Successfully");
					break;

				case "b":
					Scanner s1 = new Scanner(System.in);
					System.out.println("How Many Elements Do U Want To Add?");
					int b = s1.nextInt();
					for (int i = 0; i < b; i++) {
						String input2 = s1.next();
						mylist.addFirst(input2);
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
						mylist.add(ind, input3);
					}
					break;

				case "d":
					Scanner s3 = new Scanner(System.in);
					System.out.println("How Many Elements Do U Want To Add?");
					int d = s3.nextInt();
					for (int i = 0; i < d; i++) {
						String input4 = s3.next();
						mylist.addFirst(input4);
					}
					break;
				default:
					System.out.println("The character entered is not not valid, please Enter The Valid character!");
					break;
				}
				break;
			case "3":
				String con3 = "";
				System.out.println("    *** SUB - MENU ***");
				System.out.println("    a. Delete Element at the begining of list");
				System.out.println("    b. Delete Element at the end of list");
				System.out.println("    c. Delete Element at a position of list");
				System.out.println("    z. Exit the Menu");
				System.out.println("Enter The Operation");
				Scanner sc5 = new Scanner(System.in);
				con3 = sc5.next();
				switch (con3) {
				case "a":
					mylist.removeFirst();
					System.out.println("After Deleting At Begining:\n " + mylist);
					break;
				case "b":
					mylist.removeLast();
					System.out.println("After Deleting At End:\n " + mylist);
					break;
				case "c":
					Scanner sc2 = new Scanner(System.in);
					System.out.println("Enter The Position You Want to Delete");
					int rem = sc2.nextInt();
					mylist.remove(rem);
					System.out.println("After Deleting At A Point:\n " + mylist);
					break;
				default:
					System.out.println("Enter The Correct Option");
				}
				break;
			case "4":
				Scanner sc6 = new Scanner(System.in);
				System.out.println("Enter The Element To be Searched");
				String str5 = sc6.nextLine();
				if (mylist.contains(str5))
					System.out.println(str5);
				else
					System.out.println("No Element Found");
				break;
			case "5":
				System.out.println(mylist);
				break;
			default:
				System.out.println("Enter The Coorect Option!");
			}
		} while (con != "x" || con != "X");       
		System.out.println("Exit");
	}
}