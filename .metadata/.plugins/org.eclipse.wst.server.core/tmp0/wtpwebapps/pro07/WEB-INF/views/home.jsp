<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path1" value="${pageContext.request.contextPath }" />	
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0" />
	<title>| 외교부</title>
	<jsp:include page="common/head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="common/header.jsp"></jsp:include>
<div id="myCarousel" class="carousel slide" data-bs-ride="carousel">
	<div class="carousel-indicators">
		<button type="button" data-bs-target="#myCarousel" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
		<button type="button" data-bs-target="#myCarousel" data-bs-slide-to="1" aria-label="Slide 2"></button>
		<button type="button" data-bs-target="#myCarousel" data-bs-slide-to="2" aria-label="Slide 3"></button>
	</div>
    <div class="carousel-inner">
		<div class="carousel-item active">
	        <a href="#">
	        	<i id="img">
		        	<img src="${path1 }/resources/upload/main/20221222093426983.jpg" alt="신임 총영사 임명장 전수식 개최">
		        </i>
		        <div class="container">
					<div class="carousel-caption">
			            <div class="btn btn-lg btn-dark">
			            	<h6 class="text-start">뉴포커스</h6>
			            	<p>신임 총영사 임명장 전수식 개최</p>
						</div>
		          	</div>
				</div>
			</a>
		</div>
		<div class="carousel-item">
			<a href="#">
				<i id="img">
		        	<img src="${path1 }/resources/upload/main/20221229100927409.jpg" alt="제3차 2030 부산세계박람회 유치교섭 점검회의 개최">
		        </i>
		        <div class="container">
					<div class="carousel-caption">
						<div class="btn btn-lg btn-dark">
			            	<h6 class="text-start">뉴포커스</h6>
			            	<p>제3차 2030 부산세계박람회 유치교섭 점검회의 개최</p>
		            	</div>
		          	</div>
				</div>
			</a>
		</div>
      	<div class="carousel-item">
        	<a href="#">
				<i id="img">
		        	<img src="${path1 }/resources/upload/main/20221216101953683.jpg" alt="‘제4차 여성과 함께하는 평화 국제회의’ 개최">
		        </i>
		        <div class="container">
					<div class="carousel-caption">
						<div class="btn btn-lg btn-dark">
			            	<h6 class="text-start">뉴포커스</h6>
			            	<p>‘제4차 여성과 함께하는 평화 국제회의’ 개최</p>
		            	</div>
		          	</div>
				</div>
			</a>
      	</div>
    </div>
</div>
<h1>
	Hello world!
</h1>
<jsp:include page="common/footer.jsp"></jsp:include>
</body>
</html>
