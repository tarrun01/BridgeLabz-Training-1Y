import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        int originalNumber = number;
        
        // Use while loop till originalNumber is not equal to zero
        while (originalNumber != 0) {
            // Find each digit (remainder of modulus operation)
            int digit = originalNumber % 10;
            
            // Find the cube of the digit and add to sum
            sum += digit * digit * digit;
            
            // Remove the last digit using division
            originalNumber = originalNumber / 10;
        }
        
        // Check if the sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
            System.out.println("Verification: " + number + " = sum of cubes of its digits = " + sum);
        } else {
            System.out.println(number + " is not an Armstrong number");
            System.out.println("Sum of cubes of digits = " + sum + ", which is not equal to " + number);
        }
        
        sc.close();
    }
}
