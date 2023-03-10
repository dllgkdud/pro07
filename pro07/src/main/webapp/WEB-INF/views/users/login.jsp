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
	<title>로그인 | 외교부</title>
	<jsp:include page="../common/head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="container">
		<h2>로그인</h2>
		<form action="${path1 }/users/login.do" method="post">
			<table class="table">
				<tr>
					<th>아이디</th>
					<td>
						<input type="text" name="id" id="id" placeholder="아이디를 입력하십시오." required>
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pw" id="pw" placeholder="비밀번호를 입력하십시오." required></td>
				</tr>
			</table>
			<div class="button_group">
				<a href="${path1 }/users/list" class="reset_btn">취소</a>
				<input type="submit" class="submit_btn" value="로그인">
				<a href="${path1 }/users/agree" class="button">회원가입</a>
			</div>
		</form>
	</div>
<jsp:include page="../common/footer.jsp"></jsp:include>	
</body>
</html>