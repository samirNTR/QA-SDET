package Testing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringCharacterCount1 {

	static Scanner sc = new Scanner(System.in);

	public static void charCount(String str1) {
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

		char ch[] = str1.toCharArray();

		for (char c : ch) {
			if (!String.valueOf(c).isBlank())

				if (hm.containsKey(c))
				{
					hm.put(c, hm.get(c) + 1);
				}
				else {

					hm.put(c, 1);

		}}

		Set<Map.Entry<Character, Integer>> entryset = hm.entrySet();

		for (Map.Entry<Character, Integer> c1 : entryset) {

			//if (c1.getValue() > 1)

				System.out.println(c1.getKey()+":>"+ c1.getValue());

		}

	}

	public static void main(String[] args)

	{

		System.out.println("Enter the required string");

		String str1 = sc.nextLine();

		charCount(str1);

	}

}





/*
 * public class StringCharacterCount1 {
 * 
 * static Scanner sc = new Scanner(System.in);
 * 
 * public static void charCount(String str1) { Map<Character, Integer> hm = new
 * LinkedHashMap<Character, Integer>(); Map<Character, Integer> duplicateMap =
 * new LinkedHashMap<Character, Integer>();
 * 
 * char ch[] = str1.toCharArray();
 * 
 * for (char c : ch) { if (!String.valueOf(c).isBlank()) { if
 * (hm.containsKey(c)) { hm.put(c, hm.get(c) + 1); duplicateMap.put(c,
 * duplicateMap.getOrDefault(c, 0) + 1); } else { hm.put(c, 1); } } }
 * 
 * Set<Map.Entry<Character, Integer>> entrySet = hm.entrySet();
 * 
 * for (Map.Entry<Character, Integer> entry : entrySet) {
 * System.out.println(entry.getKey() + ":>" + entry.getValue()); Integer
 * duplicateCount = duplicateMap.get(entry.getKey()); if (duplicateCount != null
 * && duplicateCount > 1) { System.out.println("  (Duplicate Count: " +
 * duplicateCount + ")"); } } }
 * 
 * public static void main(String[] args) {
 * System.out.println("Enter the required string"); String str1 = sc.nextLine();
 * charCount(str1); } }
 * 
 * 
 */


