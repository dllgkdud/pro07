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
		<h2>회원 목록</h2>
		<table class="table">
			<tr>
				<th>번호</th>
				<th>아이디</th>
				<th>이름</th>
				<th>이메일</th>
				<th>주소</th>
				<th>가입일</th>
			</tr>
			<c:forEach items="${user }" var="user" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td><a href="${path1 }/users/one?id=${user.id }">${user.id }</a></td>
				<td>${user.name }</td>
				<td>${user.email }</td>
				<td>${user.address }</td>
				<td>${user.regdate }</td>
			</tr>
			</c:forEach>
		</table>
		<div class="button_grp">
			<c:if test='${sid eq "admin"}'>
			<a href="${path1 }/users/add.do" class="button">등록</a>
			</c:if>
		</div>
	</div>
<jsp:include page="../common/footer.jsp"></jsp:include>	
</body>
</html>