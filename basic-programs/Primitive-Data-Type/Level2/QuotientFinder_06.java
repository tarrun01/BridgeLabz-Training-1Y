//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Write a program to take 2 numbers and print their quotient and reminder

import java.util.Scanner;
public class QuotientFinder_06 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter No. 1:"); 
       int no1 = sc.nextInt();
       
       System.out.print("Enter No. 2:"); 
       int no2 = sc.nextInt();
       System.out.println("The Quotient is :"+no1/no2+" And the reminder is :"+no1%no2);
       sc.close();
}
}