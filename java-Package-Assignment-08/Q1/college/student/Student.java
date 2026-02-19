package college.student;

public class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayStudentName() {
        System.out.println("Student Name: " + name);
    }

    public void displayRollNumber() {
        System.out.println("Roll Number: " + rollNumber);
    }

    public void displayDetails() {
        displayStudentName();
        displayRollNumber();
    }
}
