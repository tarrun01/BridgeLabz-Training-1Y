import java.util.Scanner;

public class PalindromeChecker {

    static Scanner scanner = new Scanner(System.in);

    // Take string input from the user
    static String takeInput() {
        System.out.print("Enter a word or phrase to check: ");
        return scanner.nextLine().trim();
    }

    // Check if the given string is a palindrome (ignores spaces and case)
    static boolean isPalindrome(String text) {
        // Remove spaces and convert to lowercase for a clean comparison
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Display the result
    static void displayResult(String original, boolean palindrome) {
        System.out.println("\nInput  : \"" + original + "\"");
        if (palindrome) {
            System.out.println("Result : It IS a palindrome!");
        } else {
            System.out.println("Result : It is NOT a palindrome.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Palindrome Checker ===");

        String input = takeInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);

        scanner.close();
    }
}
