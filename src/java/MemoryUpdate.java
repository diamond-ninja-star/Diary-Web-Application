//this servlet works for registration only. and directs to AdminRegistration.java servlet and then index.html(for AdminRegistration.html actually).

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemoryUpdate extends HttpServlet
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
             
               
            String id4 = request.getParameter("id4");
            String date4 = request.getParameter("date4");
            String subject4 = request.getParameter("subject4");
            String place4 = request.getParameter("place4");
            String description4 = request.getParameter("description4");

            out.println("<br/><br/>");
            try
            {
                 response.sendRedirect("adminpanel.html");
                Class.forName("com.mysql.jdbc.Driver");
                out.println("Driver loaded");
                out.println("<br/><br/>");

                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/diary", "root", "");
                out.println("Connection Succes");
                //  out.println("Welcome"+" "+adminname);
                out.println("<br/><br/>");

                Statement stmt1=(Statement) con.createStatement();
                //out.println("Registration Successfull!Thanks.");
                 stmt1.executeUpdate("update memory set id='"+id4+"',edate='"+date4+"',subject='"+subject4+"',place='"+place4+"',description='"+description4+"' where id='"+id4+"'");
                 out.println("Updated Successfully");

                //************************
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");

                out.println("<title font-color='pink'>Servlet Servlet1</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet Update servlet at " + request.getContextPath() + "</h1>");
                out.println("<input type=\"button\" value=\"Log In\" onclick=\"window.location.href='index.html'\" />");
                out.println("</body>");
                out.println("</html>");

            } catch (Exception e)
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
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(AdminRegistration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(AdminRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(AdminRegistration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(AdminRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
