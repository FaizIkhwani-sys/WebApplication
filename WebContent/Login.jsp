
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Login Page</title>
</head>
<body>
	<div class="w3-card-4 w3-margin w3-display-topmiddle">
		<div class="w3-container w3-red">
			<h2>Login Form</h2>
		</div>
		<form method="post" action="Authenticate"
			class="w3-container w3-margin">
			<label class=" w3-text-red ">User name </label> <input type="text"
				name="User_name" class="w3-input w3-border " /><br />
			<br /> <label class=" w3-text-red ">Email ID </label> <input
				type="email" name="Email_ID" class="w3-input w3-border" /><br />
			<br /> <label class=" w3-text-red ">Password </label> <input
				type="password" name="Password" class="w3-input w3-border" /> <br />
			<button class="w3-btn w3-red">Login</button>
		</form>
	</div>
</body>
</html>
