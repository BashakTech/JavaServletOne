package com.bashak.xyz;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) {
		
		int i, j, k;
		
		i = Integer.parseInt(request.getParameter("num1"));
		j = Integer.parseInt(request.getParameter("num2"));
		
		k = i+j;
		
		System.out.println("Result is = " +k);
	}

}
