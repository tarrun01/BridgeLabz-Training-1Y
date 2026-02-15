import java.util.Scanner;

public class StudentVotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define array of 10 integer elements
        int[] ages = new int[10];
        
        // Take user input for student ages
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = sc.nextInt();
        }
        
        System.out.println("\n===== Voting Eligibility Results =====");
        
        // Loop through array and check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + ": The student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + ": The student with age " + ages[i] + " cannot vote.");
            }
        }
        
        sc.close();
    }
}
