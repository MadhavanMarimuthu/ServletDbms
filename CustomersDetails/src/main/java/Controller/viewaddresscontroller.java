package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import dao.Data_access_object;
import dto.Status_And_Addresstype;
import dto.data_transfer_object_address;

/**
 * Servlet implementation class viewaddresscontroller
 */
@WebServlet("/viewaddresscontroller")
public class viewaddresscontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewaddresscontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   List<data_transfer_object_address> user=null;
	    	try {
	    	 user=Data_access_object.getCustomerAddress();
	    } catch (Exception e) {
	    	
	    	e.printStackTrace(); 
	    }
	    	request.setAttribute("key", user);

	    	request.getRequestDispatcher("two_or_three_address.jsp").forward(request, response);
	    
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
