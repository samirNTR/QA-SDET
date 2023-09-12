package JavaPrac1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ABC1 {

	static Scanner sc = new Scanner(System.in);

	public static void charCount(String str) {

		
		String str1[]= str.split(" ");
		Set<	String> set= new LinkedHashSet<String >();
		StringBuilder sb= new StringBuilder();
		
		for(String str2:str1)
		{
			
			set.add(str2);
		}
		
		
		Iterator<String> it= set.iterator();
		
		while(it.hasNext())
		{
			
			System.out.print(it.next()+" ");
		}
		
		/*
		 * for(String str3:set) {
		 * 
		 * sb.append(str3).append(" ");
		 * 
		 * 
		 * }
		 */
		//System.out.println("The result is: -"+sb.toString());
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the required string");
		String str1 = sc.nextLine();
		charCount(str1);
	}
}
