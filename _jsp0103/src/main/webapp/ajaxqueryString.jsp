<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form>
	<input type="hidden" name="seq" value="1">
	<label> �̸��� �Է��ϼ��� : </label>
	<input type="text" name="username"> <br>
	<label> �н����带 �Է��ϼ��� : </label>
	<input type="password" name="password">  <br>
	<input type="checkbox" name="hobby" value="music">music
	<input type="checkbox" name="hobby" value="yoga">yoga
	<input type="checkbox" name="hobby" value="reading">reading <br>
	<input type="submit" id="submit" value="����">
</form>
<hr>
<div id="result"></div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script>

$(function(){
	$('#submit').click(function(){
		var form_data = $('form').serialize(); //�Ϸķ� �����϶�(serialize())
		$('#result').text(form_data);
		return false;
	});
});
</script>
</body>
</html>