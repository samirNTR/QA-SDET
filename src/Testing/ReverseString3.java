package Testing;

import java.util.Scanner;

//Reverse the alternate word      I LOVE JAVA-----> I EVOL JAVA
public class ReverseString3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the required string");
		String str = sc.nextLine();

		String words[]= str.split(" ");

		for(int i =0; i<words.length;i++)
		{

			if(i%2==1)
			{
				words[i]= new StringBuilder(words[i]).reverse().toString();
			}
		}



		String result= String.join(" ", words);

		System.out.println("the result is:-"+result);
	}

}

/*	public static String reverseAltWords(String s)

	{

		String[] str = s.split(" ");

		String r = "";

		for (int i = 0; i < str.length; i++)

		{

			if (i % 2 == 1)

			{

				str[i] = reverse(str[i]);

			}

			r = r + " " + str[i];

		}

		return r;

	}

	public static String reverse(String s)

	{

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--)

		{

			rev = rev + s.charAt(i);

		}

		return rev;

	}



	public static void main(String[] args)

	{
		String s="Hello Good morning America";

		String result=reverseAltWords(s);

		System.out.println(result.substring(1));

		}
	}

*/