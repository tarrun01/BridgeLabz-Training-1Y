import java.util.Scanner;

public class MaxOfThree {

    static Scanner scanner = new Scanner(System.in);

    // Take a single integer input with a label
    static int takeInput(String label) {
        System.out.print("Enter " + label + ": ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter an integer for " + label + ": ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Calculate and return the maximum of three numbers
    static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    // Display the result
    static void displayResult(int a, int b, int c, int max) {
        System.out.println("\nNumbers entered: " + a + ", " + b + ", " + c);
        System.out.println("Maximum value  : " + max);
    }

    public static void main(String[] args) {
        System.out.println("=== Maximum of Three Numbers ===");

        int num1 = takeInput("first number ");
        int num2 = takeInput("second number");
        int num3 = takeInput("third number ");

        int max = findMaximum(num1, num2, num3);
        displayResult(num1, num2, num3, max);

        scanner.close();
    }
}
