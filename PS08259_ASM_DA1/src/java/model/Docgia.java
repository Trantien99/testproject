/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author My PC
 */
public class Docgia implements java.io.Serializable {

    private String madg;
    private String tendg;
    private String diachi;
    private String sdt;
    private String mk;
    private String hinhanh;

    public Docgia() {
    }

    public Docgia(String madg, String tendg, String diachi, String sdt, String mk, String hinhanh) {
        this.madg = madg;
        this.tendg = tendg;
        this.diachi = diachi;
        this.sdt = sdt;
        this.mk = mk;
        this.hinhanh = hinhanh;
    }

    

    public String getMadg() {
        return madg;
    }

    public void setMadg(String madg) {
        this.madg = madg;
    }

    public String getTendg() {
        return tendg;
    }

    public void setTendg(String tendg) {
        this.tendg = tendg;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

}
