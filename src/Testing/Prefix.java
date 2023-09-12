package Testing;

import java.util.*;

public class Prefix {
	public String longestCommonPrefix(String[] a) {
		int size = a.length;

		/* If size is 0, return an empty string */
		if (size == 0)
			return "";

		if (size == 1)
			return a[0];

		/* Convert all strings to lowercase for case-insensitive comparison */
		for (int i = 0; i < size; i++) {
			a[i] = a[i].toLowerCase();
		}

		/* Sort the array of strings */
		Arrays.sort(a);

		/* Find the minimum length from the first and last string */
		int end = Math.min(a[0].length(), a[size - 1].length());

		/* Find the common prefix between the first and last string */
		int i = 0;
		while (i < end && a[0].charAt(i) == a[size - 1].charAt(i))
			i++;

		String pre = a[0].substring(0, i);
		return pre;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of strings: ");
		int numStrings = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		String[] input = new String[numStrings];
		for (int i = 0; i < numStrings; i++) {
			System.out.print("Enter string " + (i + 1) + ": ");
			input[i] = scanner.nextLine().toLowerCase(); // Convert input to lowercase
		}
		scanner.close();

		Prefix prefix = new Prefix();
		System.out.println("The longest Common Prefix is : " + prefix.longestCommonPrefix(input));
	}
}

/*
 * public class Prefix { public String longestCommonPrefix(String[] a) { int
 * size = a.length;
 * 
 * if size is 0, return empty string if (size == 0) return "";
 * 
 * if (size == 1) return a[0];
 * 
 * sort the array of strings Arrays.sort(a);
 * 
 * find the minimum length from first and last string int end =
 * Math.min(a[0].length(), a[size-1].length());
 * 
 * find the common prefix between the first and last string int i = 0; while (i
 * < end && a[0].charAt(i) == a[size-1].charAt(i) ) i++;
 * 
 * String pre = a[0].substring(0, i); return pre; }
 * 
 * Driver Function to test other function public static void main(String[] args)
 * { Prefix Prefix = new Prefix(); String[] input = {"Carpenter", "Cartoon"
 * ,"Cartesian"}; System.out.println( "The longest Common Prefix is : " +
 * Prefix.longestCommonPrefix(input)); } }
 */
