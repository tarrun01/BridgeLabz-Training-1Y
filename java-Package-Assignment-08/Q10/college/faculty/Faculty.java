package college.faculty;

public class Faculty {
    private int facultyId;
    private String name;
    private String designation;
    private String specialization;

    public Faculty(int facultyId, String name, String designation, String specialization) {
        this.facultyId = facultyId;
        this.name = name;
        this.designation = designation;
        this.specialization = specialization;
    }

    public int getFacultyId()         { return facultyId; }
    public String getName()           { return name; }
    public String getDesignation()    { return designation; }
    public String getSpecialization() { return specialization; }

    public void displayInfo() {
        System.out.printf("  [F%02d] %-15s | %-20s | Specialization: %s%n",
                facultyId, name, designation, specialization);
    }
}
