
package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.ProductDAO;
import com.entity.Product;

@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
   
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        String productName = request.getParameter("productName");
        double price = Double.parseDouble(request.getParameter("price"));

        // Create Product object
        Product product = new Product();
        product.setName(productName);
        product.setPrice(price);

       
        ProductDAO.addProduct(product);

        response.sendRedirect("success.jsp");
    }
}
