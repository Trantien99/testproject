<%-- 
    Document   : login
    Created on : Mar 25, 2019, 3:38:26 PM
    Author     : My PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CSS/footer.css">
        <link rel="stylesheet" href="CSS/login.css">
        <style>
            .err{margin: 3px;
                 color: red;
                 font-size: 14px;}
            </style>
        </head>
        <body>
            <div class="box11"></div>
        <div class="box12">
            <div class="lg">
                <h2><a>Chào mừng bạn đến với thư viện Trường Làng</a></h2>
                <form action="Controller" method="post">
                    <div class="dn"> Tên đăng nhập : <input type="text" name="txtTendn" value=""/><br/><br/><br/>
                        Mật khẩu : &emsp;&emsp;&#160;&#160;<input type="password" name="txtMk" value=""/><br/><br/>
                        <%
                            if (session.getAttribute("error") != null) {
                        %>
                        <div class="err"><%=session.getAttribute("error")%></div>
                        <%}%>
                        <button type="submit" name="action" value="dn">Đăng nhập</button>
                        <button type="submit" name="action" value="dmk">Đổi mật khẩu</button>
                    </div>
                </form>            
            </div>
        </div>
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
