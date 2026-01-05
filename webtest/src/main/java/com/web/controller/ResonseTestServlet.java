package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/responsetest.do")
public class ResonseTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ResonseTestServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답 작성하기
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String html="""
				<html>
					<head>
					</head>
					<body>
						<h1>내가만든 응답페이지</h1>
					</body>
					</html>
				""";
		out.write(html);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
