package JavaPrac1;

public class ABC2 {

	public static boolean countPalindrome(String word) {
		int left = 0, right = word.length() - 1;

		while (left < right) {

			if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right)))

			{
				return false;
			}

			left++;
			right--;

		}

		return true;

	}

	public static void main(String[] args) {

		String str = "mom dad child malayalam MadaM";

		String words[] = str.trim().split(" ");

		int count = 0;
		for (String word : words) {

			if (countPalindrome(word)) {
				count++;
			}
		}

		System.out.println("The total palindrome words are " + count);
	}
}
