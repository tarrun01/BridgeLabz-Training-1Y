import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define integer array of 5 elements
        int[] numbers = new int[5];
        
        // Get user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("\n===== Number Analysis =====");
        
        // Loop through array and analyze each number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                // Check for even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is positive and even");
                } else {
                    System.out.println(numbers[i] + " is positive and odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative");
            } else {
                System.out.println(numbers[i] + " is zero");
            }
        }
        
        // Compare first and last elements
        System.out.println("\n===== Comparison of First and Last Elements =====");
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        
        if (first == last) {
            System.out.println("First element (" + first + ") is equal to last element (" + last + ")");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ")");
        } else {
            System.out.println("First element (" + first + ") is less than last element (" + last + ")");
        }
        
        sc.close();
    }
}
