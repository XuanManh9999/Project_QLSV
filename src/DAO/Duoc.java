/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author nguye
 */
public class Duoc {
    private String maSV;
    private String maKT;

    public Duoc(String maSV, String maKT) {
        this.maSV = maSV;
        this.maKT = maKT;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getMaKT() {
        return maKT;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setMaKT(String maKT) {
        this.maKT = maKT;
    }
    
}
