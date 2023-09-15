package Testing;

import java.util.Arrays;
import java.util.Comparator;

import java.util.Arrays;

import java.util.Arrays;
import java.util.Comparator;

import java.util.Arrays;

import java.util.*;

import java.util.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import java.util.*;

import java.util.Arrays;
import java.util.Comparator;

import java.util.*;

import java.util.*;

public class RearrangeArray {
	public static void main(String[] args) {
		int[] a = { 1, 3, -2, -1, -3, 2 };

		// Separate positive and negative numbers
		List<Integer> positive = new ArrayList<>();
		List<Integer> negative = new ArrayList<>();

		for (int num : a) {
			if (num > 0) {
				positive.add(num);
			} else {
				negative.add(-num); // Store the positive of negative numbers
			}
		}

		// Sort both lists in ascending order
		Collections.sort(positive);
		Collections.sort(negative);

		// Rearrange the array by alternating positive and negative numbers
		int[] result = new int[a.length];
		int i = 0;

		for (int j = 0; j < positive.size(); j++) {
			result[i++] = positive.get(j);
			result[i++] = -negative.get(j);
		}

		// Print the rearranged array
		System.out.println(Arrays.toString(result));
	}
}
