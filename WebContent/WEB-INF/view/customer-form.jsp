<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Customer Form</title>
<link 
	type="text/css"
	rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css"
>
<link 
	type="text/css"
	rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"
>
</head>
<body>
	<div class="wrapper">
		<div class="heading">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div class="container">
		<h3>Save Customer</h3>
		<form:form action="saveCustomer" modelAttribute="customer" method="POST">
		
		<form:hidden path="id" />
		
		<table>
			<tr>
				<td><label for="firstName">First Name:</label></td>
				<td><form:input path="firstName" /><td>
			</tr>
			<tr>
				<td><label for="lastName">Last Name: </label></td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td><label for="email">Email: </label></td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
			
		</form:form>
	
	</div>


</body>
</html>