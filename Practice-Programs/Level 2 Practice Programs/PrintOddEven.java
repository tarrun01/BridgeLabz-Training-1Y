import java.util.Scanner;

public class PrintOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a natural number (positive integer)");
            sc.close();
            return;
        }
        
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            } else {
                System.out.println(i + " is an odd number");
            }
        }
        
        sc.close();
    }
}
