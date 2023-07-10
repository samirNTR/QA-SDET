package JavaPrac1;

import java.util.Scanner;

public class ABC {

	// static Scanner sc= new Scanner(System.in);------------I LOVE JAVA to JAVA
	// LOVE I

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the required string");
		String str = sc.nextLine();
		String words[] = str.split(" ");

		for (int i = 0; i < words.length; i++) {

			if (i % 2 == 1) {
				words[i] = new StringBuilder(words[i]).reverse().toString();
			}
		}
		String result = String.join(" ", words);

		System.out.println("The result is:- " + result);
	}
}