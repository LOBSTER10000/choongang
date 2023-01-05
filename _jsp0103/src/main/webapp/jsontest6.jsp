<%@page import="jdbc.Dao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
		Dao dao = Dao.getInstance();
		String lst = dao.selectEmpJson();
		out.println(lst);
%>