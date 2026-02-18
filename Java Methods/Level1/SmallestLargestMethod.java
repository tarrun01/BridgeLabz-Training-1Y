import java.util.Scanner;

public class SmallestLargestMethod {
    static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int n3 = scanner.nextInt();
        int[] result = findSmallestAndLargest(n1, n2, n3);
        System.out.println("Smallest = " + result[0]);
        System.out.println("Largest = " + result[1]);
        scanner.close();
    }
}
