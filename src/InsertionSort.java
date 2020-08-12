import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// take a worst case scenario array of integers to sort them using insertion sort
		int a[] = {1,2,4,6,7,82,3,21,1};
		printSortedArray(a);
	}

	private static void printSortedArray(int[] a) {
		int j =0;
		for(int i=1 ;i <a.length;i++) {
			j=i;
			while (j > 0 && a[j] < a[j - 1]) {
				a[j - 1] = a[j - 1] + a[j];
				a[j] = a[j - 1] - a[j];
				a[j - 1] = a[j - 1] - a[j];
				j--;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
