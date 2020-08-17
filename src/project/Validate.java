package project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Validate 
{
    public static boolean checkUser(String name , String email , String pwd) throws SQLException
    {
        boolean st = false ;
        try
        {
            

            Class.forName("com.mysql.cj.jdbc.Driver");
        
             //Establishing Connection with the database
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp?autoReconnect=false&useSSL=false","root","Faizfazli123");
        
            String cmd =" select * from registertable where USERNAME=? AND EMAIL=? AND PASSWORD=? ";
            PreparedStatement stmt = con.prepareStatement(cmd);
        
            stmt.setString(1,name);
            stmt.setString(2,email);
            stmt.setString(3,pwd);
        
            ResultSet rs = stmt.executeQuery();
            st = rs.next();
        }
        catch(Exception ex)
        {
            Logger.getLogger(PasswordChangingServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return st;
    }
}

