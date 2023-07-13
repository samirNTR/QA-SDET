package Testing;

import java.util.Arrays;
import java.util.Scanner;

public class Annagram {



	  static String str1, str2;
	  static Scanner sc= new Scanner(System.in);
	  public static boolean Anagram1(char[] ch1 , char[] ch2)
	  {

		int n1= ch1.length;

		int n2= ch2.length;

		if(n1!=n2)
		 return false;

		Arrays.sort(ch1);
		Arrays.sort(ch2);

	  for( int i=0 ;i<ch1.length; i++)

		if(ch1[i]!= ch2[i])

			return false;
	        return true;

		}

public static void main(String[] args)
{

	System.out.println("Enter the string one by one");

	str1=sc.nextLine();
	str2=sc.nextLine();

	char[] ch1= str1.toCharArray();
	 char[] ch2= str2.toCharArray();

	if(Anagram1(ch1,ch2))
	{


		System.out.println("both are anagram");
	}

	else {


		System.out.println("Not an Annagram");
}

	}

}
