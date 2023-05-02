package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connection.dp;
import dto.Customers_Order_And_Item_dto;
import dto.Status_And_Addresstype;
import dto.data_transfer_object_address;
import dto.data_transfer_object_customer;
import dto.data_transfer_object_order;
import dto.data_transfer_object_order_item;
public class Data_access_object {
	public static void saveuser(data_transfer_object_customer userobj) throws ClassNotFoundException, SQLException {
		Connection connection = dp.getConnection();
		String insertQuery = "insert into tb_madha_customers(name,code,email,phone,contact_person_name,contact_person_phone,status,created_date,created_by,modified_date,modified_by)values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		//preparedStatement.setString(1, userobj.getId());
		preparedStatement.setString(1, userobj.getName());
		preparedStatement.setString(2, userobj.getCode());
		preparedStatement.setString(3, userobj.getEmail());
	    preparedStatement.setString(4, userobj.getPhone());
		preparedStatement.setString(5, userobj.getContact_person_name());
		preparedStatement.setString(6, userobj.getContact_person_phone());
		preparedStatement.setString(7, userobj.getStatus());
		preparedStatement.setString(8, userobj.getCreated_date());
		preparedStatement.setString(9, userobj.getCreated_by());
		preparedStatement.setString(10, userobj.getModified_date());
	    preparedStatement.setString(11, userobj.getModified_by());
		preparedStatement.executeUpdate();

	}
	public static void  customers_address(data_transfer_object_address address) throws ClassNotFoundException, SQLException {
		Connection connection = dp.getConnection();
		String insertQuery = "insert into tb_madha_customer_address(customer_id,address_type,address_line1,address_line2,city,state,country,postal_code)values(?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		preparedStatement.setString(1, address.getCustomer_id());
		preparedStatement.setString(2, address.getAddress_type());
		preparedStatement.setString(3, address.getAddress_line1());
		preparedStatement.setString(4, address.getAddress_line2());
	    preparedStatement.setString(5, address.getCity());
		preparedStatement.setString(6, address.getState());
		preparedStatement.setString(7, address.getCountry());
		preparedStatement.setString(8, address.getPostal_code());
		preparedStatement.executeUpdate();
	
}
	
	public static void customerorder(data_transfer_object_order orderobj) throws ClassNotFoundException, SQLException {
		Connection connection = dp.getConnection();
		String order = "insert into tb_madha_customer_order(customer_id,order_no,order_date,no_of_items,order_sub_total,order_discount,order_total_amount,payment_type,delivery_date,status,created_date,created_by,modified_date,modified_by)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(order);
		//preparedStatement.setString(1, orderobj.getId());
		preparedStatement.setString(1, orderobj.getCustomer_id());
		preparedStatement.setString(2, orderobj.getOrder_no());
		preparedStatement.setString(3, orderobj.getOrder_date());
		preparedStatement.setString(4, orderobj.getNo_of_items());
	    preparedStatement.setString(5, orderobj.getOrder_sub_total());
		preparedStatement.setString(6, orderobj.getOrder_discount());
		preparedStatement.setString(7, orderobj.getOrder_total_amount());
		preparedStatement.setString(8, orderobj.getPayment_type());
		preparedStatement.setString(9, orderobj.getDelivery_date());
		preparedStatement.setString(10, orderobj.getStatus());
		preparedStatement.setString(11, orderobj.getCreated_date());
	    preparedStatement.setString(12, orderobj.getCreated_by());
	    preparedStatement.setString(13, orderobj.getModified_date());
	    preparedStatement.setString(14, orderobj.getModified_by());
		preparedStatement.executeUpdate();

	}
	public static void  customers_order_item(data_transfer_object_order_item orderitemobj ) throws ClassNotFoundException, SQLException {
		Connection connection = dp.getConnection();
		String insertQuery = "insert into tb_madha_customer_order_item(order_id,item_name,item_sku,item_rate,ordered_qty,order_total)values(?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		//preparedStatement.setString(1, orderitemobj.getId());
		preparedStatement.setString(1, orderitemobj.getOrder_id());
		preparedStatement.setString(2, orderitemobj.getItem_name());
		preparedStatement.setString(3, orderitemobj.getItem_sku());
	    preparedStatement.setString(4, orderitemobj.getItem_rate());
		preparedStatement.setString(5, orderitemobj.getOrdered_qty());
		preparedStatement.setString(6, orderitemobj.getOrder_total());
		preparedStatement.executeUpdate();
	
}
	
	public static List<data_transfer_object_customer> getAllDetails() throws ClassNotFoundException, SQLException {
		Connection connection = dp.getConnection();
		String SelectQuery = "select * from tb_madha_customers";
		PreparedStatement preparedStatement = connection.prepareStatement(SelectQuery);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<data_transfer_object_customer> user=new ArrayList<data_transfer_object_customer>();
		while(resultSet.next()) {
			String id=resultSet.getString(1);
			String name=resultSet.getString(2);
			String code=resultSet.getString(3);
			String email=resultSet.getString(4);
			String phone=resultSet.getString(5);
			String contact_person_name=resultSet.getString(6);
			String contact_person_phone=resultSet.getString(7);
			String status=resultSet.getString(8);
			String created_date=resultSet.getString(9);
			String created_by=resultSet.getString(10);
			String modified_date=resultSet.getString(11);
			String modified_by=resultSet.getString(12);
			
			data_transfer_object_customer obj=new data_transfer_object_customer(id,name,code,email,phone,contact_person_name,contact_person_phone,status,created_date,created_by,modified_date,modified_by);
			user.add(obj);
	
		}
		return user;
	}
	
	
	public static List<data_transfer_object_customer> activecustomer() throws ClassNotFoundException, SQLException {
		Connection connection = dp.getConnection();
		String pulldetails = "SELECT * FROM tb_madha_customers"
                +" WHERE status = 'Active'";
		PreparedStatement preparedStatement = connection.prepareStatement(pulldetails);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<data_transfer_object_customer> user=new ArrayList<data_transfer_object_customer>();
		while(resultSet.next()) {
			String id=resultSet.getString(1);
			String name=resultSet.getString(2);
			String code=resultSet.getString(3);
			String email=resultSet.getString(4);
			String phone=resultSet.getString(5);
			String contact_person_name=resultSet.getString(6);
			String contact_person_phone=resultSet.getString(7);
			String status=resultSet.getString(8);
			String created_date=resultSet.getString(9);
			String created_by=resultSet.getString(10);
			String modified_date=resultSet.getString(11);
			String modified_by=resultSet.getString(12);
			
			data_transfer_object_customer obj=new   data_transfer_object_customer(id,name,code,email,phone,contact_person_name,contact_person_phone,status,created_date,created_by,modified_date,modified_by);
			user.add(obj);
	
		}
		return user;
	}
	
	
	
	
	public static List<Status_And_Addresstype> Status_And_Address() throws ClassNotFoundException, SQLException {
		Connection connection = dp.getConnection();
		  String sql = "SELECT c.id ,c.name,c.code,c.phone,c.contact_person_name,c.contact_person_phone,c.`status`,a.address_type,a.address_line1,a.city,a.state,a.country,a.postal_code"+
          	    " FROM tb_madha_customers c "+
          	     " JOIN tb_madha_customer_address a  ON a.customer_id= c.id WHERE c.status = 'Active' AND a.address_type= 'Home'";	
        		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Status_And_Addresstype> user=new ArrayList<Status_And_Addresstype>();
		while(resultSet.next()) {
			String id=resultSet.getString(1);
			String name=resultSet.getString(2);
			String code=resultSet.getString(3);
			String phone=resultSet.getString(4);
			String contact_person_name=resultSet.getString(5);
			String contact_person_phone=resultSet.getString(6);
			String status=resultSet.getString(7);
			String address_type=resultSet.getString(8);
			String address_line1=resultSet.getString(9);
			String city=resultSet.getString(10);
			String state=resultSet.getString(11);
			String country=resultSet.getString(12);
			String postal_code=resultSet.getString(13);
			
			
			Status_And_Addresstype object=new Status_And_Addresstype(id,name,code,phone,contact_person_name,contact_person_phone,status,address_type,address_line1,city,state,country,postal_code);
			user.add(object);
	
		}
		return user;
	}

	public static List<Customers_Order_And_Item_dto> 	CustomersOrderAndItemTask() throws ClassNotFoundException, SQLException {
		Connection connection = dp.getConnection();
		  String sql = "SELECT b.id,d.order_id,d.item_name,d.item_sku,d.item_rate,d.ordered_qty,d.order_total,b.order_no,b.payment_type,b.order_date,b.delivery_date"
				    + " FROM tb_madha_customer_order b"
				    + " JOIN tb_madha_customer_order_item d  ON d.id= b.id WHERE b.id LIMIT 5";	
        		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Customers_Order_And_Item_dto> user=new ArrayList<Customers_Order_And_Item_dto>();
		while(resultSet.next()) {
			String id=resultSet.getString(1);
			String order_id=resultSet.getString(2);

			String item_name=resultSet.getString(3);
			String item_sku=resultSet.getString(4);
			String item_rate=resultSet.getString(5);
			String ordered_qty=resultSet.getString(6);
			String order_total=resultSet.getString(7);
			String order_no=resultSet.getString(8);
			String payment_type=resultSet.getString(9);
			String order_date=resultSet.getString(10);
			String delivery_date=resultSet.getString(11);
			
		
			
			
			Customers_Order_And_Item_dto object=new Customers_Order_And_Item_dto(id,order_id,item_name,item_sku,item_rate,ordered_qty,order_total,order_no,payment_type,order_date,delivery_date);
			user.add(object);
	
		}
		return user;
	}
	
		public static List<data_transfer_object_address> getCustomerAddress() throws ClassNotFoundException, SQLException {
			Connection connection = dp.getConnection();
			String pulldetails = "SELECT * FROM tb_madha_customer_address";
			PreparedStatement preparedStatement = connection.prepareStatement(pulldetails);
			ResultSet resultSet = preparedStatement.executeQuery();
			List<data_transfer_object_address> user=new ArrayList<data_transfer_object_address>();
			while(resultSet.next()) {
				String id=resultSet.getString(1);
				String customer_id=resultSet.getString(2);
				String address_type=resultSet.getString(3);
				String address_line1=resultSet.getString(4);
				String address_line2=resultSet.getString(5);
				String city=resultSet.getString(6);
				String state=resultSet.getString(7);
				String country=resultSet.getString(8);
				String postal_code=resultSet.getString(9);
				
				
				data_transfer_object_address obj=new data_transfer_object_address(id,customer_id,address_type,address_line1,address_line2,city,state,country,postal_code);
				user.add(obj);
		
			}
			return user;
		}
 }
