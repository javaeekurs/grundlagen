package de.drv.tag1.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

// Der Filter wird auf jeder Seite verwendet
@WebFilter("/*")
public class LogFilter implements Filter {


	@Override
	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
		// Vorher
		// response.getWriter().append("Start Filter");
		
		// Wir brauchen ggf. einen HttpServletRequest
		HttpServletRequest hsr = (HttpServletRequest) request;
		
		System.out.println("Besucher: " + hsr.getRemoteHost());
		System.out.println("Auf Seite: " + hsr.getRequestURI());
		
		chain.doFilter(request, response);
		
		// Nach der Ausführung
//		response.getWriter().append("<!-- Generiert vom Filter-->");
		
		// Nachher
		// response.getWriter().append("Ende Filter");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
