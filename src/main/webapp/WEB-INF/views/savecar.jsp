<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h1>Save a Car</h1>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>MAKER</th>
			<th>MODEL</th>
			<th>YEARMADE</th>
		</tr>
		 <c:forEach var="car" items="${cars}">
		 <tr>
			<td> ${car.id} </td>
			<td> ${car.maker} </td>
			<td> ${car.model} </td>
			<td> ${car.yearMade} </td>
		</tr>
 		<c:url var="deleteLink" value="/delete">
			<c:param name="carId" value="${car.id}"/>
		</c:url>
		</c:forEach> 
	</table>
	<br>
	<br />
	<f:form action="addcar" method="post" modelAttribute="carAttribute">
		<div>
			<input type="hidden" name="id" value="1" />
			<p>
				<label for="maker">Enter Maker</label> <input type="text"
					name="maker" />
			</p>
			<p>
				<label for="model">Enter Model</label> <input type="text"
					name="model" />
			</p>
			<p>
				
				<label for="yearMade">Enter Year of Car</label> 
				<input type="date" 
					name="yearMade" />
			</p>
			<p>
				<label for="isReserved">IsReserved</label> <input type="text"
					name="isReserved" />
			</p>
			<input type="submit" value="add car" />
		</div>
	</f:form>
	<a href="/CarRental/"><h2>Logout</h2></a>
</body>
</html>