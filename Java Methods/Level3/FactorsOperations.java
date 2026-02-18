import java.util.Scanner;

public class FactorsOperations {
    static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 2];
    }

    static int findSum(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum = sum + factors[i];
        }
        return sum;
    }

    static long findProduct(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product = product * factors[i];
        }
        return product;
    }

    static double findProductOfCubes(int[] factors) {
        double product = 1;
        for (int i = 0; i < factors.length; i++) {
            product = product * Math.pow(factors[i], 3);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        System.out.println("Greatest factor = " + findGreatestFactor(factors));
        System.out.println("Sum of factors = " + findSum(factors));
        System.out.println("Product of factors = " + findProduct(factors));
        System.out.println("Product of cubes of factors = " + findProductOfCubes(factors));
        scanner.close();
    }
}
