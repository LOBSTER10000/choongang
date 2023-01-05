<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <table class="aa" border="1"></table>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $.getJSON('item.json', function(index, value){
            	$.each(index, function(){
            		$('.aa').append("<tr><td>" + this.id + "<td>" + this.name + "<td>" + this.price + "</tr>");
            	});
            });
        });

    </script>
</body>

</html>