package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.operations.ProductOperations;

/**
 * Servlet implementation class ProductProcessServlet
 */
@WebServlet("/ProductProcessServlet")
public class ProductProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductProcessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	        String productName = request.getParameter("productName");
	        double price = Double.parseDouble(request.getParameter("price"));

	        // Assuming ProductOperations.addProduct returns the generated productId
	        int productId = ProductOperations.addProduct(productName, price);

	        // Redirect to display-product.jsp with the productId as a parameter
	        response.sendRedirect("display-product?productId=" + productId);
	}

}
