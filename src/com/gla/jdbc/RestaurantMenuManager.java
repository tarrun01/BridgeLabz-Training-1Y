package com.gla.jdbc;

import java.sql.*;

public class RestaurantMenuManager {

    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        createTable(con);
        addMenuItem(con, 1, "Burger", 150.0);
        addMenuItem(con, 2, "Pizza", 250.0);
        addMenuItem(con, 3, "Tea", 30.0);
        displayCheapItems(con);
        updatePrice(con, 3, 40.0);
        deleteMenuItem(con, 2);

        con.close();
    }

    static void createTable(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS menu (id INT, itemName VARCHAR(50), price DOUBLE)";
        con.createStatement().executeUpdate(sql);
        System.out.println("Table created.");
    }

    static void addMenuItem(Connection con, int id, String itemName, double price) throws SQLException {
        String sql = "INSERT INTO menu VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, itemName);
        ps.setDouble(3, price);
        ps.executeUpdate();
        System.out.println("Menu item added: " + itemName);
    }

    static void displayCheapItems(Connection con) throws SQLException {
        String sql = "SELECT * FROM menu WHERE price < 200";
        ResultSet rs = con.createStatement().executeQuery(sql);
        System.out.println("\nItems priced below 200:");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("itemName") + " | Rs." + rs.getDouble("price"));
        }
    }

    static void updatePrice(Connection con, int id, double price) throws SQLException {
        String sql = "UPDATE menu SET price = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, price);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("\nPrice updated for item id: " + id);
    }

    static void deleteMenuItem(Connection con, int id) throws SQLException {
        String sql = "DELETE FROM menu WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Menu item deleted with id: " + id);
    }
}
