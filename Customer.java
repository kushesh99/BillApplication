package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Customer extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String custid = request.getParameter("custid");
		String custname  = request.getParameter("custname");
	    String custmob = request.getParameter("custmob");
	    String custmail = request.getParameter("custmail");
	    Model m = new Model();
	    m.setCustid(custid);
	    m.setCustname(custname);
	    m.setCustmob(custmob);
	    m.setCustmail(custmail);
	   boolean status = m.customer();
	   
   
		
	}

}
