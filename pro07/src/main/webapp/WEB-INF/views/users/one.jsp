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
	<title>${user.name } | 외교부</title>
	<jsp:include page="../common/head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="container">
		<h2>회원상세</h2>
		<table class="table">
			<tr>
				<th>아이디</th>
				<td>${dto.id }</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${dto.name }</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>${dto.email }</td>
			</tr>
			<tr>
				<th>주소</th>
				<td>${dto.address }</td>
			</tr>
			<tr>
				<th>가입일</th>
				<td>${dto.regdate }</td>
			</tr>
		</table>
		<div class="button_grp">
			<a href="${path1 }/users/list" class="list_btn">목록</a>
			<c:if test='${sid eq dto.id || sid eq "admin"}'>
				<a href="${path1 }/users/upd?id=${dto.id}" class="upd_btn">수정</a>
				<a href="${path1 }/users/del.do?id=${dto.id}" class="del_btn">삭제</a>
			</c:if>
		</div>
	</div>
<jsp:include page="../common/footer.jsp"></jsp:include>	
</body>
</html>