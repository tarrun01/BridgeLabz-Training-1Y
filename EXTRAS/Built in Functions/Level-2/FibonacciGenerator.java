import java.util.Scanner;

public class FibonacciGenerator {

    static Scanner scanner = new Scanner(System.in);

    // Take the number of terms from the user
    static int takeInput() {
        System.out.print("Enter the number of terms to generate: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter a positive integer: ");
            scanner.next();
        }
        int terms = scanner.nextInt();
        if (terms < 1) {
            System.out.print("Please enter a number greater than 0: ");
            return takeInput();
        }
        return terms;
    }

    // Calculate and print the Fibonacci sequence
    static void generateFibonacci(int terms) {
        System.out.println("\nFibonacci Sequence (" + terms + " terms):");
        long a = 0, b = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(a);
            if (i < terms) System.out.print(", ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Fibonacci Sequence Generator ===");

        int terms = takeInput();
        generateFibonacci(terms);

        scanner.close();
    }
}
