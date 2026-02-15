import java.util.Scanner;

public class LargestSecondLargestDigitDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        
        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }
        
        // Define array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        
        // Variable to reflect array index
        int index = 0;
        long originalNumber = number;
        
        // Loop to store digits in array
        while (number != 0) {
            // Check if array needs to be resized
            if (index == maxDigit) {
                // Increase maxDigit by 10
                maxDigit += 10;
                
                // Create temp array of new size
                int[] temp = new int[maxDigit];
                
                // Copy elements from current digits array to temp
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                
                // Assign temp array to digits array
                digits = temp;
                
                System.out.println("Array resized to accommodate more digits...");
            }
            
            // Remove last digit and add to array
            int digit = (int)(number % 10);
            digits[index] = digit;
            index++;
            
            // Remove last digit from number
            number = number / 10;
        }
        
        // Handle zero case
        if (index == 0) {
            System.out.println("The number is 0");
            sc.close();
            return;
        }
        
        // Find largest and second largest digit
        int largest = 0;
        int secondLargest = 0;
        
        // Loop through array to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        // Display results
        System.out.println("\n===== Results =====");
        System.out.println("Original number: " + originalNumber);
        System.out.println("Total digits stored: " + index);
        System.out.print("Digits stored: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        System.out.println("Largest digit: " + largest);
        
        if (secondLargest > 0 || (secondLargest == 0 && largest > 0)) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit: Not found (all digits are the same)");
        }
        
        sc.close();
    }
}
