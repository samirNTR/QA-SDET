package oops;

public class OverloadingExample {
    
    // Method with two integer parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Call the overloaded methods
        int sum1 = add(5, 10);
        int sum2 = add(5, 10, 15);
        double sum3 = add(5.5, 10.5);

        // Display the results
        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}
