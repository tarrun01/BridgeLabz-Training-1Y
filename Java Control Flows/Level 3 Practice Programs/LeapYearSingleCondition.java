import java.util.Scanner;

public class LeapYearSingleCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        // Check if year is valid (Gregorian calendar started in 1582)
        if (year < 1582) {
            System.out.println("Year must be >= 1582 (Gregorian calendar)");
            sc.close();
            return;
        }
        
        // Single if condition using logical operators
        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        
        if (isLeapYear) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
        
        sc.close();
    }
}
