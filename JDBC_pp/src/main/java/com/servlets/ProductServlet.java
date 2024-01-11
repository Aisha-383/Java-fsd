package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.DBConnection;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String productId = request.getParameter("productId");

        try {
            // Establish database connection using the DBConnector class
            Connection connection = DBConnection.getConnection();
            
            // SQL query to retrieve product details based on the entered product ID
            String query = "SELECT * FROM product WHERE id=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(productId));

            ResultSet rs = ps.executeQuery();

            // Display product details or an error message
            if (rs.next()) {
                out.println("Product ID: " + rs.getInt("id") + "<br>");
                out.println("Product Name: " + rs.getString("name") + "<br>");
                out.println("Description: " + rs.getString("description") + "<br>");
                out.println("Price: $" + rs.getDouble("price"));
            } else {
                out.println("Product not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
