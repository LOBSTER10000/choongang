
<%@page import="testWeb.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String str= request.getParameter("order");
	int num = Integer.parseInt(str);
%>
<table border ="1">
<tr><td>사번</td><td>이름</td>
<td>
<form action="sortLIst.jsp">
<select name= "order" onChange="submit()">
<option value="0">부서별</option>
<option value="1">오름차순</option>
<option value="2">내림차순</option>
</select>
</form>
</td></tr>
<%
	EmpDao ed = EmpDao.getInstance();
	for(Emp emp : ed.selectAll(num)){
		
%>
	<tr><td><%=emp.getEname() %></td>
	<td><a href="content.jsp?empno=<%=emp.getEmpno() %>"><%=emp.getEmpno() %></a></td>
	<td><%=emp.getJob() %></td>
	<td><%=emp.getDeptno() %></td></tr>
<%		
	}
%>
</table>
</body>
</html>