package de.drv.tag1.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HitServlet
 */
@WebServlet("/hit")
public class HitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int count;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HitServlet() {
        super();
        
        // Globalen Variable
        // Singleton
        this.count = 0;
    }
    
    public void init() {
    	System.out.println("Servlet wird geladen");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.count++;
		
		PrintWriter out = response.getWriter();
		
		// TODO Auto-generated method stub
		out.println("Anzahl Besuche: " + this.count);
	}
	
	public void destroy() {
		System.out.println("Destroyed");
		// Hier würde man die Hits in einer Datenbank speichern etc.
	}

}
