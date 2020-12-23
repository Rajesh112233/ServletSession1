package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class s2
 */
//@WebServlet("/s2")
public class S2 extends HttpServlet {
	 
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int nn1=Integer.parseInt(request.getParameter("n1"));
		int nn2=Integer.parseInt(request.getParameter("n2"));
		int p=nn1*nn2;
		// get attribute from request object
		int sum=(int)request.getAttribute("sum");// typecasting
		PrintWriter out= response.getWriter();
		
		out.println("sum is= "+sum);
		out.println("product is= "+p);
	 }
  }
