package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import dao.Data_access_object;
import dto.Customers_Order_And_Item_dto;
import dto.Status_And_Addresstype;

/**
 * Servlet implementation class Customer_Order_And_Item_Controller
 */
@WebServlet("/Customer_Order_And_Item_Controller")
public class Customer_Order_And_Item_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_Order_And_Item_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Customers_Order_And_Item_dto> user=null;
	    	try {
	    	 user=Data_access_object.CustomersOrderAndItemTask();
	    } catch (Exception e) {
	    	
	    	e.printStackTrace(); 
	    }
	    	request.setAttribute("key", user);

	    	request.getRequestDispatcher("Order_And_Item_Mapping.jsp").forward(request, response);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
