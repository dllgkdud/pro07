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
	<title>공지사항 작성 | 외교부</title>
	<jsp:include page="../common/head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="container">
		<h2>공지사항</h2>
		<form action="${path1 }/notice/add.do" method="post">
			<table class="table">
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" id="title" placeholder="제목을 입력하십시오." required></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea cols="100" rows="20" maxlength="1900" name="content" id="content" placeholder="내용을 입력하십시오." required></textarea></td>
				</tr>
				<tr>
					<th>부서명</th>
					<td><input type="text" name="dept" id="dept" placeholder="부서를 입력하십시오." value="${dto.dept }" required></td>
				</tr>
			</table>
			<div class="button_group">
				<a href="${path1 }/notice/list" class="reset_btn">취소</a>
				<input type="submit" class="submit_btn" value="등록">
			</div>
		</form>
	</div>
<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>