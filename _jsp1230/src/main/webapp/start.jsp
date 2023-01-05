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
<p>
<span id="tb1"></span>
<span id="tb2"></span>
<span id="tb3"></span>
<input type="button" id="exe" value="사원정보"/>
</p>
<script>
		function order(v){
			$.ajax({
				url: './list.jsp?order='+v,
				success : function(v){
					$('#tb1').html(v);
				}
			});
		}

		function detail(empno){
	
		$.ajax({
			url : './content.jsp?empno='+empno,
			success : function(y){
				$('#tb2').html(y);
			}
		});
		}
		

		$('#exe').click(function(){
			$.ajax({
				url : './list.jsp',
				success : function(x){
					$('#tb1').html(x);
				}
			});
		});
		
		
</script>
</body>
</html>