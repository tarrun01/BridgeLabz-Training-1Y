public class Manager extends Employee {
    private int teamSize;
    private String department;

    public Manager(int id, String name, double salary, int teamSize, String department) {
        super(id, name, salary);
        this.teamSize = teamSize;
        this.department = department;
    }

    public int getTeamSize() { return teamSize; }
    public String getDepartment() { return department; }

    @Override
    public void displayDetails() {
        System.out.println("--- Manager ---");
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Team Size : " + teamSize);
        System.out.println();
    }
}
