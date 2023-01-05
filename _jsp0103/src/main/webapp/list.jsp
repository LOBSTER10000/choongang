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
<a href="insertEmpForm.jsp">사원 등록</a>
<table border="1">
		<tr>
			<td>사번</td>
			<td>이름</td>
			<td>
					<select onChange="order(this.value)">
						<option value="0">부서별</option>
						<option value="1">오름차순</option>
						<option value="2">내림차순</option>
					</select>
			</td>
			<td><a href="#">삭제</a></td>
		</tr>
		<%
		Dao ed = Dao.getInstance();
		for (Emp emp : ed.selectEmpTempAll()) {
		%>
		<tr>
			<td><a href="updateEmpForm.jsp?empno=<%=emp.getEmpno()%>"><%=emp.getEmpno()%></a></td>
			<td><%=emp.getEname()%></td>
			<td><%=emp.getDeptno()%></td>
			<td><a href="delete.jsp?empno=<%=emp.getEmpno()%>">삭제</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>