package JavaPrac1;

import java.util.*;

public class Prac76867 {

	public static void countChar(String str) {

		// char ch[]= str.toCharArray();
int count=0;
String str1[]=str.trim().toLowerCase().split(" ");


	Map<String, Integer> hm = new LinkedHashMap<String, Integer>();
	
	for(String str2:str1)
	{
	
	if(!str2.isBlank())
		 if(hm.containsKey(str2))
		 {
			 hm.put(str2, hm.get(str2)+1);
		
		 }
	
		 else {
			 
			 hm.put(str2, 1);
		 }
		

	
		/*
		 * hm.put('a', 0);
		 * 
		 * hm.put('e', 0);
		 * 
		 * hm.put('i', 0);
		 * 
		 * hm.put('o', 0);
		 * 
		 * hm.put('u', 0);
		 */
	
		/*
		 * for(int i=0; i<str1.length(); i++) {
		 * 
		 * char ch=str1.charAt(i);
		 * 
		 * if(hm.containsKey(ch)) { hm.put(ch, hm.get(ch)+1);
		 * 
		 * count++;
		 * 
		 * }
		 */
		count++;	
		}

	System.out.println("Total Words are "+ count);
	for(Map.Entry<String, Integer> es:hm.entrySet())
	{
		System.out.println(es.getKey()+" >"+es.getValue()+" times");
		
		
	}
	
	}

	public static void main(String[] args) {

		String str = "I love Java java java";

		countChar(str);

	}
}
