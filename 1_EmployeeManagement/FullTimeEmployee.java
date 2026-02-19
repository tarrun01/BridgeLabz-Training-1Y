public class FullTimeEmployee extends Employee implements Department {
    private double bonus;
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + (department != null ? department : "Not Assigned");
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Full Time Employee ---");
        super.displayDetails();
        System.out.println("Bonus       : " + bonus);
        System.out.println(getDepartmentDetails());
        System.out.println();
    }
}
