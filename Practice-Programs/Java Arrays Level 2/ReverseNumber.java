import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        
        // Handle negative numbers
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = -number;
        }
        
        // Find count of digits
        long temp = number;
        int count = 0;
        
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }
        
        // Store digits in array
        int[] digits = new int[count];
        int index = 0;
        temp = number;
        
        while (temp != 0) {
            int digit = (int)(temp % 10);
            digits[index] = digit;
            index++;
            temp = temp / 10;
        }
        
        // Handle zero
        if (number == 0) {
            digits[0] = 0;
        }
        
        // Create array to store in reverse order
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }
        
        // Display results
        System.out.println("\n===== Results =====");
        System.out.print("Original number: ");
        if (isNegative) System.out.print("-");
        System.out.println(number);
        
        System.out.print("Digits in original order: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        
        System.out.print("Reversed number: ");
        if (isNegative) System.out.print("-");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
        
        sc.close();
    }
}
