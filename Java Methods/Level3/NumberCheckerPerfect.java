import java.util.Scanner;

public class NumberCheckerPerfect {
    static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    static boolean isPerfect(int number) {
        return sumOfDivisors(number) == number;
    }

    static boolean isAbundant(int number) {
        return sumOfDivisors(number) > number;
    }

    static boolean isDeficient(int number) {
        return sumOfDivisors(number) < number;
    }

    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum = sum + (int) factorial(temp % 10);
            temp = temp / 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Is Perfect = " + isPerfect(number));
        System.out.println("Is Abundant = " + isAbundant(number));
        System.out.println("Is Deficient = " + isDeficient(number));
        System.out.println("Is Strong = " + isStrong(number));
        scanner.close();
    }
}
