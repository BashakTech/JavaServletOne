package com.bashak.xyz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int i, j, k;
		
		i = Integer.parseInt(request.getParameter("num1"));
		j = Integer.parseInt(request.getParameter("num2"));
		
		k = i+j;
		
		response.sendRedirect("sq");
		
//		RequestDispatcher rd = request.getRequestDispatcher("sq");
//		rd.forward(request, response);
	}

}
