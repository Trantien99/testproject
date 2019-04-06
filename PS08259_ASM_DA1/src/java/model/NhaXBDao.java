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
public class NhaXBDao {

    public static List<NhaXB> laydulieuNhaXB(String ma) throws SQLException {
        List<NhaXB> list = new ArrayList<>();
        String sql = "SELECT * FROM NXB";
        if(ma.length()>0){
        sql+= " " + ma;
        }
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String manxb = rs.getString(1);
            String tennxb = rs.getString(2);
            String diachi = rs.getString(3);
            String email = rs.getString(4);
            NhaXB nxb = new NhaXB(manxb, tennxb, diachi, email);
            list.add(nxb);
        }
        return list;
    }

    public static void themNhaXB(NhaXB object) {
        NhaXB n = object;
        String sql = "INSERT INTO NXB VALUES ('" + n.getManxb() + "',N'" + n.getTennxb() + "',N'" + n.getDiachi() + "','" + n.getEmail() + "')";
        JdbcHelper.executeUpdate(sql);
    }

    public static void capnhatNhaXB(NhaXB object) {
        NhaXB n = object;
        String sql = "UPDATE NXB SET tennxb = ?,diachi = ?,email = ? WHERE manxb = ?";
        JdbcHelper.executeUpdate(sql, n.getTennxb(), n.getDiachi(), n.getEmail(), n.getManxb());
    }

    public static void xoaNhaXB(String manxb) {
        String sql = "DELETE FROM NXB WHERE manxb = ?";
        JdbcHelper.executeUpdate(sql, manxb);
    }
}
