package br.yago;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CabecalhoHttp
 */
@WebServlet("/CabecalhoHttp")
public class CabecalhoHttp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	Enumeration<String> headers = request.getHeaderNames();
	while (headers.hasMoreElements()){
		String header = (String) headers.nextElement();
		out.println(header+ ":"+ request.getHeader(header)+"<br>");
	}
	
	
}
	}