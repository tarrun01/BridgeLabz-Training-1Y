import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Alice Johnson", 50000, 8000);
        emp1.assignDepartment("Engineering");

        FullTimeEmployee emp2 = new FullTimeEmployee(102, "Bob Smith", 45000, 5000);
        emp2.assignDepartment("Marketing");

        PartTimeEmployee emp3 = new PartTimeEmployee(103, "Carol White", 0, 80, 200);
        emp3.assignDepartment("Support");

        PartTimeEmployee emp4 = new PartTimeEmployee(104, "David Brown", 0, 60, 150);
        emp4.assignDepartment("Design");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        System.out.println("========= Employee Management System =========\n");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
