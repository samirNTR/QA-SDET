package interviewExp;

import java.util.HashSet;
import java.util.Set;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 9, 6, 17 };

		int min = Integer.MAX_VALUE;             //Value = 2,147,483,647  

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

/*
 * class Main { public static void main(String[] args) {
 * 
 * int a[] = {1,8,6,24};
 * 
 * Arrays.sort(a);
 * 
 * for(int i = 0; i < a.length - 1; i++) { int current = a[i]; int next =
 * a[i+1];
 * 
 * for(int j = current + 1; j < next; j++) { System.out.print(j + " "); } } } }
 * 
 * 
 */








