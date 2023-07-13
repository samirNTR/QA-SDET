 package Testing;

import java.util.Scanner;

 class VowelsString {

	public static void main(String[] args) {

	       /* Scanner input = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = input.nextLine();
	        input.close();

	        System.out.print("Vowels in the string: ");
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (isVowel(ch)) {
	                System.out.print(ch + " ");
	            }
	        }
	    }

	    public static boolean isVowel(char ch) {
	        ch = Character.toLowerCase(ch);
	        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
	    }

	}*/
		Scanner sc = new Scanner(System.in);
	      System.out.print("Enter a string: ");
	      String str = sc.nextLine();
          sc.close();
	      int count = 0;
	      System.out.print("The vowels are:-");
	      for (int i = 0; i < str.length(); i++)
	      {
	         char ch = str.charAt(i);
	         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	             ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')

	         {
	            count++;
	            System.out.print(ch + " ");
	         }
	      }

	      System.out.println("\nNumber of vowels: " + count);
	   }
	}




