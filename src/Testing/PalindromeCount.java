package Testing;

public class PalindromeCount {




	public static boolean isPalindrome(String word) {
		int left = 0;
		int right = word.length() - 1;

		while (left < right) 
		{
			if (word.charAt(left) != word.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		String input = "mom dad child";
		String[] words = input.split("\\s+");
		int palindromeCount = 0;

		System.out.println("Palindromic words in the given string:");

		for (String word : words) {
			if (isPalindrome(word)) {
				palindromeCount++;
				System.out.println(word);
			}
		}

		System.out.println("Number of palindrome words: " + palindromeCount);
	}
}
/*
 * for(String word:words) {
 * 
 * if(word.charAt(0)==word.charAt(word.length()-1)) 
 * count++;
 * 
 * 
 * }
 */


