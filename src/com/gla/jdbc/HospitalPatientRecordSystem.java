package com.gla.jdbc;

import java.sql.*;

public class HospitalPatientRecordSystem {

    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        createTable(con);
        insertPatient(con, 1, "Alice", "Diabetes");
        insertPatient(con, 2, "Bob", "Flu");
        insertPatient(con, 3, "Charlie", "Diabetes");
        displayByDisease(con, "Diabetes");
        updateDisease(con, 2, "Recovered");
        deletePatient(con, 2);

        con.close();
    }

    static void createTable(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS patients (id INT, name VARCHAR(50), disease VARCHAR(50))";
        con.createStatement().executeUpdate(sql);
        System.out.println("Table created.");
    }

    static void insertPatient(Connection con, int id, String name, String disease) throws SQLException {
        String sql = "INSERT INTO patients VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, disease);
        ps.executeUpdate();
        System.out.println("Patient inserted: " + name);
    }

    static void displayByDisease(Connection con, String disease) throws SQLException {
        String sql = "SELECT * FROM patients WHERE disease = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, disease);
        ResultSet rs = ps.executeQuery();
        System.out.println("\nPatients with " + disease + ":");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("disease"));
        }
    }

    static void updateDisease(Connection con, int id, String disease) throws SQLException {
        String sql = "UPDATE patients SET disease = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, disease);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("\nDisease updated for patient id: " + id);
    }

    static void deletePatient(Connection con, int id) throws SQLException {
        String sql = "DELETE FROM patients WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Patient discharged and record deleted for id: " + id);
    }
}
