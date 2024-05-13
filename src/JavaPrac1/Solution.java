package JavaPrac1;

import java.util.*;

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day); // Month is zero-based in Calendar class
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // Convert day of week integer to corresponding string representation
        String[] daysOfWeek = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return daysOfWeek[dayOfWeek];
    }
}

public class Solution {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month day and year");
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        
        String res = Result.findDay(month, day, year);

        System.out.println(res);

        scanner.close();
    }
}
