 package JavaPrac1;

import java.util.Scanner;

public class ABC1 {

	// static Scanner sc= new Scanner(System.in);------------I LOVE JAVA to JAVA
	// LOVE I

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String str="  Welcome to capgemini now";
		String [] str1=str.trim().split(" ");
		int count=str1.length;
		String rev="";
		
		for(int i=0 ; i<str1.length-1 ;i++)
		{
			
			if(i%2==1)
			{
	
			StringBuilder sb= new StringBuilder(str1[i]);
			 
			str1[i]=sb.reverse().toString();
			
		}
		}
		
		String result= String.join(" ",str1);
		System.out.println(result);
		System.out.println(count);
		
		/*
		 * for(int i= str1.length-1; i>=0; i--) {
		 * 
		 * rev=rev+str1[i]+" ";
		 * 
		 * }
		 * 
		 * System.out.println("The reversal is:\n" +rev); System.out.println(count);
		 * 
		 * if(rev.equalsIgnoreCase(str)) {
		 * 
		 * System.out.println("Its a palindrome"); }
		 * 
		 * else { System.out.println("Not a palindrome"); }
		 */
	}
}