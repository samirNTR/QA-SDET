package Testing;

import java.util.HashSet;

public class RemoveVowels {
    public static void main(String[] args) {
        String input = "I love Java";

        String result = removeVowels(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing vowels: " + result);
    }

    public static String removeVowels(String str) {
        // Create a HashSet to store the vowels
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

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
}
