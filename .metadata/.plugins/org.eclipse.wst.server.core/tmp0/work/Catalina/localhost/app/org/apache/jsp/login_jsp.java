/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-09-18 03:32:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/WEB-INF/tags/header.tag", Long.valueOf(1693804315153L));
    _jspx_dependants.put("/WEB-INF/tags/footer.tag", Long.valueOf(1693119357501L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1691645570010L));
    _jspx_dependants.put("/WEB-INF/tags/chatBot.tag", Long.valueOf(1694417783798L));
    _jspx_dependants.put("jar:file:/D:/lee/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/chatSLK_final_01/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/tags/modal.tag", Long.valueOf(1693119401401L));
    _jspx_dependants.put("/WEB-INF/tags/nav.tag", Long.valueOf(1693119404160L));
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>SoundPlay | 로그인</title>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/adminstyle.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"assets/img/apple-icon.png\" />\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/logo-no-background.ico\" />\r\n");
      out.write("<!-- Google API를 사용하기 위한 스크립트 -->\r\n");
      out.write("<script src=\"https://accounts.google.com/gsi/client\" async defer></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/login.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/templatemo.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/custom.css\" />\r\n");
      out.write("\r\n");
      out.write("<!-- 쿠팡로그인 따라하기-->\r\n");
      out.write("<script src=\"javascript/javascript.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Load fonts style after rendering the layout styles -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@100;200;300;400;500;700;900&display=swap\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/fontawesome.min.css\" />\r\n");
      out.write("\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"assets/css/adminstyle.css\"> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Start Top Nav -->\r\n");
      out.write("	");
      if (_jspx_meth_slk_005fnav_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	<!-- Close Top Nav -->\r\n");
      out.write("\r\n");
      out.write("	<!-- Header -->\r\n");
      out.write("	");
      if (_jspx_meth_slk_005fheader_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	<!-- Close Header -->\r\n");
      out.write("\r\n");
      out.write("	<!-- Modal -->\r\n");
      out.write("	");
      if (_jspx_meth_slk_005fmodal_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<!-- 챗봇 -->\r\n");
      out.write("	");
      if (_jspx_meth_slk_005fchatBot_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Start Content Page -->\r\n");
      out.write("	<div class=\"container-fluid bg-dark py-5 text-light\">\r\n");
      out.write("		<div class=\"col-md-6 m-auto text-center\">\r\n");
      out.write("			<h1 class=\"h1 text-white\">로 그 인</h1>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- 로그인 시작 -->\r\n");
      out.write("	<br>\r\n");
      out.write("	<div class=\"col-md-6 m-auto text-center\">\r\n");
      out.write("		<main>\r\n");
      out.write("			<div id=\"loginbar\">\r\n");
      out.write("				<form action=\"login.do\" method=\"post\" id=\"loginform\">\r\n");
      out.write("					<fieldset>\r\n");
      out.write("						<legend class=\"skip\">로그인</legend>\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><span class=\"id_bg\"> <i class=\"fa fa-fw fa-user text-dark mr-3\"></i>\r\n");
      out.write("							</span> <span> <input type=\"text\" name=\"memberId\" placeholder=\"아이디\" required />\r\n");
      out.write("							</span></li>\r\n");
      out.write("							<li><span class=\"pw_bg\"> <i class=\"fa fa-fw fa-lock text-dark mr-3\"></i> <!-- 비밀번호 로고-->\r\n");
      out.write("							</span> <span> <input type=\"password\" name=\"memberPw\" placeholder=\"비밀번호\" required />\r\n");
      out.write("							</span></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						<div class=\"btm\">\r\n");
      out.write("							<a href=\"idSearchPage.do\" class=\"idpw_search id\" onclick=\"openNewWindow(event)\">아이디</a> <a href=\"pwSearchPage.do\" class=\"idpw_search pw\" onclick=\"openNewWindow(event)\">비밀번호 찾기</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<button class=\"btn btn-success btn-lg px-3\" type=\"submit\" id=\"login_btn\">로그인</button>\r\n");
      out.write("					</fieldset>\r\n");
      out.write("				</form>\r\n");
      out.write("				<a href=\"signupPage.do\" class=\"join_link\">회원가입</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- 로그인 끝 -->\r\n");
      out.write("			<div class=\"snslogin\">\r\n");
      out.write("				<!-- 구글 로그인 버튼 -->\r\n");
      out.write("				<div class=\"google_login\">\r\n");
      out.write("					<div id=\"g_id_onload\" data-client_id=\"378847199952-9f3b0pubnq9lcevarpdng410rkbjdvon.apps.googleusercontent.com\" data-callback=\"handleCredentialResponse\"></div>\r\n");
      out.write("					<div class=\"g_id_signin\" data-type=\"standard\" data-size=\"large\" data-text=\"signin_with\" data-shape=\"rectangular\" data-width=185></div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<form action=\"signup.do\" method=\"post\">\r\n");
      out.write("				<div id=\"google_input\">\r\n");
      out.write("						\r\n");
      out.write("				</div>\r\n");
      out.write("					<button id=\"google_signup\" type=\"submit\" style=\"display:none;\"></button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</main>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("	// --- [ 팝업 ] ---\r\n");
      out.write("	function openNewWindow(event) {\r\n");
      out.write("	  event.preventDefault(); // 기본 링크 동작을 막습니다.\r\n");
      out.write("	  \r\n");
      out.write("	  var linkURL = event.currentTarget.href;\r\n");
      out.write("	  var windowName = \"_blank\"; // 새 창 이름 (기본적으로 \"_blank\"를 사용하면 새 창이 열립니다.)\r\n");
      out.write("	  var windowFeatures = \"width=600,height=700,top=200\"; // 새 창 크기 및 기타 특성\r\n");
      out.write("	  \r\n");
      out.write("	  var newWindow = window.open(linkURL, windowName, windowFeatures);\r\n");
      out.write("	  if (newWindow === null) {\r\n");
      out.write("	    alert(\"팝업 차단이 설정되어 있을 수 있습니다. 팝업 차단을 해제해주세요.\");\r\n");
      out.write("	  }\r\n");
      out.write("	}\r\n");
      out.write("	</script>\r\n");
      out.write("	<script>\r\n");
      out.write("		// ---[ 구글 로그인 ]-------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
      out.write("		function handleCredentialResponse(response) {\r\n");
      out.write("			// decodeJwtResponse() is a custom function defined by you\r\n");
      out.write("			// to decode the credential response.\r\n");
      out.write("			const responsePayload = parseJwt(response.credential);\r\n");
      out.write("			\r\n");
      out.write("			/* console.log(\"구글 ID : \" + responsePayload.sub);\r\n");
      out.write("			console.log(\"구글 Email : \" + responsePayload.email);\r\n");
      out.write("			console.log(\"구글 Name : \" + responsePayload.name);\r\n");
      out.write("			console.log(\"구글 프로필 사진 URL: \" + responsePayload.picture); */\r\n");
      out.write("			\r\n");
      out.write("			/* location.href='signup.do?memberId=G@'+responsePayload.sub\r\n");
      out.write("				+'&memberPw='+responsePayload.sub\r\n");
      out.write("				+'&memberName='+responsePayload.name\r\n");
      out.write("				+'&email='+responsePayload.email\r\n");
      out.write("				+'&phoneNumber=01000000000'; */\r\n");
      out.write("				\r\n");
      out.write("			var split = responsePayload.email.split('@');\r\n");
      out.write("			var email = split[0];\r\n");
      out.write("			var domain = split[1];\r\n");
      out.write("\r\n");
      out.write("			$('#google_input').append('<input type=\"hidden\" name=\"memberId\" value=\"G@'+ responsePayload.sub +'\" />');\r\n");
      out.write("			$('#google_input').append('<input type=\"hidden\" name=\"memberPw\" value=\"'+ responsePayload.sub +'\" />');\r\n");
      out.write("			$('#google_input').append('<input type=\"hidden\" name=\"memberName\" value=\"'+ responsePayload.name +'\" />');\r\n");
      out.write("			$('#google_input').append('<input type=\"hidden\" name=\"email\" value=\"'+ email +'\" />');\r\n");
      out.write("			$('#google_input').append('<input type=\"hidden\" name=\"domain\" value=\"'+ domain +'\" />');\r\n");
      out.write("			$('#google_signup').click();\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("		};\r\n");
      out.write("\r\n");
      out.write("		function parseJwt(token) {\r\n");
      out.write("			var base64Url = token.split('.')[1];\r\n");
      out.write("			var base64 = base64Url.replace(/-/g, '+').replace(/_/g, '/');\r\n");
      out.write("			var jsonPayload = decodeURIComponent(atob(base64).split('').map(\r\n");
      out.write("					function(c) {\r\n");
      out.write("						return '%'\r\n");
      out.write("								+ ('00' + c.charCodeAt(0).toString(16))\r\n");
      out.write("										.slice(-2);\r\n");
      out.write("					}).join(''));\r\n");
      out.write("			return JSON.parse(jsonPayload);\r\n");
      out.write("		};\r\n");
      out.write("		// -------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
      out.write("	</script>\r\n");
      out.write("	<!-- Footer 내용을 이곳에 추가하세요 -->\r\n");
      out.write("	");
      if (_jspx_meth_slk_005ffooter_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Start Script -->\r\n");
      out.write("	<script src=\"assets/js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/jquery-migrate-1.2.1.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/templatemo.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/javascript.js\"></script>\r\n");
      out.write("	<!-- End Script -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_slk_005fnav_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  slk:nav
    org.apache.jsp.tag.web.nav_tag _jspx_th_slk_005fnav_005f0 = new org.apache.jsp.tag.web.nav_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_slk_005fnav_005f0);
    try {
      _jspx_th_slk_005fnav_005f0.setJspContext(_jspx_page_context);
      _jspx_th_slk_005fnav_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_slk_005fnav_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_slk_005fheader_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  slk:header
    org.apache.jsp.tag.web.header_tag _jspx_th_slk_005fheader_005f0 = new org.apache.jsp.tag.web.header_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_slk_005fheader_005f0);
    try {
      _jspx_th_slk_005fheader_005f0.setJspContext(_jspx_page_context);
      _jspx_th_slk_005fheader_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_slk_005fheader_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_slk_005fmodal_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  slk:modal
    org.apache.jsp.tag.web.modal_tag _jspx_th_slk_005fmodal_005f0 = new org.apache.jsp.tag.web.modal_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_slk_005fmodal_005f0);
    try {
      _jspx_th_slk_005fmodal_005f0.setJspContext(_jspx_page_context);
      _jspx_th_slk_005fmodal_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_slk_005fmodal_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_slk_005fchatBot_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  slk:chatBot
    org.apache.jsp.tag.web.chatBot_tag _jspx_th_slk_005fchatBot_005f0 = new org.apache.jsp.tag.web.chatBot_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_slk_005fchatBot_005f0);
    try {
      _jspx_th_slk_005fchatBot_005f0.setJspContext(_jspx_page_context);
      _jspx_th_slk_005fchatBot_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_slk_005fchatBot_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_slk_005ffooter_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  slk:footer
    org.apache.jsp.tag.web.footer_tag _jspx_th_slk_005ffooter_005f0 = new org.apache.jsp.tag.web.footer_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_slk_005ffooter_005f0);
    try {
      _jspx_th_slk_005ffooter_005f0.setJspContext(_jspx_page_context);
      _jspx_th_slk_005ffooter_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_slk_005ffooter_005f0);
    }
    return false;
  }
}