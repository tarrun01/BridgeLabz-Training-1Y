import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        int originalNumber = number;
        
        // Create a while loop to access each digit
        while (originalNumber != 0) {
            // Get the last digit
            int digit = originalNumber % 10;
            
            // Add digit to sum
            sum += digit;
            
            // Remove the last digit
            originalNumber = originalNumber / 10;
        }
        
        // Check if number is perfectly divisible by the sum
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
            System.out.println("Sum of digits: " + sum);
            System.out.println(number + " is divisible by " + sum);
        } else {
            System.out.println(number + " is not a Harshad Number");
            System.out.println("Sum of digits: " + sum);
            System.out.println(number + " is not divisible by " + sum);
        }
        
        sc.close();
    }
}
