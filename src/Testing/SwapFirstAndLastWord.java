package Testing;

import java.util.Scanner;

public class SwapFirstAndLastWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        // Split the input string into words
        String[] words = input.split(" ");

        if (words.length >= 2) {
            // Swap the first and last words
            String temp = words[0];
            words[0] = words[words.length - 1];
            words[words.length - 1] = temp;

            // Join the words back into a sentence
            String swappedSentence = String.join(" ", words);

            System.out.println("String with first and last words swapped: " + swappedSentence);
        } else {
            System.out.println("Please enter a sentence with at least two words.");
        }
    }
}
