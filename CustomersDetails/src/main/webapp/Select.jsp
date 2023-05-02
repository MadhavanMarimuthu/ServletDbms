
<%@page import="dto.data_transfer_object_customer"%>
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
<h2>CUSTOMERS DETAILS</h2> 
<div>
<div>
<table border="1">
<tr>
<th>id</th>
<th>name</th>
<th>code</th>
<th>email</th>
<th>phone</th>
<th>contact_person_name</th>
<th>contact_person_phone</th>
<th>status</th>
<th>created_date</th>
<th>created_by</th>
<th>modified_date</th>
<th>modified_by</th>
</tr>
<%
List<data_transfer_object_customer> user= (List<data_transfer_object_customer>)request.getAttribute("key");
if(null!=user && user.size()>0){
for(data_transfer_object_customer customer:user){
%>
	<tr>
	<td><%= customer.getId() %></td>
	<td><%= customer.getName() %></td>
	<td><%= customer.getCode() %></td>
	<td><%= customer.getEmail() %></td>
	<td><%= customer.getPhone() %></td>
	<td><%= customer.getContact_person_name() %></td>
	<td><%= customer.getContact_person_phone() %></td>
	<td><%= customer.getStatus() %></td>
	<td><%= customer.getCreated_date() %></td>
	<td><%= customer.getCreated_by() %></td>
	<td><%= customer.getModified_date()%></td>
	<td><%= customer.getModified_by()%></td>
	</tr>
<% }
}else{
%>
<tr><td colspan="12">No Record Found</td>
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





