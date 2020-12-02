<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h1>Save a Car</h1>
</head>
<body>
	 <c:forEach var="car" items="${carList}">
	${car.id}
	${car.maker}
	${car.model}
	${car.yearmade}
	${car.isReserved}
	<c:url var="deleteLink" value="/delete">
		<c:param name="carId" value value="${car.id}"/>
	</c:url>
	<br><br>	
</c:forEach> 
	
	<br />
	<f:form action="savecar" method="post" modelAttribute="carAttribute">
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
	<a href="/CarRental/login"><h2>Logout</h2></a>
</body>
</html>