package interviewExp;

import java.util.ArrayList;
import java.util.List;

public class RemoveConsecutiveDuplicateCharacters {
	 public static void main(String[] args) {
	        String str1 = "abbcdba";   //acdba
	        String str2 = "aabbcda";   //cda

	        System.out.println("Input: " + str1);
	        System.out.println("Output: " + removeConsecutive(str1));

	        System.out.println("Input: " + str2);
	        System.out.println("Output: " + removeConsecutive(str2));
	    }

	    public static String removeConsecutive(String str) {
	        List<Character> result = new ArrayList<>();

	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);

	            // If the list is empty or the current character is different from the last character in the list
	            if (result.isEmpty() || currentChar != result.get(result.size() - 1)) {
	                result.add(currentChar);
	            }
	        }

	        // Convert the list to a string
	        StringBuilder sb = new StringBuilder();
	        for (char c : result) {
	            sb.append(c);
	        }

	        return sb.toString();
	    }
	}