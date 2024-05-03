package interviewExp;

public class String_Compression {

	public static void main(String[] args) {
		// Input string
		String str = "aaaabbbbccddbcde";

		// Call the method to print repeated consecutive characters
		printRepeatedCount(str);
	}

	// Method to print count of repeated consecutive characters
	public static void printRepeatedCount(String str) {
		// Initialize count to keep track of consecutive characters
		int count = 1;

		// Iterate through the string
		for (int i = 0; i < str.length() - 1; i++) {
			// Check if current character is same as the next character
			if (str.charAt(i) == str.charAt(i + 1)) {
				// If same, increment count
				count++;
			} else {
				// If not same, print the character and its count
				// If count is greater than 1, indicating repetition
				if (count > 1) {
					System.out.print(str.charAt(i));
					System.out.print(count);
				} else {
					// If count is 1, indicating no repetition, just print the character
					System.out.print(str.charAt(i));
				}
				// Reset count for next character
				count = 1;
			}
		}
		// Print the last character and its count
		if (count > 1) {
			System.out.print(str.charAt(str.length() - 1));
			System.out.print(count);
		} else {
			System.out.print(str.charAt(str.length() - 1));
		}
	}
}
