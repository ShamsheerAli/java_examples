package java_examples; 
public class IgnoreZeros {
	public static void main(String[] args) {
		int[] a = { 7, 4, 1, 0, 3, 6, 3, 0, 9 };
		int len = a.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] != 0) 
				a[count++] = a[i];
		}
		while (count < len)
			a[count++] = 0;
		for (int j = 0; j < len; j++)
			System.out.println(a[j]);
	}
}