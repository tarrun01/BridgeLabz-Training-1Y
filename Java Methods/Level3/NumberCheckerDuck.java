import java.util.Scanner;

public class NumberCheckerDuck {
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

    static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }

    static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum = sum + (int) Math.pow(digits[i], power);
        }
        return sum == number;
    }

    static int[] findLargestSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        return new int[]{largest, secondLargest};
    }

    static int[] findSmallestSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] digits = storeDigits(number);
        System.out.println("Digit count = " + countDigits(number));
        System.out.println("Is Duck = " + isDuck(digits));
        System.out.println("Is Armstrong = " + isArmstrong(number, digits));
        int[] largestTwo = findLargestSecondLargest(digits);
        System.out.println("Largest digit = " + largestTwo[0] + ", Second largest = " + largestTwo[1]);
        int[] smallestTwo = findSmallestSecondSmallest(digits);
        System.out.println("Smallest digit = " + smallestTwo[0] + ", Second smallest = " + smallestTwo[1]);
        scanner.close();
    }
}
