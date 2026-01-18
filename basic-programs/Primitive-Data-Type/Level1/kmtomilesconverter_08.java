//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Create a program to convert distance in kilometers to miles;

import java.util.Scanner;
public class kmtomilesconverter_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter distance in kilometers: ");
            double km = sc.nextDouble();

            double miles = km * 0.621371;

            System.out.printf("The total miles is: %.3f mile for the given %.2f km %n",miles,km);
            sc.close();
    }
}
