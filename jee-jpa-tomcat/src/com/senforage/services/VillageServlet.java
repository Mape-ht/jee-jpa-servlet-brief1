package com.senforage.services;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.senforage.dao.IVillage;
import com.senforage.dao.VillageImpl;
import com.senforage.entities.Village;



/**
 * Servlet implementation class VillageServlet
 */
@WebServlet("/Village")
public class VillageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IVillage villagedao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VillageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		villagedao = new VillageImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
			
			List<Village> villages=villagedao.findAllVillages();
			request.setAttribute("villages", villages);
		
			request.getRequestDispatcher("WEB-INF/village/add.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nomVillage = request.getParameter("nomVillage").toString();
		Village village = new Village();
		village.setNom(nomVillage);
		villagedao.add(village);
		doGet(request, response);
	}

}
