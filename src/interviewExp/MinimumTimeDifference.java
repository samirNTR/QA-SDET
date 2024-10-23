package interviewExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference {
    
    // Method to calculate the minimum time difference
    public static void count(List<String> times) {
        // List to store time in minutes
        List<Integer> minutesList = new ArrayList<>();
        
        // Convert each time string to minutes
        for (String time : times) {
            String[] splitTime = time.split(":");
            int hours = Integer.parseInt(splitTime[0]);
            int minutes = Integer.parseInt(splitTime[1]);
            int totalMinutes = hours * 60 + minutes;
            minutesList.add(totalMinutes);
        }
        
        // Sort the list of minutes
        Collections.sort(minutesList);
        
        // Initialize the minimum difference to the maximum possible value (1440 minutes in a day)
        int minDifference = Integer.MAX_VALUE;

        // Calculate the minimum difference between consecutive times
        for (int i = 1; i < minutesList.size(); i++) {
            minDifference = Math.min(minDifference, minutesList.get(i) - minutesList.get(i - 1));
        }

        // Handle the circular difference (i.e., across midnight)
        int circularDifference = (1440 - minutesList.get(minutesList.size() - 1)) + minutesList.get(0);
        minDifference = Math.min(minDifference, circularDifference);
        
        // Print the result
        System.out.println(minDifference);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test case 1
        List<String> times1 = Arrays.asList("23:59", "00:00");
        count(times1);  // Expected output: 1

        // Test case 2
        List<String> times2 = Arrays.asList("23:59", "00:00", "23:59");
        count(times2);  // Expected output: 0
    }
}