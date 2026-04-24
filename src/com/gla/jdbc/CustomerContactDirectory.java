package com.gla.jdbc;

import java.sql.*;

public class CustomerContactDirectory {

    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        createTable(con);
        addCustomer(con, 1, "Alice Smith", "9876543210");
        addCustomer(con, 2, "Bob Johnson", "8765432109");
        addCustomer(con, 3, "Alice Brown", "7654321098");
        searchByName(con, "Alice");
        updatePhone(con, 1, "1112223333");
        deleteCustomer(con, 3);

        con.close();
    }

    static void createTable(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS customers (id INT, name VARCHAR(50), phone VARCHAR(15))";
        con.createStatement().executeUpdate(sql);
        System.out.println("Table created.");
    }

    static void addCustomer(Connection con, int id, String name, String phone) throws SQLException {
        String sql = "INSERT INTO customers VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, phone);
        ps.executeUpdate();
        System.out.println("Customer added: " + name);
    }

    static void searchByName(Connection con, String keyword) throws SQLException {
        String sql = "SELECT * FROM customers WHERE name LIKE ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "%" + keyword + "%");
        ResultSet rs = ps.executeQuery();
        System.out.println("\nSearch results for '" + keyword + "':");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("phone"));
        }
    }

    static void updatePhone(Connection con, int id, String phone) throws SQLException {
        String sql = "UPDATE customers SET phone = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, phone);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("\nPhone updated for customer id: " + id);
    }

    static void deleteCustomer(Connection con, int id) throws SQLException {
        String sql = "DELETE FROM customers WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Customer deleted with id: " + id);
    }
}
