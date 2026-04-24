package com.gla.jdbc;

import java.sql.*;

public class OnlineCourseEnrollmentSystem {

    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        createTable(con);
        addEnrollment(con, 1, "Alice", "Java");
        addEnrollment(con, 2, "Bob", "Python");
        addEnrollment(con, 3, "Charlie", "Java");
        displayByCourse(con, "Java");
        changeCourse(con, 2, "Java");
        deleteEnrollment(con, 3);

        con.close();
    }

    static void createTable(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS enrollments (id INT, student VARCHAR(50), course VARCHAR(50))";
        con.createStatement().executeUpdate(sql);
        System.out.println("Table created.");
    }

    static void addEnrollment(Connection con, int id, String student, String course) throws SQLException {
        String sql = "INSERT INTO enrollments VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, student);
        ps.setString(3, course);
        ps.executeUpdate();
        System.out.println("Enrollment added: " + student + " -> " + course);
    }

    static void displayByCourse(Connection con, String course) throws SQLException {
        String sql = "SELECT * FROM enrollments WHERE course = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, course);
        ResultSet rs = ps.executeQuery();
        System.out.println("\nEnrollments for course '" + course + "':");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("student") + " | " + rs.getString("course"));
        }
    }

    static void changeCourse(Connection con, int id, String newCourse) throws SQLException {
        String sql = "UPDATE enrollments SET course = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, newCourse);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("\nCourse changed to '" + newCourse + "' for id: " + id);
    }

    static void deleteEnrollment(Connection con, int id) throws SQLException {
        String sql = "DELETE FROM enrollments WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Enrollment cancelled for id: " + id);
    }
}
