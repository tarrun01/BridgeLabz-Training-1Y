import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for Amar
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = sc.nextDouble();
        
        // Input for Akbar
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = sc.nextDouble();
        
        // Input for Anthony
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = sc.nextDouble();
        
        // Find youngest friend
        String youngest;
        int minAge = amarAge;
        youngest = "Amar";
        
        if (akbarAge < minAge) {
            minAge = akbarAge;
            youngest = "Akbar";
        }
        
        if (anthonyAge < minAge) {
            minAge = anthonyAge;
            youngest = "Anthony";
        }
        
        // Find tallest friend
        String tallest;
        double maxHeight = amarHeight;
        tallest = "Amar";
        
        if (akbarHeight > maxHeight) {
            maxHeight = akbarHeight;
            tallest = "Akbar";
        }
        
        if (anthonyHeight > maxHeight) {
            maxHeight = anthonyHeight;
            tallest = "Anthony";
        }
        
        System.out.println("\nThe youngest friend is: " + youngest + " (Age: " + minAge + ")");
        System.out.println("The tallest friend is: " + tallest + " (Height: " + maxHeight + " cm)");
        
        sc.close();
    }
}
