package stringTutorials;

import java.util.Scanner;

public class String3 {

	static Scanner sc= new Scanner(System.in);
	
	
	
	
	public static void replaceFun(String str)
	{
		
		StringBuilder alpha= new StringBuilder(), 
				num=new StringBuilder(), 
				special= new StringBuilder();
		
		for(int i=0; i<str.length(); i++)
		{
		
		if(Character.isAlphabetic(str.charAt(i)))
		{
			
			alpha.append(str.charAt(i));
		}
		else if( Character.isDigit(str.charAt(i)))
		{
			
			num.append(str.charAt(i));
		}
		
		else
		{
			special.append(str.charAt(i));
		}
		}
		
		
		System.out.println(special);
		
		/*
	}	 * str=str.replaceAll("[A-Za-z0-9 ]", " ");
		 * 
		 * 
		 * 
		 * str=str.replaceAll("  +", "");
		 * 
		 * if(str.equals(" ")) return "-1";
		 * 
		 * return str;
		 */
		
		

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ABccf&&   **890099";
		
		
		replaceFun(str);
	
}
}