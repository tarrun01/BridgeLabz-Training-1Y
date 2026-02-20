import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number");
            sc.close();
            return;
        }
        
        // Using formula
        int sumFormula = n * (n + 1) / 2;
        
        // Using for loop
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }
        
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Sum using for loop: " + sumLoop);
        System.out.println("Both results match: " + (sumFormula == sumLoop));
        
        sc.close();
    }
}
