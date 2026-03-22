import java.util.Scanner;

public class Problem4_MultipleCatchBlocks {
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
            
            System.out.print("Enter index to retrieve: ");
            int index = scanner.nextInt();
            
            System.out.println("Value at index " + index + ": " + array[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } finally {
            scanner.close();
        }
    }
}
