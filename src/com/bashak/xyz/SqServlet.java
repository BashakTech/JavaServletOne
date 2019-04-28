package com.bashak.xyz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HttpSession session = request.getSession();
		int k = (int) session.getAttribute("k");
		
		int g = k*k;
		
		PrintWriter out = response.getWriter();
		out.println("Result of g =k*k is: " +g);
		
		System.out.println("Sq called");
	}

}
