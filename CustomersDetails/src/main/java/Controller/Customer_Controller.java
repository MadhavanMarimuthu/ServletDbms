	package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import dao.Data_access_object;
import dto.data_transfer_object_address;
import dto.data_transfer_object_customer;


@WebServlet("/Customer_Controller")
public class Customer_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Customer_Controller() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.sendRedirect("Customer_address.jsp");

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String id=request.getParameter("id");
		String name=request.getParameter("name");
		String code=request.getParameter("code");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String contact_person_name=request.getParameter("contact_person_name");
		String contact_person_phone=request.getParameter("contact_person_phone");
		String status=request.getParameter("status");
		String created_date=request.getParameter("created_date");
		String created_by=request.getParameter("created_by");
		String modified_date=request.getParameter("modified_date");
		String modified_by=request.getParameter("modified_by");
		System.out.println("customers......");
		data_transfer_object_customer userobj=new data_transfer_object_customer(name, code, email, phone, contact_person_name, contact_person_phone, status, created_date,created_by ,modified_date, modified_by);
		try {
			Data_access_object.saveuser(userobj);
		}catch(Exception e) {
			System.out.println(e);
		}
	doGet(request, response);
		
	}
}
