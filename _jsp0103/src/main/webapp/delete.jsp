<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String empno = request.getParameter("empno");
	int num = Integer.parseInt(empno);
	Dao dao = Dao.getInstance();
	dao.deletEmptemp(num);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<script>
alert("��� <%=num%>�� �����Ǿ����ϴ�");	
window.location.href("list.jsp");
</script>
</body>
</html>
