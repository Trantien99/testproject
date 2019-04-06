/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbchelp.JdbcHelper;

/**
 *
 * @author My PC
 */
public class SachDao {

    public static List<Sach> laydulieuSach(String ma) throws SQLException {
        List<Sach> list = new ArrayList<>();
        String sql = "SELECT * FROM SACH";
        if(ma.length()>0){
        sql+= " " + ma;
        }
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String masach = rs.getString(1);
            String tensach = rs.getString(2);
            String hinhanh = rs.getString(3);
            String matacgia = rs.getString(4);
            String loai = rs.getString(5);
            String soluong = rs.getString(6);
            String manxb = rs.getString(7);
            String namxb = rs.getString(8);
            String file = rs.getString(9);
            int sl = Integer.parseInt(soluong);
            int namxb1 = Integer.parseInt(namxb);
            Sach s = new Sach(masach, tensach, hinhanh, matacgia, loai, sl, manxb, namxb1, file);
            list.add(s);
        }
        return list;
    }

    public static void themSach(Sach object) {
        Sach s = object;
        String sql = "INSERT INTO SACH VALUES ('" + s.getMasach() + "',N'" + s.getTensach() + "',N'" + s.getHinhanh() + "','" + s.getMatacgia() + "',N'" + s.getLoai() + "'," + s.getSoluong() + ",'" + s.getManxb() + "'," + s.getNamxb() + ",'" + s.getFiles() + "')";
        JdbcHelper.executeUpdate(sql);
    }

    public static void capnhatSach(Sach object) {
        Sach s = object;
        String sql = "UPDATE SACH SET tensach = ?,hinhanh = ?,matacgia = ?,loai = ?,soluong = ?,manxb = ?,namxb = ?,files = ? WHERE masach = ?";
        JdbcHelper.executeUpdate(sql, s.getTensach(), s.getHinhanh(), s.getMatacgia(), s.getLoai(), s.getSoluong(), s.getManxb(), s.getNamxb(), s.getFiles(), s.getMasach());
    }

    public static void xoaSach(String masach) {
        String sql = "DELETE FROM SACH WHERE masach = ?";
        JdbcHelper.executeUpdate(sql, masach);
    }
}
