package com.gla.JavaCollection.Others;
import java.util.*;

class Student implements Comparable<Student> {
    private String studentId;
    private String name;
    private int marks;

    public Student(String studentId, String name, int marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public String getStudentId() { return studentId; }
    public int getMarks() { return marks; }

    public int compareTo(Student other) { return other.marks - this.marks; }

    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) return false;
        return this.studentId.equals(((Student) obj).studentId);
    }

    public int hashCode() { return Objects.hash(studentId); }
    public String toString() { return "Student[" + studentId + ", " + name + ", marks=" + marks + "]"; }
}

public class CollegeAdmissionSystem {

    public static void main(String[] args) {
        List<Student> allApplicants = new ArrayList<>();
        Set<Student> shortlisted = new HashSet<>();
        Queue<Student> interviewQueue = new LinkedList<>();
        TreeSet<Student> meritList = new TreeSet<>();

        allApplicants.add(new Student("S001", "Alice", 85));
        allApplicants.add(new Student("S002", "Bob", 60));
        allApplicants.add(new Student("S003", "Charlie", 92));
        allApplicants.add(new Student("S004", "Diana", 55));
        allApplicants.add(new Student("S005", "Eve", 78));

        System.out.println("All Applicants: " + allApplicants);

        System.out.println("\nShortlisting (marks >= 70):");
        for (Student s : allApplicants) {
            if (s.getMarks() >= 70) {
                shortlisted.add(s);
                interviewQueue.add(s);
                System.out.println("Shortlisted: " + s);
            }
        }

        System.out.println("\nConducting Interviews:");
        while (!interviewQueue.isEmpty()) {
            Student s = interviewQueue.poll();
            meritList.add(s);
            System.out.println("Interviewed: " + s);
        }

        System.out.println("\nFinal Merit List (sorted by marks):");
        for (Student s : meritList) System.out.println(s);
    }
}
