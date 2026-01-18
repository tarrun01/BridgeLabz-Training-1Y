//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c.

import java.util.Scanner;
public class Intoperation_07 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a:"); 
       int a = sc.nextInt();
       
       System.out.print("Enter b:"); 
       int b = sc.nextInt();

       System.out.print("Enter c:"); 
       int c = sc.nextInt();
       System.out.println("The results of Int Operations are :"+(a+b*c)+" " +(a*b+c) +" "+ (c+a/b) +" and "+ (a%b+c));
       sc.close();
}
}