package com.gla.GenericProblemStatements;
import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String typeName;

    public CourseType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam-Based");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment-Based");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse() {
        super("Research-Based");
    }
}

class Course<T extends CourseType> {
    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getCourseName() { return courseName; }
    public T getCourseType() { return courseType; }

    public String toString() {
        return courseName + " [" + courseType.getTypeName() + "]";
    }
}

public class UniversityCourseManagement {

    public static void displayCourses(List<? extends Course<? extends CourseType>> courses) {
        for (Course<? extends CourseType> c : courses) {
            System.out.println("Course: " + c);
        }
    }

    public static void main(String[] args) {
        List<Course<ExamCourse>> examCourses = new ArrayList<>();
        examCourses.add(new Course<>("Mathematics", new ExamCourse()));
        examCourses.add(new Course<>("Physics", new ExamCourse()));

        List<Course<AssignmentCourse>> assignmentCourses = new ArrayList<>();
        assignmentCourses.add(new Course<>("English Literature", new AssignmentCourse()));

        List<Course<ResearchCourse>> researchCourses = new ArrayList<>();
        researchCourses.add(new Course<>("AI Research", new ResearchCourse()));

        System.out.println("Exam Courses:");
        displayCourses(examCourses);

        System.out.println("Assignment Courses:");
        displayCourses(assignmentCourses);

        System.out.println("Research Courses:");
        displayCourses(researchCourses);
    }
}
