<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	if(id.equals(pass)){  //���ǻ� ���̵�� �н����尡 ������(���������� ������ �ƴ�)
		session.setAttribute("MID", "ok");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
�α��� ����
</body>
</html>
<%
  } else {
%>
<script type="text/javascript">
alert("�α��� ����");
history.back();
</script>
<% } %>