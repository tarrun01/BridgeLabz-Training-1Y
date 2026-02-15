import java.util.Scanner;

public class CheckDivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if(number % 5 == 0){
        System.out.println(number + " is divisible by 5.");
        }
        else{
        System.out.println(number + " is not divisible by 5.");
        }
        sc.close();
    }
}