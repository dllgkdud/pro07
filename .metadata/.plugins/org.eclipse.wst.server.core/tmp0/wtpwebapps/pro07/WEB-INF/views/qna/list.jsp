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
	<title>질문게시판 목록 | 외교부</title>
	<jsp:include page="../common/head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="container">
		<h2>질문게시판</h2>
		<table class="table">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
			<c:forEach items="${qna }" var="qna" varStatus="status">
			<tr>			
				<td>
				<c:if test="${qna.step eq 0 }">
					<span>${qna.grp }</span>
				</c:if>
				<c:if test="${qna.step eq 1 }">
					<span style="color: #fff;">${qna.grp }</span>
				</c:if>
				</td>
				<td>
				<c:if test="${qna.indent eq 1 }">
					<c:if test="${empty sid }">
						<span onclick='alert("작성자만 확인할 수 있습니다.")' style="cursor: pointer;">
						${qna.title }</span>
					</c:if>
					<c:if test="${not empty sid }">
						<c:if test='${sid eq qna.dept || sid eq "admin" }'>
							<a href="${path1 }/qna/one?no=${qna.no }">${qna.title }</a>
						</c:if>
					</c:if>
				</c:if>
				<c:if test="${qna.indent eq 0 }">
					<a href="${path1 }/qna/one?no=${qna.no }">${qna.title }</a>
				</c:if>
				</td>
				<td>${qna.dept }</td>
				<td>${qna.regdate }</td>
			</tr>
			</c:forEach>
		</table>
		<c:if test="${not empty sid }">
			<div class="button_grp">
				<a href="${path1 }/qna/add" class="button">질문</a>
			</div>
		</c:if>
	</div>
<jsp:include page="../common/footer.jsp"></jsp:include>	
</body>
</html>