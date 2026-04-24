package com.gla.jdbc;

import java.sql.*;

public class SimpleToDoTaskManager {

    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        createTable(con);
        addTask(con, 1, "Buy groceries", "Pending");
        addTask(con, 2, "Submit assignment", "Pending");
        addTask(con, 3, "Read book", "Completed");
        displayPendingTasks(con);
        markCompleted(con, 1);
        deleteCompletedTasks(con);

        con.close();
    }

    static void createTable(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS tasks (id INT, title VARCHAR(100), status VARCHAR(20))";
        con.createStatement().executeUpdate(sql);
        System.out.println("Table created.");
    }

    static void addTask(Connection con, int id, String title, String status) throws SQLException {
        String sql = "INSERT INTO tasks VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, title);
        ps.setString(3, status);
        ps.executeUpdate();
        System.out.println("Task added: " + title);
    }

    static void displayPendingTasks(Connection con) throws SQLException {
        String sql = "SELECT * FROM tasks WHERE status = 'Pending'";
        ResultSet rs = con.createStatement().executeQuery(sql);
        System.out.println("\nPending Tasks:");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("title") + " | " + rs.getString("status"));
        }
    }

    static void markCompleted(Connection con, int id) throws SQLException {
        String sql = "UPDATE tasks SET status = 'Completed' WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("\nTask marked as Completed for id: " + id);
    }

    static void deleteCompletedTasks(Connection con) throws SQLException {
        String sql = "DELETE FROM tasks WHERE status = 'Completed'";
        int rows = con.createStatement().executeUpdate(sql);
        System.out.println("Deleted " + rows + " completed task(s).");
    }
}
