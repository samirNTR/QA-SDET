package Testing;

import java.util.Scanner;

public class LargestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String largestWord = findLargestWord(input);
        System.out.println("Largest word: " + largestWord);
    }

    private static String findLargestWord(String input) {
        String[] words = input.split("\\s+");
        String largestWord = "";

        for (String word : words) {
            if (word.length() > largestWord.length() || largestWord.isEmpty()) {
                largestWord = word;
            }
        }

        return largestWord;
    }
}
