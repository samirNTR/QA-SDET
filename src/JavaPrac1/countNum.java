package JavaPrac1;

import java.util.ArrayList;
import java.util.Scanner;

public class countNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input 1: Enter the size of the list
		System.out.print("Enter the size of the list: ");
		int size = scanner.nextInt();

		// Create an ArrayList to store the numbers
		ArrayList<Integer> numbers = new ArrayList<>();

		// Input 2: Enter the values
		System.out.print("Enter the values: ");
		for (int i = 0; i < size; i++) {
			int value = scanner.nextInt();
			numbers.add(value);
		}

		// Count the number of even numbers
		int count = 0;
		for (int num : numbers) {
			if (num % 2 == 0) {
				count++;
			}
		}

		System.out.println("Count of even numbers: " + count);

		scanner.close();
	}
}
