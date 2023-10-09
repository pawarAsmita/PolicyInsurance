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
	<form action="deletePolicyMethod" method="post">


		<label>Policy Name:</label> <select name="policy">
			<c:select var="policy" items="${requestScope.policies}">
				<option value="${policy.Id}">${policy.policy}</option>
			</c:select>
		</select> <input type="submit" value="Delete">

	</form>
</body>
</html>