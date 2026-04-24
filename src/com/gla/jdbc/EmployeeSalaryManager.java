package com.gla.jdbc;

import java.sql.*;

public class EmployeeSalaryManager {

    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        createTable(con);
        addEmployee(con, 1, "Alice", 45000);
        addEmployee(con, 2, "Bob", 12000);
        addEmployee(con, 3, "Charlie", 32000);
        displayHighSalary(con);
        increaseSalary(con, 1);
        deleteLowSalary(con);

        con.close();
    }

    static void createTable(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS employee (id INT, name VARCHAR(50), salary DOUBLE)";
        con.createStatement().executeUpdate(sql);
        System.out.println("Table created.");
    }

    static void addEmployee(Connection con, int id, String name, double salary) throws SQLException {
        String sql = "INSERT INTO employee VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, salary);
        ps.executeUpdate();
        System.out.println("Employee added: " + name);
    }

    static void displayHighSalary(Connection con) throws SQLException {
        String sql = "SELECT * FROM employee WHERE salary > 30000";
        ResultSet rs = con.createStatement().executeQuery(sql);
        System.out.println("\nEmployees with salary > 30000:");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getDouble("salary"));
        }
    }

    static void increaseSalary(Connection con, int id) throws SQLException {
        String sql = "UPDATE employee SET salary = salary * 1.10 WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("\nSalary increased by 10% for employee id: " + id);
    }

    static void deleteLowSalary(Connection con) throws SQLException {
        String sql = "DELETE FROM employee WHERE salary < 15000";
        int rows = con.createStatement().executeUpdate(sql);
        System.out.println("Deleted " + rows + " employee(s) with salary < 15000");
    }
}
