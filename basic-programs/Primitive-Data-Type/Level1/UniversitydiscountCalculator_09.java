//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Write a new program similar to the program # 6 but take user input for Student Fee and University Discount

import java.util.Scanner;
public class UniversitydiscountCalculator_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter University Fee:");
        int fee=sc.nextInt();
        System.out.print("Enter Discount (%):"); 
        int discount=sc.nextInt();
        if (discount<=100) {
        int discountamount=(fee*discount)/100;
        System.out.println("The Discount Amount is INR :"+discountamount+" And Final Discounted fee is INR :"+(fee-discountamount));   
    }
        else{
        System.out.println("Maximun Discount should be 100 or less then 100 Try again!");
    }  
        sc.close();  
    }
}

