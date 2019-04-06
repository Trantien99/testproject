<%-- 
    Document   : index
    Created on : Mar 12, 2019, 8:02:50 PM
    Author     : My PC
--%>

<%@page import="model.TheloaiDao"%>
<%@page import="model.Theloai"%>
<%@page import="model.NhaXB"%>
<%@page import="model.NhaXBDao"%>
<%@page import="model.TacgiaDao"%>
<%@page import="model.Tacgia"%>
<%@page import="model.SachDao"%>
<%@page import="model.Sach"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="CSS/box.css">
        <link rel="stylesheet" href="CSS/nav.css">
        <link rel="stylesheet" href="CSS/boxbook.css">
        <link rel="stylesheet" href="CSS/box1.css">
        <link rel="stylesheet" href="CSS/tieude.css">
        <link rel="stylesheet" href="CSS/footer.css">
        <style>
            body{
                width: 95%;
                margin: auto;

            }
        </style>
        <%
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
        %>
    </head>
    <body>
        <header>
            <img src="ICON/brTV1.jpg" width="100%"/>
        </header>
        <nav> 
            <ul>
                <li><a href="index.jsp" >trang chủ</a></li>
                <li><a>thể loại</a>
                    <ul>
                        <li>
                            <%
                                for (Theloai tl : thl) {
                                    out.println("<a href=\"seachSach.jsp?txtSeach=" + tl.getMatl() + "&txtMa=4&action=seach\">" + tl.getTentl() + "</a>");
                                }%>
                        </li>
                        <li>
                            <a></a>
                        </li>
                    </ul>
                </li>
                <li><a>tác giả</a>
                    <ul>
                        <li>
                            <% for (Tacgia tg : tacgia1) {
                                    out.println("<a href=\"seachSach.jsp?txtSeach=" + tg.getMatacgia() + "&txtMa=2&action=seach\">" + tg.getTentacgia() + "</a>");
                                }%>
                        </li>
                        <li>
                            <a></a>
                        </li>
                    </ul>
                </li>
                <li><a>nhà xuất bản</a>
                    <ul>
                        <li>
                            <%for (NhaXB n : nxb1) {
                                    out.println("<a href=\"seachSach.jsp?txtSeach=" + n.getManxb() + "&txtMa=3&action=seach\">" + n.getTennxb() + "</a>");
                                }%>
                        </li>
                        <li>
                            <a></a>
                        </li>
                    </ul>
                </li>
                <li><a href="sachOnline.jsp">sách online</a>
                </li>
            </ul>
            <form action="seachSach.jsp">
                <div class="seach1">
                    <input type="text" name="txtSeach" value="" />
                    <input type="hidden" name="txtMa" value="1"/>
                    <img src="ICON/iconseach.png" width="32px" height="32px"/>
                    <button type="submit" name="action" value="seach"></button>
                </div>
            </form>
        </nav>
        <div class="logout">
            <a href="Controller?action=dnh"><u>Đăng xuất</u></a> / <a href="changepassword.jsp"><u>Đổi mật khẩu</u></a>
        </div>
        <div class="box1">
            <div class="tieudebox3" style="background-color: #01DFD7 ">
                <div class="tieude"><em class="fa fa-bars ico-title" style="color: white"></em> MENU</div>
            </div>
            <ul>
                <li><a>Thể loại</a><br/><div class="trong"></div>
                    <ul>
                        <%
                            for (Theloai tl : thl) {
                                out.println("<li><a href=\"seachSach.jsp?txtSeach=" + tl.getMatl() + "&txtMa=4&action=seach\">" + tl.getTentl() + "</a></li></br>");
                            }%>
                    </ul><div class="trong"></div>
                    <a>Tác giả</a><br/><div class="trong"></div>
                    <ul>
                        <% for (Tacgia tg : tacgia1) {
                                out.println("<li><a href=\"seachSach.jsp?txtSeach=" + tg.getMatacgia() + "&txtMa=2&action=seach\">" + tg.getTentacgia() + "</a></li><br/>");
                            }%>      
                    </ul>
                    <div class="trong"></div>
                    <a >Nhà xuất bản</a><br/><div class="trong"></div>
                    <ul>
                        <%for (NhaXB n : nxb1) {
                                out.println("<li><a href=\"seachSach.jsp?txtSeach=" + n.getManxb() + "&txtMa=3&action=seach\">" + n.getTennxb() + "</a></li>");
                            }%>   
                    </ul>
                </li>
            </ul>

        </div>
        <div class="box2">
            <%for (Sach s : sach) {
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
                }%>
        </div>
        <!--        <div class="boxcart">
                    <a href="login.jsp"><img src="ICON/iconlogin.jpg" width="100%"/> </a>         
                </div>-->
        <footer>
            © Bản quyền thuộc Thư Viện Trường Làng.<br/>
            Giấy phép số 96/GP-STTTT, cấp ngày 30/10/2015 do Sở TT&TT cấp.<br/>
            Địa chỉ: Số 69 Lý Tự Trọng, Phường Bến Thành, Quận 1, Tp. Hồ Chí Minh.<br/>
            Điện thoại: + 84 (037) 491 4944 <br/>
            Email: thuvienttruonglang@thuvientruonglang.gov.vn<br/>
            Chịu trách nhiệm chính: Trần Viết Tiến
        </footer>
    </body>
</html>
