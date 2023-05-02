
<%@page import="dto.data_transfer_object_address"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
background-color:#8ca8f5;

}
button{
background-color:#b0b5b5;
    border: none;
}

</style>
</head>
<body>
<h2>CUSTOMERS ADDRESS</h2> 
<div>
<div>
<table border="1">
<tr>
<th>id</th>
<th>customer_id</th>
<th>address_type</th>
<th>address_line1</th>
<th>address_line2</th>
<th>city</th>
<th>state</th>
<th>country</th>
<th>postal_code</th>

</tr>

<%
List<data_transfer_object_address> user= (List<data_transfer_object_address>)request.getAttribute("key");
if(null!=user && user.size()>0){
for(data_transfer_object_address customer:user){
%>
	<tr>
	<td><%= customer.getId() %></td>
	<td><%= customer.getCustomer_id() %></td>
	<td><%= customer.getAddress_type() %></td>
	<td><%= customer.getAddress_line1() %></td>
	<td><%= customer.getAddress_line2() %></td>
	<td><%= customer.getCity() %></td>
	<td><%= customer.getState() %></td>
	<td><%= customer.getCountry() %></td>
	<td><%= customer.getPostal_code() %></td>
	
	</tr>
<% }
}else{
%>
<tr><td colspan="9">No Record Found</td>
<%}%>

<div>
<tr>

</tr>
</div>
</table>
<button onclick="window.location.href='index.jsp'">Return to home</button>
</form>
</div>
</div>
</body>
</html>





