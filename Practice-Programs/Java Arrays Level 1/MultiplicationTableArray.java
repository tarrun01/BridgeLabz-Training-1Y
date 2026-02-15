import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Define integer array to store multiplication results from 1 to 10
        int[] multiplicationTable = new int[10];
        
        // Run loop from 1 to 10 and store results in array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }
        
        // Display the results from array
        System.out.println("\nMultiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }
        
        sc.close();
    }
}
