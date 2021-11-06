//Program To Count Number Of IceBlocks
package java_examples;
import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;
public class CountingOfIceBlocks{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Size Of An Array!");
    int n=sc.nextInt();
    int[] blocks=new int[n];
    System.out.println("Enter The Blocks!!");
    int[] placeOfIce=new int[n];
    for(int i=0; i<n;i++){
 	 blocks[i]=sc.nextInt();
    }
        int left[] = new int[n];
         int right[] = new int[n];
         int iceBlocks = 0;
        left[0] = blocks[0];
        right[n - 1] = blocks[n - 1];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], blocks[i]);
        
        for (int j = n - 2; j >= 0; j--)
            right[j] = Math.max(right[j + 1], blocks[j]);
        
        for (int k= 0; k < n; k++) {
            iceBlocks += Math.min(left[k], right[k]) - blocks[k];
        placeOfIce[k]=Math.min(left[k], right[k]) - blocks[k];
        }
        System.out.println("The Number Of IceBlocks Formed: "+iceBlocks) ;
        System.out.println("The Ice Blocks Formed At: ");
        for(int z=0; z<n;z++)
        	System.out.print(placeOfIce[z]+" ");
           }

}