<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>LOGIN</h1>
	<form action="${pageContext.request.contextPath}/login" method="post">
		USERNAME : <input name="username"  /><br>
		PASSWORD : <input name="password"  type="password"/><br>
		<button>로그인</button>
		<%-- <input type="hidden" name="_csrf" value="${_csrf.token}" /> --%>
	</form>
	${message}
	
</body>
</html>






