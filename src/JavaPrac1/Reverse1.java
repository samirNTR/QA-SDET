 package JavaPrac1;

import java.util.Scanner;

public class Reverse1 {

	static Scanner sc= new Scanner(System.in);
	    public static void main(String[] args) {
	    	System.out.println("Please enter the required string");
	        String str = sc.nextLine();
	        sc.close();
	        String filteredStr = str.replaceAll("[A-Z0-9]", "");

	        System.out.println("Original String: " + str);
	        System.out.println("Filtered String: " + filteredStr);
	    }
	}
	/*In this program, we have a string str that contains uppercase and lowercase alphabets, punctuation marks, and spaces. We use the replaceAll method of the String class to replace all lowercase alphabets [a-z] with an empty string "".

	The resulting string filteredStr only contains uppercase alphabets, punctuation marks, and spaces. We print both the original string and the filtered string using the println method of the System.out object. The output of the program will be:

	vbnet
	Copy code
	Original String: Hello World! This is a Java Program.
	Filtered String: H W! T J P.








/*
 * String sentence = "I love JAAAVA more";
 * 
 * // Split the sentence into words String[] words = sentence.split("\\s+");
 * 
 * // Loop through each word for (String word : words) 
 * { // Check if the word
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
