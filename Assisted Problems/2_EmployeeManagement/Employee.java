public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void displayDetails() {
        System.out.println("ID    : " + id);
        System.out.println("Name  : " + name);
        System.out.println("Salary: ₹" + salary);
    }
}
