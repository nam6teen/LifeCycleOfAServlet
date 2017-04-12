package com.example.servletlifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class LifeCycleOfAServletServlet extends GenericServlet {

	public LifeCycleOfAServletServlet() {
		System.out.println("Instantiation Phase...");
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Initialization Phase...");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Service Phase...");
		PrintWriter out = response.getWriter();
		out.println("Welcome!!!");
	}

	public void destroy() {
		System.out.println("Destruction Phase...");
	}
}
