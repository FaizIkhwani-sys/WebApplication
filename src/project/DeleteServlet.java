package project;



import java.io.IOException; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet 
{
 
    
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
      
        
        String user_name = request.getParameter("User_name");
        String email_id = request.getParameter("Email_ID");
        
        try 
        {     
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp?autoReconnect=false&useSSL=false","root","Faizfazli123");
            
            String cmd =" delete from registertable where USERNAME=? AND EMAILID=? ";
            PreparedStatement stmt = con.prepareStatement(cmd);
            
            stmt.setString(1,user_name);
            stmt.setString(2,email_id);
            
            int i = stmt.executeUpdate();
            if(i > 0)
            {
                RequestDispatcher rd;                                                                                                                                                       
                rd = request.getRequestDispatcher("Login.jsp");
                rd.forward(request,response);
            }
        }
        catch (Exception ex) 
        {
        	RequestDispatcher rd = request.getRequestDispatcher("SignUp.jsp");
			rd.forward(request, response);
        }
    }
}

    
