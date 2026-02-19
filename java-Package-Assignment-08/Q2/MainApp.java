import com.university.department.cse.Course;

/**
 * Q2 – Package Hierarchy Demo
 *
 * Folder structure;
 *
 * Q2/
 * ├── MainApp.java                              (default package)
 * └── com/
 *     └── university/
 *         └── department/
 *             └── cse/
 *                 └── Course.java
 *
 */
public class MainApp {
    public static void main(String[] args) {
        Course c1 = new Course("Object Oriented Programming", "CSE201", 4, "Kajal Wankhede");
        c1.printCourseDetails();

        System.out.println();

        Course c2 = new Course("Database Systems", "CSE301", 3, "Prof. Grace Hopper");
        c2.printCourseDetails();
    }
}
