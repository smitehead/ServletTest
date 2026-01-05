package com.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/senderedirettest.do")
public class SendRedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SendRedirectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("요청받음");
		
		//특정 데이터의 입력 수정 삭제 로그인 로그아웃 후 응답할때 사용
		response.sendRedirect(request.getContextPath()+"/views/person.html");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
