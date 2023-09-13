package Testing;

//Online Java Compiler
import java.util.*;

public class Suffix {
 public static String longestCommonSuffix(String[] a) {
     int size = a.length;

     /* If size is 0, return an empty string */
     if (size == 0)
         return "";

     if (size == 1)
         return a[0];

     /* Convert all strings to lowercase for case-insensitive comparison */
     for (int i = 0; i < size; i++) {
         a[i] = a[i].toLowerCase();
     }

     /* Sort the array of strings */
     Arrays.sort(a);

     /* Find the minimum length from the first and last string */
     int end = Math.min(a[0].length(), a[size - 1].length());

     /* Find the common suffix between the first and last string */
     int i = 0;
     while (i < end && a[0].charAt(a[0].length() - 1 - i) == a[size - 1].charAt(a[size - 1].length() - 1 - i))
         i++;

     String suffix = a[0].substring(a[0].length() - i);
     return suffix;
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a comma-separated list of words: ");
     String inputLine = scanner.nextLine();
     scanner.close();

     /* Split the input line by commas to get an array of words */
     String[] input = inputLine.split(",");

     System.out.println("The longest Common Suffix is : " + longestCommonSuffix(input));
 }
}
