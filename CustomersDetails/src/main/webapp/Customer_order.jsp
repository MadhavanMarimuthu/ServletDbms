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

<h2 align="center">CUSTOMERS ORDER</h2>
<table align="center">
<tr>
<td><form action="customerorder" method="post"></td>
</tr>
<tr>
  <td>Customer ID:<input type="text" id="customer_id" name="customer_id"></td>
</tr>
<tr>
<td> Order Number:<input type="text" id="order_no" name="order_no"></td>
</tr>
<tr>
 <td>Order Date: <input type="date" id="order_date" name="order_date"></td>
</tr>
<tr>
<td> Number of Items: <input type="number" id="no_of_items" name="no_of_items"></td>
</tr>
<tr>
 <td>Order Subtotal:<input type="number" id="order_sub_total" name="order_sub_total"></td>
</tr>
<tr>
 <td> Order Discount:<input type="number" id="order_discount" name="order_discount"></td>
</tr>
<tr>
 <td>Order Total Amount:<input type="number" id="order_total_amount" name="order_total_amount"></td>
</tr>
<tr>
 <td> Payment Type:<input type="text" id="payment_type" name="payment_type"></td>
</tr>
<tr>
  <td>Delivery Date:<input type="date" id="delivery_date" name="delivery_date"></td>
</tr>
<tr>
  <td>Status:<input type="text" id="status" name="status"></td>
<tr>
<td> Created Date: <input type="date" id="created_date" name="created_date"></td>
</tr>
<tr>
  <td>Created By:<input type="text" id="created_by" name="created_by"></td>
</tr>
<tr>
 <td>Modified Date: <input type="date" id="modified_date" name="modified_date"></td>
</tr>
<tr>
 <td> Modified By:<input type="text" id="modified_by" name="modified_by"></td>
</tr>
<tr>
 <td> <input type="submit" value="Submit"></td>
  </tr> 

</form>
</table>
</body>
</html>