<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="savePolicy" method="post">
	<h4>Policy Page</h4>
		<label> Policy Name:</label> <select name="policy">
			<option value="Life Insurance">Life Insurance</option>
			<option value="Home Insurance">Home Insurance</option>
			<option value="Term Life">Term Life</option>
			<option value="Health Insurance">Health Insurance</option>
		</select><br /> <label>Insurance Tenure in Yrs:</label> <input name="tenure"
			type="number"><br /> <label>Premium Amount:</label> <input
			type="number" name="amount"><br /> <input type="submit"
			value="Buy">
	</form>
</body>
</html>