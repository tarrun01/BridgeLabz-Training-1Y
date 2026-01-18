//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Write a program the find the distance in yards and miles for the distance provided by user in feets

import java.util.Scanner;
public class Feettoyardsconverter_14 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Distance in feet:"); 
       double distance = sc.nextDouble();
       double yards=(distance/3);
       System.out.println("The length in yards is :"+yards+" And in miles is :"+yards/1760);
       sc.close();
}
}
