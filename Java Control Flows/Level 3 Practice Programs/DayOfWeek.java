import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int d = sc.nextInt();

        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter year: ");
        int y = sc.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day of week (0=Sun, 1=Mon, 2=Tue, 3=Wed, 4=Thu, 5=Fri, 6=Sat): " + d0);

        sc.close();
    }
}