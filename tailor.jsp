


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color: lavender">
	<h1>
		<center>User Sign Up</center>
	</h1>


	<center>
		<form:form method="post" action="/tailorRegister" modelAttribute="tailor">
		
			<table>
				<tr>
					<td>Shop Name</td>
					<td><form:input  name="shopName" path="shopName" /></td>
				</tr>

				<tr>
					<td>Address</td>
					<td><form:textarea name="Address" path="Address" /></td>
				</tr>

				<tr>
					<td>Contact Number</td>
					<td><form:input name="contactNumber" path="contactNumber" /></td>
				</tr>
				
				<tr>
					<td>working hours</td>
					<td><form:input name="workingHours" path="workingHours" /></td>
				</tr>

				<tr>
					<td>Available Services</td>
					<td><form:input name="availableServices" path="availableServices" /></td>
				</tr>

				<tr>
					<td>Courier Service Available ?</td>
					<td>YES <form:radiobutton path="courier" name="courier" value="1" /></td>
					<td>NO <form:radiobutton path="courier" name="courier" value="0" /></td>
				</tr>
              
				<tr>
					<td><input type="submit" value="register" /></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>





