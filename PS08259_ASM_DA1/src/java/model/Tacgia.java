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
public class Tacgia implements java.io.Serializable{
    private String matacgia;
    private String tentacgia;
    private String ghichu ;
    private String hinhanh ;

    public Tacgia(){}
    
    public Tacgia(String matacgia, String tentacgia, String ghichu, String hinhanh) {
        this.matacgia = matacgia;
        this.tentacgia = tentacgia;
        this.ghichu = ghichu;
        this.hinhanh = hinhanh;
    }

    public String getMatacgia() {
        return matacgia;
    }

    public void setMatacgia(String matacgia) {
        this.matacgia = matacgia;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }
    
    
}
