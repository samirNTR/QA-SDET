package interviewExp;

public class PalindromeSubstrings {
	public static void main(String[] args) {
		String str = "maamnitingupta";
		int count = findPalindromeSubstrings(str);
		System.out.println("Total palindromes: " + count);
	}

	public static int findPalindromeSubstrings(String str) {
		int count = 0; // Counter to count the number of palindromes
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 3; j <= str.length(); j++) // minimum length of 3 required i+2
			{
				String substring = str.substring(i, j);
				if (isPalindrome(substring)) {
					System.out.println(substring);
					count++; // Increment the counter if substring is palindrome
				}
			}
		}
		return count;
	}

	public static boolean isPalindrome(String str) {
		int left = 0,  right = str.length() - 1;
	
		while (left < right) 
		{
			if (str.charAt(left) != str.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}