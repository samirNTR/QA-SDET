package JavaPrac1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test1 {

	
	public static  void charCount( String str)
	{
	
		char ch[]=str.toCharArray();
		
		Map<Character,Integer> hm = new LinkedHashMap<Character, Integer>();
		
		for(char c:ch)
		{
			if(!String.valueOf(c).isBlank())
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			
			else
			{
				
				hm.put(c, 1);
			}
		}
		
		System.out.println("The non repeating characters are:- ");
		for(Map.Entry<Character, Integer> es1:hm.entrySet())
		{
			if(es1.getValue()==1)
			System.out.print(es1.getKey());
			
		}
		
	}
	
	
	
	public static void main(String[] args) {

String str="abcd  for  abcd";

charCount(str);

	}

}
