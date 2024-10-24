package interviewExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.*;

class MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        // Convert the time points into minutes from "00:00"
        List<Integer> minutesList = new ArrayList<>();
        
        for (String time : timePoints) {
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int totalMinutes = hours * 60 + minutes;
            minutesList.add(totalMinutes);
        }
        
        // Sort the time points in minutes
        Collections.sort(minutesList);
        
        // Initialize the minimum difference as the largest possible value
        int minDifference = Integer.MAX_VALUE;
        
        // Compare consecutive time points for minimum difference
        for (int i = 1; i < minutesList.size(); i++) {
            int diff = minutesList.get(i) - minutesList.get(i - 1);
            minDifference = Math.min(minDifference, diff);
        }
        
        // Also check the difference between the first and the last time point,
        // considering the circular nature of the 24-hour clock.
        int circularDiff = 1440 - minutesList.get(minutesList.size() - 1) + minutesList.get(0);
        minDifference = Math.min(minDifference, circularDiff);
        
        return minDifference;
    }

    public static void main(String[] args) {
    	MinimumTimeDifference solution = new MinimumTimeDifference();
        
        // Test case 1
        List<String> timePoints1 = Arrays.asList("23:59", "00:00");
        int result1 = solution.findMinDifference(timePoints1);
        System.out.println("Minimum difference (Test case 1): " + result1); // Output: 1

        // Test case 2
        List<String> timePoints2 = Arrays.asList("00:00", "23:59", "00:00");
        int result2 = solution.findMinDifference(timePoints2);
        System.out.println("Minimum difference (Test case 2): " + result2); // Output: 0

        // Test case 3
        List<String> timePoints3 = Arrays.asList("12:30", "03:45", "06:15", "14:10");
        int result3 = solution.findMinDifference(timePoints3);
        System.out.println("Minimum difference (Test case 3): " + result3); // Output: 105 (e.g., difference between 12:30 and 14:10)
    }
}
