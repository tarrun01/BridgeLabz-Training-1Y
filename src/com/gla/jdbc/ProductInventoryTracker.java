package com.gla.jdbc;

import java.sql.*;

public class ProductInventoryTracker {

    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        createTable(con);
        insertProduct(con, 1, "Pen", 5);
        insertProduct(con, 2, "Notebook", 20);
        insertProduct(con, 3, "Eraser", 8);
        displayLowStock(con);
        updateQuantity(con, 1, 50);
        deleteProduct(con, 3);

        con.close();
    }

    static void createTable(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS product (pid INT, pname VARCHAR(50), qty INT)";
        con.createStatement().executeUpdate(sql);
        System.out.println("Table created.");
    }

    static void insertProduct(Connection con, int pid, String pname, int qty) throws SQLException {
        String sql = "INSERT INTO product VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, pid);
        ps.setString(2, pname);
        ps.setInt(3, qty);
        ps.executeUpdate();
        System.out.println("Product inserted: " + pname);
    }

    static void displayLowStock(Connection con) throws SQLException {
        String sql = "SELECT * FROM product WHERE qty < 10";
        ResultSet rs = con.createStatement().executeQuery(sql);
        System.out.println("\nLow stock products (qty < 10):");
        while (rs.next()) {
            System.out.println(rs.getInt("pid") + " | " + rs.getString("pname") + " | " + rs.getInt("qty"));
        }
    }

    static void updateQuantity(Connection con, int pid, int qty) throws SQLException {
        String sql = "UPDATE product SET qty = ? WHERE pid = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, qty);
        ps.setInt(2, pid);
        ps.executeUpdate();
        System.out.println("\nQuantity updated for pid: " + pid);
    }

    static void deleteProduct(Connection con, int pid) throws SQLException {
        String sql = "DELETE FROM product WHERE pid = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, pid);
        ps.executeUpdate();
        System.out.println("Product deleted with pid: " + pid);
    }
}
