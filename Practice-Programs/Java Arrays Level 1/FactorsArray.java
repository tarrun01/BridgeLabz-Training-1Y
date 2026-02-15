import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
            sc.close();
            return;
        }
        
        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        
        // Find factors and store in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if array needs to be resized
                if (index == maxFactor) {
                    // Reset maxFactor to twice its size
                    maxFactor = maxFactor * 2;
                    
                    // Create temp array and copy elements
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    
                    // Assign temp array to factors array
                    factors = temp;
                }
                
                // Add factor to array
                factors[index] = i;
                index++;
            }
        }
        
        // Display the factors
        System.out.println("\nFactors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        System.out.println("Total number of factors: " + index);
        
        sc.close();
    }
}
