package collectionFramework;

import java.util.*;

class DistinctArray {
    public static int getMaximumDistinctCount(List<Integer> a, List<Integer> b, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int distinctCount = 0;

        // Calculate frequency of elements in list 'a'
        for (int num : a) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Convert list 'b' to array and sort it to prioritize removing smaller elements
        Integer[] bArray = b.toArray(new Integer[0]);
        Arrays.sort(bArray);

        // Perform at most 'k' operations
        for (int num : bArray) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0 && k > 0) {
                freqMap.put(num, freqMap.get(num) - 1);
                k--;
            }
        }

        // Count distinct elements after operations
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > 0) {
                distinctCount++;
            }
        }

        return distinctCount;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(2, 3, 3, 2, 2);
        List<Integer> b = Arrays.asList(1, 3, 2, 4, 1);
        int k = 2;

        int result = getMaximumDistinctCount(a, b, k);
        System.out.println("Maximum number of distinct elements after operations: " + result);
    }
}
