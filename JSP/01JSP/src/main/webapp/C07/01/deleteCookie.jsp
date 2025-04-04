<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	String cookieName = request.getParameter("cookieName");
    	System.out.println("cookieName : " + cookieName);	
    
    if(cookieName!=null){
    	Cookie cookie = new Cookie(cookieName,null);		// 빈 Value의 쿠키 생성
    	cookie.setMaxAge(0);							// 쿠키 유지시간 0초 (만료설정)
    	//cookie.setPath("/");							// 쿠키적용 URI 설정 (/ : 모든 영역)
    	response.addCookie(cookie);						// 만료처리 전달
    }
    
    out.println("<script>alert('쿠기삭제완료!'); location.href='getCookie.jsp'; </script>");
    // 만료쿠키 전달 후 다음이동 위치 전달
    //response.sendRedirect("./getCookie.jsp");
    
    %>