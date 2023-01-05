<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="welcome.jsp" method="post">
	<label> 이름을 입력하세요 : </label>
	<input type="text" name="username" class="username">
	<br>
	<input type="button" id="submit" value="전송">
</form>
<div id="message"></div>

<script>
$(function(){
	$('#submit').click(function(){
		var username = $('.username').val();
		var sendDate = 'username' + username;
		
		$.post(
				"welcome.jsp",
				sendData,
				function(msg){
					$('#message').html(msg);
				});
		return false;
	});
});
</script>
</body>
</html>