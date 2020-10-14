package de.drv.tag1.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		if (request.getCookies() == null) {
			out.println("Keine Cookies gesetzt");
			return;
		}
		
		boolean hasCookieBanner = false;
		
		for (Cookie cookie : request.getCookies()) {
			out.println(cookie.getName());
			
			if (cookie.getName().equals("cookiebanner")) {
				hasCookieBanner = true;
			}
		}
		
		System.out.println(hasCookieBanner);
		
		if (hasCookieBanner) {
			out.println("Sie haben Cookies erlaubt");
		} else {
			out.println("ERlauben Sie Cookies?");
			
			// Hier setzen wir ein Cookie
			
			Cookie cookie = new Cookie("cookiebanner", "ja");
			cookie.setMaxAge(60 * 60 * 24 * 365);
			
			
			// String -> uuid -> Datenbank speichern und ins Cookie setzen
			Cookie cookieUser = new Cookie("user", "IRGENDEINENZUFALLSWERT");
			
			response.addCookie(cookie);
		}
		
	}

}
