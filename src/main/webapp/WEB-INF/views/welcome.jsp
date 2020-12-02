<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       
<!DOCTYPE html>
<html>
<body>
Car_Id | Maker | Model | Year of Made  <br>
<c:forEach var="car" items="${carList}" >
<tr>
	<td>${car.id}</td>
	<td>${car.maker}</td>
 	<td>${car.model}</td>
	<td>${car.yearMade}</td>
<%-- 	<td>${car.isReserved}</td> 
 --%>	</tr><br><br>
</c:forEach>
<!-- Welcome! -->
<%-- ${carList} --%>
</body>
</html>