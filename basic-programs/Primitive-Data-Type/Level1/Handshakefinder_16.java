//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Create a program to find the maximum number of handshakes among N number of students.
import java.util.Scanner;

public class Handshakefinder_16 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter No. of Students:"); 
       int N = sc.nextInt();
       int handshakes=(N*(N-1))/2;
       System.out.println("Total no of poosible Handshakes is:"+handshakes);
       sc.close();
}
}