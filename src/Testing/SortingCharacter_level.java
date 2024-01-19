package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCharacter_level {

	public static void main(String[] args) {

		String str = " I love java";

		String words[] = str.trim().split(" ");

		List<String> al = new ArrayList<String>();

		for (String word : words) {
			char ch[] = word.toCharArray();

			Arrays.sort(ch);
			al.add(new String(ch));
		}

		Collections.sort(al);
		System.out.println(al);

		for (String a1 : al) {
			System.out.print(a1 + " ");
		}
	}
}
