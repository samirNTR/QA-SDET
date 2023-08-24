     package Testing;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicateWord {
//Remove duplicate word from String
	static Scanner sc = new Scanner(System.in);

	public static void removeDup(String str)

	{

		String[] str1 = str.split(" ");

		Set<String> mySet = new LinkedHashSet<>();
		for (String x : str1) {
			mySet.add(x);

		}
		Iterator<String> it = mySet.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");

		}

	}

	public static void main(String[] args)

	{
		System.out.println("Enter the required string");
		String str1 = sc.nextLine();
		removeDup(str1);

	}

}
