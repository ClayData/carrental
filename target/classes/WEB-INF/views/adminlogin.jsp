<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Admin Login</h2>
	<f:form action="adminForm" modelAttribute="adminInfo">
		<div>
			<p>
				<label for="email">Enter email</label> <f:input type="text"
					name="email" path="email"/>
			</p>
			<p>
				<label for="password">Enter password</label> <f:input type="text"
					name="password" path="password" />
			</p>
			
			<input type="submit" value="Login" />
		</div>
	</f:form>

</body>
</html>