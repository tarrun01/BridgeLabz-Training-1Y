import java.util.Scanner;

public class NaturalSumWhile {
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
        
        // Using while loop
        int sumLoop = 0;
        int i = 1;
        while (i <= n) {
            sumLoop += i;
            i++;
        }
        
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Sum using while loop: " + sumLoop);
        System.out.println("Both results match: " + (sumFormula == sumLoop));
        
        sc.close();
    }
}
