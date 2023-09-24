package Testing;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringFilterAndUppercase {
    public static void main(String[] args) {
        // Get input strings from the user
    	
    	//Output:-aPPLE
        List<String> inputStrings = getInputStrings();
        
        // Process the strings and store filtered uppercase strings
        List<String> filteredUpperCaseStrings = new ArrayList<>();
        for (String str : inputStrings) {
            if (str.startsWith("a"))
            {
                filteredUpperCaseStrings.add(str.substring(0, 1).toLowerCase() + str.substring(1).toUpperCase());
            }
        }

        // Print the filtered uppercase strings
        for (String result : filteredUpperCaseStrings) {
            System.out.println(result);
        }
    }

    public static List<String> getInputStrings() {
        Scanner scanner = new Scanner(System.in);
        List<String> inputStrings = new ArrayList<>();

        System.out.print("Enter the number of strings: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String str = scanner.nextLine();
            inputStrings.add(str);
        }

        scanner.close();
        return inputStrings;
    }
}

