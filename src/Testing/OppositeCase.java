package Testing;

import java.util.Scanner;

public class OppositeCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		String result = oppositeCase(input);
		System.out.println("Output: " + result);
	}

	private static String oppositeCase(String input) {
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) 
		{
			char currentChar = charArray[i];
			if (Character.isUpperCase(currentChar))
			{
				charArray[i] = Character.toLowerCase(currentChar);
			} 
			else if (Character.isLowerCase(currentChar))
			{
				charArray[i] = Character.toUpperCase(currentChar);
			}
		}
		return new String(charArray);
	}
}
