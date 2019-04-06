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
public class Sach implements java.io.Serializable{
    private String masach;
    private String tensach;
    private String hinhanh;
    private String matacgia;
    private String loai;
    private int soluong;
    private String manxb;
    private int namxb;
    private String files;

    public Sach(){
    }
    
    public Sach(String masach, String tensach, String hinhanh, String matacgia, String loai, int soluong, String manxb, int namxb, String files) {
        this.masach = masach;
        this.tensach = tensach;
        this.hinhanh = hinhanh;
        this.matacgia = matacgia;
        this.loai = loai;
        this.soluong = soluong;
        this.manxb = manxb;
        this.namxb = namxb;
        this.files = files;
    }
    
    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getMatacgia() {
        return matacgia;
    }

    public void setMatacgia(String matacgia) {
        this.matacgia = matacgia;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getManxb() {
        return manxb;
    }

    public void setManxb(String manxb) {
        this.manxb = manxb;
    }

    public int getNamxb() {
        return namxb;
    }

    public void setNamxb(int namxb) {
        this.namxb = namxb;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }
    
    
}
