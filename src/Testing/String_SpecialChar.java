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

		
		System.out.println("count is : "+ count);
	}

}
