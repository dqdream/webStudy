package com.dq.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class TestFilter implements Filter{

	private int count;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		count=Integer.valueOf(filterConfig.getInitParameter("num"));
		System.out.println("init"+filterConfig.getServletContext().getServletContextName()
				+filterConfig.getFilterName());
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		count++;
		HttpServletRequest request2=(HttpServletRequest) request;
		request2.setAttribute("count", count);
		System.out.println("doFilter"+request.getParameter("name"));
		chain.doFilter(request, response);
		System.out.println("doFilter");
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
	}

}
