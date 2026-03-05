package interviewExp;

import java.util.HashSet;
import java.util.Set;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 9, 6, 17 };

		int min = Integer.MAX_VALUE;

		int max = Integer.MIN_VALUE;

		Set<Integer> hs = new HashSet<Integer>();

		for (int num : a) {
			hs.add(num);

			min = Math.min(min, num);
			max = Math.max(max, num);

		}

		for (int i = min; i <= max; i++) {
			if (!hs.contains(i))

				System.out.print(i + " ");
		}

	}
}
