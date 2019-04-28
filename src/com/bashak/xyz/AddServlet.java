package com.bashak.xyz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int i, j, k;
		
		i = Integer.parseInt(request.getParameter("num1"));
		j = Integer.parseInt(request.getParameter("num2"));
		
		k = i+j;
		
		PrintWriter out = response.getWriter();
		
		out.println("Result is = " +k);
	}

}
