import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
            sc.close();
            return;
        }
        
        int greatestFactor = 1;
        int counter = number - 1;
        
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        
        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);
        
        sc.close();
    }
}
