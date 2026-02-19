package college.student;

public class Student {
    private int rollNo;
    private String name;
    private String branch;
    private double cgpa;

    public Student(int rollNo, String name, String branch, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    public int getRollNo()      { return rollNo; }
    public String getName()     { return name; }
    public String getBranch()   { return branch; }
    public double getCgpa()     { return cgpa; }

    public void displayInfo() {
        System.out.printf("  [%03d] %-15s | Branch: %-20s | CGPA: %.1f%n",
                rollNo, name, branch, cgpa);
    }
}
