import java.util.Scanner;

public class Problem9_NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter array size: ");
            int size = scanner.nextInt();
            
            int[] array = new int[size];
            
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            
            System.out.print("Enter index to access: ");
            int index = scanner.nextInt();
            
            System.out.print("Enter divisor: ");
            int divisor = scanner.nextInt();
            
            // Outer try-catch for array access
            try {
                int element = array[index];
                
                // Inner try-catch for division
                try {
                    int result = element / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
            
        } finally {
            scanner.close();
        }
    }
}
