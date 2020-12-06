<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
       
<!DOCTYPE html>
<html>
<body>
Welcome!<br>
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
		</c:forEach> 
	</table>
	<h4>Reserve Car</h4>
	<f:form action="resForm" modelAttribute="resinfo">
		<label>Enter Car ID</label> <f:input type="text" name="carId" path="car_id"/>
		<f:errors path="car_id" cssClass="error"/>
		<br/>
		<label>Enter Email</label> <f:input type="text" name="userEmail" path="user_email"/> 
		<f:errors path="user_email" cssClass="error"/>
		<br />
		<label>Enter Pick Up</label> <f:input type="date" name="pickUp" path="pick_up"/> <p>Format: yyyy-mm-dd</p>
		<f:errors path="pick_up" cssClass="error"/>
		<br />
		<label>Enter Drop Off</label> <f:input type="date" name="dropOff" path="drop_off"/> <p>Format:  yyyy-mm-dd</p>
		<f:errors path="drop_off" cssClass="error"/>
		<br />
		<input type="submit" value="Reserve"/>
	</f:form> 
</body>
</html>