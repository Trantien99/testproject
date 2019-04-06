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
public class DocgiaDao {

    public static List<Docgia> laydulieuDocgia(String ma) throws SQLException {
        List<Docgia> list = new ArrayList<>();
        String sql = "SELECT * FROM DOCGIA";
        if(ma.length()>0){
        sql+= " " + ma;
        }
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String madg = rs.getString(1);
            String tendg = rs.getString(2);
            String diachi = rs.getString(3);
            String sdt = rs.getString(4);
            String mk = rs.getString(5);
            String hinhanh = rs.getString(6);
            Docgia nv = new Docgia(madg, tendg, diachi, sdt,mk, hinhanh);
            list.add(nv);
        }
        return list;
    }

    public static void themDocgia(Docgia object) {
        Docgia dg = object;
        String sql = "INSERT INTO DOCGIA VALUES ('" + dg.getMadg() + "',N'" + dg.getTendg() + "',N'" + dg.getDiachi() + "','" + dg.getSdt() + "','" + dg.getMk()+ "','" + dg.getHinhanh() + "')";
        JdbcHelper.executeUpdate(sql);
    }

    public static void capnhatDocgia(Docgia object) {
        Docgia dg = object;
        String sql = "UPDATE DOCGIA SET tendg = ?,diachi = ?,sdt = ?,matkhau = ?,hinhanh = ? WHERE madg = ?";
        JdbcHelper.executeUpdate(sql, dg.getTendg(), dg.getDiachi(), dg.getSdt(),dg.getMk(), dg.getHinhanh(), dg.getMadg());
    }

    public static void xoaDocgia(String madg) {
        String sql = "DELETE FROM DOCGIA WHERE madg = ?";
        JdbcHelper.executeUpdate(sql, madg);
    }
}
