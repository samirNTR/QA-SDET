package JavaPrac1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Prac2 {

	static Scanner sc = new Scanner(System.in);
	static String str1;

	public static void countChar(String str) {

		String[] s1= str.split(" ");


	Set<String> mySet= new LinkedHashSet<>();

	for(String s2:s1)
	{

		mySet.add(s2);
		}

	Iterator<String> it= mySet.iterator();

	while(it.hasNext())
	{
		System.out.print(" "+it.next());
	}
	}

	public static void main(String[] args)

	{
		System.out.println("Enter the required string");

		str1 = sc.nextLine();

		countChar(str1);
	}
}
