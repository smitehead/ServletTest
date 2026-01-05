package com.web.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.model.dto.Person;


@WebServlet("/view/personview.do")
public class PersonViewServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//이전 서블릿이 저장한 데이터를 가져오기
		Person p =(Person) request.getAttribute("person");
		
		StringBuilder html = new StringBuilder("<html>");
		html.append("<head>");
		html.append("<meta charset=\"utf-8\">");
		html.append("</head>");
		html.append("<body>");
		html.append("<h3>"+p.getName()+"님 개인취향 테스트 결과</h3>");
		html.append("<p> 당신의 나이는 "+p.getAge()+"키는 "+p.getHeight()+"cm</p>");
		html.append("<h3>좋아하는 색은 <span style='color : ="+p.getColor()+"</h3>'");
		html.append("<h3>좋아하는 동물</h3>");
		html.append("<ul>");
		for(String a : p.getAnimals()) {
			String src="";
			switch (a) {
			case "강아지": src="banana.jpg";break;
			case "고양이": src="banana1.webp";break;
			default:
				break;
			}
			html.append("<li>");
			html.append("<img src='"+request.getContextPath()+"/images/"+src+"' width='100' height='100'>");
			html.append("</li>");
		}
		html.append("</ul>");
		html.append("</body>");
		html.append("</html>");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(html.toString());
		response.getWriter().write(html.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);//걍 요청이라서 doget을 호출해서 doget하나만써도 가능
	}

}
