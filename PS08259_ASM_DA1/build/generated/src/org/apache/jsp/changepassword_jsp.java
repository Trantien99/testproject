package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changepassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/footer.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/login.css\">\n");
      out.write("        <style>\n");
      out.write("            .lg .dn{\n");
      out.write("                width: 360px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            .lg input{float: right;}\n");
      out.write("            .lg .dn button{margin: 5px 23px;}\n");
      out.write("            .err{color: red;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"box11\"></div>\n");
      out.write("        <div class=\"box12\">\n");
      out.write("            <div class=\"lg\">\n");
      out.write("                <h2><a>Chào mừng bạn đến với thư viện Trường Làng</a></h2>\n");
      out.write("                <form action=\"Controller\" method=\"post\">\n");
      out.write("                    <div class=\"dn\"> \n");
      out.write("                        Tên đăng nhập : <input type=\"text\" name=\"txttendn\" value=\"\"/><br/><br/>\n");
      out.write("                        Mật khẩu cũ : <input type=\"password\" name=\"txtpwc\" value=\"\"/><br/>\n");
      out.write("                        ");

                            if (session.getAttribute("errormkc") != null) {
                        
      out.write("\n");
      out.write("                        <div class=\"err\">");
      out.print(session.getAttribute("errormkc"));
      out.write("</div>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        Mật khẩu mới:<input type=\"password\" name=\"txtpwm\" value=\"\"/><br/><br/><br/>\n");
      out.write("                        Xác nhận mật khẩu mới:<input type=\"password\" name=\"txtpwxn\" value=\"\"/><br/><br/>\n");
      out.write("                        ");

                            if (session.getAttribute("errormkm1") != null) {
                        
      out.write("\n");
      out.write("                        <div class=\"err\">");
      out.print(session.getAttribute("errormkm1"));
      out.write("</div>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        <button type=\"submit\" name=\"action\" value=\"tdmk\">Thay đổi</button>\n");
      out.write("                        <button type=\"submit\" name=\"action\" value=\"dnh\">Đăng nhập</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            © Bản quyền thuộc Thư Viện Trường Làng.<br/>\n");
      out.write("            Giấy phép số 96/GP-STTTT, cấp ngày 30/10/2015 do Sở TT&TT cấp.<br/>\n");
      out.write("            Địa chỉ: Số 69 Lý Tự Trọng, Phường Bến Thành, Quận 1, Tp. Hồ Chí Minh.<br/>\n");
      out.write("            Điện thoại: + 84 (037) 491 4944 <br/>\n");
      out.write("            Email: thuvienttruonglang@thuvientruonglang.gov.vn<br/>\n");
      out.write("            Chịu trách nhiệm chính: Trần Viết Tiến\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
