<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<header>
	<div class="tnb container">
      <div class="d-flex pt-2 flex-wrap align-items-center justify-content-center justify-content-lg-start">
        <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-dark text-decoration-none">
			<img src="${path1 }/resources/assets/images/eg_logo.png" alt="eg_logo">
        </a>
        <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
			<li class="col-12 col-md-auto mb-2 justify-content-center mb-md-0">이 누리집은 대한민국 공식 전자정부 누리집입니다.</li>
        </ul>
        <div class="dropdown text-end">
        	<c:if test="${empty sid }">
	          	<a href="${path1 }/users/login">로그인</a>
				<a href="${path1 }/users/agree">회원가입</a>
			</c:if>
			<c:if test="${not empty sid }">
				<a href="${path1 }/users/logout">로그아웃</a>
				<a href="${path1 }/users/info">회원정보</a>
				<c:if test='${sid eq "admin"}'>
					<a href="${path1 }/users/list">관리자 페이지</a>
	        	</c:if>
			</c:if>
        </div>
      </div>
    </div>
	<br>
	<div class="gnb container">
		<ul class="nav nav-tabs pb-3" id="myTab" role="tablist">
			<li>
				<a href="${path1 }/"><img src="${path1 }/resources/assets/images/logo.png" alt="logo"></a>
				<a href="https://www.president.go.kr/affairs/gov_project" target="_black"><img src="${path1 }/resources/assets/images/go_img1_220713.png" alt="gov_project"></a>
			</li>
			<li class="nav-item" role="presentation">
				<button class="nav-link" id="main-tab" data-bs-toggle="tab" data-bs-target="#main" type="button" role="tab" aria-controls="main" aria-selected="false">주요 외교활동</button>
			</li>
			<li class="nav-item" role="presentation">
				<button class="nav-link" id="policy-tab" data-bs-toggle="tab" data-bs-target="#policy" type="button" role="tab" aria-controls="policy" aria-selected="false">외교정책</button>
			</li>
			<li class="nav-item" role="presentation">
				<button class="nav-link" id="notice-tab" data-bs-toggle="tab" data-bs-target="#notice" type="button" role="tab" aria-controls="notice" aria-selected="false">뉴스·공지</button>
			</li>
			<li class="nav-item" role="presentation">
				<button class="nav-link" id="profile-tab" data-bs-toggle="tab" data-bs-target="#profile" type="button" role="tab" aria-controls="profile" aria-selected="false">외교부 소개</button>
			</li>
		</ul>
		<div class="tab-content" id="myTabContent">
		  	<div class="tab-pane fade m-5" id="main" role="tabpanel" aria-labelledby="main-tab">
		  		<ul>
		  			<li><a href="#">대통령 정상외교</a></li>
		  			<li><a href="#">장관 외교활동</a></li>
		  		</ul>
			</div>
		  	<div class="tab-pane fade m-5" id="policy" role="tabpanel" aria-labelledby="policy-tab">
		  		<ul>
		  			<li><a href="#">국정비전 및 국정목표</a></li>
		  			<li><a href="#">조약·국제법</a></li>
		  			<li><a href="#">개발협력</a></li>
		  		</ul>
			</div>
		  	<div class="tab-pane fade m-5" id="notice" role="tabpanel" aria-labelledby="notice-tab">
		  		<ul>
		  			<li><a href="${path1 }/notice/list">공지사항</a></li>
		  			<li><a href="#">자료실</a></li>
		  			<li><a href="${path1 }/qna/list">질문 및 답변</a></li>
		  		</ul>
			</div>
			<div class="tab-pane fade m-5" id="profile" role="tabpanel" aria-labelledby="profile-tab">
		  		<ul>
		  			<li><a href="${path1 }/page/intro.do">외교부 소개</a></li>
		  			<li><a href="${path1 }/page/policy.do">외교정책 목표</a></li>
		  			<li><a href="${path1 }/page/map.do">오시는길</a></li>
		  		</ul>
			</div>
		</div>
	</div>
</header>