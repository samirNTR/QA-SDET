import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int size = scanner.nextInt();

        int[] digits = new int[size];
        System.out.print("Enter the values: ");
        for (int i = 0; i < size; i++) {
            digits[i] = scanner.nextInt();
        }

        int[] result = solution(digits);
        System.out.println("Output: " + Arrays.toString(result));

        scanner.close();
    }

    public static int[] solution(int[] digits) {
        int n = digits.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;

            if (carry == 0) {
                // No more carry, early return
                return digits;
            }
        }

        int[] result = new int[n + 1];
        result[0] = carry;
        System.arraycopy(digits, 0, result, 1, n);
        return result;
    }
}
