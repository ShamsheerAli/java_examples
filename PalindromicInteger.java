package java_examples;

public class PalindromicInteger {

	public static void main(String[] args) {
		int n=8;
	     System.out.println(solvez(n));
	}
	public static boolean solvez(int num) {
	       int r,sum=0,temp; 
	       temp=num;    
	      while(num>0){    
	          r=num%10;  //getting remainder  
	          sum=(sum*10)+r;    
	           num=num/10;    
	        }    
	       if(temp==sum)    
	            return true; 
	       else       
	           return false;
	    }
}
