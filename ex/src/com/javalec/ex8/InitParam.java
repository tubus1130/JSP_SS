package com.javalec.ex8;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class initParam
 */
@WebServlet(urlPatterns = {"/initP"}, initParams = {@WebInitParam(name="id", value="tubus1130"), @WebInitParam(name="pw", value="12345")})
public class InitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String id = getInitParameter("id");
//		String pw = getInitParameter("pw");
//		
//		System.out.println("id = " + id);
//		System.out.println("pw = " + pw);
//		String id = getServletContext().getInitParameter("id");
//		String pwd = getServletContext().getInitParameter("pwd");
//		
//		System.out.println("id = " + id);
//		System.out.println("pwd = " + pwd);
		System.out.println("doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
