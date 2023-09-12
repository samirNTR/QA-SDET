package JavaPrac1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Prac77t5 {

	public static void charCount(String str) {

		String str1[] = str.toLowerCase().trim().split(" ");

		Map<String, Integer> hm = new LinkedHashMap<String, Integer>();

		for (String str2 : str1) {
			if (hm.containsKey(str2)) {
				hm.put(str2, hm.get(str2) + 1);
			}

			else {
				hm.put(str2, 1);
			}

		}
	
		

	Set<Map.Entry<String,Integer>> es1=hm.entrySet();		
	
	for(Map.Entry<String, Integer> es:es1)
	{
		if(es.getValue()>1)
		System.out.println(es.getKey()+":"+es.getValue());
	}
			
		

	}

	public static void main(String[] args) {

		String str = " I love Java java java ";

		charCount(str);

	}

}
