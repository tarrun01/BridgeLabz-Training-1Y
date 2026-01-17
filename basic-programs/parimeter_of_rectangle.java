//Author-Tarun Kumar, Sec-AT, Program-Btech CSE, Roll no-63
//Created Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-A Simple Program to cfind the parimeter of rectangle
import java.util.Scanner;
public class parimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length :");
        double length=sc.nextDouble();

        System.out.println("Enter Width :");
        double width=sc.nextDouble();

        System.out.println("Parimeter of Recatangle is :"+ (2*(length + width)));   
        sc.close();//Sc object uses a system resource and should be closed otherwise system give us a warning Resource leak
    }
}
