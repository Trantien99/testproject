/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbchelp.JdbcHelper;
import model.Docgia;
import model.DocgiaDao;

/**
 *
 * @author My PC
 */
public class Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        response.setHeader("Cache-Control", "no-cache");
//        response.setHeader("Pragma", "no-cache");
       
        try (PrintWriter out = response.getWriter()) {
            String action = request.getParameter("action");
            HttpSession session = request.getSession(true);
            String err = (String) session.getAttribute("error");
            String errdmk = (String) session.getAttribute("errormkc");
            String errmkm1 = (String) session.getAttribute("errormkm1");
            String errlg = (String) session.getAttribute("errorlg");
            if (action.equals("dn")) {
                String tendn = request.getParameter("txtTendn");
                String mk = request.getParameter("txtMk");
//                List<Docgia> list = new ArrayList<>();
                
                if (tendn.equals("") || mk.equals("")) {
                    err = "Vui lòng nhập tài khoản hoặc mật khẩu";
                    session.setAttribute("error", err);
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);
                }
                Docgia docGia = null;
                try {
                    docGia = DocgiaDao.laydulieuDocgia(" Where sdt like '" + tendn + "'").get(0);
                } catch (SQLException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (docGia == null) {
                    err = "Thông tin đăng nhập không hợp lệ !";
                    session.setAttribute("error", err);
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);
                } else {
                    if (mk.equals(docGia.getMk())) {
                        err = "";
                        session.setAttribute("error", err);
                        errlg = "1";
                        session.setAttribute("errorlg", errlg);
                        session.setAttribute("userName", tendn);  
                        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                        rd.forward(request, response);

                    } else {
                        err = "Thông tin đăng nhập không hợp lệ !";
                        session.setAttribute("error", err);
                        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                        rd.forward(request, response);
                    }
                }
//                if (tendn.equals("") || mk.equals("")) {
//                    err = "Vui lòng nhập tài khoản hoặc mật khẩu";
//                    session.setAttribute("error", err);
//                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
//                    rd.forward(request, response);
//                }
//                for (Docgia dg : list) {
//                    if (dg.getSdt().trim().equals(tendn)) {
//                        if (dg.getMk().trim().equals(mk.trim())) {
//                            err = "";
//                            session.setAttribute("error", err);
//                            errlg = "1";
//                            session.setAttribute("errorlg", errlg);
//                            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//                            rd.forward(request, response);
//
//                        } else {
//                            err = "Thông tin đăng nhập không hợp lệ !";
//                            session.setAttribute("error", err);
//                            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
//                            rd.forward(request, response);
//                        }
//                    } else if (list.indexOf(dg) == list.size() - 1 && !dg.getSdt().equals(tendn)) {
//                        err = "Thông tin đăng nhập không hợp lệ !";
//                        session.setAttribute("error", err);
//                        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
//                        rd.forward(request, response);
//                    } else {
//                    }
//                }
            } else if (action.equals("dmk")) {
                errdmk = "";
                session.setAttribute("errormkc", errdmk);
                errmkm1 = "";
                session.setAttribute("errormkm1", errmkm1);
                RequestDispatcher rd = request.getRequestDispatcher("changepassword.jsp");
                rd.forward(request, response);
            } else if (action.equals("tdmk")) {
                String tendn = request.getParameter("txttendn");
                String mkc = request.getParameter("txtpwc");
                String mkm1 = request.getParameter("txtpwm");
                String mkm2 = request.getParameter("txtpwxn");
                if (mkc.trim().length() < 8 || mkc.trim().length() > 16) {
                    errdmk = "Mật khẩu từ 8 đến 16 kí tự";
                    session.setAttribute("errormkc", errdmk);
                    RequestDispatcher rd = request.getRequestDispatcher("changepassword.jsp");
                    rd.forward(request, response);
                    return;
                } else {
                    errdmk = "";
                    session.setAttribute("errormkc", errdmk);
                }
                if (mkm1.trim().length() < 8 || mkm1.trim().length() > 16 || mkm2.trim().length() < 8 || mkm2.trim().length() > 16) {
                    errmkm1 = "Mật khẩu từ 8 đến 16 kí tự";
                    session.setAttribute("errormkm1", errmkm1);
                    RequestDispatcher rd = request.getRequestDispatcher("changepassword.jsp");
                    rd.forward(request, response);
                    return;
                } else {
                    errmkm1 = "";
                    session.setAttribute("errormkm1", errmkm1);
                }
                List<Docgia> dgia = new ArrayList<>();
                try {
                    dgia = DocgiaDao.laydulieuDocgia("");
                } catch (SQLException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
                boolean ckmk = false;
                for (Docgia dg : dgia) {
                    if (dg.getSdt().equals(tendn)) {
                        if (dg.getMk().equals(mkc)) {
                            errmkm1 = "";
                            session.setAttribute("errormkc", errmkm1);
                            ckmk = true;
                            break;
                        } else {
                            errmkm1 = "Tài khoản hoăc mật khẩu không chính xác";
                            session.setAttribute("errormkc", errmkm1);
                            RequestDispatcher rd = request.getRequestDispatcher("changepassword.jsp");
                            rd.forward(request, response);
                            return;
                        }
                    } else {
                        errmkm1 = "Tài khoản hoăc mật khẩu không chính xác";
                        session.setAttribute("errormkc", errmkm1);
                    }
                }
                if (!ckmk) {
                }
                if (!mkm1.equals(mkm2)) {
                    errmkm1 = "Mật khẩu không khớp";
                    session.setAttribute("errormkm1", errmkm1);
                    RequestDispatcher rd = request.getRequestDispatcher("changepassword.jsp");
                    rd.forward(request, response);
                    return;
                } else {
                    errmkm1 = "";
                    session.setAttribute("errormkm1", errmkm1);
                }
                String sql = "UPDATE DOCGIA SET matkhau = ? WHERE sdt = ?";
                JdbcHelper.executeUpdate(sql, mkm2, tendn);
                errmkm1 = "Đổi mật khẩu thành công";
                session.setAttribute("errormkm1", errmkm1);
                RequestDispatcher rd = request.getRequestDispatcher("changepassword.jsp");
                rd.forward(request, response);
            } else if (action.equals("dnh")) {
                err = "";
                session.setAttribute("error", err);
                errlg = "2";
                session.setAttribute("errorlg", errlg);
                session.invalidate();
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
//                session = request.getSession(false);
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
