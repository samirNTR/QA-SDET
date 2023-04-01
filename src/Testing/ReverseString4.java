package Testing;

import java.util.Scanner;

public class ReverseString4 {
 static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		   String rev = "", word = ""; System.out.println("Enter the string"); String
		   str = sc.nextLine(); str = str + " "; 
		   for (int i = 0; i < str.length(); i++)
		   { char ch = str.charAt(i); if (ch != ' ') { word = word + ch;
		   
		   } else { rev = word + " " + rev; word = ""; }
		   
		   }
		   
		   System.out.println("The reversal is:- " + rev);
		   
		   }
		   
		   }



