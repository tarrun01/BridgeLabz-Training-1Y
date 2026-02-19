public class Course {
    private String courseName;
    private int durationWeeks;
    private String instructor;

    public Course(String courseName, int durationWeeks, String instructor) {
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
        this.instructor = instructor;
    }

    public String getCourseName() { return courseName; }
    public int getDurationWeeks() { return durationWeeks; }
    public String getInstructor() { return instructor; }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration   : " + durationWeeks + " weeks");
        System.out.println("Instructor : " + instructor);
    }
}
