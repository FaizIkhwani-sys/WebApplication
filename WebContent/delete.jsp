

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete Account</title>
<style>
a, h3 {
	text-decoration: none;
	color: rgb(128, 32, 0);
}
</style>
</head>
<body>
	<div class="w3-card-4 w3-margin w3-display-topmiddle">
		<h3>To Confirm, please re-enter the following details</h3>
		<form method="post" action="DeleteServlet"
			class="w3-container w3-margin">
			<label class=" w3-text-red ">User name </label> <input type="text"
				name="User_name" class="w3-input w3-border" /><br> <label
				class=" w3-text-red ">Email ID </label> <input type="email"
				name="Email_ID" class="w3-input w3-border" /> <br>
		</form>

		<h3>Are you sure that you want to delete your account ??</h3>
		<a href="DeleteServlet"><b>Yes</b> 
		<br/>
		<br/>
		 </a> <a href="Homepage.jsp"><b>No</b></a>

	</div>
</body>
</html>

