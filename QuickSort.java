//Quick Sort Program 
package java_examples;
import java.util.Scanner;
public class QuickSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Elements....");
		int num = sc.nextInt();
		int a[] = new int[num];
		System.out.println("Enter Elements");
		for (int z = 0; z < num; z++) {
			a[z] = sc.nextInt();
		}
		QuickSort ob=new QuickSort();
		ob.quicksort(a, 0, num-1);
		System.out.println("The Sorted Array Is.....");
		for (int z = 0; z < a.length; z++) {
			System.out.println(a[z]);
		}
	}
	int partition(int[] a, int low, int high) {
		int pivot = a[(low+high)/2];
		while(low<=high) {
			while(a[low]<pivot) {
				low++;
			}
			while(a[high]>pivot) {
				high--;
			}
			if(low<=high) {
				 int temp = a[low];
	                a[low] = a[high];
	                a[high] = temp;
	                low++;
	                high--;
			}
		}
		return low;
	}
				
	void quicksort(int[] a, int low, int high) {
		int pi= partition(a, low, high); 
			if(low<pi-1) {
			quicksort(a, low, pi - 1);
			}
			if(pi<high) {
			quicksort(a, pi, high);
			}
		}
}