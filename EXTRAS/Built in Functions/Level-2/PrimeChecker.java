import java.util.Scanner;

public class PrimeChecker {

    static Scanner scanner = new Scanner(System.in);

    // Take a positive integer input from the user
    static int takeInput() {
        System.out.print("Enter a positive integer to check: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter a positive integer: ");
            scanner.next();
        }
        int num = scanner.nextInt();
        if (num < 1) {
            System.out.print("Please enter a number greater than 0: ");
            return takeInput();
        }
        return num;
    }

    // Check if a number is prime
    static boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Display the result
    static void displayResult(int number, boolean prime) {
        System.out.println("\nNumber : " + number);
        if (prime) {
            System.out.println("Result : " + number + " IS a prime number.");
        } else {
            System.out.println("Result : " + number + " is NOT a prime number.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Prime Number Checker ===");

        int number = takeInput();
        boolean result = isPrime(number);
        displayResult(number, result);

        scanner.close();
    }
}
