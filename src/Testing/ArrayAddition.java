package Testing;

public class ArrayAddition {

	public static int calculateSum(int[] array) {
		int sum = 0;
		boolean oddLength = false;

		if (array.length % 2 != 0) {
			oddLength = true;
		}

		for (int i = 0; i < array.length-1 ; i += 2) {
			sum += array[i] + array[i + 1];
		}

		if (oddLength) {
			sum += array[array.length - 1];
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 5, 8, 10 };
		int sum = calculateSum(array);
		System.out.println("Sum of array: " + sum);
	}
}
