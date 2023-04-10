package JavaPrac1;

import java.util.Scanner;

public class Prac3 {
 static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string");
		String str= sc.nextLine();
		
		
		String words[]= str.split(" ");
		
	
		for(int i=0; i<words.length;i++)
		{
			
			if(i%2==1)
			{
				
				words[i]= new StringBuilder(words[i]).reverse().toString();
			}
		}
			
		
		String result= String.join(" ", words);
		
		System.out.println(result);
		}
		
		
	}