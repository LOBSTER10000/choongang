<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div id="json"></div>
<script type="text/javascript">
var date = new Date();
//자바스크립트 date 객체
var str = date.toJSON(); // Date객체를 JSON 형식의 문자열로 변환함

console.log(date);
console.log(str);
document.getElementById("json").innerHTML = date + "<br>";
document.getElementById("json").innerHTML += str;
</script>
</body>
</html>