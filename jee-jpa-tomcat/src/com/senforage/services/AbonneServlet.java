package com.senforage.services;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.senforage.dao.AbonneImpl;
import com.senforage.dao.IAbonne;
import com.senforage.dao.IVillage;
import com.senforage.dao.VillageImpl;
import com.senforage.entities.Abonne;
import com.senforage.entities.Village;

/**
 * Servlet implementation class AbonneServlet
 */
@WebServlet("/Abonne")
public class AbonneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IAbonne abonnedao ;
	private IVillage villagedao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AbonneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		abonnedao = new AbonneImpl();
		villagedao = new VillageImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  List<Abonne> abonnes = abonnedao.findAllAbonnes();
		  request.setAttribute("abonnes", abonnes); 
		
		  request.setAttribute("villages", villagedao.findAllVillages());
		 
		 
		request.getRequestDispatcher("WEB-INF/abonne/add.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adresse = request.getParameter("adresse").toString();
		String nom = request.getParameter("nom").toString();
		String telephone = request.getParameter("telephone").toString();
		int village_id = Integer.parseInt(request.getParameter("village_id"));
		Village village = new Village();
		village = villagedao.getVillage(village_id);
		
		Abonne abonne = new Abonne();
		abonne.setAdresse(adresse);
		abonne.setNom(nom);
		abonne.setTelephone(telephone);
		abonne.setVillage(village);
		
		abonnedao.add(abonne);
		doGet(request, response);
	}

}
