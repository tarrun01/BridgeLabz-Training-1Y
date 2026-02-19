import java.util.Scanner;

public class FactorialRecursion {

    static Scanner scanner = new Scanner(System.in);

    // Take a non-negative integer input from the user
    static int takeInput() {
        System.out.print("Enter a non-negative integer: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter a non-negative integer: ");
            scanner.next();
        }
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.print("Factorial is not defined for negative numbers. Try again: ");
            return takeInput();
        }
        return num;
    }

    // Recursive function to calculate factorial
    static long calculateFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * calculateFactorial(n - 1);
    }

    // Display the result
    static void displayResult(int number, long factorial) {
        System.out.println("\n" + number + "! = " + factorial);
    }

    public static void main(String[] args) {
        System.out.println("=== Factorial Calculator (Recursive) ===");

        int number = takeInput();
        long result = calculateFactorial(number);
        displayResult(number, result);

        scanner.close();
    }
}
