public class Student extends Person {
    private String grade;
    private int rollNumber;
    private double gpa;

    public Student(String name, int age, String email, String grade, int rollNumber, double gpa) {
        super(name, age, email);
        this.grade = grade;
        this.rollNumber = rollNumber;
        this.gpa = gpa;
    }

    public String getGrade() { return grade; }
    public int getRollNumber() { return rollNumber; }
    public double getGpa() { return gpa; }

    @Override
    public void displayRole() {
        System.out.println("--- Student ---");
        super.displayRole();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade      : " + grade);
        System.out.println("GPA        : " + gpa);
        System.out.println();
    }
}
