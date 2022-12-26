<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>오늘은 좋은날</h1>
<form action="">
구구단 <input type="text" name="gugu" />단<br/>
<input type="submit"  />

</form>
<%
	String str = request.getParameter("gugu");
	out.println(str);
	int gugu=0;
	if (str != null){
		gugu = Integer.parseInt(str);	
		for(int i=1; i<=9; i++){
%>
<h2><%=i * gugu%></h2>
<%
		}
	}
%>
	


	
</body>
</html>