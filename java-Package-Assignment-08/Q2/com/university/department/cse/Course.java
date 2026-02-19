package com.university.department.cse;

public class Course {
    private String courseName;
    private String courseCode;
    private int credits;
    private String instructor;

    public Course(String courseName, String courseCode, int credits, String instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
        this.instructor = instructor;
    }

    public void printCourseDetails() {
        System.out.println("=== Course Details ===");
        System.out.println("Course Name   : " + courseName);
        System.out.println("Course Code   : " + courseCode);
        System.out.println("Credits       : " + credits);
        System.out.println("Instructor    : " + instructor);
    }
}
