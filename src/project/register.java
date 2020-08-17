package project;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String first_name = request.getParameter("First_name");
	        String last_name = request.getParameter("Last_name");
	        String user_name = request.getParameter("User_name");
	        String email_id = request.getParameter("Email_ID");
	        String phone_num = request.getParameter("Phone_number");
	        String addr = request.getParameter("Address");
	        String post_code = request.getParameter("Postal_code");
	        String pwd = request.getParameter("Password");
	        
	        
	        if(first_name != null && last_name != null && user_name != null && email_id != null && phone_num != null
	        		&& addr != null && post_code != null && pwd != null) {
				
				Input input = new Input();
				
				input.setFirstName(first_name);
				input.setLastName(last_name);
				input.setUserName(user_name);
				input.setEmailId(email_id);
				input.setPhoneNum(phone_num);
				input.setAddress(addr);
				input.setPostalCode(post_code);
				input.setPassword(pwd);
				
			
			
					if(input.storeData()==true) {
						RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
						rd.forward(request, response);
					}else {
						RequestDispatcher rd = request.getRequestDispatcher("Homepage.jsp");
						rd.forward(request, response);
					}
					
				}
				
				
				
				
			}
	        
	}

