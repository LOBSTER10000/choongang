<%@page import="user.*"%>
<%@ page import="bbs.BbsDao"%>
<%@ page import="bbs.Bbs"%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./style.css" type="text/css">
<meta name="viewport" content="width=device-width" , initail-scale="1">
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
	color: black;
	text-decoration: none;
}

#sign-color {
	color: black;
}

.login {
	color: white;
	text-decoration: none;
}
</style>
</head>
<body>
	<%
	String userID = null;
	if (session.getAttribute("userID") != null) {
		userID = (String) session.getAttribute("userID");
	}
	int pageNumber = 1;
	if (request.getParameter("pageNumber") != null) {
		pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
	}
	%>
	

	<header class="p-3 text-bg-dark">
		<div class="container-fluid">
			<div class="row">
				<div
					class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
					<a href="/"
						class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
						
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
							<a href="login.jsp" class="login">Login</a>
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
							<a href="logoutAction.jsp" class="login">LogOut</a>
						</button>

					</div>
					<%
					}
					%>
				</div>
			</div>
		</div>
	</header>


	<section class="wrapper">
		<div class="container">
			<div class="row">
				<main style="padding: 15px">
					<div class="container">
						<div class="row">
							<div id="wrapper" style="height: 100%; overflow: hidden;">
								<section id="content">
									<%
											BbsDao bbsDao = new BbsDao();
											ArrayList<Bbs> list = bbsDao.getList(pageNumber);
											for (int i = 0; i <= list.size() - 1; i++) {
											%>
									<ul>

										<li>

											<article>
												<div id="profile">
													<img src="blankProfile.jpg" alt="프로필사진">
													<div id="ano">익명</div>
													<div id="date"><%=list.get(i).getBbsDate()%></div>
												</div>
												<h1>
													<a href="view.jsp?bbsID=<%=list.get(i).getBbsID()%>">
													<%=list.get(i).getBbsTitle().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>")%></a>
												</h1>
												<p>
													<a href="view.jsp?bbsID=<%=list.get(i).getBbsID()%>"> 
													<%=list.get(i).getBbsContent().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>")%></a>
												</p>
												<div id="like-comment">
													<span id="like"> <img src="icon_like.png"
														alt="좋아요 수"> 10
													</span> <span id="comment"> <img src="icon_comment.png"
														alt="댓글 수"> 10
													</span>
												</div>

											</article>

										</li>

									</ul>
									<%
											}
											%>
								</section>
								<a href="write.jsp" class="btn btn-success offset-10"
									style="width: 75px;">글쓰기</a>
							</div>



						</div>
					</div>

				</main>
			</div>
		</div>
	</section>








	<script
		src="C:\_dev\project3\src\main\webapp\js\bootstrap.bundle.min.js"></script>
</body>
</html>