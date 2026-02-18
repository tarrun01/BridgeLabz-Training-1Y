import java.util.Scanner;

public class Student {
    String name;
    int rollNumber;
    double marks;

    String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter name: ");
        student.name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        student.rollNumber = scanner.nextInt();
        System.out.print("Enter marks: ");
        student.marks = scanner.nextDouble();
        student.displayDetails();
        scanner.close();
    }
}
