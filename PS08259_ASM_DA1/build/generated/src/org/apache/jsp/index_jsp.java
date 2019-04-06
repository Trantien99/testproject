package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.TheloaiDao;
import model.Theloai;
import model.NhaXB;
import model.NhaXBDao;
import model.TacgiaDao;
import model.Tacgia;
import model.SachDao;
import model.Sach;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/box.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/nav.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/boxbook.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/box1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/tieude.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/footer.css\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                width: 95%;\n");
      out.write("                margin: auto;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        ");

            if (!session.getAttribute("errorlg").equals("1")) {
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
            List<Sach> sach = SachDao.laydulieuSach("");
            List<Tacgia> tacgia1 = TacgiaDao.laydulieuTacgia("");
            List<NhaXB> nxb1 = NhaXBDao.laydulieuNhaXB("");
            List<Theloai> thl = TheloaiDao.laydulieuTheloai("");
            int height = 880;
            double size = sach.size();
            double t = Math.ceil(size / 3);
            for (int i = 3; i < t; i++) {
                height += 290;
            }
            out.println("<style>"
                    + ".box2{height: " + height + "px;}"
                    + "</style>");
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <img src=\"ICON/brTV1.jpg\" width=\"100%\"/>\n");
      out.write("        </header>\n");
      out.write("        <nav> \n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"index.jsp\" >trang chủ</a></li>\n");
      out.write("                <li><a>thể loại</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            ");

                                for (Theloai tl : thl) {
                                    out.println("<a href=\"seachSach.jsp?txtSeach=" + tl.getMatl() + "&txtMa=4&action=seach\">" + tl.getTentl() + "</a>");
                                }
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a>tác giả</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            ");
 for (Tacgia tg : tacgia1) {
                                    out.println("<a href=\"seachSach.jsp?txtSeach=" + tg.getMatacgia() + "&txtMa=2&action=seach\">" + tg.getTentacgia() + "</a>");
                                }
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a>nhà xuất bản</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            ");
for (NhaXB n : nxb1) {
                                    out.println("<a href=\"seachSach.jsp?txtSeach=" + n.getManxb() + "&txtMa=3&action=seach\">" + n.getTennxb() + "</a>");
                                }
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"sachOnline.jsp\">sách online</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <form action=\"seachSach.jsp\">\n");
      out.write("                <div class=\"seach1\">\n");
      out.write("                    <input type=\"text\" name=\"txtSeach\" value=\"\" />\n");
      out.write("                    <input type=\"hidden\" name=\"txtMa\" value=\"1\"/>\n");
      out.write("                    <img src=\"ICON/iconseach.png\" width=\"32px\" height=\"32px\"/>\n");
      out.write("                    <button type=\"submit\" name=\"action\" value=\"seach\"></button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"logout\">\n");
      out.write("            <form action=\"Controller\"> <button type=\"submit\" name=\"action\" value=\"dnh\">Đăng xuất</button> </form> / <a href=\"changepassword.jsp\"><u2>Đổi mật khẩu</u2></a> \n");
      out.write("        </div>\n");
      out.write("        <div class=\"box1\">\n");
      out.write("            <div class=\"tieudebox3\" style=\"background-color: #01DFD7 \">\n");
      out.write("                <div class=\"tieude\"><em class=\"fa fa-bars ico-title\" style=\"color: white\"></em> MENU</div>\n");
      out.write("            </div>\n");
      out.write("            <ul>\n");
      out.write("                <li><a>Thể loại</a><br/><div class=\"trong\"></div>\n");
      out.write("                    <ul>\n");
      out.write("                        ");

                            for (Theloai tl : thl) {
                                out.println("<li><a href=\"seachSach.jsp?txtSeach=" + tl.getMatl() + "&txtMa=4&action=seach\">" + tl.getTentl() + "</a></li></br>");
                            }
      out.write("\n");
      out.write("                    </ul><div class=\"trong\"></div>\n");
      out.write("                    <a>Tác giả</a><br/><div class=\"trong\"></div>\n");
      out.write("                    <ul>\n");
      out.write("                        ");
 for (Tacgia tg : tacgia1) {
                                out.println("<li><a href=\"seachSach.jsp?txtSeach=" + tg.getMatacgia() + "&txtMa=2&action=seach\">" + tg.getTentacgia() + "</a></li><br/>");
                            }
      out.write("      \n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"trong\"></div>\n");
      out.write("                    <a >Nhà xuất bản</a><br/><div class=\"trong\"></div>\n");
      out.write("                    <ul>\n");
      out.write("                        ");
for (NhaXB n : nxb1) {
                                out.println("<li><a href=\"seachSach.jsp?txtSeach=" + n.getManxb() + "&txtMa=3&action=seach\">" + n.getTennxb() + "</a></li>");
                            }
      out.write("   \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box2\">\n");
      out.write("            ");
for (Sach s : sach) {
                    String sql = "WHERE matacgia like '%" + s.getMatacgia() + "%'";
                    List<Tacgia> tacgia = TacgiaDao.laydulieuTacgia(sql);
                    String tentg = "";
                    for (Tacgia tg : tacgia) {
                        tentg = tg.getTentacgia();
                    }
                    String sql1 = "WHERE manxb like '%" + s.getManxb() + "%'";
                    List<NhaXB> nxb = NhaXBDao.laydulieuNhaXB(sql1);
                    String tennxb = "";
                    for (NhaXB n : nxb) {
                        tennxb = n.getTennxb();
                    }
                    String sql2 = "WHERE matl like '%" + s.getLoai() + "%'";
                    List<Theloai> tl = TheloaiDao.laydulieuTheloai(sql2);
                    String tentl = "";
                    for (Theloai l : tl) {
                        tentl = l.getTentl();
                    }
                    String tt = "";
                    if (s.getSoluong() > 0) {
                        tt = "<a style=\"color: green\">Còn sách</a>";
                    } else {
                        tt = "<a style=\"color: red\">Đã hết sách</a>";
                    }
                    out.println("<div class=\"boxbook\">"
                            + "<img src=\"IMG/" + s.getHinhanh() + "\"/>"
                            + "<div class=\"ttbook\">"
                            + "<div class=\"tensach\">Tên: " + s.getTensach() + "</div>"
                            + "<hr>"
                            + "<div class=\"loai\">Thể loại: " + tentl + "</div>"
                            + "<hr>"
                            + "<div class=\"tacgia\"> Tác giả: " + tentg + "</div>"
                            + "<hr>"
                            + "<div class=\"trangthai\"> Trạng thái: " + tt + "</div>"
                            + "<hr>"
                            + "<div class=\"namxb\">Năm xuất bản: " + s.getNamxb() + "</div>"
                            + "<hr>"
                            + "<div class=\"nxb\">NXB: " + tennxb + "</div>"
                            + "</div>"
                            + "</div>");
                }
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--        <div class=\"boxcart\">\n");
      out.write("                    <a href=\"login.jsp\"><img src=\"ICON/iconlogin.jpg\" width=\"100%\"/> </a>         \n");
      out.write("                </div>-->\n");
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
