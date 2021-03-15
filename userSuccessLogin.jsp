


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color: lavender">
<center>
	<h1>
		Hello customer ${name} 
	</h1>

	<a href="/searchTailor">search tailor</a>
 <br><br>
 <a href="/viewOrders">View Orders</a>
 <br><br>
 <a href="/viewTailors">View Tailor Details</a>
 <br> <br>

 
 <a href="/customerOrder"> Place Order  </a>
</center>
</body>
</html>