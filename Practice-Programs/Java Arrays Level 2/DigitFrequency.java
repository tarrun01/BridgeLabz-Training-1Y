import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        
        // Handle negative numbers
        if (number < 0) {
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
        
        if (temp == 0) {
            digits[0] = 0;
            index = 1;
        } else {
            while (temp != 0) {
                int digit = (int)(temp % 10);
                digits[index] = digit;
                index++;
                temp = temp / 10;
            }
        }
        
        // Find frequency of each digit (0-9)
        int[] frequency = new int[10]; // Array of size 10 for digits 0-9
        
        // Loop through digits array and count frequency
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }
        
        // Display results
        System.out.println("\n===== Digit Frequency Analysis =====");
        System.out.println("Number: " + number);
        System.out.print("Digits in the number: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        
        System.out.println("\n----- Frequency of Each Digit -----");
        boolean hasDigits = false;
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": appears " + frequency[i] + " time(s)");
                hasDigits = true;
            }
        }
        
        if (!hasDigits) {
            System.out.println("No digits found.");
        }
        
        // Display all frequencies (including zeros)
        System.out.println("\n----- Complete Frequency Table -----");
        System.out.println("Digit\tFrequency");
        System.out.println("-----\t---------");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + frequency[i]);
        }
        
        sc.close();
    }
}
