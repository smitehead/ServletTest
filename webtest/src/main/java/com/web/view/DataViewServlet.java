package com.web.view;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/view/dataview.do")
public class DataViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DataViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StringBuilder html = new StringBuilder();
		html.append("<h3>request :" +request.getAttribute("request")+"<h3>");
		HttpSession session = request.getSession();
		html.append("<h3> session: "+session.getAttribute("session")+"<h3>");
		ServletContext context = request.getServletContext();
		html.append("<h3>context :"+context.getAttribute("context")+"<h3>");
		
		html.append("<button onclick='location.replace(\""+request.getContextPath()+"/sessionout.do\");'>session삭제</button>");
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(html.toString());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
