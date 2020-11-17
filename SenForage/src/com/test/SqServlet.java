package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//int k = Integer.parseInt(req.getParameter("k")); //pour les servlet normal
		HttpSession session = req.getSession();				//Créer une session ou appeler une session si elle existe déjà
		//and maintain the login
		//session.removeAttribute("k");						//delete data from the session
		//int k = (int)session.getAttribute("k");
		
		int k = 0;
		Cookie cookies[]= req.getCookies();					//use session cookies to send data
		
		for(Cookie c : cookies ) 
		{
			
			if (c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		
		
		k = k*k;
		PrintWriter out = res.getWriter();
		out.println("Result is "+ k);
		
		System.out.println("sq called");
	}
}
