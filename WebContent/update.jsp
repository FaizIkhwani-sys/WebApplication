
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Account</title>
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
			<h2>Details Updation Form</h2>
		</div>
		<form method="post" action="UpdateServlet"
			class="w3-container w3-margin">
			<label class=" w3-text-red ">User name </label> <input type="text"
				name="User_name" class="w3-input w3-border" /><br /> <label
				class=" w3-text-red ">Email ID </label> <input type="email"
				name="Email_ID" class="w3-input w3-border" /><br /> <label
				class=" w3-text-red ">Phone number </label> <input type="number"
				name="Phone_number" class="w3-input w3-border" /><br /> <label
				class=" w3-text-red ">Address </label> <input type="text"
				name="Address" class="w3-input w3-border" /><br /> <label
				class=" w3-text-red ">Postal code </label> <input type="number"
				name="Postal_code" class="w3-input w3-border" /><br />
			<button class="w3-btn w3-red">Update</button>
		</form>
	</div>
	<a href="Homepage.jsp">HOMEPAGE</a>
</body>
</html>

