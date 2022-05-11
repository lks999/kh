<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String main = request.getParameter("mainMenu");
	String side = request.getParameter("sideMenu");
	String drink = request.getParameter("drinkMenu");
	
	int sum = (int) request.getAttribute("sum");
	
	System.out.println("-----------------------@jsp---------------------------");
	System.out.println(main + ", " + side + ", " + drink);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 결과 페이지</title>
<style>
span#mainMenu {
	color: navy;
	font-size: 2em;
}

span#sideMenu {
	color: indigo;
	font-size: 1.5em;
}

span#drinkMenu {
	color: yellowgreen;
}

span#price {
	color: maroon;
	font-size: 2.5em;
}
</style>
</head>
<body>
	<h2>감사합니다.</h2>
	<span id="mainMenu"><%= main %></span>,
	<span id="sideMenu"><%= side %></span>,
	<span id="drinkMenu"><%= drink %></span>을/를 주문하셨습니다.
	<br /> 총 결제금액은
	<span id="price"><%= sum %>원</span> 입니다.
</body>
</html>
