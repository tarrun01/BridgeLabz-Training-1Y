import java.util.Scanner;

public class CheckFirstSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();
        System.out.print("Enter number3: ");
        int number3 = sc.nextInt();
        
       if(number1 <= number2 && number1 <= number3)
        System.out.println("The first number " + number1 + " is the smallest.");
        else
        System.out.println("The first number " + number1 + " is not the smallest.");
        
        sc.close();
    }
}
