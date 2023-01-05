<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<br>
<footer>
	<div class="footer container">
		<div class="copyright">
			<p>주소 : 03172 서울특별시 종로구 사직로8길 60 |(여권영사민원실) 서울특별시 서초구 남부순환로 2558 외교타운 6층</p>
			<p>전화번호 : 02.2100.2114(주간), 02.3210.0404(영사콜센터, 24시간)</p>
			<p>팩스 : 02.2100.7998</p>
			<p>본 누리집의 모든 권리는 외교부에 귀속됩니다.</p>
		</div>
		<br>
		<div class="server">
			<p>${serverTime}</p>
		</div>
	</div>
</footer>