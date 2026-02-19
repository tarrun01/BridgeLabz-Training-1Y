package college.department;

public class Department {
    private String deptCode;
    private String deptName;
    private int totalSeats;
    private String hodName;

    public Department(String deptCode, String deptName, int totalSeats, String hodName) {
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.totalSeats = totalSeats;
        this.hodName = hodName;
    }

    public String getDeptCode()  { return deptCode; }
    public String getDeptName()  { return deptName; }
    public int getTotalSeats()   { return totalSeats; }
    public String getHodName()   { return hodName; }

    public void displayInfo() {
        System.out.printf("  [%s] %-25s | Seats: %3d | HoD: %s%n",
                deptCode, deptName, totalSeats, hodName);
    }
}
