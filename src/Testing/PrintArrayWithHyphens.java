
package Testing;

public class PrintArrayWithHyphens {
    public static void main(String[] args) {
        int[] a = {0, 1, 1, 0, 1, 0, 1};
        rearrangeArray(a);
        printArrayWithHyphens(a);
    }

    public static void rearrangeArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int countZeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[countZeroes];
                arr[countZeroes] = arr[i];
                arr[i] = temp;
                countZeroes++;
            }
        }
    }

    public static void printArrayWithHyphens(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        System.out.print(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0 && arr[i - 1] == 1) {
                System.out.print("-");
            } else if (arr[i] == 1 && arr[i - 1] == 0) {
                System.out.print("-");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
