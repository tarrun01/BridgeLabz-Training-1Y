import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();
        
        // Convert height from cm to meters
        double heightM = heightCm / 100;
        
        // Calculate BMI using formula: BMI = weight / (height * height)
        double bmi = weight / (heightM * heightM);
        
        // Determine weight status
        String status;
        
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25.0) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi < 40.0) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        // Display results
        System.out.println("\n===== BMI Results =====");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + heightCm + " cm (" + heightM + " m)");
        System.out.println("BMI: " + String.format("%.2f", bmi) + " kg/m²");
        System.out.println("Status: " + status);
        
        sc.close();
    }
}
