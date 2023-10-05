/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author nguye
 */
public class Lich_Thi {
    private String maLT;
    private String ngayThi;
    private String phongThi;
    private String hinhThucThi;
    private String maMH;

    public Lich_Thi(String maLT, String ngayThi, String phongThi, String hinhThucThi, String maMH) {
        this.maLT = maLT;
        this.ngayThi = ngayThi;
        this.phongThi = phongThi;
        this.hinhThucThi = hinhThucThi;
        this.maMH = maMH;
    }
    
    public String getMaLT() {
        return maLT;
    }

    public String getNgayThi() {
        return ngayThi;
    }

    public String getPhongThi() {
        return phongThi;
    }

    public String getHinhThucThi() {
        return hinhThucThi;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaLT(String maLT) {
        this.maLT = maLT;
    }

    public void setNgayThi(String ngayThi) {
        this.ngayThi = ngayThi;
    }

    public void setPhongThi(String phongThi) {
        this.phongThi = phongThi;
    }

    public void setHinhThucThi(String hinhThucThi) {
        this.hinhThucThi = hinhThucThi;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }
    
}
