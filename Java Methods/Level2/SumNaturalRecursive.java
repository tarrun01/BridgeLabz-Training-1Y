import java.util.Scanner;

public class SumNaturalRecursive {
    static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n > 0) {
            int recursive = sumRecursive(n);
            int formula = sumFormula(n);
            System.out.println("Sum using recursion = " + recursive);
            System.out.println("Sum using formula = " + formula);
            System.out.println("Both results are equal: " + (recursive == formula));
        } else {
            System.out.println("Please enter a natural number.");
        }
        scanner.close();
    }
}
