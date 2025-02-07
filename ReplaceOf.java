public class StringReplaceDemo {  
    public static void main(String[] args) {  
        // Feature 1: Case-Sensitivity  
        String str1 = "Hello World";  
        String replaced1 = str1.replace("o", "*");  
        System.out.println("Case-Sensitivity:");  
        System.out.println("Original String: " + str1);  
        System.out.println("Replaced String: " + replaced1); // Output: Hell* W*rld  
        System.out.println();  
        // Feature 2: Replacing Substrings  
        String str2 = "Java is awesome";  
        String replaced2 = str2.replace("awesome", "fantastic");  
        System.out.println("Replacing Substrings:");  
        System.out.println("Original String: " + str2);  
        System.out.println("Replaced String: " + replaced2); // Output: Java is fantastic  
        System.out.println();  
        // Feature 3: Replacing with an Empty String  
        String str3 = "Remove these spaces";  
        String replaced3 = str3.replace(" ", "");  
        System.out.println("Replacing with an Empty String:");  
        System.out.println("Original String: " + str3);  
        System.out.println("Replaced String: " + replaced3); // Output: Removethesespaces  
    }  
}  
