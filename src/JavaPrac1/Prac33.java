package JavaPrac1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Prac33 {
	static Scanner sc = new Scanner(System.in);

	public static void vowelCount(String str) {

		String words[] = str.trim().toLowerCase().split(" ");

		Map<String, Integer> hm = new LinkedHashMap<String, Integer>();

		for (String word : words) {

			if (!word.isBlank()) {

				if (hm.containsKey(word)) {
					hm.put(word, hm.get(word) + 1);

				}

				else {

					hm.put(word, 1);
				}

			}

		}

		Set<Map.Entry<String, Integer>> entryset = hm.entrySet();

		boolean foundDuplicate = false;
		for (Map.Entry<String, Integer> es1 : entryset) {
			if (es1.getValue() > 1) {
				System.out.println(es1.getKey() + ":" + es1.getValue());

				foundDuplicate = true;
			}
		}

		if (!foundDuplicate) {
			System.out.println("No repeated/Duplicate word present");
		}

	}

	public static void main(String[] args) {

		System.out.println("Enter the required string");
		String str = sc.nextLine();
		vowelCount(str);

	}

	/*
	 * String str1 = str.toLowerCase();
	 * 
	 * Map<Character, Integer> hm = new LinkedHashMap<>();
	 * 
	 * hm.put('a', 0); hm.put('e', 0); hm.put('i', 0); hm.put('o', 0); hm.put('u',
	 * 0);
	 * 
	 * int totalCount = 0;
	 * 
	 * for (int i = 0; i < str1.length(); i++) {
	 * 
	 * char ch = str1.charAt(i);
	 * 
	 * if (hm.containsKey(ch)) { hm.put(ch, hm.get(ch) + 1); totalCount++; } }
	 * 
	 * Set<Map.Entry<Character, Integer>> entryset = hm.entrySet(); for
	 * (Map.Entry<Character, Integer> es1 : entryset) {
	 * 
	 * System.out.println(es1.getKey() + ":" + es1.getValue());
	 * 
	 * }
	 * 
	 * System.out.println("The total count is: " + totalCount);
	 * 
	 * }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * System.out.println("Enter the required string"); String str = sc.nextLine();
	 * vowelCount(str);
	 * 
	 * }
	 */
}
