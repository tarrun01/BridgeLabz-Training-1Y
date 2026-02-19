import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    static int low = 1;
    static int high = 100;
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    // Generate a guess within current range
    static int generateGuess() {
        return low + random.nextInt(high - low + 1);
    }

    // Get feedback from user: 'H' = too high, 'L' = too low, 'C' = correct
    static char getUserFeedback(int guess) {
        System.out.print("My guess is: " + guess + ". Is it too (H)igh, too (L)ow, or (C)orrect? ");
        String input = scanner.nextLine().trim().toUpperCase();
        while (!input.equals("H") && !input.equals("L") && !input.equals("C")) {
            System.out.print("Invalid input! Please enter H, L, or C: ");
            input = scanner.nextLine().trim().toUpperCase();
        }
        return input.charAt(0);
    }

    // Adjust range based on feedback
    static void adjustRange(char feedback, int guess) {
        if (feedback == 'H') {
            high = guess - 1;
        } else if (feedback == 'L') {
            low = guess + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Number Guessing Game ===");
        System.out.println("Think of a number between 1 and 100. I will try to guess it!");
        System.out.println("Provide feedback: H = Too High, L = Too Low, C = Correct\n");

        int attempts = 0;

        while (low <= high) {
            int guess = generateGuess();
            attempts++;
            char feedback = getUserFeedback(guess);

            if (feedback == 'C') {
                System.out.println("\nI guessed your number " + guess + " in " + attempts + " attempt(s)!");
                scanner.close();
                return;
            }
            adjustRange(feedback, guess);
        }

        System.out.println("Something went wrong — inconsistent feedback provided!");
        scanner.close();
    }
}
