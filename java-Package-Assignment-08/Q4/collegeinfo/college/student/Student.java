package college.student;

public class Student {
    private String name;
    private int rollNumber;
    private String branch;

    public Student(String name, int rollNumber, String branch) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
    }

    public String getName()        { return name; }
    public int getRollNumber()     { return rollNumber; }
    public String getBranch()      { return branch; }

    public void displayInfo() {
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Branch      : " + branch);
    }
}
