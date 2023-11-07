package stringTutorials;

import java.util.HashMap;
import java.util.Map;

public class abcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I love java";

		int totalCount = 0;
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);

		for (int i = 0; i < str.length(); i++) {

			char ch = str.toLowerCase().charAt(i);

			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
				totalCount++;

			}
		}

		for (Map.Entry<Character, Integer> es : hm.entrySet()) {

			System.out.println(es.getKey() + ":" + es.getValue());
		}

		System.out.println("The total vowels are " + totalCount);
	}

}
