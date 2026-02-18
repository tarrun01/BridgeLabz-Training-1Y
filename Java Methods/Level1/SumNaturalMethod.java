import java.util.Scanner;

public class SumNaturalMethod {
    static int sumNatural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.println("Sum of " + n + " natural numbers = " + sumNatural(n));
        } else {
            System.out.println("Please enter a natural number.");
        }
        scanner.close();
    }
}
