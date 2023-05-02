package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.Data_access_object;
import dto.data_transfer_object_address;
@WebServlet("/address")
public class AddressController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public AddressController() {
        super();
  
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.sendRedirect("Customer_order.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Customer_id=request.getParameter("customer_id");
		String address_type=request.getParameter("address_type");
		String address_line1=request.getParameter("address_line1");
		String  address_line2=request.getParameter("address_line2");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		String postal_code=request.getParameter("postal_code");
		data_transfer_object_address address=new data_transfer_object_address(Customer_id,address_type, address_line1, address_line2, city, state, country, postal_code);
		try {
			Data_access_object.customers_address(address);
		}catch(Exception e) {
			System.out.println(e);
		}
		doGet(request, response);
	}

}
