package com.lava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<h1>welcome to RegisterServlet</h1>");
String name=request.getParameter("username");
String password=request.getParameter("pass");
String email=request.getParameter("email");
String gender=request.getParameter("user_gender");
String course=request.getParameter("user_courses");
String cond=request.getParameter("condition");

   
if(cond!=null) 
	{
	if(cond.equals("checked"))
	{
		out.println("<p1>name: "+name+"</p1><br>");
		out.println("<p2>password: "+password+"</p2><br>");
		out.println("<p3>email: "+email+"</p3><br>");
		out.println("<p4>gender: "+gender+"</p4><br>");
		out.println("<p5>course: "+course+"</p5><br>");
		
		 RequestDispatcher rd=request.getRequestDispatcher("servlet2");
		 rd.forward(request,response);
	}
	else
	{
	 /* RequestDispatcher  rd= request.getRequestDispatcher("index.html");
	  rd.include(request,response);*/
	}
   
   }
  else 
  {
	  out.println("<h2> you have not accepted terms and conditions</h2>");
	  RequestDispatcher  rd= request.getRequestDispatcher("index.html");
	  rd.include(request,response);
  }
  
    }
   
     }    

