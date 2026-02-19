public class Staff extends Person {
    private String designation;
    private String department;

    public Staff(String name, int age, String email, String designation, String department) {
        super(name, age, email);
        this.designation = designation;
        this.department = department;
    }

    public String getDesignation() { return designation; }
    public String getDepartment() { return department; }

    @Override
    public void displayRole() {
        System.out.println("--- Staff ---");
        super.displayRole();
        System.out.println("Designation: " + designation);
        System.out.println("Department : " + department);
        System.out.println();
    }
}
