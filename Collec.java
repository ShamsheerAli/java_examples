import java.util.Collections;  
import java.util.HashSet;  
import java.util.Set;  
public class CollectionsAddAllExample1 {  
    public static void main(String[] args) {  
        Set<Integer> set = new HashSet<>();  
            boolean b = Collections.addAll(set, 1, 2, 3, 4, 5);  
            System.out.println("Boolean Result: "+b);  
            System.out.println("Collection Value: "+set);         
          }  
}  
