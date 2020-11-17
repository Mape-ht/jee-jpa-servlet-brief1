package com.test;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		//PrintWriter out = res.getWriter();
		//out.println("result is " + k);
		
		//request dispatcher
		//req.setAttribute("k", k);
		
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
		//rd.forward(req, res);
		
		//redirect 
		//res.sendRedirect("sq?k="+k); 	//session management URL rewriting 
		HttpSession session = req.getSession(); //Créer une session ou appeler une session si elle existe déjà
		session.setAttribute("k", k);
		
		//Cookie cookie= new Cookie("k", k +"");  //create cookie first a tken is given and the value must be a string 
		//res.addCookie(cookie);					//send response to client abd client send request to sqServlet again with the cookie as well
		
		res.sendRedirect("sq");
		
	}
}
