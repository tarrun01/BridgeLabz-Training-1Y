import java.util.Scanner;

public class TemperatureConverter {

    static Scanner scanner = new Scanner(System.in);

    // Convert Fahrenheit to Celsius
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // Convert Celsius to Fahrenheit
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    // Take a temperature value from the user
    static double takeTemperatureInput(String unit) {
        System.out.print("Enter temperature in " + unit + ": ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input! Enter a numeric temperature: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    // Take menu choice from the user
    static int takeChoice() {
        System.out.println("\nChoose conversion:");
        System.out.println("  1. Fahrenheit  →  Celsius");
        System.out.println("  2. Celsius     →  Fahrenheit");
        System.out.print("Enter choice (1 or 2): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid! Enter 1 or 2: ");
            scanner.next();
        }
        int choice = scanner.nextInt();
        if (choice != 1 && choice != 2) {
            System.out.print("Invalid! Enter 1 or 2: ");
            return takeChoice();
        }
        return choice;
    }

    // Display the conversion result
    static void displayResult(double input, double output, String fromUnit, String toUnit) {
        System.out.printf("\n%.2f° %s  =  %.2f° %s%n", input, fromUnit, output, toUnit);
    }

    public static void main(String[] args) {
        System.out.println("=== Temperature Converter ===");

        int choice = takeChoice();

        if (choice == 1) {
            double fahrenheit = takeTemperatureInput("Fahrenheit");
            double celsius = fahrenheitToCelsius(fahrenheit);
            displayResult(fahrenheit, celsius, "F", "C");
        } else {
            double celsius = takeTemperatureInput("Celsius");
            double fahrenheit = celsiusToFahrenheit(celsius);
            displayResult(celsius, fahrenheit, "C", "F");
        }

        scanner.close();
    }
}
