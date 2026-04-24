package com.gla.jdbc;

import java.sql.*;

public class LibraryBookManager {

    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        createTable(con);
        insertBook(con, 1, "Java Programming", "James Gosling", "Available");
        insertBook(con, 2, "Clean Code", "Robert Martin", "Issued");
        insertBook(con, 3, "Design Patterns", "Gang of Four", "Available");
        displayAvailableBooks(con);
        markAsIssued(con, 1);
        deleteBook(con, 2);

        con.close();
    }

    static void createTable(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS books (id INT, title VARCHAR(100), author VARCHAR(50), status VARCHAR(10))";
        con.createStatement().executeUpdate(sql);
        System.out.println("Table created.");
    }

    static void insertBook(Connection con, int id, String title, String author, String status) throws SQLException {
        String sql = "INSERT INTO books VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, title);
        ps.setString(3, author);
        ps.setString(4, status);
        ps.executeUpdate();
        System.out.println("Book inserted: " + title);
    }

    static void displayAvailableBooks(Connection con) throws SQLException {
        String sql = "SELECT * FROM books WHERE status = 'Available'";
        ResultSet rs = con.createStatement().executeQuery(sql);
        System.out.println("\nAvailable Books:");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("title") + " | " + rs.getString("author"));
        }
    }

    static void markAsIssued(Connection con, int id) throws SQLException {
        String sql = "UPDATE books SET status = 'Issued' WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("\nBook marked as Issued for id: " + id);
    }

    static void deleteBook(Connection con, int id) throws SQLException {
        String sql = "DELETE FROM books WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Book deleted with id: " + id);
    }
}
