<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% // Request 속성 추가(새로운 요청 시 마다 초기화)
	request.setAttribute("ID1","user1"); 
	request.setAttribute("PW1","1111");

	// Session 속성 추가(지정된 시간까지 유지, 기본 1800초(30분), 단 App종료시 초기화되겠죠?)
	session.setAttribute("ID1","user1"); 
	session.setAttribute("PW1","1111");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="getSession.jsp">정보확인</a>
	
</body>
</html>