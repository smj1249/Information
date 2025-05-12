<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%! Connection con = null; %> <%-- 전역 선언 --%>
<%
    try {
        Class.forName("oracle.jdbc.OracleDriver");
        con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "system", "1234"
        );
    } catch(Exception e) {
        e.printStackTrace();
    }
%>
