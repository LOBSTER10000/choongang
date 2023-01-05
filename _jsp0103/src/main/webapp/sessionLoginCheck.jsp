<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String mid = (String) session.getAttribute("MID");
	if(mid!=null && mid.equals("ok")){
		
	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
로그인 상태 유지 중
</body>
</html>
<%
   } else {
%>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
로그아웃 상태
</body>
</html>
<%
  }
%>