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
	<title>회원 수정 | 외교부</title>
	<jsp:include page="../common/head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="container">
		<h2>회원 등록</h2>
		<form action="${path1 }/users/upd.do" method="post">
			<table class="table">
				<tr>
					<th>아이디</th>
					<td>
						<input type="text" name="id" id="id" placeholder="아이디를 입력하십시오." value="${dto.id}" readonly>
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pw" id="pw" placeholder="비밀번호를 입력하십시오." value="${dto.pw}" required></td>
				</tr>
				<tr>
					<th>비밀번호 확인</th>
					<td><input type="password" name="pw2" id="pw2" placeholder="비밀번호를 다시 입력하십시오." value="${dto.pw}" required></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" id="name" placeholder="이름을 입력하십시오." value="${dto.name}" required></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type="email" name="email" id="email" placeholder="이메일을 입력하십시오." value="${dto.email}" required></td>
				</tr>
				<tr>
					<th>주소</th>
					<td>
						<input type="text" name="address" id="address" placeholder="주소를 입력하십시오." value="${dto.address}" required><br>
						<input type="text" name="address2" id="address2" placeholder="상세주소를 입력하십시오." required><br>
						<input type="text" name="postcode" id="postcode" placeholder="우편번호를 입력하십시오." required>
						<button type="button" onclick="findAddr()" class="addr_btn">우편번호 검색</button>
					</td>
				</tr>
			</table>
			<div class="button_group">
				<a href="${path1 }/users/list" class="reset_btn">취소</a>
				<input type="submit" class="submit_btn" value="등록">
			</div>
		</form>
	</div>
	<script>
	$().ready(function(){
		$("[type='submit']").click(function(){
			var pw1 = $("#pw").val();
			var pw2 = $("#pw2").val();
			if(pw1!=pw2) {
				alert("비밀번호가 서로 일치하지 않습니다.");
				pw1.focus();
				return false;
			}
		});
	});
	</script>
	<script>	
	function findAddr() {
		new daum.Postcode({
			oncomplete: function(data) {
				console.log(data);
				var road = data.roadAddress;
				var jibun = data.jibunAddress;
				document.getElementById("postcode").value = data.zonecode;
				if(road !== '') {
					document.getElementById("address").value = road;
				} else if(jibun !== ''){
					document.getElementById("address").value = jibun;
				}
				document.getElementById("address2").focus();
			}
		}).open();
	}
	</script>
	<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<jsp:include page="../common/footer.jsp"></jsp:include>	
</body>
</html>