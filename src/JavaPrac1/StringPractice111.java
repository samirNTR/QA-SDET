package JavaPrac1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringPractice111 {

	public static String vowelRemove(String str)
	{
		
		char ch[]=str.toLowerCase().toCharArray();
		
		Set<Character> vowels= new LinkedHashSet<Character>();
		
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		StringBuilder result= new StringBuilder();
		
		for(char vowel:ch)
		{
			if(!vowels.contains(vowel))
			{
				
				result.append(vowel);
			}
				
			
		}
		
		return result.toString();
	}
	
	
	public static void main(String[] args) {
		

		String str="I like Java";
		String result=vowelRemove(str);
		System.out.println("Original string is:- "+str);
		System.out.println("After removing vowels:- "+result.trim());
	

	}

}
