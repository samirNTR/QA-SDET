package Testing;

import java.util.Scanner;

public class String_SpecialChar {
    static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {


		int count=0;
		String str= "aa a234bc@ sad$ hsagd)&&&&&&&";

		for(int i=0; i<str.length(); i++)
		{

			char ch= str.charAt(i);

			if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch))

			{

				count++;
			}
		}
 str=str.replaceAll("[a-zA-Z0-9]", " ");


str=str.replaceAll("  +", " ");   //jHAAUIAHU
str=str.trim();

System.out.println(str);
System.out.println("count is : "+ count);
	}

}
