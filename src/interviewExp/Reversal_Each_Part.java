package interviewExp;

public class Reversal_Each_Part {

	public static void main(String[] args) {

		String reverse = "";
		String str = "I love java, Java loves me";

		String[] words = str.trim().split(",");

		for (String word : words) {
			String parts[] = word.trim().split(" ");

			for (int i = parts.length - 1; i >= 0; i--) {
				reverse += parts[i] + " ";
			}

			reverse += ", ";
		}

		if (reverse.endsWith(", ")) {
			reverse = reverse.substring(0, reverse.length() - 2);
		}

		System.out.println(reverse);
	}
}
