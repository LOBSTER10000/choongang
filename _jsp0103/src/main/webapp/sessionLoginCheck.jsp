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
�α��� ���� ���� ��
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
�α׾ƿ� ����
</body>
</html>
<%
  }
%>