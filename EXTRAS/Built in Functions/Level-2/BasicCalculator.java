import java.util.Scanner;

public class BasicCalculator {

    static Scanner scanner = new Scanner(System.in);

    // Addition
    static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    static double multiply(double a, double b) {
        return a * b;
    }

    // Division (handles divide by zero)
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return Double.NaN;
        }
        return a / b;
    }

    // Take a numeric input with a label
    static double takeNumber(String label) {
        System.out.print("Enter " + label + ": ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input! Enter a number for " + label + ": ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    // Display the operation menu and return the user's choice
    static int takeOperation() {
        System.out.println("\nSelect an operation:");
        System.out.println("  1. Addition       (+)");
        System.out.println("  2. Subtraction    (-)");
        System.out.println("  3. Multiplication (*)");
        System.out.println("  4. Division       (/)");
        System.out.print("Enter choice (1-4): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid! Enter a number between 1 and 4: ");
            scanner.next();
        }
        int choice = scanner.nextInt();
        if (choice < 1 || choice > 4) {
            System.out.print("Invalid! Enter a number between 1 and 4: ");
            return takeOperation();
        }
        return choice;
    }

    // Display the result
    static void displayResult(double a, double b, int op, double result) {
        String[] symbols = {"+", "-", "*", "/"};
        if (!Double.isNaN(result)) {
            System.out.printf("%n%.2f %s %.2f = %.2f%n", a, symbols[op - 1], b, result);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Basic Calculator ===");

        double num1 = takeNumber("first number ");
        double num2 = takeNumber("second number");
        int operation = takeOperation();

        double result = switch (operation) {
            case 1 -> add(num1, num2);
            case 2 -> subtract(num1, num2);
            case 3 -> multiply(num1, num2);
            case 4 -> divide(num1, num2);
            default -> Double.NaN;
        };

        displayResult(num1, num2, operation, result);

        scanner.close();
    }
}
