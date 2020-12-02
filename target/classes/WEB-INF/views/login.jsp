<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Customer Login</h2>
	<f:form action="logForm" modelAttribute="loginfo">
		<div>
			<p>
				<label for="email">Enter email</label> <f:input type="text"
					name="email" path="email"/>
				<%-- 	<f:errors path="email" cssClass="error"/> --%>
			</p>
			<p>
				<label for="password">Enter password</label> <f:input type="text"
					name="password" path="password" />
					<%-- <f:errors path="email" cssClass="error"/> --%>
			</p>
			
			<input type="submit" value="Login" />
		</div>
	</f:form>
	<br />
	<br />
	
	
	<a href="/CarRental/register"><h2>Register</h2></a>
</body>
</html>