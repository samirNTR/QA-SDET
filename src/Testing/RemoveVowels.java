package Testing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveVowels {
 
    public static String removeVowels(String str) {
        // Create a HashSet to store the vowels
        Set<Character> vowels = new LinkedHashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        // Create a StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Iterate through the characters in the input string
        for (char c : str.toCharArray()) {
            if (!vowels.contains(c)) {
                result.append(c);
                
                
            }
        }

        return result.toString();
    }
    
    public static void main(String[] args) {
        String input = "I LOve Java";

        String result = removeVowels(input.trim().toLowerCase());
        System.out.println("Original String: " + input);
        System.out.println("String after removing vowels: " + result);
    }

}
