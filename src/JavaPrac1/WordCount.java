package JavaPrac1;





import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordCount {

	public static void charCount(String str)
	{
		
		//char[]ch = str.toLowerCase().toCharArray();
		
		String words[]= str.toLowerCase().trim().split(" ");
		
		Map<String,Integer>hm = new LinkedHashMap<String, Integer>();
		for(String word:words)
		{
			if(!word.isBlank())
			
				hm.put(word, hm.getOrDefault(word,0)+1);
			
		}
		
		Set<Map.Entry<String,Integer>> es=hm.entrySet();
		
		for(Map.Entry<String, Integer>es1:es)
		{
			System.out.println(es1.getKey()+">"+es1.getValue());
			
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = scanner.nextLine();
		scanner.close();
		charCount(str);
		
	}
		
}
		
		
		
		
		
		
		
		

		/*Map<String, Integer> wordCountMap = countWords(input);
		displayWordCounts(wordCountMap);
	}

	public static Map<String, Integer> countWords(String input) {
		Map<String, Integer> wordCountMap = new HashMap<>();
		String[] words = input.split("\\s+");

		for (String word : words) {
			word = word.toLowerCase(); // Convert the word to lowercase to handle case-insensitivity
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		}

		return wordCountMap;
	}

	public static void displayWordCounts(Map<String, Integer> wordCountMap) {
		System.out.println("Word Counts:");
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
*/


