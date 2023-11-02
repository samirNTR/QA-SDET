package Testing;

import java.util.Arrays;

public class FindNthLargestInArray {
	public static int findNthLargest(int[] arr, int n) {
		if (n <= 0 || n > arr.length) {
			System.out.println("Invalid value of n.");
			return -1;
		}

		Arrays.sort(arr);
		return arr[arr.length - n];
	}

	public static void main(String[] args) {
		int[] arr = { 12, 5, 19, 8, 9, 23 };
		int n = 3;

		int nthLargest = findNthLargest(arr, n);
		if (nthLargest != -1) {
			System.out.println(n + "th largest element in the array: " + nthLargest);
		}
	}
}
