import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }
        
        // Handle zero case
        if (number == 0) {
            System.out.println("Number of digits: 1");
            sc.close();
            return;
        }
        
        int count = 0;
        
        // Loop until number becomes 0
        while (number != 0) {
            // Remove last digit
            number = number / 10;
            // Increase count
            count++;
        }
        
        System.out.println("Number of digits: " + count);
        
        sc.close();
    }
}
