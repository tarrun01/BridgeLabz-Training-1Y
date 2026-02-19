import java.util.Scanner;

public class GcdLcmCalculator {

    static Scanner scanner = new Scanner(System.in);

    // Take a positive integer input with a label
    static int takeInput(String label) {
        System.out.print("Enter " + label + ": ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter a positive integer for " + label + ": ");
            scanner.next();
        }
        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.print("Please enter a number greater than 0: ");
            return takeInput(label);
        }
        return num;
    }

    // Calculate GCD using Euclidean algorithm (recursive)
    static int calculateGCD(int a, int b) {
        if (b == 0) return a;
        return calculateGCD(b, a % b);
    }

    // Calculate LCM using the relationship: LCM(a, b) = (a * b) / GCD(a, b)
    static long calculateLCM(int a, int b) {
        return ((long) a * b) / calculateGCD(a, b);
    }

    // Display the results
    static void displayResult(int a, int b, int gcd, long lcm) {
        System.out.println("\nNumbers : " + a + " and " + b);
        System.out.println("GCD     : " + gcd);
        System.out.println("LCM     : " + lcm);
    }

    public static void main(String[] args) {
        System.out.println("=== GCD and LCM Calculator ===");

        int num1 = takeInput("first number ");
        int num2 = takeInput("second number");

        int gcd = calculateGCD(num1, num2);
        long lcm = calculateLCM(num1, num2);

        displayResult(num1, num2, gcd, lcm);

        scanner.close();
    }
}
