package com.kh.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class menuServlet
 */
@WebServlet("/menuOrder.do")
public class menuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 인코딩처리
		request.setCharacterEncoding("utf-8");
		
		// 2. 사용자입력값처리
		String main = request.getParameter("mainMenu");
		String side = request.getParameter("sideMenu");
		String drink = request.getParameter("drinkMenu");
		System.out.println(main + ", " + side + ", " + drink);
		
		// 3. 업무로직
		int sum = 0;
		switch(main) 
		{
		case "한우버거" : sum += 5000;
			break;
		case "밥버거" : sum += 4500;
			break;
		case "치즈버거" : sum += 4000;
			break;
		}
		
		switch(side) 
		{
		case "감자튀김" : sum += 1500;
			break;
		case "어니언링" : sum += 1700;
			break;
		}
		
		switch(drink) 
		{
		case "콜라" : sum += 1000;
			break;
		case "사이다" : sum += 1000;
			break;
		case "커피" : sum += 1500;
			break;
		case "밀크쉐이크" : sum += 2500;
			break;
		}
		
		// 4. 응답메세지 작성 - jsp(view)에 위임
		request.setAttribute("sum", sum);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("/menu/menuEnd.jsp");
		reqDispatcher.forward(request, response);
	}

}
