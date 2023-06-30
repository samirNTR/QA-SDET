package Testing;

import java.util.Scanner;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//Input : “aaabbbccca”
//Output : a3b3c3a1
//Input: “zzz”
//Output: z3
public class SequentialCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String output = countSequentialCharacters(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String countSequentialCharacters(String input) {
        List<String> result = new ArrayList<>();

        char[] chars = input.toCharArray();
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                result.add(chars[i - 1] + "" + count);
                count = 1;
            }
        }

        result.add(chars[chars.length - 1] + "" + count);

        return String.join("", result);
    }
}
