package JavaPrac1;

import java.util.Scanner;

public class Prac444 {

	static Scanner sc = new Scanner(System.in);

	static String str;

	public static void main(String[] args) {

		System.out.println("Enter the required string");

		str = sc.nextLine();

		sc.close();
		String str1 = str.toLowerCase();
		int count = 0;

		System.out.print("The vowels are");
		for (int i = 0; i < str.length(); i++) {

			char ch = str1.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;

				System.out.print(ch + " ");
			}
		}

		System.out.println("\nThe count is " + count);

	}
}
