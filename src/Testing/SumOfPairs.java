package Testing;

import java.util.ArrayList;
import java.util.List;

public class SumOfPairs {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Populate the list with numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        // Find all pairs whose sum is 9
        for (int num1 : numbers) {
            for (int num2 : numbers) {
                if (num1 + num2 == 9) {
                    System.out.println("Numbers found: " + num1 + " and " + num2);
                }
            }
        }

        System.out.println("No numbers found.");
    }
}