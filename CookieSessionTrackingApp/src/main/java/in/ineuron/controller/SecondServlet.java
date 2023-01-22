package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Collect request parameters 
		String pcost = request.getParameter("pcost");
		String pquantity = request.getParameter("pquantity");
		
		//create a cookie as per the requirement
		Cookie c3 = new Cookie("pcost", pcost);
		Cookie c4= new Cookie("pquantity", pquantity);
		
		//Cookies should sent back through response object because you should maintain at server side.
		response.addCookie(c3);
		response.addCookie(c4);
		
		//forward the response to form3.html
		RequestDispatcher rd = request.getRequestDispatcher("/form3.html");
		rd.forward(request, response);
	}

}
