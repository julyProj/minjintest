<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/min/resources/js/jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){
	$("#insertbtn").on('click', function(){
		//var category = $('#Category').val();
		//var product = $('#Product').val();
		//var price = $('#Price').val();
		//var size = $('#Size').val();
		/*var useable = $('#Useable').val();
		var formData = {
			"Category":category,				
			"Product":product,
			"Price":price,
			"Size":size,
			"Useable":useable
		};*/
		
		var formData = $('#insert_form').serialize();
		
		$.ajax({
			url:"insert.ajax",
			type:"POST",
			//dataType:"html",
			data:formData,
			success : function(resData){
				alert(resData.result);
				return;
				if (resData.result == "success"){
					alert("추가되었습니다.");
					location.href="list";
				}
			},
			error : function(e){
				alert("error");
				console.log(e);
			}
		});
	});
});
</script>
<title>상품추가</title>
</head>
<body>
<h1>상품추가하기</h1>
<form id="insert_form" name="insert_form" method="POST">
카테고리 : <select name="Category" id="Category">
		<option value="상의" label="상의" />
		<option value="하의" label="하의" />
		<option value="내의" label="내의" />
		</select><br>
상품명 : <input type='text' id="Product" name="Product" /><br>
가격 : <input type='text' id="Price" name="Price"/><br>
사이즈 : <select id="Size" name="Size">
		<option value="S" label="S" />
		<option value="M" label="M" />
		<option value="L" label="L" />
		<option value="free" label="free" />
		</select><br>
사용여부 : Y<input type="radio" id="Useable" name="Useable" value="1" /> N<input type="radio" id="Useable" name="Useable" value="0"/>
<br>
<a id="insertbtn">완료</a>
</form>

</body>
</html>