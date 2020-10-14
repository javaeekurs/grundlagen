package de.drv.tag1.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionCreateServlet
 */
@WebServlet("/start")
public class SessionCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionCreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Session -> Sitzung
		// Seitenübergreifenden Speichern von Sitzungs-Informationen
		HttpSession session = request.getSession();
		
		// In die Session schreiben 
		// Wird auf dem Server gespeichert (Also die Daten)
		// Auf dem Client (Browser) existiert nur die SessionId
		session.setAttribute("besucher", "Martin");
		
		response.getWriter().append("Session Informationen gesetzt");
	}

}
