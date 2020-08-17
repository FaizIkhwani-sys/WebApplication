
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Password Changing Page</title>
<style>
a {
	text-decoration: none;
	color: rgb(128, 32, 0);
	font-size: 20px;
}
</style>
</head>
<body>
	<div class="w3-card-4 w3-margin w3-display-topmiddle">
		<div class="w3-container w3-red">
			<h2>Change your password</h2>
		</div>
		<form method="post" action="PasswordChangingServlet"
			class="w3-container w3-margin">
			<label class=" w3-text-red ">Email ID </label> <input type="email"
				name="Email_ID" class="w3-input w3-border" /> <br /> <label
				class=" w3-text-red ">Current password </label> <input
				type="password" name="Current_Password" class="w3-input w3-border" /><br />
			<label class=" w3-text-red ">New password </label> <input
				type="password" name="New_Password" class="w3-input w3-border" /><br />
			<label class=" w3-text-red ">Confirm password</label> <input
				type="password" name="Confirm_Password" class="w3-input w3-border" /><br />
			<button class="w3-btn w3-red">Change password</button>
		</form>
	</div>
	<a href="Homepage.jsp">HOMEPAGE</a>
</body>
</html>
