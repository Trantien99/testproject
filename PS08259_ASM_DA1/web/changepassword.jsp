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
            .lg .dn{
                width: 360px;
                text-align: left;
            }
            .lg input{float: right;}
            .lg .dn button{margin: 5px 23px;}
            .err{margin: 5px;
                 color: red;
                 font-size: 14px;
            height: 10px;}
            </style>
        </head>
        <body>
            <div class="box11"></div>
        <div class="box12">
            <div class="lg">
                <h2><a>Chào mừng bạn đến với thư viện Trường Làng</a></h2>
                <form action="Controller" method="post">
                    <div class="dn"> 
                        Tên đăng nhập : <input type="text" name="txttendn" value=""/><br/><br/>
                        Mật khẩu cũ : <input type="password" name="txtpwc" value=""/><br/>
                        <%
                            if (session.getAttribute("errormkc") != null) {
                        %>
                        <div class="err"><%=session.getAttribute("errormkc")%></div>
                        <%}%>
                        Mật khẩu mới:<input type="password" name="txtpwm" value=""/><br/><br/>
                        Xác nhận mật khẩu mới:<input type="password" name="txtpwxn" value=""/><br/><br/>
                        <%
                            if (session.getAttribute("errormkm1") != null) {
                        %>
                        <div class="err"><%=session.getAttribute("errormkm1")%></div>
                        <%}%>
                        <button type="submit" name="action" value="tdmk">Thay đổi</button>
                        <button type="submit" name="action" value="dnh">Đăng nhập</button>
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
