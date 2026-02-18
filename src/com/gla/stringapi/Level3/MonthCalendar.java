package com.gla.stringapi.Level3;

import java.util.Scanner;

public class MonthCalendar {

    // Get name of the month
    static String monthName(int m) {
        String[] months = {"January","February","March","April","May","June",
                           "July","August","September","October","November","December"};
        return months[m - 1];
    }

    // Check if a year is a leap year
    static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    // Get number of days in a month
    static int daysInMonth(int m, int y) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m == 2 && isLeapYear(y)) return 29;
        return days[m - 1];
    }

    // Gregorian algorithm: returns 0=Sun, 1=Mon, ..., 6=Sat
    static int firstDay(int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x  = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (1 + x + 31 * m0 / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and year (e.g. 7 2005): ");
        int m = sc.nextInt();
        int y = sc.nextInt();

        // Print header
        System.out.println("\n   " + monthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Indent to first day
        int start = firstDay(m, y);
        for (int i = 0; i < start; i++) System.out.print("    ");

        // Print days, move to next line after Saturday
        for (int day = 1; day <= daysInMonth(m, y); day++) {
            System.out.printf("%3d ", day);
            if ((start + day) % 7 == 0) System.out.println();
        }
        System.out.println();
        sc.close();
    }
}
