/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2023-01-10 00:56:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
      out.write("    \r\n");
      out.write("    <!-- open graph -->\r\n");
      out.write("    <meta name=\"author\" content=\"외교부\" />\r\n");
      out.write("	<meta name=\"keywords\" content=\"외교부,외교부,여권,비자,재외공관\" />\r\n");
      out.write("	<meta name=\"description\" content=\"외교부 홈페이지에 오신것을 환영합니다.\" />\r\n");
      out.write("	<meta property=\"og:type\" content=\"website\" />\r\n");
      out.write("	<meta property=\"og:title\" content=\"외교부\" />\r\n");
      out.write("	<meta property=\"og:site_name\" content=\"외교부\" />\r\n");
      out.write("	<meta property=\"og:description\" content=\"외교부\" />\r\n");
      out.write("	<meta property=\"og:url\" content=\"https://dllgkdud.github.io/web07\" />\r\n");
      out.write("	<meta property=\"og:image\" content=\"http://localhost:8097/mofa/resources/assets/siteimg.png\" />\r\n");
      out.write("	\r\n");
      out.write("	<!-- absolute path -->\r\n");
      out.write("	<link rel=\"shortcut icon\" href=\"http://localhost:8097/mofa/resources/assets/icon/favicon.ico\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"http://localhost:8097/mofa/resources/assets/icon/favicon-16X16.png\" sizes=\"16x16\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"http://localhost:8097/mofa/resources/assets/icon/favicon-32X32.png\" sizes=\"32x32\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"http://localhost:8097/mofa/resources/assets/icon/favicon-48X48.png\" sizes=\"48x48\">\r\n");
      out.write("	\r\n");
      out.write("	<!-- bootstrap5 -->\r\n");
      out.write("	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">	\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("	\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"http://localhost:8097/mofa/resources/assets/css/default.css\" type=\"text/css\">\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"http://localhost:8097/mofa/resources/assets/css/main.css\" type=\"text/css\">\r\n");
      out.write("	\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-latest.js\"></script>\r\n");
      out.write("    <script src=\"http://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>");
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
}
