package biz.dreambox.tutorials.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.dreambox.utils.DummyUtils;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet(description = "This is my first servlet :)", urlPatterns = { "/FirstServlet", "/SimpleServlet" })
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
		writer.println("<b>My first servlet output :)</b><br />");
		writer.println("<a href=\"/HelloJavaWebWorld\">Go back</a>");
		
		DummyUtils.sayHello();
	}

}
