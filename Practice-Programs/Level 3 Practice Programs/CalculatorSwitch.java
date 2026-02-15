import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();
        
        double result;
        
        // Use switch...case to perform operations
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + first + " + " + second + " = " + result);
                break;
                
            case "-":
                result = first - second;
                System.out.println("Result: " + first + " - " + second + " = " + result);
                break;
                
            case "*":
                result = first * second;
                System.out.println("Result: " + first + " * " + second + " = " + result);
                break;
                
            case "/":
                if (second == 0) {
                    System.out.println("Error: Division by zero is not allowed");
                } else {
                    result = first / second;
                    System.out.println("Result: " + first + " / " + second + " = " + result);
                }
                break;
                
            default:
                System.out.println("Invalid Operator");
                break;
        }
        
        sc.close();
    }
}
