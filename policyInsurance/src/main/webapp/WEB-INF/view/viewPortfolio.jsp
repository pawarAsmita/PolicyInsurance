<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<!-- Add border for visualization -->
		<h2>Policy Table</h2>
		<tr>
			<th rowspan="2">Policy Name</th>
			<th rowspan="2">Insurance Tenure (Yrs)</th>
			<th colspan="2">Financial Details</th>

		</tr>

		<c:forEach var="policy" items="${requestScope.policies}">
			<tr>
				<td>${policy.policy}</td>
				<td>${policy.tenure}</td>
				<td>${policy.amount}</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>