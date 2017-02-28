package smvcMybatis.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import smvcMybatis.Entity.User;

/**
 * Servlet Filter implementation class SessionCheckFilter
 */
public class SessionCheckFilter implements Filter {

	private List<String> loginPaths;

	/**
	 * Default constructor.
	 */
	public SessionCheckFilter() {
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
	 * 第一种
	 */
	/*
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest hsr = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		User user = (User) hsr.getSession().getAttribute("user");
		if (user == null) {
			String url = hsr.getContextPath();
			res.sendRedirect(url);
			return;
		}
		chain.doFilter(request, response);
	}
	*/

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 * 第二种
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest hsr = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String servletPath = hsr.getServletPath();
		for (String loginPath : loginPaths) {
			if (servletPath.matches(loginPath)) {
				User user = (User) hsr.getSession().getAttribute("user");
				if (user == null) {
					String url = hsr.getContextPath();
					res.sendRedirect(url);
					return;
				}
			}
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		String includePath = fConfig.getInitParameter("includePathPatterns");
		String[] temp = includePath.split(",");
		loginPaths = Arrays.asList(temp);
	}

}
