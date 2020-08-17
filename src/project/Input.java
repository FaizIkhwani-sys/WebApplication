package project;

import java.sql.*;
public class Input 
{
    /**
	 * 
	 */

	private String firstName ;
    private String lastName ;
    private String userName ;
    private String emailId;
    private String phoneNum ;
    private String address ;
    private String postalCode ;
	private String passWord;

  
    public String getFirstName() {
        return firstName;
    }

   
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

   
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public String getUserName() {
        return userName;
    }

    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    public String getEmailId() {
        return emailId;
    }

    
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

   
    public String getPhoneNum() {
        return phoneNum;
    }

    
    public void setPhoneNum(String phone_num) {
        this.phoneNum = phone_num;
    }

   
    public String getAddress() {
        return address;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }

   
    public String getPostalCode() {
        return postalCode;
    }

    
    public void setPostalCode(String post_code) {
        this.postalCode = post_code;
    }
    public String getPassword() {
        return passWord;
    }

	public void setPassword(String pwd) {
		this.passWord=pwd;
		
	}
   
    
    
    


    public boolean storeData() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp?autoReconnect=false&useSSL=false","root","Faizfazli123"); 
            String sql =" insert into registertable (FIRSTNAME, LASTNAME, USERNAME, EMAILID, PHONENUMBER, ADDRESS, POSTALCODE, PASSWORD) values(?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
            
			statement.setString(1, getFirstName());
			statement.setString(2, getLastName());
			statement.setString(3, getUserName());
			statement.setString(4, getEmailId());
			statement.setString(5, getPhoneNum());
			statement.setString(6, getAddress());
			statement.setString(7, getPostalCode());
			statement.setString(8, getPassword());
			
			statement.executeUpdate();
			statement.close();
			con.close();
			return true;	
			
		}catch(Exception ex) {
			return false;
		}
		
	}





    
}