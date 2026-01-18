//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Write a program that takes the base and height to find area of a triangle in square inches and square centimeters

import java.util.Scanner;
public class AreaofTriangle_02 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Base of Triangle in inches:"); 
       double Base = sc.nextDouble();
       System.out.print("Enter Height of Triangle in inches:"); 
       double height = sc.nextDouble();
       
       double area=0.5*Base*height;
       System.out.println("Area of Triangle in sq inches is:"+area+" And Area of Triangle in sq cm is :"+(area*6.4516));
    sc.close();
    }
}
