package Testing;

import java.util.HashSet;

public class PairSum {
	public static void main(String[] args) {
		int[] array = { 1, 9, 5, 3, 6, 2, 7 };
		int targetSum = 8;
		printPairs(array, targetSum);
	}

	public static void printPairs(int[] array, int targetSum) {
		HashSet<Integer> set = new HashSet<>();
		StringBuilder result = new StringBuilder();

		for (int number : array) {
			int complement = targetSum - number;
			if (set.contains(complement)) {
				result.append("(").append(complement).append(", ").append(number).append("), ");
				// Remove the complement from the set to avoid counting the same pair twice
				set.remove(complement);
			} else {
				set.add(number);
			}	
		}

		// Remove the trailing comma and space, and add the final period
		if (result.length() > 0) {
			result.setLength(result.length() - 2);
			result.append(".");
		}

		System.out.println("Pairs with sum " + targetSum + ": " + result);
	}
}
