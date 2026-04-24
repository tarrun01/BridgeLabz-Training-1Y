package com.gla.jdbc;

import java.sql.*;

public class MovieTicketBookingSystem {

    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        createTable(con);
        addMovie(con, 1, "Inception", 100);
        addMovie(con, 2, "Interstellar", 0);
        addMovie(con, 3, "Avatar", 50);
        displayAvailableMovies(con);
        bookSeat(con, 1);
        deleteMovie(con, 2);

        con.close();
    }

    static void createTable(Connection con) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS movies (id INT, name VARCHAR(50), seats INT)";
        con.createStatement().executeUpdate(sql);
        System.out.println("Table created.");
    }

    static void addMovie(Connection con, int id, String name, int seats) throws SQLException {
        String sql = "INSERT INTO movies VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, seats);
        ps.executeUpdate();
        System.out.println("Movie added: " + name);
    }

    static void displayAvailableMovies(Connection con) throws SQLException {
        String sql = "SELECT * FROM movies WHERE seats > 0";
        ResultSet rs = con.createStatement().executeQuery(sql);
        System.out.println("\nMovies with available seats:");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | Seats: " + rs.getInt("seats"));
        }
    }

    static void bookSeat(Connection con, int id) throws SQLException {
        String sql = "UPDATE movies SET seats = seats - 1 WHERE id = ? AND seats > 0";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("\nSeat booked for movie id: " + id);
    }

    static void deleteMovie(Connection con, int id) throws SQLException {
        String sql = "DELETE FROM movies WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Movie deleted with id: " + id);
    }
}
