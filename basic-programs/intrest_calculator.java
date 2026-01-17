//Author-Tarun Kumar, Sec-AT, Program-Btech CSE, Roll no-63
//Created Date-18/01/2026; Last Edited Date-18/01/2026
//Purpose-A Simple Program to find interast
import java.util.Scanner;
public class intrest_calculator {
   public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal :");
        float Principal=sc.nextFloat();

        System.out.println("Enter Rate Of Interest(%) :");
        float Rate=sc.nextFloat();

        System.out.println("Enter Time(Years) :");
        float Time=sc.nextFloat();

        System.out.println("Your Total Interest is : "+(Principal*Rate*Time));
        sc.close();
    }
} 
//Note-If we use Math.PI fn of java we can first convert float to double or we can dirctly take input in double
//Here we can use Float as well as Double