import java.util.Scanner;

public class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        
        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers");
            sc.close();
            return;
        }
        
        long result = 1;
        int counter = 0;
        
        while (counter < power) {
            result *= number;
            counter++;
        }
        
        System.out.println(number + " raised to the power " + power + " is: " + result);
        
        sc.close();
    }
}
