
<%@page import="dto.Customers_Order_And_Item_dto"%>
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
<h2>HALF OF THE CUSTOMERS</h2> 
<div>
<table border="1">
<tr>
<th>id</th>
<th>order_id</th>
<th>item_name</th>
<th>item_sku</th>
<th>item_rate</th>
<th>ordered_qty</th>
<th>order_total</th>
<th>order_no</th>
<th>payment_type</th>
<th>order_date</th>
<th>delivery_date</th>
</tr>
	
<%
List<Customers_Order_And_Item_dto> user= (List<Customers_Order_And_Item_dto>)request.getAttribute("key");
if(null!=user && user.size()>0){
for(Customers_Order_And_Item_dto customer:user){
%>
	<tr>
	<td><%= customer.getId() %></td>
		<td><%= customer.getOrder_id() %></td>
	<td><%= customer.getItem_name() %></td>
	<td><%= customer.getItem_sku()%></td>
	<td><%= customer.getItem_rate() %></td>
	<td><%= customer.getOrdered_qty() %></td>
	<td><%= customer.getOrder_total()%></td>
	<td><%= customer.getOrder_no() %></td>
	<td><%= customer.getPayment_type() %></td>
	<td><%= customer.getOrder_date() %></td>
	<td><%= customer.getDelivery_date()%></td>
	
	</tr>
	<% }
}else{
%>
<tr><td colspan="11">No Record Found</td>
<%}%>

</table>
<div>
<button onclick="window.location.href='index.jsp'">Return to home</button>
</div>
</div>
</div>
</body>
</html>

