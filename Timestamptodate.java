import java.sql.Timestamp;  
import java.util.Date;  
public class TimestampToDate {  
    public static void main(String[] args) {  
        // Creating a Timestamp object representing the current time  
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());  
        // Converting the Timestamp to a Date using the Date constructor  
        Date date = new Date(timestamp.getTime());  
        // Printing the original Timestamp and the converted Date  
        System.out.println("Original Timestamp: " + timestamp);  
        System.out.println("Converted Date: " + date);  
    }  
}  
