import college.student.Student;

/**
 * Q4 – Modular Programming (Java 9+)
 *
 * HOW TO COMPILE AND RUN:
 * ─────────────────────────────────────────────────────────────────
 * From Q4/ directory:
 *
 * Step 1 – Compile collegeinfo module:
 *   javac -d mods/collegeinfo collegeinfo/module-info.java collegeinfo/college/student/Student.java
 *
 * Step 2 – Compile app module:
 *   javac --module-path mods -d mods/app app/module-info.java app/MainApp.java
 *
 * Step 3 – Run:
 *   java --module-path mods -m app/MainApp
 * ─────────────────────────────────────────────────────────────────
 *
 * PACKAGES vs MODULES:
 *   Package  → logical grouping of related classes within a single codebase.
 *               Controlled by the 'package' keyword and directory structure.
 *   Module   → higher-level grouping introduced in Java 9. A module contains
 *               one or more packages and declares dependencies and exports
 *               explicitly via module-info.java. Modules enforce strong
 *               encapsulation at the JVM level, which packages alone cannot do.
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Modular Application Demo ===\n");

        Student s1 = new Student("Tarun Kumar", 63, "CSE");
        s1.displayInfo();

        System.out.println();

        Student s2 = new Student("Shivam Singh", 58, "CSE");
        s2.displayInfo();
    }
}
