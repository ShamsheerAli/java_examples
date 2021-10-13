package java_examples;
import java.util.Scanner;
import java.util.Stack;
public class ValidateBrackets {
	public static void main(String[] args) {
		Stack st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Data");
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
				st.push(str.charAt(i));
			} else if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
				st.pop();
			}
		}
		if (st.isEmpty())
			System.out.println("It is Valid");
		else
			System.out.println("It is Not Valid");
	}
}