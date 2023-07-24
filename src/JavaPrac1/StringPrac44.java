package JavaPrac1;

public class StringPrac44 {

	public static void main(String[] args) {

		String str = " I love java";

		String str1[] = str.trim().split(" ");

		String reverseString = "";

		for (int i = 0; i < str1.length; i++) {

			String word = str1[i];
			String reverseWord = "";

			if (i % 2 == 1) {
				for (int j = word.length() - 1; j >= 0; j--) {
					reverseWord = reverseWord + word.charAt(j);

				}

			}

			else {

				reverseWord = word;
			}

			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(reverseString.trim());

	}

}

/*
 * for (int i = 0; i < str1.length; i++) { String word = str1[i];
 * 
 * String reverseWord = "";
 * 
 * // Check if the index is even if (i % 2 == 1) { for (int j = word.length() -
 * 1; j >= 0; j--) { reverseWord = reverseWord + word.charAt(j); } } else {
 * reverseWord = word; // If the index is odd, keep the word as it is }
 * 
 * reverseString = reverseString + reverseWord + " "; }
 * 
 * System.out.println("Reverse string with alternate words reversed:\n" +
 * reverseString.trim()); } }
 */