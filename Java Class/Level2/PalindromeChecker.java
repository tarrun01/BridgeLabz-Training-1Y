import java.util.Scanner;

public class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();
        System.out.print("Enter text: ");
        checker.text = scanner.next();
        checker.displayResult();
        scanner.close();
    }
}
