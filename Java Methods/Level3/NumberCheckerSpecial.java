import java.util.Scanner;

public class NumberCheckerSpecial {
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        int temp = square;
        while (temp != 0) {
            sum = sum + temp % 10;
            temp = temp / 10;
        }
        return sum == number;
    }

    static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }
        return sum == product;
    }

    static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String sqStr = String.valueOf(square);
        return sqStr.endsWith(numStr);
    }

    static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Is Prime = " + isPrime(number));
        System.out.println("Is Neon = " + isNeon(number));
        System.out.println("Is Spy = " + isSpy(number));
        System.out.println("Is Automorphic = " + isAutomorphic(number));
        System.out.println("Is Buzz = " + isBuzz(number));
        scanner.close();
    }
}
