public class NullPointerExceptionExample {  
    public static void main(String[] args) {  
        String str = null; // Initializing a String variable to null  
        try {  
            int length = str.length(); // Attempting to call a method on a null reference  
            System.out.println("Length of the string: " + length);  
        } catch (NullPointerException e) {  
            System.out.println("Error: Null reference encountered.");  
            // Additional error handling code can be added here  
        }  
    }  
}  
