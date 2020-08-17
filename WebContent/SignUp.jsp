

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Signup Page</title>
<style>
a {
	text-decoration: none;
}

h4 {
	color: rgb(128, 32, 0);
}
</style>
</head>
<body>
	<div class="w3-card-4 w3-margin w3-display-topmiddle">
		<div class="w3-container w3-red">
			<h2>KICT Student Society Registration Form</h2>
		</div>
		<form method="post" action="register"
			class="w3-container w3-margin">
			<label class=" w3-text-red ">First name </label> <input type="text"
				name="First_name" class="w3-input w3-border" /><br /> <label
				class=" w3-text-red ">Last name </label> <input type="text"
				name="Last_name" class="w3-input w3-border" /><br /> <label
				class=" w3-text-red ">User name </label> <input type="text"
				name="User_name" class="w3-input w3-border" /><br /> <label
				class=" w3-text-red ">Email ID </label> <input type="email"
				name="Email_ID" class="w3-input w3-border" /><br /> <label
				class=" w3-text-red ">Phone number </label> <input type="text"
				name="Phone_number" class="w3-input w3-border" /><br /> <label
				class=" w3-text-red ">Address </label> <input type="text"
				name="Address" class="w3-input w3-border" /><br /> <label
				class=" w3-text-red ">Postal code </label> <input type="text"
				name="Postal_code" class="w3-input w3-border" /><br /> <label
				class=" w3-text-red ">Password </label> <input type="password"
				name="Password" class="w3-input w3-border" /><br />
			<button class="w3-btn w3-red">Register</button>
			<h1>Already a member ?</h1>
			<h4>
				<a href="Login.jsp">Signin</a>
			</h4>
		</form>
	</div>
</body>
</html>
