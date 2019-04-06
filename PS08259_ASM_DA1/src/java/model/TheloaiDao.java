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
public class TheloaiDao {
    public static List<Theloai> laydulieuTheloai(String ma) throws SQLException{
    List<Theloai> list = new ArrayList<>();
        String sql = "SELECT * FROM THELOAI";
        if(ma.length()>0){
        sql+= " " + ma;
        }
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String matl = rs.getString(1);
            String tentl = rs.getString(2);
            Theloai tl = new Theloai(matl, tentl);
            list.add(tl);
        }
        return list;
    }

    public static void themTheloai(Theloai object) {
        Theloai tl = object;
        String sql = "INSERT INTO THELOAI VALUES ('" + tl.getMatl() + "',N'" + tl.getTentl() + "')";
        JdbcHelper.executeUpdate(sql);
    }

    public static void capnhatTheloai(Theloai object) {
         Theloai tl = object;
        String sql = "UPDATE THELOAI SET tentl = ? WHERE matl = ?";
        JdbcHelper.executeUpdate(sql,  tl.getTentl(),tl.getMatl());
    }

    public static void xoaTheloai(String matl) {
        String sql = "DELETE FROM THELOAI WHERE matl = ?";
        JdbcHelper.executeUpdate(sql, matl);
    }
}
