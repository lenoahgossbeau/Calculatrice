package cm.itac.formation.servlet.bean;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormationTestServlet extends HttpServlet  {
	
	public FormationTestServlet() { 
		
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	                   throws ServletException, IOException {
		String paramAuteur = request.getParameter("auteur");
		String message = "Transmission de variables : OK !" +paramAuteur;
		request.setAttribute("FormationTestWeb", message);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/FormationTestWeb.jsp").
		forward(request, response);
	}
}


