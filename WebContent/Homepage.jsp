

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Home Page</title>
</head>
<body>
	<div class="w3-center">
		<h3 color:red>Welcome !!!</h3>
	</div>
	<div class="w3.container">
		<div class="w3-large w3-red w3-hover">
			<a href="Homepage.jsp" class="w3-bar-item w3-button"><i
				class="fa fa-home"></i></a>
			<div class="w3-dropdown-hover">
				<button class="w3-button">
					<i class="fa fa-bars"></i>
				</button>
				<div class="w3-dropdown-content w3-bar-block w3-card-4">
					<a href="update.jsp" class="w3-bar-item w3-button">UPDATE
						PROFILE</a> <a href="PasswordChanging.jsp"
						class="w3-bar-item w3-button">CHANGE PASSWORD</a> <a
						href="delete.jsp" class="w3-bar-item w3-button">DELETE ACCOUNT</a>
				</div>
			</div>
		</div>
	</div>
	<jsp:useBean class="project.Input" id="access"
		scope="request">
		<jsp:setProperty name="access" param="First_name" property="firstName" /><br/>
		<jsp:setProperty name="access" param="Last_name" property="lastName" /><br/>
		<jsp:setProperty name="access" param="User_name" property="userName" /><br/>
		<jsp:setProperty name="access" param="Email_ID" property="emailId" /><br/>
		<jsp:setProperty name="access" param="Phone_number" property="phoneNum" /><br/>
		<jsp:setProperty name="access" param="Address" property="address" /><br/>
		<jsp:setProperty name="access" param="Postal_code" property="postalCode" /><br/>
	</jsp:useBean>
	First name :<jsp:getProperty name="access" property="firstName" /><br/>
	Last name :<jsp:getProperty name="access" property="lastName" /><br/>
	User name :<jsp:getProperty name="access" property="userName" /><br/>
	Email ID :<jsp:getProperty name="access" property="emailId" /><br/>
	Phone number :<jsp:setProperty name="access" property="phoneNum" /><br/>
	Address :<jsp:setProperty name="access" property="address" /><br/>
	Postal code :<jsp:setProperty name="access" property="postalCode" /><br/>
</body>
</html>
