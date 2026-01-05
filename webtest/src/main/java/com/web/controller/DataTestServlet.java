package com.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/datatest.do")
public class DataTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DataTestServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("request","requestData");
		
		
		HttpSession session = request.getSession();
		session.setAttribute("session","sessiondata");
		
		ServletContext context = getServletContext();
		context.setAttribute("context","contextdata");
		
//		RequestDispatcher rd = request.getRequestDispatcher("/view/dataview.do");
//		rd.forward(request,response);
		
		response.sendRedirect(request.getContextPath()+"/view/dataview.do");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
