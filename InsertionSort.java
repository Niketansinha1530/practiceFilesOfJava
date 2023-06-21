package practiceJava;

import java.util.Arrays;

public class InsertionSort {

	public static void Insert(int arr[]) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int j = i;
			while (j > 0 && arr[j] < arr[j - 1]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 20, 40, 11, 19, 27, 45 };
		Insert(arr);

		System.out.println("Sorted Array Is");

		System.out.println(Arrays.toString(arr));
	}

}
