<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="insertEmp.jsp" method="post">
<table border= "1">
<tr><td>사번</td><td><input type="text" name="empno" /></td></tr>
<tr><td>이름</td><td><input type="text" name="ename" /></td></tr>
<tr><td>직무</td><td><input type="text" name="job" /></td></tr>
<tr><td>상급자 사번</td><td><input type="text" name="mgr" /></td></tr>
<tr><td>입사일</td><td><input type="text" name="hiredate" /></td></tr>
<tr><td>급여</td><td><input type="text" name="sal" /></td></tr>
<tr><td>보너스</td><td><input type="text" name="comm" /></td></tr>
<tr><td>부서번호</td><td><input type="text" name="deptno" /></td></tr>
<tr><td>확인</td><td><input type="reset" name="초기화" />
<input type="submit" value="저장" /></td></tr>
</table>
</form>
</body>
</html>