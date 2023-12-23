package Testing;

// Reverse the sentence I LOVE JAVA---->JAVA LOVE I

public class ReverseString4_1 {

	public static void main(String[] args) {
		String originalString = "I LOVE JAVA";
		String[] words = originalString.split(" ");
		String reversedString = "";

		for (int i = words.length-1; i >= 0; i--) 
		{
			reversedString = reversedString + words[i] + " ";
		}

		System.out.println(reversedString.trim());
	}
}
