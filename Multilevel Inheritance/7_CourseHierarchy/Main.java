public class Main {
    public static void main(String[] args) {
        System.out.println("========= Educational Course Hierarchy =========\n");

        PaidOnlineCourse course1 = new PaidOnlineCourse(
            "Java Full Stack Development", 12, "Ankit Sharma",
            "Udemy", true, 4999, 20
        );

        PaidOnlineCourse course2 = new PaidOnlineCourse(
            "Data Science with Python", 16, "Dr. Priya Rao",
            "Coursera", true, 8999, 35
        );

        PaidOnlineCourse course3 = new PaidOnlineCourse(
            "AWS Cloud Practitioner", 8, "Rahul Mehta",
            "LinkedIn Learning", false, 3999, 10
        );

        course1.displayDetails();
        course2.displayDetails();
        course3.displayDetails();
    }
}
