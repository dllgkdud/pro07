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
	<title>회원 목록 | 외교부</title>
	<jsp:include page="../common/head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="container">
		<h2>${user.name } | 외교부</h2>
		<table class="table">
			<tr>
				<th>아이디</th>
				<td>${user.id }</td>
			</tr>
			<tr>
				<th>이름</th>
				<th>이메일</th>
				<th>주소</th>
				<th>가입일</th>
				
				<td>${user.name }</td>
				<td>${user.email }</td>
				<td>${user.address }</td>
				<td>${user.regdate }</td>
			</tr>
		</table>
		<div class="button_grp">
			<a href="${path1 }/users/add.do" class="button">등록</a>
		</div>
	</div>
<jsp:include page="../common/footer.jsp"></jsp:include>	
</body>
</html>