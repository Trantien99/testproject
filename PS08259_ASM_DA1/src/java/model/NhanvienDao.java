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
public class NhanvienDao {

    public static List<Nhanvien> laydulieuNhanvien(String ma) throws SQLException {
        List<Nhanvien> list = new ArrayList<>();
        String sql = "SELECT * FROM NHANVIEN";
        if(ma.length()>0){
        sql+= " " + ma;
        }
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String manv = rs.getString(1);
            String tennv = rs.getString(2);
            String ngaysinh = rs.getString(3);
            String sdt = rs.getString(4);
            String email = rs.getString(5);
            String diachi = rs.getString(6);
            String vaitro = rs.getString(7);
            String mk = rs.getString(8);
            String hinhanh = rs.getString(9);
            Nhanvien nv = new Nhanvien(manv, tennv, ngaysinh, sdt, email, diachi, vaitro, mk, hinhanh);
            list.add(nv);
        }
        return list;
    }

    public static void themNhanvien(Nhanvien object) {
        Nhanvien nv = object;
        String sql = "INSERT INTO NHANVIEN VALUES ('" + nv.getManv() + "',N'" + nv.getTennv() + "'," + nv.getNgaysinh() + ",'" + nv.getSdt() + "','" + nv.getEmail() + "',N'" + nv.getDiachi() + "','"+ nv.getVaitro()+ "','"+ nv.getMk()+ "','" + nv.getHinhanh() + "')";
        JdbcHelper.executeUpdate(sql);
    }

    public static void capnhatNhanvien(Nhanvien object) {
        Nhanvien nv = object;
        String sql = "UPDATE NHANVIEN SET tennv = ?,ngaysinh = ?,sdt = ?,email = ?,diachi = ?,vaitro = ?, matkhau = ?, ,hinhanh = ? WHERE manv = ?";
        JdbcHelper.executeUpdate(sql, nv.getTennv(), nv.getNgaysinh(), nv.getSdt(), nv.getEmail(), nv.getDiachi(),nv.getVaitro(),nv.getMk(), nv.getHinhanh(), nv.getManv());
    }

    public static void xoaNhanvien(String manv) {
        String sql = "DELETE FROM NHANVIEN WHERE manv = ?";
        JdbcHelper.executeUpdate(sql, manv);
    }
}
