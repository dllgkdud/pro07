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
		<h2>공지사항</h2>
		<form action="${path1 }/qna/upd.do" method="post">
			<table class="table">
				<input type="hidden" name="no" id="no" value="${dto.no}">
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" id="title" placeholder="제목을 입력하십시오." value="${dto.title}" required></td>
				</tr>
				<tr>
					<th>공개여부</th>
					<td>
						<input type="radio" name="indent" id="open" value="0" checked>
						<label for="open">공개</label>
						<input type="radio" name="indent" id="close" value="1">
						<label for="close">비밀</label>
					</td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea cols="100" rows="20" maxlength="1900" name="content" id="content" placeholder="내용을 입력하십시오." required>${dto.content}</textarea></td>
				</tr>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="dept" id="dept" value="${dto.dept}" readonly></td>
				</tr>
			</table>
			<div class="button_group">
				<a href="${path1 }/qna/list" class="list_btn">목록</a>
				<a href="#" class="del_btn">삭제</a>
				<button type="submit" class="upd_btn">수정</button>
			</div>
		</form>
	</div>
<jsp:include page="../common/footer.jsp"></jsp:include>	
</body>
</html>