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

	<div class="wrapper">
		<!--  -->
		<%@include file="/layouts/Header.jsp"%>

		<!--  -->
		<%@include file="/layouts/Nav.jsp"%>

		<%@page
			import="Utils.*,java.util.*,java.time.LocalDate,java.time.format.DateTimeFormatter"%>
		<%
		List<VoteDto> list = DBUtils.getInstance().selectAllVote(); //860918
		%>
		<main>
			<h2>투표검수조회</h2>
			<table>
				<tr>
					<th>성명</th>
					<th>생년월일</th>
					<th>나이</th>
					<th>성별</th>
					<th>후보번호</th>
					<th>투표시간</th>
					<th>유권자확인</th>
				</tr>
				<%
				for (VoteDto voteDto : list) {
				%>
				<tr>
					<td><%=voteDto.getV_name()%></td>
					<%
					String birthYear = voteDto.getV_jumin().substring(0, 6); //yyMMdd
					System.out.println("birthYear : " + birthYear);
					
					int yy = Integer.parseInt(birthYear.substring(0,2));
					int now = LocalDate.now().getYear()%100;
					System.out.println("now : " + now);
					if(yy>0 && yy<=now)	//01년생 - 24년생
						birthYear = "20"+birthYear;
					else
						birthYear = "19"+birthYear;	//19860918
						
					
					//입력 포맷(yyMMdd)
					DateTimeFormatter infmt = DateTimeFormatter.ofPattern("yyyyMMdd");
					
					LocalDate myBirth = LocalDate.parse(birthYear ,infmt);
						
						
					//출력 포맷(yyyy년MM월dd일생)
					DateTimeFormatter outfmt = DateTimeFormatter.ofPattern("yyyy년MM월dd일생");
					out.println("<td>"+myBirth.format(outfmt)+"</td>");
					%>
					<%-- <td><%=voteDto.getV_jumin()%></td> --%>
					
					
					<td><%=voteDto.getV_jumin()%></td>
					<td><%=voteDto.getV_jumin()%></td>
					<td><%=voteDto.getM_no()%></td>
					<td><%=voteDto.getV_time()%></td>
					<td><%=voteDto.getV_confirm()%></td>
				</tr>
				<%
				}
				%>

			</table>
		</main>

		<!--  -->
		<%@include file="/layouts/Footer.jsp"%>

	</div>

</body>
</html>