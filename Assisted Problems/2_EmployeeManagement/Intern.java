public class Intern extends Employee {
    private String college;
    private int internshipDurationMonths;

    public Intern(int id, String name, double salary, String college, int internshipDurationMonths) {
        super(id, name, salary);
        this.college = college;
        this.internshipDurationMonths = internshipDurationMonths;
    }

    public String getCollege() { return college; }
    public int getInternshipDurationMonths() { return internshipDurationMonths; }

    @Override
    public void displayDetails() {
        System.out.println("--- Intern ---");
        super.displayDetails();
        System.out.println("College   : " + college);
        System.out.println("Duration  : " + internshipDurationMonths + " months");
        System.out.println();
    }
}
