import java.util.Scanner;

public class FriendlyPair {
    static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);

        if (sum1 == num2 && sum2 == num1) {
            System.out.println("Yes, Friendly Pair");
        } else{
            System.out.println("No,This is Not a Friendly Pair");
        }
        sc.close();
    }
}
