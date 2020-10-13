package de.drv.tag1.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormularServlet
 */
@WebServlet({ "/formular", "/verarbeitung" })
public class FormularServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<form action=\"verarbeitung\" method=\"POST\">");
		
		out.println("<input type=\"text\" name=\"vorname\" placeholder=\"Vorname\">");
		
		out.println("<input type=\"text\" name=\"nachname\" placeholder=\"Nachname\">");
		
		out.println("<input type=\"submit\" value=\"Senden\">");
		out.println("</form>");
		
		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String vorname = request.getParameter("vorname");
		String nachname = request.getParameter("nachname");
		
		response.getWriter().append("Kundendaten: " + vorname + " " + nachname);
	}
	
	/**
	 * Aufgabe
	 * 
	 * localhost:8080/tag1/ip
	 * 
	 * -> Servlet
	 * 
	 * Welches die IP Adresse des Besuchers anzeigt
	 * 
	 * BONUS: User-Agent anzeigen ;-)
	 */

}
