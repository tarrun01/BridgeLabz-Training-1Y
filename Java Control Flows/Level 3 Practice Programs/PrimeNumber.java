import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Prime numbers are greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number");
            sc.close();
            return;
        }
        
        boolean isPrime = true;
        
        // Check for factors from 2 to number-1
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
        
        sc.close();
    }
}
