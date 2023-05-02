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
import java.sql.Statement;
import java.util.List;

import Connection.dp;
import dao.Data_access_object;
import dto.data_transfer_object_customer;

/**
 * Servlet implementation class Selectquery
 */
@WebServlet("/Update5Customer")
public class Update_5_Customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update_5_Customer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Connection conn = null;
	        PreparedStatement pstmt = null;

		  int numRowsUpdated = 0;
		try {
        	conn = dp.getConnection();
      
            String sql = "UPDATE tb_madha_customers SET status = 'Deleted'"
                       + " WHERE status = 'Active' LIMIT 5";
            pstmt = conn.prepareStatement(sql);
            numRowsUpdated = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        
		}
      
      
        List<data_transfer_object_customer> user=null;
    	try {
    	 user=Data_access_object.getAllDetails();
    } catch (Exception e) {
    	
    	e.printStackTrace(); 
    }
    	request.setAttribute("key", user);

    	request.getRequestDispatcher("update.jsp").forward(request, response);
    
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		       
	}
}

