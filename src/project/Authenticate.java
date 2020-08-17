package project;



import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet 
{


	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest request ,HttpServletResponse response)
            throws ServletException , IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String user_name = request.getParameter("User_name");
        String email_id = request.getParameter("Email_ID");
        String pwd = request.getParameter("Password");
        
        try
        {
        if(Validate.checkUser(user_name,email_id,pwd))
        {
            RequestDispatcher rd;
            rd = request.getRequestDispatcher("Homepage.jsp");
            rd.forward(request,response);
        }
        else
        {
            out.println("Username , EmailID or Password incorrect");
            RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
            rd.include(request,response);
        }
        }
        catch(SQLException e)
        {
        }
    }
}

