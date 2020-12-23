package com.attr;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1
 */

public class S1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("html/text");  
      String no1= request.getParameter("n1");
      String no2= request.getParameter("n2");
      int nn1=Integer.parseInt(no1);
      int nn2=Integer.parseInt(no2);
      //add
     // PrintWriter out=response.getWriter();
      int s=nn1+nn2;
      //out.println(s);
      //attribute
      request.setAttribute("sum",s);
      // now forward request
      RequestDispatcher rd= request.getRequestDispatcher("s2");
      rd.forward(request,response);
	}
 }
