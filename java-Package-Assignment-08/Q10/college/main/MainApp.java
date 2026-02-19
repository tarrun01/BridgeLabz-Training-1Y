package college.main;

import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;
import static java.lang.Math.*;

/**
 * Q10 – Mini Project: College Management System
 *
 * HOW PACKAGES HELPED ORGANISE THIS PROJECT:
 *   1. Separation of concerns – Student, Faculty, and Department logic are
 *      fully isolated in their own packages; changes in one don't affect others.
 *   2. Readability – The package names (college.student, college.faculty …)
 *      immediately convey the responsibility of each file.
 *   3. Encapsulation – Each class exposes only what other packages need via
 *      public getters/setters; internal details remain hidden.
 *   4. Reusability – Any future module (e.g., college.exam) can import only
 *      the packages it needs without pulling in unrelated code.
 *   5. Namespace management – Two classes could share the same name (e.g.,
 *      'Report') across different packages without conflict.
 *
 * Folder structure:
 * Q10/
 * ├── college/
 * │   ├── student/Student.java
 * │   ├── faculty/Faculty.java
 * │   ├── department/Department.java
 * │   └── main/MainApp.java
 *
 * Compile (from Q10/):
 *   javac college/student/Student.java
 *   javac college/faculty/Faculty.java
 *   javac college/department/Department.java
 *   javac college/main/MainApp.java
 *
 * Run:
 *   java college.main.MainApp
 */
public class MainApp {

    static void printSeparator(char ch, int len) {
        System.out.println(String.valueOf(ch).repeat(len));
    }

    public static void main(String[] args) {

        // ── Departments ──────────────────────────────────────────
        Department[] departments = {
            new Department("CSE", "Computer Science & Engineering",  120, "Dr. Ada Lovelace"),
            new Department("ECE", "Electronics & Communication",      90, "Dr. Nikola Tesla"),
            new Department("ME",  "Mechanical Engineering",           60, "Dr. James Watt"),
        };

        // ── Faculty ───────────────────────────────────────────────
        Faculty[] faculties = {
            new Faculty(1, "Dr. Alan Turing",   "Professor",        "Algorithms"),
            new Faculty(2, "Prof. Grace Hopper","Assoc. Professor", "Compilers"),
            new Faculty(3, "Dr. Dennis Ritchie","Asst. Professor",  "C Programming"),
        };

        // ── Students ──────────────────────────────────────────────
        Student[] students = {
            new Student(101, "Alice",   "CSE", 9.1),
            new Student(102, "Bob",     "ECE", 8.4),
            new Student(103, "Charlie", "ME",  7.8),
            new Student(104, "Diana",   "CSE", 9.5),
        };

        // ── Display ───────────────────────────────────────────────
        printSeparator('═', 65);
        System.out.println("          COLLEGE MANAGEMENT SYSTEM – FULL REPORT");
        printSeparator('═', 65);

        System.out.println("\n📚 DEPARTMENTS");
        printSeparator('─', 65);
        for (Department d : departments) d.displayInfo();

        System.out.println("\n🎓 FACULTY");
        printSeparator('─', 65);
        for (Faculty f : faculties) f.displayInfo();

        System.out.println("\n👩‍🎓 STUDENTS");
        printSeparator('─', 65);
        for (Student s : students) s.displayInfo();

        // Static import demo – compute highest CGPA using Math.max
        double maxCgpa = students[0].getCgpa();
        for (Student s : students) maxCgpa = max(maxCgpa, s.getCgpa());
        System.out.printf("%n📊 Highest CGPA (using static Math.max): %.1f%n", maxCgpa);

        // Hypotenuse demo using static import
        double hyp = hypot(3, 4);
        System.out.printf("📐 Sample hypot(3,4) via static import: %.1f%n", hyp);

        printSeparator('═', 65);
        System.out.println("  Report generated successfully.");
        printSeparator('═', 65);
    }
}
