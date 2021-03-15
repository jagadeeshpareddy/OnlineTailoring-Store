


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color: lavender">
	<form:form method="post" action="/userSuccessLogin"	modelAttribute="user">
 		${error} 
		<table>
 			
			<tr>
				<td id="id1"><label>User Id</label></td>
				<td id="id2"><form:input path="userId" name="userId" /></td>
				
			</tr>
 
			<tr>
				<td id="id1"><label>Password</label></td>
				<td id="id5">
				<form:password path="password"  name="password" />
				<form:errors path="password" cssClass="error"/>
				</td>
				
			</tr>
 
			
 
			<tr>
				<td><input type="Submit" name="SignIn" value="Sign In" /></td>
				
			</tr>
 
 
		</table>
	</form:form>
</body>
</html>