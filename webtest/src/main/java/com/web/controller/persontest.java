package com.web.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.model.dto.Person;
import com.web.view.PersonViewServlet;


@WebServlet("/persontest.do")
public class persontest extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public persontest() {
        super();
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//데이터 인코딩 처리하기
		//setCharacterEncoding()메소드 이용
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		
		//for 문으로 예외처리
//		int age =0;
//		String ageStr = request.getParameter("age");
//		if(ageStr !=null &&!ageStr.equals("")) {
//			int age = Integer.parseInt(request.getParameter("age"));
//		}
		
		//익셉션으로 예외처리
		int age =0;
		try {
			age = Integer.parseInt(request.getParameter("age"));
		} catch (NumberFormatException e) {
			// TODO: handle exception
		}
		
		double height = Double.parseDouble(request.getParameter("height"));
		String color = request.getParameter("color");
		String lunch = request.getParameter("lunch");
		String info = request.getParameter("info");
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(color);
		System.out.println(lunch);

		//다수값이 전달됬을때 getParmeter는 단일만 가져와서 안됨 ->getparameterValues("키값")을 사용해야함 String[]

		String[] animals= request.getParameterValues("animals");
		Arrays.stream(animals).forEach(System.out::println);
		
		Person p = Person.builder()
				.name(name)
				.age(age)
				.height(height)
				.lunch(lunch)
				.animals(animals)
				.info(info)
				.color(color)
				.build();
		System.out.println(p);
		//다른 서블릿을 호출하기!!
		RequestDispatcher rd = request.getRequestDispatcher("/view/personview.do");
		//페이지 전환
		//다른 서블릿에서 이용할 데이터를 저장하기
		request.setAttribute("person" , p);
		//key value 형식임
		rd.forward(request, response);
		
		
//		Map<String,String[]> parameters = request.getParameterMap();
//		parameters.forEach((k,v)->{
//			System.out.println(k);
//			System.out.println(Arrays.toString(v));
//		});
//		System.out.println(parameters);


	
	}

}
