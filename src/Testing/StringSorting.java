package Testing;

import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {



	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args)

{
		int temp=0;
		System.out.println("Enter the required String");

		String str=sc.nextLine();
		 char[] ch= str.toCharArray();

		for( int i=0 ; i<ch.length;i ++)

		{

			for(int j=i+1; j<ch.length;j++)
			{


				if(ch[i]> ch[j])
				{

					temp= ch[i];
					ch[i]= ch[j];
					ch[j]=(char) temp;


				}
			}

		}
		 System.out.println(ch);
		System.out.println(Arrays.toString(ch));

	}

}
