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
var data = '{"name": "�Ļ�", "family": "�����ڱ�", "age": 1, "weight": 2.14}';
//�ڹٽ�ũ��Ʈ ��ü
var dog = JSON.parse(data); 
// �ڹٽ�ũ��Ʈ ��ü�� ���ڿ��� ��ȯ��.
document.getElementById("json").innerHTML = dog + "<br/>";
document.getElementById("json").innerHTML += dog.name + ", " + dog.family;
</script>
</body>
</html>