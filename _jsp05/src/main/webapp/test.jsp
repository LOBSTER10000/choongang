<%@page import="java.util.stream.Stream"%>
<%@page import="java.util.Collection"%>
<%@page import="jdbc.Emp"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="jdbc.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	width : 300px;
	height : 300px;
	border-collapse : collapse;
	box-sizing : boder-box;
	margin : 0 auto;
}
td {
	font-size : 22px;
	text-align : center;
}
</style>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="3">
<%
EmpDao ed = EmpDao.getInstance();
List<Emp> list = ed.selectAll(0); 
List<Emp> list1 = ed.selectDeptno();%>
<tr>
<td>
부서
</td>
<td>
평균 연봉
</td>
</tr>
<tr>
<td><% 
int deptno  = 
list1.get(0).getDeptno();
out.println(deptno);
%></td>
<td><%
double avg1 = 
list.stream().filter(n->n.getDeptno() ==10).mapToInt(Emp::getSal).average().getAsDouble();
out.println(avg1);%></td>
</tr>
<tr>
<td><% 
int deptno1  = 
list1.get(1).getDeptno();
out.println(deptno1);
%></td>
<td><%double avg2 = 
list.stream().filter(n->n.getDeptno() ==20).mapToInt(Emp::getSal).average().getAsDouble();
out.println(avg2);%></td>
</tr>

<tr>
<td><% 
int deptno2  = 
list1.get(2).getDeptno();
out.println(deptno2);
%></td>
<td><%double avg3 = 
list.stream().filter(n->n.getDeptno() ==30).mapToInt(Emp::getSal).average().getAsDouble();
out.println(avg3);%></td>
</tr>

</body>
</html>