package com.servlets;
import com.ecommerce.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String productId = request.getParameter("productId");
 
		Connection connection = Connection_check.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM products WHERE product_id=?");
            ps.setString(1, productId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String productName = rs.getString("product_name");
                double price = rs.getDouble("price");
                PrintWriter out = response.getWriter();
                out.println("Product ID: " + productId + "<br>");
                out.println("Product Name: " + productName + "<br>");
                out.println("Price: " + price + "<br>");
            } else {
                PrintWriter out = response.getWriter();
                out.println("Product not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
