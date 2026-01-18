//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c.

import java.util.Scanner;
     public class Doubleoperations_08 {
     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a:"); 
       double a = sc.nextDouble();
       
       System.out.print("Enter b:"); 
       double b = sc.nextDouble();

       System.out.print("Enter c:"); 
       double c = sc.nextDouble();
       System.out.println(String.format("The results of Int Operations are : %.2f  %.2f  %.2f and %.2f",(a+b*c),(a*b+c),(c+a/b),(a%b+c)));
       sc.close();
}
}

