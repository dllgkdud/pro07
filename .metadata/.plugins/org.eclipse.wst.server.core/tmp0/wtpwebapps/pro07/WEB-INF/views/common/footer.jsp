<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<br>
<footer>
	<div class="nav container">
		<img src="${path1 }/resources/assets/images/f_logo.png">
		<div class="col-12 col-lg-auto me-lg-auto mt-2 pl-3">
			<span>누리집 이용안내</span>
			<span>개인정보처리방침</span>
		</div>
		<div class="text-end form-select-sm">
			<select aria-label="Default select example" onchange="sel_link(this)">
				<option selected style="display:none;">산하기관 바로가기</option>
			  	<option value="https://www.koica.go.kr/sites/koica_kr/index.do">한국국제협력단</option>
				<option value="http://www.kf.or.kr/">한국국제교류재단</option>
				<option value="http://www.okf.or.kr/">재외동포재단</option>
				<option value="http://k-af.or.kr/">한·아프리카재단</option>
			</select>
			<select aria-label="Default select example" onchange="sel_link(this)">
				<option selected style="display:none;">정부기관 바로가기</option>
				<option value="http://www.korea.go.kr/">대한민국 정부포털</option>
				<option value="http://www.president.go.kr">대통령실</option>
				<option value="http://www.humanrights.go.kr">국가인권위원회</option>
				<option value="http://www.nis.go.kr">국가정보원</option>
				<option value="http://www.bai.go.kr">감사원</option>
				<option value="http://www.kcc.go.kr">방송통신위원회</option>
				<option value="http://www.opm.go.kr">국무총리실</option>
				<option value="http://www.mpm.go.kr">인사혁신처</option>
				<option value="http://www.moleg.go.kr">법제처</option>
				<option value="http://www.mpva.go.kr">국가보훈처</option>
				<option value="http://www.mfds.go.kr">식품의약품안전처</option>
				<option value="http://http://www.ftc.go.kr">공정거래위원회</option>
				<option value="http://www.fsc.go.kr">금융위원회</option>
				<option value="http://www.acrc.go.kr">국민권익위원회</option>
				<option value="http://www.nssc.go.kr">원자력안전위원회</option>
				<option value="http://www.mosf.go.kr">기획재정부</option>
				<option value="http:http://www.nts.go.kr">- 국세청</option>
				<option value="http://www.customs.go.kr">- 관세청</option>
				<option value="http://www.pps.go.kr">- 조달청</option>
				<option value="http://www.kostat.go.kr">- 통계청</option>
				<option value="http://www.msit.go.kr">과학기술정보통신부</option>
				<option value="http://www.moe.go.kr">교육부</option>
				<option value="http://www.mofa.go.kr">외교부</option>
				<option value="http://www.unikorea.go.kr">통일부</option>
				<option value="http://www.moj.go.kr">법무부</option>
				<option value="http://www.spo.go.kr">- 검찰청</option>
				<option value="http://www.mnd.go.kr">국방부</option>
				<option value="http://www.mma.go.kr">- 병무청</option>
				<option value="http://www.mnd.go.kr">국방부</option>
				<option value="http://www.dapa.go.kr">- 방위사업청</option>
				<option value="http://www.mois.go.kr">행정안전부</option>
				<option value="http://www.police.go.kr">- 경찰청</option>
				<option value="http://www.nfa.go.kr">- 소방청</option>
				<option value="http://www.mcst.go.kr">문화체육관광부</option>
				<option value="http://www.cha.go.kr">- 문화재청</option>
				<option value="http://www.mafra.go.kr">농림축산식품부</option>
				<option value="http://www.rda.go.kr">- 농촌진흥청</option>
				<option value="http://www.forest.go.kr">- 산림청</option>
				<option value="http://www.motie.go.kr">산업통상자원부</option>
				<option value="http://www.kipo.go.kr">- 특허청</option>
				<option value="http://www.mohw.go.kr">보건복지부</option>
				<option value="http://www.me.go.kr">환경부</option>
				<option value="http://www.kma.go.kr">- 기상청</option>
				<option value="http://www.moel.go.kr">고용노동부</option>
				<option value="http://www.mogef.go.kr">여성가족부</option>
				<option value="http://www.molit.go.kr">국토교통부</option>
				<option value="http://www.saemangeum.go.kr">- 새만금개발청</option>
				<option value="http://www.naacc.go.kr">- 행정중심복합도시건설청</option>
				<option value="http://www.mof.go.kr">해양수산부</option>
				<option value="http://www.kcg.go.kr">- 해양경찰청</option>
				<option value="http://www.smba.go.kr">중소벤처기업부</option>
			</select>
		</div>
		<script>
		function sel_link(sel) {
		   location.href = sel.value;
		}
		</script>
	</div>
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