package Testing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class StringWordCount {

    static Scanner sc = new Scanner(System.in);

    public static void wordCount(String str) {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = str.split("\\s+");

        for (String word : words) {
            if (!word.isBlank()) {
                word = word.toLowerCase(); // Optional: Convert word to lowercase to count case-insensitively
                hm.put(word, hm.getOrDefault(word, 0) + 1);
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet) {
        //	if(entry.getValue()>1)
            System.out.println(entry.getKey() + ":>" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the required string");
        String str = sc.nextLine();
        wordCount(str);
    }
}

/*
 * 
 * package Testing;
 * 
 * import java.util.HashMap; import java.util.LinkedHashMap; import
 * java.util.Map; import java.util.Scanner; import java.util.Set;
 * 
 * public class StringWordCount {
 * 
 * static Scanner sc = new Scanner(System.in);
 * 
 * public static void wordCount(String str) { Map<String, Integer> hm = new
 * HashMap<>(); Map<String, Integer> duplicateWords = new LinkedHashMap<>(); //
 * To keep track of duplicate words String[] words = str.split("\\s+");
 * 
 * for (String word : words) { if (!word.isBlank()) { word = word.toLowerCase();
 * // Optional: Convert word to lowercase to count case-insensitively int count
 * = hm.getOrDefault(word, 0); hm.put(word, count + 1);
 * 
 * // Check for duplicate words if (count > 0) { duplicateWords.put(word, count
 * + 1); } } }
 * 
 * System.out.println("Duplicate Words:"); Set<Map.Entry<String, Integer>>
 * duplicateEntrySet = duplicateWords.entrySet(); for (Map.Entry<String,
 * Integer> entry : duplicateEntrySet) { System.out.println(entry.getKey() +
 * ":>" + entry.getValue()); }
 * 
 * System.out.println("\nWord Count:"); Set<Map.Entry<String, Integer>> entrySet
 * = hm.entrySet(); for (Map.Entry<String, Integer> entry : entrySet) {
 * System.out.println(entry.getKey() + ":>" + entry.getValue()); } }
 * 
 * public static void main(String[] args) {
 * System.out.println("Enter the required string"); String str = sc.nextLine();
 * wordCount(str); } }
 * 
 * 
 * 
 */