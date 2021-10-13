package java_examples;

public class PrimeNumbersInReverse 
{
	public static void main(String[] args) 
	{
		System.out.println("The prime numbers are... ");
		for(int i=100; i>0; i--) 
		{    	
			int n=0;			// Initizing the number
			for(int j=2;j<i;j++) 
			{
				if(i%j==0) 		// Dividing with each element
				{
					n=1;
			     break;
				}
			}
			if(n==0) 			// If n=0, means it is not dividing number
				System.out.println(i);
		}	 
	}
}
