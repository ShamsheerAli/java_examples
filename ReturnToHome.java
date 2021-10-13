package java_examples;

import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;

public class ReturnToHome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 or more Characters: ");
		String route = sc.nextLine();
		int up = 0;
		int down = 0;
		int left = 0;
		int right = 0;
		if (route.length() < 10)
			System.out.println("Plz Enter Only 10 Characters");
		else {
			route = route.toUpperCase();
			System.out.println(route);
			for (int i = 0; i < route.length(); i++) {
				if (route.charAt(i) == 'U')
					up++;
				else if (route.charAt(i) == 'D')
					down++;
				else if (route.charAt(i) == 'L')
					left++;
				else if (route.charAt(i) == 'R')
					right++;
			}
			System.out.println("Final Position: (" + (right - left) + "," + (up - down) + ")");
		}
		List<String> values = new ArrayList<>();
		if ((right - left) == 0 && (up - down) == 0)
			System.out.println("Returned To The Home");
		else {
			System.out.println("Give The Shortest Way To Go To Home");
			System.out.println(right + "" + left + "" + up + "" + down);
			if ((right - left) != 0) {
				if (right > left) {
					for (int i = 0; i < right; i++) {
						right--;
						values.add("L");
						if (right - left == 0)
							break;
					}
				} else {
					for (int i = 0; i < left; i++) {
						left--;
						values.add("R");
						if (right - left == 0)
							break;
					}
				}
			}
			if ((up - down) != 0) {
				if (up > down) {
					for (int i = 0; i < up; i++) {
						up--;
						values.add("D");
						if (up - down == 0)
							break;
					}
				} else {
					for (int i = 0; i < down; i++) {
						down--;
						values.add("U");
						if (up - down == 0)
							break;
					}
				}
			}
			System.out.println("The Shortest Distance is: " + values);
		}
	}
}