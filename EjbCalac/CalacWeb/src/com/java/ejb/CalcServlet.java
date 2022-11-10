package com.java.ejb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int firstNo,secondNo,result;
		firstNo = Integer.parseInt(request.getParameter("firstNo"));
		secondNo = Integer.parseInt(request.getParameter("secondNo"));
		result = firstNo +secondNo;
		PrintWriter  out = response.getWriter();
		out.println("Sum is " +result + " <br/>");
		result =firstNo - secondNo;
		out.println("Sub is " +result +"<br/>");
		result = firstNo*secondNo;
		out.println("Mult is " +result +"<br/>");
		CalcBeanRemote service = null;

	    // Context compEnv = (Context) new InitialContext().lookup("java:comp/env");

	    // service = (HelloService)new
	    // InitialContext().lookup("java:comp/env/ejb/HelloService");
	    try {
			service = (CalcBeanRemote)
					new InitialContext().lookup("CalcBean/remote");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
