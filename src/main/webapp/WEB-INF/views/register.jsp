<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h1>Registration</h1>
</head>
<body>
	<h2>Customer Registration</h2>
	<f:form action="save" modelAttribute="custinfo">
		<div>
<%-- 			<f:input type="hidden" name="id" value="1" path="id"/>
 --%>			<p>
				<label for="name">Enter Name</label> <f:input type="text" name="name" path="name" />
				<f:errors path="name" cssClass="error"/>
			</p>
			<p>
				<label for="age">Enter Age</label> <f:input type="number" name="age" path="age" />
				<f:errors path="age" cssClass="error"/>
			</p>
			<p>
				<label for="email">Enter email</label> <f:input type="text"
					name="email" path="email" />
					<f:errors path="email" cssClass="error"/>
			</p>
			<p>
				<label for="password">Enter password</label> <f:input type="password"
					name="password" path="password" />
					<f:errors path="password" cssClass="error"/>
			</p>
			<input type="submit" value="add customer" />
		</div>
	</f:form>
	<a href="/CarRental/login"><h2>Login</h2></a>
</body>
</html>