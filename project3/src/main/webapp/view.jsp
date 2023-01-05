<%@page import="java.io.PrintWriter"%>
<%@page import="user.*"%>
<%@ page import="bbs.Bbs"%>
<%@ page import="bbs.BbsDao"%>
<%@ page import="comment.Comment"%>
<%@ page import="comment.CommentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./style.css" type="text/css">
<meta name="viewport" content="width=device-width" initail-scale="1">
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<link href="C:\_dev\project3\src\main\webapp\css\bootstrap.min.css"
	rel="stylesheet">

<title>302중앙브리타임</title>
<style>
a {
	color: white;
	text-decoration: none;
}

#sign-color {
	color: black;
}
</style>
</head>
<body>

	<%
	String userID = null;
	if (session.getAttribute("userID") != null) {
		userID = (String) session.getAttribute("userID");
	}
	int bbsID = 0;
	if (request.getParameter("bbsID") != null) {
		bbsID = Integer.parseInt(request.getParameter("bbsID"));
	}
	if (bbsID == 0) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('유효하지 않은 글입니다')");
		script.println("location.href = 'bbs.jsp'");
		script.println("</script>");
	}
	Bbs bbs = new BbsDao().getBbs(bbsID);
	%>
	

	<header class="p-3 text-bg-dark">
		<div class="container-fluid">
			<div class="row">
				<div
					class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
					<a href="/"
						class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
						<svg class="bi me-2" width="40" height="32" role="img"
							aria-label="Bootstrap">
							<use xlink:href="#bootstrap" /></svg>
					</a>

					<ul
						class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
						<li><a href="#" class="nav-link px-2 text-secondary">Home</a></li>
						<li><a href="#" class="nav-link px-2 text-white">카테고리</a></li>
						<li><a href="bbs.jsp" class="nav-link px-2 text-white">게시판</a></li>
						<li><a href="#" class="nav-link px-2 text-white">1:1 채팅</a></li>
						<li><a href="#" class="nav-link px-2 text-white">About</a></li>
					</ul>

					<form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
						<input type="search"
							class="form-control form-control-dark text-bg-dark"
							placeholder="Search..." aria-label="Search">
					</form>


					<%
					if (userID == null) {
					%>
					<div class="text-end">
						<button type="button" class="btn btn-outline-light me-2"
							role="button" aria-haspopup="true" aria-expanded="false">
							<a href="login.jsp">Login</a>
						</button>
						<button type="button" class="btn btn-warning" role="button"
							aria-haspopup="true" aria-expanded="false">
							<a href="join.jsp" id="sign-color">Sign-up</a>
						</button>
					</div>
					<%
					} else {
					%>
					<div class="text-end">
						<button type="button" class="btn btn-outline-light me-2"
							role="button" aria-haspopup="true" aria-expanded="false">
							<a href="logoutAction.jsp">LogOut</a>
						</button>

					</div>
					<%
					}
					%>
				</div>
			</div>
		</div>

	</header>


	<div class="container">
		<div class="row">
			<main style="padding: 15px">
				 <div id="wrapper">
      			 <section id="content">
           <ul>
               <li style="margin:10px">
                   <article>
                       <div id="profile">
                           <img src="blankProfile.jpg" alt="프로필사진">
                           <div id="ano">익명</div>
                           <div id="date"><%=bbs.getBbsDate()%></div>
                       </div>
                       <h1><%=bbs.getBbsTitle()%></h1>
                       <p><%=bbs.getBbsContent()%></p>
                       <div id="like-comment">
                           <span id="like">
                               <img src="icon_like.png" alt="좋아요 수"> 10
                           </span>
                           <span id="comment">
                               <img src="icon_comment.png" alt="댓글 수"> 10
                           </span>
                       </div>
                   </article>
               </li>
           </ul>
       </section>
       <a href="bbs.jsp" class="btn btn-success" style="width: 75px; margin: 15px;">목록</a>
						<%
						if (userID != null && userID.equals(bbs.getUserID())) {
						%>
						<a href="update.jsp?bbsID=<%=bbsID%>"
							class="btn btn-primary offset-7" style="width: 75px;">수정</a> <a
							onclick="return confirm('정말로 삭제하시겠습니까?')"
							href="deleteAction.jsp?bbsID=<%=bbsID%>" class="btn btn-primary"
							style="width: 75px; margin-left: 15px;">삭제</a>
						<%
						}
						%>
   			</div>
		</main>
		</div>
	</div>

	<script
		src="C:\_dev\project3\src\main\webapp\js\bootstrap.bundle.min.js"></script>
</body>
</html>