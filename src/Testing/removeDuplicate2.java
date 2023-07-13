package Testing;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
                                    //Remove Duplicate Character/Repeated character
public class removeDuplicate2 {


	static Scanner sc= new Scanner(System.in);

		public static void charCount1(String str)
		{

			StringBuilder sb= new StringBuilder();

			Set<Character> set= new LinkedHashSet<>();
			for(int i=0; i<str.length(); i++)
			{
				set.add(str.charAt(i));
			}

			for(Character c:set)
			{
				sb.append(c);
			}


			System.out.println(sb);
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.out.println("Enter the required string");
			String str=sc.nextLine();
			charCount1(str);



		}

	}


