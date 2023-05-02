package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import Connection.dp;
import dao.Data_access_object;
import dto.Status_And_Addresstype;
import dto.data_transfer_object_address;
import dto.data_transfer_object_customer;
@WebServlet("/Status_And_Address_Controller")
public class Status_And_Address_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Status_And_Address_Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
        List<Status_And_Addresstype> user=null;
    	try {
    	 user=Data_access_object.Status_And_Address();
    } catch (Exception e) {
    	
    	e.printStackTrace(); 
    }
    	request.setAttribute("key", user);

    	request.getRequestDispatcher("Status_And_Addresstype.jsp").forward(request, response);
    
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}