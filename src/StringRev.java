import java.util.Arrays;
import java.util.Scanner;

public class StringRev {

	static Scanner sc = new Scanner(System.in);

	public static boolean Annagram(char[] ch1, char[] ch2) {
		int n1 = ch1.length;
		int n2 = ch2.length;
		if (n1 != n2)

			return false;

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for (int i = 0; i < n1; i++)

			if (ch1[i] != ch2[i])

				return false;

		return true;
	}

	public static void main(String[] args) {

		System.out.println("Enter the required string1");
		String str1 = sc.nextLine();
		System.out.println("Enter the required string12");
		String str2 = sc.nextLine();

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		if (Annagram(ch1, ch2))

		{

			System.out.println("String is Annagram");
		}

		else {

			System.out.println("NOt an Annagram");
		}
	}
}
