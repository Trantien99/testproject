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
public class Theloai implements java.io.Serializable{
    private String matl;
    private String tentl;

    public Theloai(){}
    
    public Theloai(String matl, String tentl) {
        this.matl = matl;
        this.tentl = tentl;
    }
    
    public String getMatl() {
        return matl;
    }

    public void setMatl(String matl) {
        this.matl = matl;
    }

    public String getTentl() {
        return tentl;
    }

    public void setTentl(String tentl) {
        this.tentl = tentl;
    }
    
    
}
