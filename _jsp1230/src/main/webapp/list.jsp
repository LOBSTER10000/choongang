<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
String str = request.getParameter("order");
int num = 0;
if (str !=null){
	num = Integer.parseInt(str);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<body>
<table border="1">
<tr><td>사번</td><td>이름</td>
<td>

<select onChange="order(this.value)">
<option value="0">부서별</option>
<option value="1">오름차순</option>
<option value="2">내림차순</option>
</select>

</td></tr>
		<%
		EmpDao ed = EmpDao.getInstance();
		ed.realSelectAll();
		for (Emp emp : ed.selectAll(num)){
		%>
	<tr>
	<td><a href="javascript:;"
	 onclick="detail(<%=emp.getEmpno() %>);">
	 <%=emp.getEmpno()%></a></td>
	<td><%=emp.getEname()%></td>
	<td><%=emp.getDeptno()%></td></tr>
	<%	
	}
	%>
</table>
</body>
</html>