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

@WebServlet("/PasswordChangingServlet")
public class PasswordChangingServlet extends HttpServlet 
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
      
        
        String email_id = request.getParameter("Email_ID");
        String current_password = request.getParameter("Current_Password");
        String new_password = request.getParameter("New_Password");
        String confirm_password = request.getParameter("Confirm_Password");
        
        PrintWriter out = response.getWriter();
        
        if(!new_password.equals(confirm_password))
        {
             out.println("New password and confirm password does not match ");
        }
        else
        {
        try
        {
          
                Class.forName("com.mysql.cj.jdbc.Driver");
           

        //Establishing Connection with the Database
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://local:3306/webapp?autoReconnect=false&useSSL=false","root","Faizfazli123");
            
            String sql =" update registertable set PASSWORD=? where EMAILID=? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1,new_password);
            
            int i = stmt.executeUpdate();
            
            if(i > 0)
            {
                out.println("Password changed Successfully");
            }
        }
        catch (Exception ex) 
        {
        	RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
        }
        }
    }
}
