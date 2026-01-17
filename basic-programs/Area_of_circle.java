//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-A simple Program to find the Area of the circle
import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle:");
        int radius=sc.nextInt();
        System.out.printf("Area Of Circle is : %.2f%n",(Math.PI*radius*radius));
        sc.close();
    }
}