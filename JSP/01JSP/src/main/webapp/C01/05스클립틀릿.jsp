<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 단수 입력받아 해당 구구단을 찍어보세요 (Table로 만드세요 - 스크립틀릿) -->
<%
for(int i=2;i<=9;i++){
	System.out.printf("%d단" ,i);
	for(int k=1;k<=9;k++){
		System.out.println(i+" * "+k+" = " + i*k);	
	}
	
}
%>

</body>
</html>