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
	<h2>공지사항</h2>
	<c:forEach items="${notice }" var="notice" varStatus="status">
		<span>${status.count } </span>.
		<span><a href="${path1 }/notice/one?no=${notice.no }">${notice.title }</a> </span>,
		<span>${notice.dept }</span>,
		<span>${notice.regdate }</span>,
		<span>${notice.hits }</span><p>		
	</c:forEach>
	<div class="button_grp">
		<a href="${path1 }/notice/add" class="button">작성</a>
	</div>
</body>
</html>