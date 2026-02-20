import java.util.Scanner;

public class CheckLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();
        System.out.print("Enter number3: ");
        int number3 = sc.nextInt();
        
        boolean firstLargest = (number1 >= number2 && number1 >= number3);
        boolean secondLargest = (number2 >= number1 && number2 >= number3);
        boolean thirdLargest = (number3 >= number1 && number3 >= number2);
        
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);
        
        sc.close();
    }
}
