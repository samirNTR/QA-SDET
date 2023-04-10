package Testing;

import java.util.Scanner;
// Reverse the sentence I LOVE JAVA---->JAVA LOVE I

public class ReverseString4 {
 static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		   String rev = "", word = "";
		   System.out.println("Enter the string"); 
		   String str = sc.nextLine(); 
		   str = str + " "; 
		   for (int i = 0; i < str.length(); i++)
		   { 
			   char ch = str.charAt(i); 
			   if (ch != ' ')
			   
			   { 
				   word = word + ch;
		   
		   }
			   else { 
				   
				   rev = word + " " + rev;
				   
				   word = ""; 
			   }
		   
		   }
		   
		   System.out.println("The reversal is:- " + rev);
		   
		   }
		   
		   }

/*public class ReverseString {
    public static void main(String[] args) {
        String originalString = "I LOVE JAVA";
        String[] words = originalString.split(" ");
        String reversedString = "";
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i] + " ";
        }
        
        System.out.println(reversedString.trim());
    }
}
*/

