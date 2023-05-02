<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
<h2 align="center">CUSTOMERS ADDRESS</h2>
<table align="center">
	<tr>
		<form action="address" method="post">
				<td>customer_id:<input type="text" name="customer_id" id="customer_id"></td>
				</tr>
			<tr>
				<td>address_type:<input type="text" name="address_type" id="address_type"></td>
			</tr>
			<tr>
				<td>address_line1:<input type="text" name="address_line1"
					id="address_line1"></td>
				</tr>
			<tr>
				<td>address_line2:<input type="text" name="address_line2" id="address_line2">
				</td></tr>
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
				<td>city:<input type="text" name="city" id="city"><br /></td>
				</tr>
				<tr>
				<td>state:<input type="text" name="state" id="state"></td>
				</tr>
				<tr>
				<td>country:<input type="text" name="country" id="country"></td>
				</tr>
				<tr>
				<td>postal_code:<input type="text" name="postal_code" id="postal_code"></tr>
				</tr>
				<tr>
			<td><button type="submit">submit</button></td>
			</tr>
		</form>
		</table>

</body>
</html>

