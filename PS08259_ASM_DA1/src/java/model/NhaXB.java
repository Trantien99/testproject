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
public class NhaXB implements java.io.Serializable{
    private String manxb;
    private String tennxb;
    private String diachi;
    private String email;

    public NhaXB(){}
    
    public NhaXB(String manxb, String tennxb, String diachi, String email) {
        this.manxb = manxb;
        this.tennxb = tennxb;
        this.diachi = diachi;
        this.email = email;
    }

    public String getManxb() {
        return manxb;
    }

    public void setManxb(String manxb) {
        this.manxb = manxb;
    }

    public String getTennxb() {
        return tennxb;
    }

    public void setTennxb(String tennxb) {
        this.tennxb = tennxb;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
