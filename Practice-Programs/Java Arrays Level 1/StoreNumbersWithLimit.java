import java.util.Scanner;

public class StoreNumbersWithLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create array of 10 elements
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        
        System.out.println("Enter numbers (0 or negative to stop, max 10 numbers):");
        
        // Use infinite while loop
        while (true) {
            System.out.print("Enter number: ");
            double userInput = sc.nextDouble();
            
            // Check if user entered 0 or negative number
            if (userInput <= 0) {
                System.out.println("Stopping input (0 or negative number entered)");
                break;
            }
            
            // Check if array is full
            if (index == 10) {
                System.out.println("Maximum 10 numbers reached");
                break;
            }
            
            // Store number in array and increment index
            numbers[index] = userInput;
            index++;
        }
        
        // Calculate total from array elements
        System.out.println("\n===== Numbers entered =====");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
            total += numbers[i];
        }
        
        // Display total
        System.out.println("\nTotal sum: " + total);
        
        sc.close();
    }
}
