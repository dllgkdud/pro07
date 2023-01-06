<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
	<title>API Test</title>
</head>
<body>
	<div class="container">
		<section class="get">
			<h2>Get</h2>
			<a href="test1">테스트1</a>
			<a href="test2/lhy/1234">테스트2</a>
			<a href="test3/lhy">테스트3</a>
			<a href="test4/lhy/1234">테스트4</a>
			<a href="test5/lhy">테스트5</a>
			<hr>
			<a href="list">목록</a>
			<a href="user/lhy">상세</a>
		</section><br>
		<section class="post">
			<h2>Post</h2>
			<form name="add" action="add" method="post">
				<input type="text" id="id" name="id" placeholder="id">
				<input type="password" id="pw" name="pw" placeholder="pw">
				<input type="submit" value="작성">
			</form>
		</section><br>
		<section class="put">
			<h2>Put</h2>
			<form name="upd" action="upd" method="post">
				<input type="hidden" name="_method" value="PUT"/>
				<input type="text" id="id" name="id" value="lhy">
				<input type="password" id="pw" name="pw" value="1111">
				<input type="submit" value="수정">
			</form>
		</section>
		<section class="delete">
			<h2>Delete</h2>
			<form action="del" method="POST">
				<input type="hidden" name="_method" value="DELETE"/>
				<input type="text" id="id" name="id" value="lhy">
				<input type="submit" value="삭제">
			</form>
		</section>
	</div>
</body>
</html>