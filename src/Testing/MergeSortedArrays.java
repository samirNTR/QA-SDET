package Testing;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8};

        int[] c = mergeArrays(a, b);

        System.out.println("Merged Array:");
        for (int num : c) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        Arrays.sort(c);
        return c;
    }
}
