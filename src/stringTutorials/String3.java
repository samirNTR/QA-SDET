package stringTutorials;

import java.util.Scanner;

public class String3 {

	static Scanner sc= new Scanner(System.in);
	
	
	public static void replaceFun(String str)
	{
		
		StringBuffer alpha= new StringBuffer(), num=new StringBuffer(), special= new StringBuffer();
		
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
		
		
		System.out.println(num);
		
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