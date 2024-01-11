package com.ecommerce;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/ecommerce";
        String user = "your_username";
        String password = "your_password";
        return DriverManager.getConnection(url, user, password);
    }
}

