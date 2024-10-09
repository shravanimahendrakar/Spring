<html>
<body>
	<h2><%="Hello World!"%></h2>
	<h2><%="Login here"%></h2>
	<form action="login" method="post">
		<input type="text" name="emailId" placeholder="Enter email id">
		<input type="password" name="password" placeholder="Enter password">
		<input type="submit" value="Login">
	</form>
	
	<a href="register-form">Register here</a>
	
<h5 style="color:red">${msg }</h5>
</body>
</html>
