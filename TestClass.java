package java_examples;

public class TestClass 
{
	public static void main(String[] args) 
	{
		System.out.println("the numbers are");
		for(int i=100; i>0; i--) 
		{    
			int n=0;
			for(int j=2;j<i;j++) 
			{
				if(i%j==0) {
					n=1;
			     break;
				}
			}
			if(n==0) {
				System.out.println(i);

			}
		

		}	 
		
	}

}
