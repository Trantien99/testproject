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
public class TacgiaDao {

    public static List<Tacgia> laydulieuTacgia(String ma) throws SQLException {
        List<Tacgia> list = new ArrayList<>();
        String sql = "SELECT * FROM TACGIA";
        if(ma.length()>0){
        sql+= " " + ma;
        }
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String matacgia = rs.getString(1);
            String tentacgia = rs.getString(2);
            String ghichu = rs.getString(3);
            String hinhanh = rs.getString(4);
            Tacgia tg = new Tacgia(matacgia, tentacgia, ghichu, hinhanh);
            list.add(tg);
        }
        return list;
    }

    public static void themTacgia(Tacgia object) {
        Tacgia tg = object;
        String sql = "INSERT INTO TACGIA VALUES ('" + tg.getMatacgia() + "',N'" + tg.getTentacgia() + "',N'" + tg.getGhichu() + "','" + tg.getHinhanh() + "')";
        JdbcHelper.executeUpdate(sql);
    }

    public static void capnhatTacgia(Tacgia object) {
         Tacgia tg = object;
        String sql = "UPDATE TACGIA SET tentacgia = ?,ghichu = ?,hinhanh = ? WHERE matacgia = ?";
        JdbcHelper.executeUpdate(sql, tg.getTentacgia(), tg.getGhichu(), tg.getHinhanh(), tg.getMatacgia());
    }

    public static void xoaTacgia(String matacgia) {
        String sql = "DELETE FROM TACGIA WHERE matacgia = ?";
        JdbcHelper.executeUpdate(sql, matacgia);
    }
}
