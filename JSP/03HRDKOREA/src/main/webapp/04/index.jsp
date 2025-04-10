<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
:root {
	
}

html {
	
}

* {
	box-sizing: border-box;
}

body {
	padding: 0;
	margin: 0;
}

ul {
	list-style: none;
	margin: 0;
	padding: 0;
}

a {
	text-decoration: none;
	color: black;
}

.wrapper {
	
}

.wrapper>header {
	height: 80px;
}

.wrapper>nav {
	height: 50px;
}

.wrapper>main {
	height: calc(100vh - 80px - 50px - 80px);
	overflow:auto;
}

.wrapper>main h2 {
	text-align: center;
	font-size: 1.8rem;
	font-weight: 400;
}

.wrapper>main table {
	border: 1px solid;
	border-collapse: collapse;
	min-width: 500px;
	min-height: 350px;
	margin: 0 auto;
}

.wrapper>main table th, .wrapper>main table td {
	min-width: 80px !important;
	min-height: 25px !important;
	border: 1px solid;
	text-align: center;
}

.wrapper>main table th {
	background-color: lightgray;
}

.wrapper>footer {
	height: 80px;
}
</style>


</head>
<body>
	<%@page import="Utils.*,java.util.*" %>
	<%
		List<Join2Dto> join_list = DBUtils.getInstance().selectAllJoin2();
	%>
	<div class="wrapper">
		<!--  -->
		<%@include file="/layouts/Header.jsp" %>
		
		<!--  -->
		<%@include file="/layouts/Nav.jsp" %>
		
		<main>
		
			<h2>강사매출현황</h2>
			<table>
				<tr>
					<th>강사코드</th>
					<th>강의명</th>
					<th>강사명</th>
					<th>총매출</th>
				</tr>
				<%
				for(Join2Dto dto : join_list)
				{
				%>	
				<tr>
					<td><%=dto.getTeacher_code() %></td>
					<td><%=dto.getClass_name() %></td>
					<td><%=dto.getTeacher_name() %></td>
					<td><%=dto.getTotal_tuition() %></td>
				</tr>	
					
				<%	
				}
				%>

			
			</table>
		</main>
		
		<!--  -->
		<%@include file="/layouts/Footer.jsp" %>
	
	</div>

</body>
</html>