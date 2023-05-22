package Testing;

import java.util.Scanner;

public class FetchString {

	static Scanner sc = new Scanner(System.in);
	static String str;

	public static String extractInt(String str) {

		str = str.replaceAll("[^A-Za-z]", " ");
	
		// str = str.replaceAll("[^0-9]", " "); // regular expression
		 str = str.trim();
		// Replace all the consecutive white
		// spaces with a single space
		str = str.replaceAll(" +", "");

		if (str.isBlank())
			return "string is blank";

		return str;
	}


	public static void main(String[] args) {
		String str = " zxs554444d5QQQ";
	    System.out.println(extractInt(str));
	}

}
