<%@page import="java.util.TreeSet"%>
<%@page import="user.Content2"%>
<%@page import="user.ContentDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="./gy_content.css">
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
</head>
<body>
<div id = "gy_main">
<section id="content">
<ul>
<%
ContentDao2 contentDao2 = new ContentDao2();
for(Content2 content2 : contentDao2.selectContent()){
	 %>
<li>
<article>
<h1><%=content2.getTitle() %></h1>
<p><%=content2.getContent() %></p>
</article>
</li>
<%} %>
</ul>
</section>
</div>
</body>
</html>

