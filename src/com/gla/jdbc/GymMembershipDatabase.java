package com.gla.jdbc;

import java.sql.*;

public class GymMembershipDatabase {

    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        createTable(con);
        addMember(con, 1, "Alice", "Premium", 12);
        addMember(con, 2, "Bob", "Basic", 3);
        addMember(con, 3, "Charlie", "Premium", 6);
        displayPremiumMembers(con);
        extendMembership(con, 2, 3);
        deleteMember(con, 2);

        con.close();
    }

    static void createTable(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS members (id INT, name VARCHAR(50), type VARCHAR(20), months INT)";
        con.createStatement().executeUpdate(sql);
        System.out.println("Table created.");
    }

    static void addMember(Connection con, int id, String name, String type, int months) throws SQLException {
        String sql = "INSERT INTO members VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, type);
        ps.setInt(4, months);
        ps.executeUpdate();
        System.out.println("Member added: " + name);
    }

    static void displayPremiumMembers(Connection con) throws SQLException {
        String sql = "SELECT * FROM members WHERE type = 'Premium'";
        ResultSet rs = con.createStatement().executeQuery(sql);
        System.out.println("\nPremium Members:");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("type") + " | " + rs.getInt("months") + " months");
        }
    }

    static void extendMembership(Connection con, int id, int extraMonths) throws SQLException {
        String sql = "UPDATE members SET months = months + ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, extraMonths);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("\nMembership extended by " + extraMonths + " months for id: " + id);
    }

    static void deleteMember(Connection con, int id) throws SQLException {
        String sql = "DELETE FROM members WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Member removed with id: " + id);
    }
}
