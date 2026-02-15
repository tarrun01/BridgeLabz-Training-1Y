import java.util.Scanner;

public class BMICalculatorMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of persons: ");
        int numPersons = sc.nextInt();
        
        // Create arrays to store data
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] weightStatus = new String[numPersons];
        
        // Take input for weight and height
        System.out.println("\nEnter weight and height for each person:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            weights[i] = sc.nextDouble();
            System.out.print("Height (in cm): ");
            heights[i] = sc.nextDouble();
        }
        
        // Calculate BMI and determine weight status
        for (int i = 0; i < numPersons; i++) {
            // Convert height from cm to meters
            double heightM = heights[i] / 100;
            
            // Calculate BMI
            bmis[i] = weights[i] / (heightM * heightM);
            
            // Determine weight status
            if (bmis[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 25.0) {
                weightStatus[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] < 40.0) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        // Display results
        System.out.println("\n===== BMI Report =====");
        System.out.println("\n------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-10s %-15s%n", "Person", "Height (cm)", "Weight (kg)", "BMI", "Status");
        System.out.println("------------------------------------------------------------------");
        
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10d %-15.2f %-15.2f %-10.2f %-15s%n", 
                (i + 1), heights[i], weights[i], bmis[i], weightStatus[i]);
        }
        System.out.println("------------------------------------------------------------------");
        
        sc.close();
    }
}
