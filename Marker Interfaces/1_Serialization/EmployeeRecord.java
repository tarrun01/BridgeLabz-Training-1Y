public class EmployeeRecord implements Backupable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String department;

    public EmployeeRecord(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "EmployeeRecord{id=" + id + ", name='" + name + "', department='" + department + "'}";
    }
}
