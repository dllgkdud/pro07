/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2023-01-19 09:02:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class intro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/lhy/pro07/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1668994785251L));
    _jspx_dependants.put("jar:file:/D:/lhy/pro07/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/lhy/pro07/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\">\r\n");
      out.write("	<title>외교부 소개 | 외교부</title>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/head.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h2>외교부 소개</h2>\r\n");
      out.write("		<div class=\"table\">\r\n");
      out.write("			<h3 id=\"tit_eff\">외교부 설립목적</h3>\r\n");
      out.write("			<i class=\"intro_info\">\r\n");
      out.write("				<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/upload/main/bg_intro_1_01.jpg\" alt=\"bg\">\r\n");
      out.write("			</i>\r\n");
      out.write("			<h3 style=\"font-size:8rem; font-weight:800; text-align:right; color:rgba(0, 0, 0, 0.08);\">MOFA</h3>\r\n");
      out.write("			<div class=\"intro_content\">\r\n");
      out.write("				<ol>\r\n");
      out.write("					<li>외교정책의 수립 . 시행</li>\r\n");
      out.write("					<li>다자 . 양자 경제외교 및 국제경제협력외교</li>\r\n");
      out.write("					<li>대외경제 관련 외교정책의 수립 . 시행 및 총괄 . 조정</li>\r\n");
      out.write("					<li>조약 및 그 밖의 국제협정에 관한 사무 관장</li>\r\n");
      out.write("					<li>문화협력, 대외홍보에 관한 사무 관장</li>\r\n");
      out.write("					<li>재외동포 정책의 수립 및 재외국민 보호 . 지원</li>\r\n");
      out.write("					<li>국제정세의 조사 . 분석 및 이민에 관한 사무 관장</li>\r\n");
      out.write("				</ol>\r\n");
      out.write("			</div>\r\n");
      out.write("			<h3 style=\"font-size:8rem; font-weight:800; text-align:right; color:rgba(0, 0, 0, 0.08);\">HISTORY</h3>\r\n");
      out.write("			<div class=\"his_info\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li>\r\n");
      out.write("						<strong>2013</strong>\r\n");
      out.write("						<div>\r\n");
      out.write("							<b>03. 23</b>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li>외교통상부를 외교부로 개편</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<strong>2012</strong>\r\n");
      out.write("						<div>\r\n");
      out.write("							<b>03. 01</b>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li>국립외교원 신설</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<strong>2002</strong>\r\n");
      out.write("						<div>\r\n");
      out.write("							<b>12. 22</b>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li>정부중앙청사 남쪽에 지하 6층, 지상 18층의 단독청사를 완공하여 이전</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<strong>1998</strong>\r\n");
      out.write("						<div>\r\n");
      out.write("							<b>02. 28</b>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li>통상교섭과 대외경제 관련 외교정책을 종합적으로 수립․시행하기 위해 외무부를 외교통상부로 개편하고 통상교섭본부를 신설</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<strong>1976</strong>\r\n");
      out.write("						<div>\r\n");
      out.write("							<b>12. 31</b>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li>외교연구원을 외교안보연구원으로 개편</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<strong>1965</strong>\r\n");
      out.write("						<div>\r\n");
      out.write("							<b>01. 05</b>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li>외무공무원교육원을 외교연구원으로 개편</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<strong>1963</strong>\r\n");
      out.write("						<div>\r\n");
      out.write("							<b>06. 24</b>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li>외무공무원의 자질 향상 및 근무 능률 증진을 위해 외무공무원교육원 신설</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<strong>1948</strong>\r\n");
      out.write("						<div>\r\n");
      out.write("							<b>08. 15</b>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li>대한민국 정부 수립 후 미국, 영국, 프랑스 등을 비롯한 우방 제국과 국교를 수립하고 재외공관 설치 시작</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<strong>1948</strong>\r\n");
      out.write("						<div>\r\n");
      out.write("							<b>07. 17</b>\r\n");
      out.write("							<ul>\r\n");
      out.write("							<li>정부조직법 제정ㆍ공포에 따라 외무부 출범</li>\r\n");
      out.write("								<li>외교, 조약, 대외경제, 재외국민 보호, 국제정세 조사 및 대외홍보에 관한 사무 관장</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/page/intro.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("path1");
      // /WEB-INF/views/page/intro.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/page/intro.jsp(6,0) '${pageContext.request.contextPath }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
