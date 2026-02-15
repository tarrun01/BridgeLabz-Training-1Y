import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double total = 0.0;
        
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double userInput = sc.nextDouble();
            
            if (userInput <= 0) {
                break;
            }
            
            total += userInput;
        }
        
        System.out.println("Total sum: " + total);
        
        sc.close();
    }
}
