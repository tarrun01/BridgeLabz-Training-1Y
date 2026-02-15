import java.util.Scanner;

public class MultiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Define integer array to store multiplication results from 6 to 9
        int[] multiplicationResult = new int[4]; // 4 elements for 6, 7, 8, 9
        
        // Using for loop, find multiplication from 6 to 9 and save in array
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }
        
        // Display the result from array
        System.out.println("\nMultiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
        
        sc.close();
    }
}
