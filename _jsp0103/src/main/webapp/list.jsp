<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<a href="insertEmpForm.jsp">��� ���</a>
<table border="1">
		<tr>
			<td>���</td>
			<td>�̸�</td>
			<td>
					<select onChange="order(this.value)">
						<option value="0">�μ���</option>
						<option value="1">��������</option>
						<option value="2">��������</option>
					</select>
			</td>
			<td><a href="#">����</a></td>
		</tr>
		<%
		Dao ed = Dao.getInstance();
		for (Emp emp : ed.selectEmpTempAll()) {
		%>
		<tr>
			<td><a href="updateEmpForm.jsp?empno=<%=emp.getEmpno()%>"><%=emp.getEmpno()%></a></td>
			<td><%=emp.getEname()%></td>
			<td><%=emp.getDeptno()%></td>
			<td><a href="delete.jsp?empno=<%=emp.getEmpno()%>">����</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>