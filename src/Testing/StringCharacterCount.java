package Testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StringCharacterCount {
	
	static Scanner sc= new Scanner(System.in);
	
	
	public static void charCount(String str1)
	{
	 Map<Character,Integer> hm= new HashMap<Character,Integer>();
	
	char ch[]= str1.toCharArray();
	
	for(char c:ch)
	{
	if(!String.valueOf(c).isBlank())
		
		if(hm.containsKey(c))
			
			hm.put(c, hm.get(c)+1);
	
		else
			
			hm.put(c, 1);
		
	}
		
		
	Set<Map.Entry<Character,Integer>> entryset= hm.entrySet();
	
	for(Map.Entry<Character, Integer> c1:entryset)
	{
		// if(c1.getValue()>1)
		System.out.println(c1.getKey()+"--> "+ c1.getValue());
		
		
		
	}
		
	}

	public static void main(String[] args)
	
	{
		
		System.out.println("Enter the required string");
		
		String str1= sc.nextLine();
		
		charCount(str1);

	}

}
