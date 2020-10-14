package de.drv.tag1.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class CookieFilter
 */
@WebFilter("/*")
public class CookieFilter implements Filter {

    /**
     * Default constructor. 
     */
    public CookieFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hsr = (HttpServletRequest) request;
		
		if (response.getContentType() != "text/html") {
			chain.doFilter(request, response);
			return;
		}
		
		boolean hasAllowedCookies = false;
		
		for (Cookie cookie : hsr.getCookies()) {
			if (cookie.getName().equals("_drv_cookiepolicy")) {
				hasAllowedCookies = true;
				break;
			}
		}
		
		if (!hasAllowedCookies) {
			response.getWriter().append("Akzeptieren Sie Cookies?");
			response.getWriter().append("<a href=\"/cookieserlauben\">Ja</a>");
		}
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
