import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Check for natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (positive integer)");
            sc.close();
            return;
        }
        
        // Create arrays for odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        
        // Create index variables
        int evenIndex = 0;
        int oddIndex = 0;
        
        // Loop from 1 to number and separate odd/even
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
        
        // Print odd numbers array
        System.out.println("\nOdd numbers from 1 to " + number + ":");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
        
        // Print even numbers array
        System.out.println("\nEven numbers from 1 to " + number + ":");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
