package com.web;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.gestionDao;
import com.model.Etudiant;


/**
 * Servlet implementation class auth
 */
@WebServlet("/auth")
public class auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	gestionDao aut;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public auth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		aut=new gestionDao();
		
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 String lg=request.getParameter("log");
		   String ps=request.getParameter("pass");
		   Etudiant et=aut.authentification(lg, ps);
		   
		   if(et!=null)
		   {
			   HttpSession ses = request.getSession(true);
			   
			   ses.setAttribute("etudiant", et);
			   
			   response.sendRedirect("biblio.jsp");
		   }else
			  
			   {
			   	
			   	response.sendRedirect("authen.jsp?res=err");
			   }
		
		
		
		
	}



}
