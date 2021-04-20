<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Test</title>
	</head>
	<body>
	Inserisci le tue credenziali: <br>
		<form action="CheckNamingServlet" method="post"><br>
		<label>Nome utente: </label>
		<input type = "text" name = "usernameInput" /><br><br>
		<label>Password: </label>
		<input type = "text" name = "passwordInput" /><br><br>
		<input type = "submit" value = "login" />		
		</form>
		
	</body>
</html>