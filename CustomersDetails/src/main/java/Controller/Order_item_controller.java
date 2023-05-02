package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import dao.Data_access_object;
import dto.data_transfer_object_customer;
import dto.data_transfer_object_order;
import dto.data_transfer_object_order_item;

/**
 * Servlet implementation class Order_item_controller
 */
@WebServlet("/Order_item_controller")
public class Order_item_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Order_item_controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<data_transfer_object_customer> user=null;
		try {
		 user=Data_access_object.getAllDetails();
	} catch (Exception e) {
		
		e.printStackTrace(); 
	}
		request.setAttribute("key", user);

		request.getRequestDispatcher("Select.jsp").forward(request, response);
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String id=request.getParameter("id");
		String order_id=request.getParameter("order_id");
		String item_name=request.getParameter("item_name");
		String item_sku=request.getParameter("item_sku");
		String item_rate=request.getParameter("item_rate");
		String ordered_qty=request.getParameter("ordered_qty");
		String order_total=request.getParameter("order_total");
		data_transfer_object_order_item orderitemobj=new data_transfer_object_order_item(order_id, item_name, item_sku, item_rate, ordered_qty, order_total);
		try {	
		Data_access_object.customers_order_item(orderitemobj);
		}catch(Exception e) {
			System.out.println(e);
		}
		response.sendRedirect("index.jsp");
		
	}
}
