package com.web;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.gestionDao;
import com.model.Livre;

/**
 * Servlet implementation class ajouterliv
 */
@WebServlet("/ajouterliv")
public class ajouterliv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	gestionDao l;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajouterliv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		l=new gestionDao();
		
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   String titre=request.getParameter("titre");
		   String auteur=request.getParameter("auteur");
		   String categorie=request.getParameter("categorie");
		   int lv=l.ajouterLivre(titre,auteur,categorie);
		
		   response.sendRedirect("ajouterlivre.jsp?d=done");
		   
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


}
