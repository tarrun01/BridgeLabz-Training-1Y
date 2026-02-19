import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        LocalDate date = LocalDate.parse(input);
        System.out.println("Original Date         : " + date);

        // Add 7 days
        date = date.plusDays(7);
        System.out.println("After +7 Days         : " + date);

        // Add 1 month
        date = date.plusMonths(1);
        System.out.println("After +1 Month        : " + date);

        // Add 2 years
        date = date.plusYears(2);
        System.out.println("After +2 Years        : " + date);

        // Subtract 3 weeks
        date = date.minusWeeks(3);
        System.out.println("After -3 Weeks (Final): " + date);

        scanner.close();
    }
}
