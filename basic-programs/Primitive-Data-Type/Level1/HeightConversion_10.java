//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Write a program that takes your height in centimeters and converts it into feet and inches
import java.util.*;
public class HeightConversion_10 {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Your Height in (cm):");
    double heightincm=sc.nextDouble();
    double heightinfeet=(heightincm*0.033);
    System.out.println("Your Height in cm is :"+heightincm+" While in feet is: "+heightinfeet+" and inches is :"+heightinfeet*12);
    sc.close();    
}    
}
