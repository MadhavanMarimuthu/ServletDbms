
<%@page import="dto.Status_And_Addresstype"%>
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
}

</style>
</head>
<body>
<h2> ACTIVE CUSTOMERS DETAILS</h2> 
<div> 
<div>
<table border="1">
<tr>

<th>id</th>
<th>name</th>
<th>code</th>
<th>phone</th>
<th>contact_person_name</th>
<th>contact_person_phone</th>
<th>status</th>
<th>address_type</th>
<th>address_line1</th>
<th>city</th>
<th>state</th>
<th>country</th>
<th>postal_code</th>
</tr>
<%
List<Status_And_Addresstype> user= (List<Status_And_Addresstype>)request.getAttribute("key");
if(null!=user && user.size()>0){
for(Status_And_Addresstype customer:user){
%>

	<tr>
	<td><%= customer.getId()%></td>
	<td><%= customer.getName() %></td>
	<td><%= customer.getCode() %></td>
	<td><%= customer.getPhone() %></td>
	<td><%= customer.getContact_Person_Name() %></td>
	<td><%= customer.getContact_Person_Phone() %></td>
	<td><%= customer.getStatus() %></td>
	<td><%= customer.getAddress_Type() %></td>
	<td><%= customer.getAddress_Line1() %></td>
	<td><%= customer.getCity()%></td>
	<td><%= customer.getState()%></td>
	<td><%= customer.getCountry()%></td>
	<td><%= customer.getPostal_Code()%></td>
	</tr>
<% }
}else{
%>
<tr><td colspan="14">No Record Found</td>
<%}%>

<div>
<tr>

</tr>
</div>
</table>
<button ><a href="index.jsp">Return to home page</a></button>

</div>
</div>
</body>
</html>





