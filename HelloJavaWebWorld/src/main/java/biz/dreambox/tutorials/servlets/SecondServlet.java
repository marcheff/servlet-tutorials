<<<<<<< HEAD
package biz.dreambox.tutorials.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet
{

    private static final long serialVersionUID = -1757531409531136302L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        System.out.println("click");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        String userName = request.getParameter("userName");
        String pageOutput = MessageFormat.format("<html><head><title>Here we go!</title></head><body>Hello, {0}!</body></html>",
                                                 new Object[] { userName  });
        out.println(pageOutput);
    }

}
=======
package biz.dreambox.tutorials.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet
{

    private static final long serialVersionUID = -1757531409531136302L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        resp.getOutputStream().println("Second servlet!");
    }

}
>>>>>>> refs/remotes/origin/master
