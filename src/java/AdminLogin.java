
//this servlet works for login checker only and directs to Welcome Servlet.
//if login unsuccessfull then back to the login html page(index.html)
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminLogin extends HttpServlet
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {

            String id = request.getParameter("id");
            String pass = request.getParameter("pass");

            out.println("<br/><br/>");

            try
            {
                if (LoginValidate.checkUser(id, pass))
                {
                    RequestDispatcher rs = request.getRequestDispatcher("adminpanel.html");
                    rs.forward(request, response);
                }
                else
                {
                    out.println("Username or Password incorrect");
                    RequestDispatcher rs = request.getRequestDispatcher("login.html");
                    rs.include(request, response);
                }

            }
            catch (Exception e)
            {

            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
