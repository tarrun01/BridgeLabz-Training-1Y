package com.gla.jdbc;

import java.sql.*;

public class SimpleBankingAccountManager {

    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        createTable(con);
        addAccount(con, 1001, "Alice", 15000);
        addAccount(con, 1002, "Bob", 8000);
        addAccount(con, 1003, "Charlie", 25000);
        displayHighBalance(con);
        updateBalance(con, 1002, 5000);
        deleteAccount(con, 1002);

        con.close();
    }

    static void createTable(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS accounts (accNo INT, name VARCHAR(50), balance DOUBLE)";
        con.createStatement().executeUpdate(sql);
        System.out.println("Table created.");
    }

    static void addAccount(Connection con, int accNo, String name, double balance) throws SQLException {
        String sql = "INSERT INTO accounts VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, accNo);
        ps.setString(2, name);
        ps.setDouble(3, balance);
        ps.executeUpdate();
        System.out.println("Account added: " + name);
    }

    static void displayHighBalance(Connection con) throws SQLException {
        String sql = "SELECT * FROM accounts WHERE balance > 10000";
        ResultSet rs = con.createStatement().executeQuery(sql);
        System.out.println("\nAccounts with balance > 10000:");
        while (rs.next()) {
            System.out.println(rs.getInt("accNo") + " | " + rs.getString("name") + " | " + rs.getDouble("balance"));
        }
    }

    static void updateBalance(Connection con, int accNo, double amount) throws SQLException {
        String sql = "UPDATE accounts SET balance = balance + ? WHERE accNo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, amount);
        ps.setInt(2, accNo);
        ps.executeUpdate();
        System.out.println("\nBalance updated for accNo: " + accNo);
    }

    static void deleteAccount(Connection con, int accNo) throws SQLException {
        String sql = "DELETE FROM accounts WHERE accNo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, accNo);
        ps.executeUpdate();
        System.out.println("Account closed for accNo: " + accNo);
    }
}
