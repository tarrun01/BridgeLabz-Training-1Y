import java.util.Scanner;

public class NumberCheckerHarshad {
    static int countDigits(int number) {
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        return count;
    }

    static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        return digits;
    }

    static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum = sum + digits[i];
        }
        return sum;
    }

    static double sumOfSquares(int[] digits) {
        double sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum = sum + Math.pow(digits[i], 2);
        }
        return sum;
    }

    static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[digits.length][2];
        boolean[] counted = new boolean[digits.length];
        int count = 0;
        for (int i = 0; i < digits.length; i++) {
            if (!counted[i]) {
                int frequency = 1;
                for (int j = i + 1; j < digits.length; j++) {
                    if (digits[j] == digits[i]) {
                        frequency++;
                        counted[j] = true;
                    }
                }
                freq[count][0] = digits[i];
                freq[count][1] = frequency;
                count++;
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] digits = storeDigits(number);
        System.out.println("Sum of digits = " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits = " + sumOfSquares(digits));
        System.out.println("Is Harshad = " + isHarshad(number, digits));
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " : " + freq[i][1]);
            }
        }
        scanner.close();
    }
}
