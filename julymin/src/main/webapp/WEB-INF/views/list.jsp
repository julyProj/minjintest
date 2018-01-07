<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품리스트</title>
<script type="text/javascript" src="/min/resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	var list = ${productList};
	for(var i in list){
		$('tbody').append(list[i]);
	}
});
</script>
</head>
<body>
<h1>상품리스트</h1>
	<table>
		<thead>
			<tr>
				<th>상품코드</th>
				<th>카테고리</th>
				<th>상품명</th>
				<th>가격</th>
				<th>사이즈</th>
				<th>사용여부</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${productList}" var="i">
				<tr>
					<td><input type="checkbox" value='${i.proIdx}'></td>
					<td>${i.proIdx}</td>
					<td>${i.category}</td>
					<td>${i.product}</td>
					<td>${i.price}</td>
					<td>${i.size}</td>
					<td>${i.useable}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href='insert'>추가</a>
	<a>선택삭제</a>
	<a>선택수정</a>
</body>
</html>