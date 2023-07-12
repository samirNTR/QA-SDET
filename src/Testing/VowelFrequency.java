package Testing;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

	public class VowelFrequency {

	    public static void countVowelFrequency(String str) {
	        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive matching

	        // Create a map to store the frequency of each vowel
	        Map<Character, Integer> vowelFrequency = new LinkedHashMap<>();
	        vowelFrequency.put('a', 0);
	        vowelFrequency.put('e', 0);
	        vowelFrequency.put('i', 0);
	        vowelFrequency.put('o', 0);
	        vowelFrequency.put('u', 0);

	        int totalCount = 0; // Variable to track the total count of vowels

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Check if the character is a vowel
	            if (vowelFrequency.containsKey(ch)) {

	                vowelFrequency.put(ch, vowelFrequency.get(ch)+1 );
	                totalCount++;
	            }
	        }

	        // Print the frequency of each vowel

	        Set<Map.Entry<Character,Integer> >entrySet=vowelFrequency.entrySet();
	        for (Map.Entry<Character, Integer> entry : entrySet)
	        {
	            System.out.println(entry.getKey() + "->" + entry.getValue() +" times");
	        }

	        // Print the total count of vowels
	        System.out.println("Total count of vowels: " + totalCount);
	    }

	    public static void main(String[] args) {
	        String input = "Hello World";
	        countVowelFrequency(input);
	    }
	}



