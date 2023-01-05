<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	if(id.equals(pass)){  //편의상 아이디와 패스워드가 같게함(연습용이지 실전이 아님)
		session.setAttribute("MID", "ok");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
로그인 성공
</body>
</html>
<%
  } else {
%>
<script type="text/javascript">
alert("로그인 실패");
history.back();
</script>
<% } %>