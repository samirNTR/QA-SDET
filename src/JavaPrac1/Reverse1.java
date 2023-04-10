package JavaPrac1;

import java.util.Scanner;

public class Reverse1 {

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

/*
 * String sentence = "I love JAAAVA more";
 * 
 * // Split the sentence into words String[] words = sentence.split("\\s+");
 * 
 * // Loop through each word for (String word : words) { // Check if the word
 * contains only lowercase letters if (word.matches("[a-z]+")) {
 * System.out.println(word); } } } }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * String str="Welcome to Java";
 * 
 * String[] words= str.split(" ");
 * 
 * String reverseWord=""; for(String w: words) {
 * 
 * 
 * StringBuilder sb= new StringBuilder(w); sb.reverse();
 * 
 * reverseWord=reverseWord+sb.toString()+" "; }
 * 
 * System.out.println(reverseWord); } }
 */
