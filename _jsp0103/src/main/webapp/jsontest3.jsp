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
//�ڹٽ�ũ��Ʈ date ��ü
var str = date.toJSON(); // Date��ü�� JSON ������ ���ڿ��� ��ȯ��

console.log(date);
console.log(str);
document.getElementById("json").innerHTML = date + "<br>";
document.getElementById("json").innerHTML += str;
</script>
</body>
</html>