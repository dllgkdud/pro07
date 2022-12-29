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
<title>sample</title>
</head>
<body>
	<h2>테스트화면</h2>
	<c:forEach items="${sample }" var="sample" varStatus="status">
		<span>${status.count } </span>.
		<span><a href="${path1 }/sample/one?id=${sample.id }">${sample.id }</a> </span>,
		<span>${sample.regdate }</span><p>
	</c:forEach>
</body>
</html>