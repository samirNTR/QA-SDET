package Testing;

import java.util.Scanner;

public class ReverseString2 {

	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args)

	{

	System.out.println("Enter the required string");

	String str= sc.nextLine();

	String words[]= str.split(" ");

	/*String reverseString=" ";
	 for(String w:words)
	 {
		 String reverseWord=" ";

		 for(int i=w.length()-1; i>=0; i--)
		 {
			 reverseWord= reverseWord+w.charAt(i);

			 }
		 reverseString= reverseString+ reverseWord+"";

	 }

	 System.out.println("The reversal is:-"+reverseString);
	}*/



String reverseWord="";
for(String w:words)
{

	StringBuilder sb= new StringBuilder(w);

	sb.reverse();

	reverseWord= reverseWord+sb.toString()+" ";
}

System.out.println(reverseWord);
}
}







