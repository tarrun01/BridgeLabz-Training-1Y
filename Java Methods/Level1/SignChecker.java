import java.util.Scanner;

public class SignChecker {
    static int checkSign(int number) {
        if (number < 0) {
            return -1;
        } else if (number > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int result = checkSign(number);
        if (result == 1) {
            System.out.println(number + " is positive");
        } else if (result == -1) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is zero");
        }
        scanner.close();
    }
}
