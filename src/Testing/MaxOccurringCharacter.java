package Testing;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MaxOccurringCharacter {

    static Scanner sc = new Scanner(System.in);

    public static void charCount(String str1) {
        Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

        char ch[] = str1.toCharArray();
        char maxChar = ' ';
        int maxCount = 0;

        for (char c : ch) {
            if (!String.valueOf(c).isBlank()) {
                if (hm.containsKey(c)) {
                    hm.put(c, hm.get(c) + 1);
                    if (hm.get(c) > maxCount) {
                        maxCount = hm.get(c);
                        maxChar = c;
                    }
                } else {
                    hm.put(c, 1);
                }
            }
        }

        System.out.println("Character with maximum occurrences: " + maxChar);
        System.out.println("Occurrences: " + maxCount);
    }

    public static void main(String[] args) {
        System.out.println("Enter the required string");
        String str1 = sc.nextLine();
        charCount(str1);
    }
}
