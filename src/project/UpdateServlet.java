package project;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet 
{
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
      
        
        String user_name = request.getParameter("User_name");
        String email_id = request.getParameter("Email_ID");
        String phone_num = request.getParameter("Phone_number");
        String addr = request.getParameter("Address");
        String post_code = request.getParameter("Postal_code");
        
        PrintWriter out = response.getWriter();
        try 
        {    
           
                Class.forName("com.mysql.cj.jdbc.Driver");
         

           
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://local:3306/webapp?autoReconnect=false&useSSL=false","root","Faizfazli123");
            
            String cmd =" update registertable set EMAILID=? , PHONENUMBER=? , ADDRESS=? , POSTALCODE=? where USERNAME=? AND EMAILID=? ";
            PreparedStatement stmt = con.prepareStatement(cmd);
         
            stmt.setString(1,email_id);
            stmt.setString(2,phone_num);
            stmt.setString(3,addr);
            stmt.setString(4,post_code);
            
            stmt.executeUpdate();
            out.println("Account Updated Successfully");
           
        }
        catch(Exception e)
        {
        	RequestDispatcher rd = request.getRequestDispatcher("Homepage.jsp");
			rd.forward(request, response);
        }
    }
}

   

