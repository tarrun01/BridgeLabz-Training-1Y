import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        
        // Run a for loop from i = 1 to i < number
        for (int i = 1; i < number; i++) {
            // Check if number is divisible by i
            if (number % i == 0) {
                // Add i to sum
                sum += i;
            }
        }
        
        // Check if sum is greater than number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
            System.out.println("Sum of divisors: " + sum + " > " + number);
        } else {
            System.out.println(number + " is not an Abundant Number");
            System.out.println("Sum of divisors: " + sum + " <= " + number);
        }
        
        sc.close();
    }
}
