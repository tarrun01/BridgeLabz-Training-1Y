import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= School System with Different Roles =========\n");

        List<Person> people = new ArrayList<>();
        people.add(new Teacher("Mrs. Sunita Joshi", 42, "sunita@school.edu", "Mathematics", 18));
        people.add(new Teacher("Mr. Deepak Mishra", 35, "deepak@school.edu", "Physics", 10));
        people.add(new Student("Riya Kapoor", 16, "riya@school.edu", "10th Grade", 101, 9.2));
        people.add(new Student("Arjun Mehta", 15, "arjun@school.edu", "9th Grade", 204, 8.7));
        people.add(new Staff("Mr. Ramesh Gupta", 50, "ramesh@school.edu", "Admin Officer", "Administration"));

        for (Person person : people) {
            person.displayRole();
        }
    }
}
