<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 /*out.println(request.getParameter("kor"));
  out.println(request.getParameter("math")); */
  String kor = request.getParameter("kor");
  int knum = Integer.parseInt(kor);
  String math = request.getParameter("math");
  int mnum = Integer.parseInt(math);
  String eng = request.getParameter("eng");
  int eno = Integer.parseInt(eng);
  out.println(knum+mnum+eno);
%>
</body>
</html>