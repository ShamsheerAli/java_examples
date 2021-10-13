package java_examples;

public class NumbersWithName {

	public static void main(String[] args) {
		int number=100;
		for(int i=1;i<=number;i++) {
			
			if(i%15==0)
				System.out.println("shamsheer ali");
			else if(i%3==0)
				System.out.println("shamsheer");
			else if(i%5==0)
				System.out.println("ali");
			 else {
				 System.out.println(i);
			 }	
		}
	}
}
