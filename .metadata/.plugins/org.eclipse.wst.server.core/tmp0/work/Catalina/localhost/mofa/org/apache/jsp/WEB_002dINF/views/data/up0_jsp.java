/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2023-01-11 02:28:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class up0_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>파일 업로드</title>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/head.jsp", out, false);
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"app\">\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<!-- <nav>\r\n");
      out.write("                <div class=\"nav-wrapper cyan\">\r\n");
      out.write("                    <div class=\"col s12\">\r\n");
      out.write("                        <a href=\"/\" class=\"breadcrumb\" style=\"padding-left:20px\">홈</a>\r\n");
      out.write("                        <a href=\"\" class=\"breadcrumb\">파일관리</a>\r\n");
      out.write("                        <span class=\"breadcrumb\">파일 업로드</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav> -->\r\n");
      out.write("            <br>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("            	<h4 class=\"center-align\">파일 업로드</h4>\r\n");
      out.write("                <hr style=\"margin-bottom: 50px;\">\r\n");
      out.write("                <form class=\"col s12 l6 offset-l3\" action=\"up0\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("                	<div class=\"row\" id=\"fileContainer\">\r\n");
      out.write("                        <div class=\"file-field input-field col s12\">\r\n");
      out.write("                            <div class=\"btn\">\r\n");
      out.write("                                <span><i class=\"material-icons left\">attach_file</i>첨부 파일</span>\r\n");
      out.write("                                <input type=\"file\" name=\"file\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"file-path-wrapper\">\r\n");
      out.write("                                <input type=\"text\" class=\"file-path validate\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"helper-text\">첨부파일로 업로드 가능한 용량은 최대 50MB 입니다.</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row center-align\">\r\n");
      out.write("                        <div class=\"col s12 l8 offset-l2\">\r\n");
      out.write("                            <div class=\"col s6\">\r\n");
      out.write("                                <button type=\"submit\" class=\"btn-large waves-effect waves-light\">\r\n");
      out.write("                                    <i class=\"material-icons left\">file_upload</i>\r\n");
      out.write("									파일 업로드\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col s6\">\r\n");
      out.write("                                <a class=\"btn-large waves-effect waves-light\" href=\"/file/list\">\r\n");
      out.write("                                    <i class=\"material-icons left\">list</i>\r\n");
      out.write("									파일 목록\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <blockquote>\r\n");
      out.write("                            [파일 업로드] 버튼을 눌러서 새 파일을 업로드해 보세요.<br>\r\n");
      out.write("							새 파일을 업로드 하지 않고 파일 목록으로 가시려면 [파일 목록] 버튼을 누르세요.\r\n");
      out.write("                        </blockquote>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>\r\n");
      out.write("	    <script>\r\n");
      out.write("	        const sideNav = document.querySelector('.sidenav');\r\n");
      out.write("	        M.Sidenav.init(sideNav, {});\r\n");
      out.write("	    </script>\r\n");
      out.write("	    <script>\r\n");
      out.write("	    	var fileContainer = document.querySelector('#fileContainer');	    	\r\n");
      out.write("	    	var btnAddFile = document.querySelector('#btnAddFile');\r\n");
      out.write("	    	var fileCount = 1; // 첨부파일 선택상자 개수\r\n");
      out.write("	    	\r\n");
      out.write("	    	btnAddFile.addEventListener('click', function () {\r\n");
      out.write("	    		if (fileCount >= 5) {\r\n");
      out.write("	    			alert('첨부파일은 최대 5개까지만 업로드 가능합니다.')\r\n");
      out.write("	    			return;\r\n");
      out.write("	    		}\r\n");
      out.write("	    		fileCount++; // 추가된 첨부파일 선택상자 개수 반영   		\r\n");
      out.write("	    		var input = '<div class=\"file-field input-field col s12\"><div class=\"btn\"><span><i class=\"material-icons left\">attach_file</i>첨부 파일</span><input type=\"file\" name=\"files\" multiple></div><div class=\"file-path-wrapper\"><input type=\"text\" class=\"file-path validate\"></div><span class=\"helper-text\">첨부파일로 업로드 가능한 용량은 최대 50MB 입니다.</span></div>';\r\n");
      out.write("	    		fileContainer.innerHTML += input;\r\n");
      out.write("	    	});\r\n");
      out.write("	    </script>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("	</div>\r\n");
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
}
