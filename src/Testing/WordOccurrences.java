package Testing;

import java.util.HashMap;
import java.util.Map;

public class WordOccurrences {

	
	    public static void main(String[] args) {
	        String sentence = "The quick brown fox jumps over the lazy dog the quick quick";
	        printMostOccurredWords(sentence);
	    }

	    public static void printMostOccurredWords(String sentence) {
	        String[] words = sentence.toLowerCase().split(" ");

	        Map<String, Integer> wordOccurrences = new HashMap<>();

	        for (String word : words) {
	            wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
	        }

	        int maxOccurrences = 0;

	        for (int occurrences : wordOccurrences.values()) {
	            if (occurrences > maxOccurrences) {
	                maxOccurrences = occurrences;
	            }
	        }

	        System.out.println("Word occurrences:");
	        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        System.out.println("\nMost occurred words:");
	        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
	            if (entry.getValue() == maxOccurrences) {
	                System.out.println(entry.getKey() + ": " + entry.getValue());
	            }
	        }
	    }
	}
