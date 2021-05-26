package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.gestionDao;
import com.model.Etudiant;


/**
 * Servlet implementation class ajouteretudiant
 */
@WebServlet("/ajouteretudiant")
public class ajouteretudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	gestionDao n;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajouteretudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		n=new gestionDao();
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		   String nom=request.getParameter("nom");
		   String prn=request.getParameter("prenom");
		   String lg=request.getParameter("log");
		   String ps=request.getParameter("pass");
		   int u=n.ajouteretudiant(nom,prn,lg, ps);
		
		   response.sendRedirect("registre.jsp?s=done&nom="+nom+"&prn="+prn);
		   
		// TODO Auto-generated method stub
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
