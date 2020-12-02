<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
       
<!DOCTYPE html>
<html>
<body>
Welcome!<br>
Search Bar: maker, model, year of made, capacity, price --> details --> reserve page<br>
Showing available cars with basic info, like price, capacity, pics in 2 colomns--> details --> reserve page
 <c:forEach var="car" items="${carList}">
	${car.id}
	${car.maker}
	${car.model}
	${car.yearmade}
	${car.isReserved}
	<br><br>	
</c:forEach> 
	<h4>Reserve Car</h4>
	<f:form action="resForm" modelAttribute="resinfo">
		<label>Enter Car ID</label> <f:input type="text" name="carId" path="carId"/>
		<br/>
		<label>Enter Email</label> <f:input type="text" name="userEmail" path="userEmail"/>
		<br />
		<label>Enter Pick Up</label> <f:input type="text" name="pickUp" path="pickUp"/>
		<br />
		<label>Enter Drop Off</label> <f:input type="text" name="dropOff" path="dropOff"/>
		<br />
		<input type="submit" value="Reserve"/>
	</f:form>
</body>
</html>