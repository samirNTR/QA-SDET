package Testing;

import java.util.Scanner;

public class ReverseString1 {

	static Scanner sc = new Scanner(System.in);
	static String str;

	public static void main(String[] args) {

		String reverse = "";

		System.out.println("Enter the required string");
		str = sc.nextLine();

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse =  reverse + str.charAt(i) ;

		}
		System.out.println("The entered string is:" + str);
		System.out.println("the reversal is:" + reverse);
		if (str.equalsIgnoreCase(reverse)) {
			System.out.println("Its a palindrome");
		}

		else {

			System.out.println("Not a palindrome");
		}

	}

}
