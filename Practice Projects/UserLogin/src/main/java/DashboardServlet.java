import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object loggedIn = request.getSession().getAttribute("loggedIn");
        
        if (loggedIn != null && (boolean) loggedIn) {
            response.setContentType("text/html");
            response.getWriter().println("<html><head><title>Dashboard</title></head><body>");
            response.getWriter().println("<h1>Welcome to the Dashboard</h1>");
            response.getWriter().println("<a href=\"LogoutServlet\">Logout</a>");
            response.getWriter().println("</body></html>");
        } else {
            response.sendRedirect("error.html");
        }
    }
}
