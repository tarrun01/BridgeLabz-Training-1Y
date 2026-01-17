//Author-Tarun Kumar, Sec-AT, Program-Btech CSE, Roll no-63
//Created Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-A Simple Program to find power of given no.
import java.util.Scanner;
public class Power_Calculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.print("Enter base: ");
            double base = sc.nextDouble();

            System.out.print("Enter exponent: ");
            int exponent = sc.nextInt();

            double result = Math.pow(base, exponent);

            System.out.printf("Result :%.2f%n",result);
            sc.close();
        }
    }

