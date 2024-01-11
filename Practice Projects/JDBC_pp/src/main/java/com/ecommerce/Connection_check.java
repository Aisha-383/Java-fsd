package com.ecommerce;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_check{
	    private static final String URL = "jdbc:mysql://127.0.0.1:3306/shirts_db";
	    private static final String USER = "root";
	    private static final String PASSWORD = "root";

	    public static Connection getConnection() {
	        Connection connection = null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection(URL, USER, PASSWORD);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return connection;
	    }
	}


