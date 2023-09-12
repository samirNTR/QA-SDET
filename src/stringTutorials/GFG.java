package stringTutorials;

//Java program to find longest common prefix of
//given array of words.
import java.util.*;


import java.util.*;

public class GFG {
    public String longestCommonPrefix(String[] a) {
        int size = a.length;

        /* If size is 0, return an empty string */
        if (size == 0)
            return "";

        if (size == 1)
            return a[0];

        /* Sort the array of strings */
        Arrays.sort(a);

        /* Find the minimum length from the first and last string */
        int end = Math.min(a[0].length(), a[size - 1].length());

        /* Find the common prefix between the first and last string */
        int i = 0;
        while (i < end && a[0].charAt(i) == a[size - 1].charAt(i))
            i++;

        String pre = a[0].substring(0, i);
        return pre;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] input = new String[numStrings];
        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            input[i] = scanner.nextLine();
        }
        scanner.close();

        GFG gfg = new GFG();
        System.out.println("The longest Common Prefix is : " +
                gfg.longestCommonPrefix(input));
    }
}



























/*
 * public class GFG { public String longestCommonPrefix(String[] a) { int size =
 * a.length;
 * 
 * if size is 0, return empty string if (size == 0) return "";
 * 
 * if (size == 1) return a[0];
 * 
 * sort the array of strings Arrays.sort(a);
 * 
 * find the minimum length from first and last string int end =
 * Math.min(a[0].length(), a[size-1].length());
 * 
 * find the common prefix between the first and last string int i = 0; while (i
 * < end && a[0].charAt(i) == a[size-1].charAt(i) ) i++;
 * 
 * String pre = a[0].substring(0, i); return pre; }
 * 
 * Driver Function to test other function public static void main(String[] args)
 * { GFG gfg = new GFG(); String[] input = {"Carpenter", "Cartoon"
 * ,"Cartesian"}; System.out.println( "The longest Common Prefix is : " +
 * gfg.longestCommonPrefix(input)); } }
 */
