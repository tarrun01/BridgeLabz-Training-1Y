package com.gla.jdbc;

import java.sql.*;

public class BookstoreSalesTracking {

    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        createTable(con);
        insertSale(con, 1, "Clean Code", 3, 499.0);
        insertSale(con, 2, "Java Complete Reference", 1, 699.0);
        insertSale(con, 3, "Design Patterns", 2, 599.0);
        displayMultiQuantitySales(con);
        updateQuantity(con, 2, 4);
        deleteSale(con, 1);

        con.close();
    }

    static void createTable(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS sales (id INT, bookName VARCHAR(100), quantity INT, price DOUBLE)";
        con.createStatement().executeUpdate(sql);
        System.out.println("Table created.");
    }

    static void insertSale(Connection con, int id, String bookName, int quantity, double price) throws SQLException {
        String sql = "INSERT INTO sales VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, bookName);
        ps.setInt(3, quantity);
        ps.setDouble(4, price);
        ps.executeUpdate();
        System.out.println("Sale inserted: " + bookName);
    }

    static void displayMultiQuantitySales(Connection con) throws SQLException {
        String sql = "SELECT * FROM sales WHERE quantity > 1";
        ResultSet rs = con.createStatement().executeQuery(sql);
        System.out.println("\nSales with quantity > 1:");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("bookName") + " | Qty: " + rs.getInt("quantity") + " | Rs." + rs.getDouble("price"));
        }
    }

    static void updateQuantity(Connection con, int id, int quantity) throws SQLException {
        String sql = "UPDATE sales SET quantity = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, quantity);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("\nQuantity updated for sale id: " + id);
    }

    static void deleteSale(Connection con, int id) throws SQLException {
        String sql = "DELETE FROM sales WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Sale entry deleted for id: " + id);
    }
}
