import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JDBCServlet")
public class JDBCServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shirts_db","root","root");
			if(conObj!=null) {
				System.out.println("DB CONNECTED");
				conObj.close();
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
    }
}
