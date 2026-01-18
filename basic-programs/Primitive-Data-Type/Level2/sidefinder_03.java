//Author-Tarun Kumar Sec-AT Program-Btech CSE
//Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-Write a program to find the side of the square whose parameter you read from user;

import java.util.Scanner;
public class sidefinder_03 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Parameter of Square:"); 
       double parameter = sc.nextDouble();
       System.out.println("The length of the Side is :"+(parameter/4)+" Whose parameter is :"+parameter);
       sc.close();
}
}
