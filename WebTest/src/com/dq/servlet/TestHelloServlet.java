package com.dq.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestHelloServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		System.out.println(req.getContentType()+","+req.getCharacterEncoding());
		
		
		String temp=req.getParameter("name");
		byte[] temp2 = temp.getBytes("UTF-8");    
		String name = new String(temp2);
		System.out.println("姓名："+name);
		System.out.println("第"+req.getAttribute("count")+"个在线");
		
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method " );
		out.println("  </BODY>");
		out.println("在线</HTML>"+name);
		out.flush();
		out.close();
	}
	@Override
	public String getInitParameter(String name) {
		System.out.println("getInitParameter");
		return super.getInitParameter(name);
	}
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init");
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig");
		return super.getServletConfig();
	}
	
	
	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo"+super.getServletInfo());
		return super.getServletInfo();
	}
	
	@Override
	public String getServletName() {
		System.out.println("getServletName"+super.getServletName());
		return super.getServletName();
	}
}
