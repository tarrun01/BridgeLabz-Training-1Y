//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. 
// Write a program to find the discounted amount and discounted price the student will pay for the course

public class Discountcalculator_06 {
   public static void main(String[] args) {
    int fee=125000,discount=10,discountamount=(fee*discount)/100;
    System.out.println("The Discount Amount is INR :"+discountamount+" And Final Discounted fee is INR :"+(fee-discountamount));
   } 
}
