package connection;
import java.sql.*;
public class MyCon 
{
    static Connection con=null;
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            
        }
    }
    public static Connection getConnection()
    {
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
            //System.out.println("connection established successfully.........");
        }
        catch(SQLException e)
        {
            //System.out.println(e);
        }
        return con;
    }
    
}
