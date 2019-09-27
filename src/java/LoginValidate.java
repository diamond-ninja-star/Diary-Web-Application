
import java.sql.*;

public class LoginValidate
{

    public static boolean checkUser(String id, String pass)
    {
        boolean st = false;
        try
        {

            //loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diary", "root", "");
            PreparedStatement ps = con.prepareStatement("select * from adminpanel where id=? and password=?");
            ps.setString(1, id);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            st = rs.next();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return st;
    }
}
