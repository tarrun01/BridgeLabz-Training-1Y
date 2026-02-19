import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first date  (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter the second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());

        System.out.println("\nDate 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println();

        if (date1.isBefore(date2)) {
            System.out.println("Result: Date 1 is BEFORE Date 2.");
        } else if (date1.isAfter(date2)) {
            System.out.println("Result: Date 1 is AFTER Date 2.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Result: Date 1 is the SAME as Date 2.");
        }

        scanner.close();
    }
}
