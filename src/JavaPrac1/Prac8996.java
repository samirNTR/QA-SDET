package JavaPrac1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Prac8996 {

	public static void countVowel(String str) {
		char ch[] = str.toLowerCase().toCharArray();
	int vowelCount=0;
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();


		for (char c : ch) {

			if (!String.valueOf(c).isBlank())
				if (hm.containsKey(c))
				{
				

					hm.put(c, hm.get(c) + 1);
					
					vowelCount++;
				}

				

		}
		
		System.out.println("Count of vowels are "+vowelCount);

		Set<Map.Entry<Character, Integer>> es = hm.entrySet();
		for (Map.Entry<Character, Integer> es1 : es) {

			System.out.println(es1.getKey() + ">" + es1.getValue());
			
		

		}
		

	}

	public static void main(String[] args) {

		String str = "    Hi Hello world";

		countVowel(str);

	}

}
