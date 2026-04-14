package com.gla.JavaCollection.Others;
import java.util.*;

class Question {
    private int id;
    private String text;

    public Question(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public String toString() { return "Q" + id + ": " + text; }
}

class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() { return studentId; }

    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) return false;
        return this.studentId.equals(((Student) obj).studentId);
    }

    public int hashCode() { return Objects.hash(studentId); }
    public String toString() { return "Student[" + studentId + ", " + name + "]"; }
}

public class OnlineExamSystem {

    public static void main(String[] args) {
        List<Question> questionBank = new ArrayList<>();
        Set<String> enrolledIds = new HashSet<>();
        Queue<Student> examQueue = new LinkedList<>();
        Stack<Question> navigationStack = new Stack<>();

        questionBank.add(new Question(1, "What is OOP?"));
        questionBank.add(new Question(2, "Explain Generics in Java."));
        questionBank.add(new Question(3, "What is a HashSet?"));
        questionBank.add(new Question(4, "Difference between List and Set?"));

        Collections.shuffle(questionBank);
        System.out.println("Randomized Questions: " + questionBank);

        String[] ids = {"S101", "S102", "S101", "S103"};
        String[] names = {"Ravi", "Priya", "Ravi-Duplicate", "Sneha"};
        for (int i = 0; i < ids.length; i++) {
            if (enrolledIds.add(ids[i])) {
                examQueue.add(new Student(ids[i], names[i]));
                System.out.println("Enrolled: " + names[i]);
            } else {
                System.out.println("Duplicate ID rejected: " + ids[i]);
            }
        }

        System.out.println("\nServing Students:");
        while (!examQueue.isEmpty()) {
            Student s = examQueue.poll();
            System.out.println("Serving: " + s);

            for (Question q : questionBank) navigationStack.push(q);

            System.out.println("  Current Question: " + navigationStack.peek());
            navigationStack.pop();
            System.out.println("  Going back to: " + (navigationStack.isEmpty() ? "Start" : navigationStack.peek()));
        }
    }
}
