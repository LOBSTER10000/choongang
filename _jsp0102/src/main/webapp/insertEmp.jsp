<%@page import="jdbc.Emp"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%

	String empnoS = request.getParameter("empno");
	String mgrS = request.getParameter("mgr");
	String salS = request.getParameter("sal");
	String commS = request.getParameter("comm");
	String deptnoS = request.getParameter("deptno");
	try{
	int empno = Integer.parseInt(request.getParameter("empno"));
	String ename = request.getParameter("ename");
	String job = request.getParameter("job");
	int mgr = Integer.parseInt(request.getParameter("mgr"));
	String hiredate = request.getParameter("hiredate");
	int sal = Integer.parseInt(request.getParameter("sal"));
	int comm = Integer.parseInt(request.getParameter("comm"));
	int deptno = Integer.parseInt(request.getParameter("deptno"));
	} catch(java.lang.NumberFormatException e){
		int empno = 0;
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		int mgr = 0;
		String hiredate = request.getParameter("hiredate");
		int sal = 0;
		int comm = 0;
		int deptno = 0;
	}
	EmpDeptDao edd = EmpdeptDao.getInstance();
	Emp emp = new Emp();
	int result = edd.insertEmpTemp(emp);
%>
</body>
</html>