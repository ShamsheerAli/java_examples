package java_examples;
public class SortingAndDuplicatesInArray {

	public static void main(String[] args) {
		int[] a = { 3, 5, 2, 5, 6, 4, 6, 2, 1, 4 };
		int len = a.length;
		int flag;
		int[] b = new int[a.length];
		int k = 0;   
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					flag = a[i];
					a[i] = a[j];
					a[j] = flag;                 
				}
			}  
		}
		System.out.println("The Sorted Elements Are: ");
		for (int i = 0; i < a.length; i++)           
			System.out.print( a[i] + ",");
		System.out.println("                           ");
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				b[k++] = a[i];
			}
		}
		b[k++] = a[len - 1];
		System.out.println("The Array After Removing Duplicates: ");
		for (int i = 0; i < k; i++) {
			System.out.print( b[i] + ",");
		}
	}
}