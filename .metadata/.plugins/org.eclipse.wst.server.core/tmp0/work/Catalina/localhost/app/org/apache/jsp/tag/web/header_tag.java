/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-09-15 02:05:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1691645570010L));
    _jspx_dependants.put("jar:file:/D:/lee/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/chatSLK_final_01/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
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

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(this, ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }

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
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light shadow\">\n");
      out.write("	<div class=\"container d-flex justify-content-between align-items-center\">\n");
      out.write("\n");
      out.write("		<a class=\"navbar-brand text-success logo h1 align-self-center\" href=\"main.do\"> SoundPlay <!--  로고명 -->\n");
      out.write("		</a>\n");
      out.write("\n");
      out.write("		<button class=\"navbar-toggler border-0\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#templatemo_main_nav\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("		</button>\n");
      out.write("\n");
      out.write("		<div class=\"align-self-center collapse navbar-collapse flex-fill  d-lg-flex justify-content-lg-between\" id=\"templatemo_main_nav\">\n");
      out.write("			<div class=\"flex-fill\">\n");
      out.write("				<ul class=\"nav navbar-nav d-flex justify-content-between mx-lg-auto\">\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"main.do\">Home</a></li>\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"shopPage.do\">Shop</a></li>\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"aboutPage.do\">About</a></li>\n");
      out.write("				</ul>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"navbar align-self-center d-flex\">\n");
      out.write("				<div class=\"d-lg-none flex-sm-fill mt-3 mb-4 col-7 col-sm-auto pr-3\">\n");
      out.write("					<div class=\"input-group\">\n");
      out.write("						<input type=\"text\" class=\"form-control\" id=\"inputMobileSearch\" placeholder=\"Search ...\">\n");
      out.write("						<div class=\"input-group-text\">\n");
      out.write("							<i class=\"fa fa-fw fa-search\"></i>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("				<a class=\"nav-icon d-none d-lg-inline\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#templatemo_search\"> <i class=\"fa fa-fw fa-search text-dark mr-2\"></i>\n");
      out.write("				</a>\n");
      out.write("\n");
      out.write("				");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("				");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("</nav>");
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));
      // /WEB-INF/tags/header.tag(36,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty memberId}", boolean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("					<a class=\"nav-icon position-relative text-decoration-none\" href=\"error.do\"> <i class=\"fa fa-fw fa-cart-arrow-down text-dark mr-1\"></i>\n");
          out.write("					</a>\n");
          out.write("					<a class=\"nav-icon position-relative text-decoration-none\" href=\"loginPage.do\"> <i class=\"fa fa-fw fa-user text-light mr-3\"></i>\n");
          out.write("					</a>\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));
      // /WEB-INF/tags/header.tag(42,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty memberId}", boolean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("					<a class=\"nav-icon position-relative text-decoration-none\" href=\"cartPage.do\">\n");
          out.write("					<i class=\"fa fa-fw fa-cart-arrow-down text-dark mr-1\"></i> <!-- <span class=\"position-absolute top-0 left-100 translate-middle badge rounded-pill bg-light text-dark\">2</span> --> <!-- 요기 장바구니 담긴 갯수 -->\n");
          out.write("					</a>\n");
          out.write("					<a class=\"nav-icon position-relative text-decoration-none\" href=\"mypagePage.do\"> <i class=\"fa fa-fw fa-user text-dark mr-3\"></i> <!-- <span class=\"position-absolute top-0 left-100 translate-middle badge rounded-pill bg-dark text-light\">2</span> 요기 주문완료한 갯수 -->\n");
          out.write("					</a>\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
