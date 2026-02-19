import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Student Details ===");
        Student s = new Student("Tarun Kumar", 63, "CSE");
        s.displayDetails();

        System.out.println("\n=== Faculty Details ===");
        Faculty f = new Faculty("Udayveer Singh", "Data Structures");
        f.displayDetails();
    }
}
