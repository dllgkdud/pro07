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
	<title>공지사항 목록 | 외교부</title>
	<jsp:include page="../common/head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="container">
		<h2>공지사항</h2>
		<table class="table">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>부서명</th>
				<th>작성일</th>
			</tr>
			<c:forEach items="${notice }" var="notice" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>
				<c:if test="${empty sid }">
					<span>${notice.title }</span>
				</c:if>
				<c:if test="${not empty sid }">
					<a href="${path1 }/notice/one?no=${notice.no }">${notice.title }</a>
				</c:if>
				</td>
				<td>${notice.dept }</td>
				<td>${notice.regdate }</td>
			</tr>
			</c:forEach>
		</table>
		<div class="button_grp">
			<c:if test='${sid eq "admin"}'>
				<a href="${path1 }/notice/add.do" class="button">작성</a>
			</c:if>
		</div>
	</div>
<jsp:include page="../common/footer.jsp"></jsp:include>	
</body>
</html>