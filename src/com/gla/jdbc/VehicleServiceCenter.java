package com.gla.jdbc;

import java.sql.*;

public class VehicleServiceCenter {

    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        createTable(con);
        addVehicle(con, "MH01AB1234", "Alice", "Pending");
        addVehicle(con, "DL02CD5678", "Bob", "Pending");
        addVehicle(con, "KA03EF9012", "Charlie", "Completed");
        displayPendingVehicles(con);
        updateStatus(con, "MH01AB1234", "Completed");
        deleteVehicle(con, "KA03EF9012");

        con.close();
    }

    static void createTable(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS vehicles (regNo VARCHAR(20), owner VARCHAR(50), status VARCHAR(20))";
        con.createStatement().executeUpdate(sql);
        System.out.println("Table created.");
    }

    static void addVehicle(Connection con, String regNo, String owner, String status) throws SQLException {
        String sql = "INSERT INTO vehicles VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, regNo);
        ps.setString(2, owner);
        ps.setString(3, status);
        ps.executeUpdate();
        System.out.println("Vehicle added: " + regNo);
    }

    static void displayPendingVehicles(Connection con) throws SQLException {
        String sql = "SELECT * FROM vehicles WHERE status = 'Pending'";
        ResultSet rs = con.createStatement().executeQuery(sql);
        System.out.println("\nPending vehicles:");
        while (rs.next()) {
            System.out.println(rs.getString("regNo") + " | " + rs.getString("owner") + " | " + rs.getString("status"));
        }
    }

    static void updateStatus(Connection con, String regNo, String status) throws SQLException {
        String sql = "UPDATE vehicles SET status = ? WHERE regNo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, status);
        ps.setString(2, regNo);
        ps.executeUpdate();
        System.out.println("\nStatus updated to '" + status + "' for: " + regNo);
    }

    static void deleteVehicle(Connection con, String regNo) throws SQLException {
        String sql = "DELETE FROM vehicles WHERE regNo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, regNo);
        ps.executeUpdate();
        System.out.println("Vehicle removed: " + regNo);
    }
}
