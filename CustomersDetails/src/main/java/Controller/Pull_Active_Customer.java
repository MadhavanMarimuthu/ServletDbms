package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Connection.dp;
import dao.Data_access_object;
import dto.data_transfer_object_customer;


/**
 * Servlet implementation class Pull_Active_Customer
 */
@WebServlet("/Pull_Active_Customer")
public class Pull_Active_Customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pull_Active_Customer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        List<data_transfer_object_customer> user=null;
    	try {
    	 user=Data_access_object.activecustomer();
    } catch (Exception e) {
    	
    	e.printStackTrace(); 
    }
    	request.setAttribute("key", user);

    	request.getRequestDispatcher("update.jsp").forward(request, response);
    
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
