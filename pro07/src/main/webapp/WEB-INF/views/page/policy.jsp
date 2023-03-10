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
			<h3 id="tit_eff">외교정책 목표</h3>
			<div class="policy_info">
				외교부는 ‘다시 도약하는 대한민국, 함께 잘 사는 국민의 나라’라는 국가비전 아래 ‘자유, 평화, 번영에 기여하는 글로벌 중추국가’라는 국정목표를 충실히 이행하기 위하여, 다음 과제에 외교 역량을 집중하고자 합니다.
			</div>
			<h3 style="font-size:8rem; font-weight:800; text-align:right; color:rgba(0, 0, 0, 0.08);">MOFA</h3>
			<div class="policy_content">
				<ol>
					<li>
						<h3>북한 비핵화 추진</h3>
						<p>북한의 완전하고 검증가능한 비핵화를 통해 한반도에 지속가능한 평화 구현</p>
					</li>
					<li>
						<h3>자유민주주의 가치와 공동이익에 기반한 동아시아 외교 전개</h3>
						<p>공동의 가치와 이익을 기반으로 미·중·일·러 4개국과 협력 강화를 추진, 이를 통해 한반도 평화·번영 환경을 조성하고 지역·글로벌차원에서 우리 위상을 제고</p>
					</li>
					<li>
						<h3>함께 번영하는 지역별 협력 네트워크 구축</h3>
						<p>지역별로 특화된 상생공영의 협력 네트워크를 구축·강화하여 우리 외교·경제의 지평 확대</p>
					</li>
					<li>
						<h3>능동적 경제안보 외교 추진</h3>
						<p>우리 주도의 대외 경제안보 환경 조성을 통해 국익을 극대화. G20, APEC, OECD, WTO 등 다자경제협력체에서 우리 관심의제 논의에 적극 참여하고 우리측 필요 의제 설정을 주도</p>
					</li>
					<li>
						<h3>국격에 걸맞은 글로벌 중추국가 역할 강화</h3>
						<p>주요 분야 다자외교 리더십 확대 및 국제사회 평화안보·민주주의·인권·법치·비확산·기후변화·개발 분야 협력에 선도적 역할 수행. 규범 기반 국제질서 강화를 주도하면서 글로벌 중추국가 역할을 강화</p>
					</li>
					<li>
						<h3>지구촌 한민족 공동체 구축</h3>
						<p>재외국민보호 역량을 강화하여 튼튼한 사회 안전망 구축. 재외동포에 대한 지원을 확대하고 모국과의 유대를 강화하며 재외국민 편익 증진을 위한 비대면 디지털 영사민원시스템 구축</p>
					</li>
					<li>
						<h3>국가 사이버안보 대응역량 강화</h3>
						<p>국제사회의 사이버규범 수립에 적극 참여하고, 글로벌 협력 네트워크 확충</p>
					</li>
					<li>
						<h3>2030 세계박람회 유치 및 성공적 개최 추진</h3>
						<p>부산세계박람회 유치를 위한 대외교섭 강화</p>
					</li>
				</ol>
			</div>
		</div>
	</div>
<jsp:include page="../common/footer.jsp"></jsp:include>	
</body>
</html>