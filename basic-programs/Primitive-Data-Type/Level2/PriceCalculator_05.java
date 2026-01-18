//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Write a program to input the unit price of an item and the quantity to be bought. Then calculate the total price.
import java.util.Scanner;

public class PriceCalculator_05 {
     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Price per unit:"); 
       double unitprice = sc.nextDouble();
       System.out.print("Enter Qty of unit:"); 
       int Qty = sc.nextInt();
       
       System.out.println("The Total Purchase Price is :"+unitprice*Qty+" if the qty is :"+Qty+" and unit price is :"+unitprice);
       sc.close();
}
}
