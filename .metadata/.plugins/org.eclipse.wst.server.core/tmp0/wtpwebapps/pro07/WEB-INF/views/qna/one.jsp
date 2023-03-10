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
	<title>${dto.title } | 외교부</title>
	<jsp:include page="../common/head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="container">
		<h2>질문게시판</h2>
		<div class="table">
			<h3>${dto.title }</h3>
			<div class="qna_info">
				<span>작성자 : </span><span>${dto.dept }</span>&nbsp;&nbsp;
				<span>작성일 : </span><span>${dto.regdate }</span>&nbsp;&nbsp;
				<span>조회수 : </span><span>${dto.hits }</span>
			</div>
			<div class="notice_content">${dto.content }</div>
		</div>
		<div class="button_group">
			<a href="${path1 }/qna/list" class="list_btn">목록</a>
			<c:if test='${sid eq dto.dept || sid eq "admin" }'>
				<a href="${path1 }/qna/del.do?grp=${dto.grp}" class="del_btn">삭제</a>
				<a href="${path1 }/qna/upd.do?no=${dto.no}" class="mod_btn">수정</a>
				<a href="${path1 }/qna/ans" class="button">답변</a>
			</c:if>
		</div>
	</div>
<jsp:include page="../common/footer.jsp"></jsp:include>	
</body>
</html>