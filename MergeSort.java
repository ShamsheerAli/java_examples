package java_examples;
import java.util.Scanner;
public class MergeSort {
	void merge(int a[], int low, int mid, int high) {
		System.out.println("Merge Function");
		int l = mid-low+ 1;
		int r = high - mid;
		int LeftArray[] = new int[l];
		int RightArray[] = new int[r];
		for (int i = 0; i < l; i++)
			LeftArray[i] = a[low+i];
		for(int j=0;j<r;j++)
			RightArray[j] = a[mid+1+j];
		int i = 0, j = 0;
		int k = low;
		while (i < l && j < r) {
			if (LeftArray[i] <= RightArray[j]) {
				a[k] = LeftArray[i];
				i++;
			} else {
				a[k] = RightArray[j]; 
				j++;
			}
			k++;
		}
	    while (i < l) {
			a[k] = LeftArray[i];
			i++;
			k++;
		}
		while (j < r) {
			a[k] = RightArray[j];
			j++;
			k++;
		}
	}
	void sort(int a[], int low, int high) {
		System.out.println("Sort Function");
		if (low < high) {
			int mid = (low + high) / 2;
			sort(a, low, mid);
			sort(a, mid + 1, high);
			merge(a, low, mid, high);
		}
	}
public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Elements....");
		int num = sc.nextInt();
		int a[] = new int[num];
		System.out.println("Enter Elements");
		for (int z = 0; z < num; z++) {
			a[z] = sc.nextInt();
		}
		MergeSort ob = new MergeSort();
		ob.sort(a, 0, a.length - 1);
		System.out.println("The Sorted Array Is....");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "");
		}
	}
}	