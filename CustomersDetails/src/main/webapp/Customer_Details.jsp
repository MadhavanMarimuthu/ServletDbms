
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Details</title>
<style type="text/css">
body{background-color:#8ad182;

}
button{
background-color:#98a896;
    border: none;
}

</style>
</head>
<body>
<h2 align="center">CUSTOMERS DETAILS</h2>
	<table align="center">
	<tr>
		<td><form action="Customer_Controller" method="post"></td>
	</tr>
	<tr>
		<td>name:<input type="text" name="name" id="name"></td>
	</tr>
	<tr>
		<td>code:<input type="text" name="code" id="code"></td>
		</tr>
	<tr>
		<td>email:<input type="text" name="email" id=email></td>
	</tr>
	<tr>
		<td>phone:<input type="text" name="phone" id="phone"></td>
</tr>
	<tr>
		<td>contact_person_name:<input type="text" name="contact_person_name"
			id="contact_person_name"></td>
		</tr>
	<tr>
		<td>contact_person_phone:<input type="text" name="contact_person_phone"
			id="contact_person_phone"></td>
	</tr>
	<tr>
		<td>status:<input type="text" name="status" id="status"></td>
</tr>
<tr>
	<td>	created_date:<input type="date" name="created_date" id="created_date"></td>
</tr>
<tr>
		<td>created_by:<input type="text" name="created_by" id="created_by"></td>
	</tr>
	<tr>
		<td>modified_date:<input type="date" name="modified_date"
			id="modified_date"></td>
	</tr>
	<tr>
		<td>modified_by:<input type="text" name="modified_by" id="modified_by"></td>
		</tr>
		<tr>

	<td><button onclick="submit">submit</button><td>
	</tr>
	</form>
		</table>

</body>
</html>