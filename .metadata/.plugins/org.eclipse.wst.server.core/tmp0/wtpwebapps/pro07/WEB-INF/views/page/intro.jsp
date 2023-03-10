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
	<title>외교부 소개 | 외교부</title>
	<jsp:include page="../common/head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="container">
		<h2>외교부 소개</h2>
		<div class="table">
			<h3 id="tit_eff">외교부 설립목적</h3>
			<i class="intro_info">
				<img src="${path1 }/resources/upload/main/bg_intro_1_01.jpg" alt="bg">
			</i>
			<h3 style="font-size:8rem; font-weight:800; text-align:right; color:rgba(0, 0, 0, 0.08);">MOFA</h3>
			<div class="intro_content">
				<ol>
					<li>외교정책의 수립 . 시행</li>
					<li>다자 . 양자 경제외교 및 국제경제협력외교</li>
					<li>대외경제 관련 외교정책의 수립 . 시행 및 총괄 . 조정</li>
					<li>조약 및 그 밖의 국제협정에 관한 사무 관장</li>
					<li>문화협력, 대외홍보에 관한 사무 관장</li>
					<li>재외동포 정책의 수립 및 재외국민 보호 . 지원</li>
					<li>국제정세의 조사 . 분석 및 이민에 관한 사무 관장</li>
				</ol>
			</div>
			<h3 style="font-size:8rem; font-weight:800; text-align:right; color:rgba(0, 0, 0, 0.08);">HISTORY</h3>
			<div class="his_info">
				<ul>
					<li>
						<strong>2013</strong>
						<div>
							<b>03. 23</b>
							<ul>
								<li>외교통상부를 외교부로 개편</li>
							</ul>
						</div>
					</li>
					<li>
						<strong>2012</strong>
						<div>
							<b>03. 01</b>
							<ul>
								<li>국립외교원 신설</li>
							</ul>
						</div>
					</li>
					<li>
						<strong>2002</strong>
						<div>
							<b>12. 22</b>
							<ul>
								<li>정부중앙청사 남쪽에 지하 6층, 지상 18층의 단독청사를 완공하여 이전</li>
							</ul>
						</div>
					</li>
					<li>
						<strong>1998</strong>
						<div>
							<b>02. 28</b>
							<ul>
								<li>통상교섭과 대외경제 관련 외교정책을 종합적으로 수립․시행하기 위해 외무부를 외교통상부로 개편하고 통상교섭본부를 신설</li>
							</ul>
						</div>
					</li>
					<li>
						<strong>1976</strong>
						<div>
							<b>12. 31</b>
							<ul>
								<li>외교연구원을 외교안보연구원으로 개편</li>
							</ul>
						</div>
					</li>
					<li>
						<strong>1965</strong>
						<div>
							<b>01. 05</b>
							<ul>
								<li>외무공무원교육원을 외교연구원으로 개편</li>
							</ul>
						</div>
					</li>
					<li>
						<strong>1963</strong>
						<div>
							<b>06. 24</b>
							<ul>
								<li>외무공무원의 자질 향상 및 근무 능률 증진을 위해 외무공무원교육원 신설</li>
							</ul>
						</div>
					</li>
					<li>
						<strong>1948</strong>
						<div>
							<b>08. 15</b>
							<ul>
								<li>대한민국 정부 수립 후 미국, 영국, 프랑스 등을 비롯한 우방 제국과 국교를 수립하고 재외공관 설치 시작</li>
							</ul>
						</div>
					</li>
					<li>
						<strong>1948</strong>
						<div>
							<b>07. 17</b>
							<ul>
							<li>정부조직법 제정ㆍ공포에 따라 외무부 출범</li>
								<li>외교, 조약, 대외경제, 재외국민 보호, 국제정세 조사 및 대외홍보에 관한 사무 관장</li>
							</ul>
						</div>
					</li>
				</ul>
			</div>
		</div>
	</div>
<jsp:include page="../common/footer.jsp"></jsp:include>	
</body>
</html>