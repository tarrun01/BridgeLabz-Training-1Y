//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Write a program to create a basic calculator that can perform addition, subtraction,multiplication, and division.
import java.util.Scanner;
public class Arthimaticoperations_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no 1 and no 2 :");
        double a=sc.nextDouble(),b=sc.nextDouble();
        System.out.println("The Addition of these no are:"+(a+b)+" Sub is:"+(a-b)+" Multipilication is:"+(a*b)+" Division is:"+(a/b));
    sc.close();
    }
}
