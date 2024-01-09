import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Hardcoded values for validation
        if (email.equals("user@example.com") && password.equals("password")) {
            request.getSession().setAttribute("loggedIn", true);
            response.sendRedirect("DashboardServlet");
        } else {
            response.sendRedirect("error.html");
        }
    }
}
