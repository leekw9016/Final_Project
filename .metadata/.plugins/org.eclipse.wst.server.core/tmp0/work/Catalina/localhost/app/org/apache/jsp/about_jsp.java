/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-09-15 02:05:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"kr\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>SoundPlay | 회사소개</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/adminstyle.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"assets/img/logo-no-background.png\">\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/logo-no-background.ico\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/templatemo.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/custom.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/map.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Load fonts style after rendering the layout styles -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@100;200;300;400;500;700;900&display=swap\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/fontawesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Start Top Nav -->\r\n");
      out.write("	");
      if (_jspx_meth_slk_005fnav_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
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
      out.write("	<!-- Start Section -->\r\n");
      out.write("\r\n");
      out.write("	<section>\r\n");
      out.write("		<div>\r\n");
      out.write("			<img alt=\"About Hero\" src=\"assets/img/test/221122_221780_1950.jpg\" width=100%>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<section>\r\n");
      out.write("		<div>\r\n");
      out.write("			<img alt=\"About Hero\" src=\"assets/img/test/beolab01-1.jpg\" width=100%>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<section>\r\n");
      out.write("		<div>\r\n");
      out.write("			<img alt=\"About Hero\" src=\"assets/img/1.jpeg\" width=100%>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<br>\r\n");
      out.write("\r\n");
      out.write("	<!-- 지도 부분 -->\r\n");
      out.write("	<section class=\"container py-5\">\r\n");
      out.write("		<div class=\"container my-4\">\r\n");
      out.write("			<!-- 유튜브 embed 부분 -->\r\n");
      out.write("			<style>\n");
      out.write(".embed-container {\n");
      out.write("	position: relative;\n");
      out.write("	padding-bottom: 56.25%;\n");
      out.write("	height: 0;\n");
      out.write("	overflow: hidden;\n");
      out.write("	max-width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".embed-container iframe, .embed-container object, .embed-container embed\n");
      out.write("	{\n");
      out.write("	position: absolute;\n");
      out.write("	top: 0;\n");
      out.write("	left: 0;\n");
      out.write("	width: 100%;\n");
      out.write("	height: 100%;\n");
      out.write("}\n");
      out.write("</style>\r\n");
      out.write("			<div class='embed-container'>\r\n");
      out.write("				<iframe src='https://www.youtube.com/embed/D-h6MoF7HLA' frameborder='0' allowfullscreen></iframe>\r\n");
      out.write("			</div>\r\n");
      out.write("			<br>\r\n");
      out.write("			<div class=\"col-lg-6 m-auto\" id=\"map\" style=\"width: 700px; height: 700px;\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<!-- End Section -->\r\n");
      out.write("\r\n");
      out.write("	<!-- Start Brands -->\r\n");
      out.write("	<section class=\"container py-5\">\r\n");
      out.write("		<div class=\"container my-4\">\r\n");
      out.write("			<div class=\"row text-center py-3\">\r\n");
      out.write("				<div class=\"col-lg-9 m-auto tempaltemo-carousel\">\r\n");
      out.write("					<div class=\"row d-flex flex-row\">\r\n");
      out.write("						<!--Controls-->\r\n");
      out.write("						<div class=\"col-1 align-self-center\">\r\n");
      out.write("							<a class=\"h1\" href=\"#templatemo-slide-brand\" role=\"button\" data-bs-slide=\"prev\"> <i class=\"text-light fas fa-chevron-left\"></i>\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!--End Controls-->\r\n");
      out.write("\r\n");
      out.write("						<!--Carousel Wrapper-->\r\n");
      out.write("						<div class=\"col\">\r\n");
      out.write("							<div class=\"carousel slide carousel-multi-item pt-2 pt-md-0\" id=\"templatemo-slide-brand\" data-bs-ride=\"carousel\">\r\n");
      out.write("								<!--Slides-->\r\n");
      out.write("								<div class=\"carousel-inner product-links-wap\" role=\"listbox\">\r\n");
      out.write("\r\n");
      out.write("									<!--First slide-->\r\n");
      out.write("									<div class=\"carousel-item active\">\r\n");
      out.write("										<div class=\"row\">\r\n");
      out.write("											<div class=\"col-3 p-md-5\">\r\n");
      out.write("												<a href=\"#\"><img class=\"img-fluid banner-img\" src=\"assets/img/test/dol.png\" alt=\"banner Logo\"></a>\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"col-3 p-md-5\">\r\n");
      out.write("												<a href=\"#\"><img class=\"img-fluid brand-img\" src=\"assets/img/test/rever.png\" alt=\"banner Logo\"></a>\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"col-3 p-md-5\">\r\n");
      out.write("												<a href=\"#\"><img class=\"img-fluid brand-img\" src=\"assets/img/test/mark.png\" alt=\"banner Logo\"></a>\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"col-3 p-md-5\">\r\n");
      out.write("												<a href=\"#\"><img class=\"img-fluid brand-img\" src=\"assets/img/test/ms.png\" alt=\"banner Logo\"></a>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<!--End First slide-->\r\n");
      out.write("\r\n");
      out.write("									<!--Second slide-->\r\n");
      out.write("									<div class=\"carousel-item\">\r\n");
      out.write("										<div class=\"row\">\r\n");
      out.write("											<div class=\"col-3 p-md-5\">\r\n");
      out.write("												<a href=\"#\"><img class=\"img-fluid banner-img\" src=\"assets/img/test/sony.png\" alt=\"banner Logo\"></a>\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"col-3 p-md-5\">\r\n");
      out.write("												<a href=\"#\"><img class=\"img-fluid brand-img\" src=\"assets/img/test/oc.png\" alt=\"banner Logo\"></a>\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"col-3 p-md-5\">\r\n");
      out.write("												<a href=\"#\"><img class=\"img-fluid brand-img\" src=\"assets/img/test/bose.png\" alt=\"banner Logo\"></a>\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"col-3 p-md-5\">\r\n");
      out.write("												<a href=\"#\"><img class=\"img-fluid brand-img\" src=\"assets/img/test/senn.png\" alt=\"banner Logo\"></a>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<!--End Second slide-->\r\n");
      out.write("								</div>\r\n");
      out.write("								<!--End Slides-->\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!--End Carousel Wrapper-->\r\n");
      out.write("\r\n");
      out.write("						<!--Controls-->\r\n");
      out.write("						<div class=\"col-1 align-self-center\">\r\n");
      out.write("							<a class=\"h1\" href=\"#templatemo-slide-brand\" role=\"button\" data-bs-slide=\"next\"> <i class=\"text-light fas fa-chevron-right\"></i>\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!--End Controls-->\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<!--End Brands-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Start Footer -->\r\n");
      out.write("	");
      if (_jspx_meth_slk_005ffooter_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	<!-- End Footer -->\r\n");
      out.write("\r\n");
      out.write("	<!-- Start Script -->\r\n");
      out.write("	<script src=\"assets/js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/jquery-migrate-1.2.1.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/templatemo.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=	4e0f594d6cf711abc609295ba752a2b2\"></script>\r\n");
      out.write("	<script src=\"assets/js/map.js\"></script>\r\n");
      out.write("	<!-- End Script -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
