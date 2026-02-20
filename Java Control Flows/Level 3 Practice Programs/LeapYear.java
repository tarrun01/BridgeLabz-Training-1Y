import java.util.Scanner;

public class LeapYear {
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
        
        boolean isLeapYear = false;
        
        // Method 1: Multiple if-else statements
        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
            isLeapYear = false;
        } else if (year % 4 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
        
        if (isLeapYear) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
        
        sc.close();
    }
}
