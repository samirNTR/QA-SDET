package Testing;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//Remove Duplicate Character/Repeated character

public class removeDuplicateCharacter {

	static Scanner sc = new Scanner(System.in);

	public static void charCount1(String str) {

		StringBuilder sb = new StringBuilder();

		Set<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}

		for (Character c : set) {
			sb.append(c);
		}

		System.out.println(sb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the required string");
		String str = sc.nextLine();
		charCount1(str);

	}

}

/*
 * static Scanner sc = new Scanner(System.in);
 * 
 * public static void charCount(String str1) { Map<Character, Integer> hm = new
 * LinkedHashMap<Character, Integer>();
 * 
 * char ch[] = str1.toCharArray();
 * 
 * for (Character c : ch) { if (!String.valueOf(c).isBlank())
 * 
 * if (hm.containsKey(c)) { hm.put(c, hm.get(c)+1); }
 * 
 * else {
 * 
 * hm.put(c, 1); }
 * 
 * }
 * 
 * StringBuilder sb= new StringBuilder(); Set<Map.Entry<Character, Integer>>
 * entryset=hm.entrySet();
 * 
 * for(Map.Entry<Character, Integer>es1:entryset) { sb.append(es1.getKey());
 * 
 * //if(es1.getValue()>1) System.out.println(es1.getKey()+":"+ es1.getValue());
 * 
 * }
 * 
 * System.out.println("String without duplicate character now:- "+
 * sb.toString());
 * 
 * 
 * }
 * 
 * public static void main(String[] args) {
 * System.out.println("Enter the required string"); String str1 = sc.nextLine();
 * charCount(str1); } }
 */