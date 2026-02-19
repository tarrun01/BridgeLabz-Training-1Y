import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Employee Management System =========\n");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Manager(1, "Rajesh Kumar", 120000, 10, "Engineering"));
        employees.add(new Developer(2, "Priya Sharma", 90000, "Java", "Senior"));
        employees.add(new Developer(3, "Anil Verma", 70000, "Python", "Mid-Level"));
        employees.add(new Intern(4, "Sneha Patel", 15000, "IIT Bombay", 6));

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
