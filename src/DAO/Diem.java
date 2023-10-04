/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author nguye
 */
public class Diem {
    
    private String maDiem;
    private int thangDiem10;
    private String thangDiemChu;
    private String ghiChu;
    private String maMH;
    private String maSV;
    public Diem() {
        
    }
    public Diem(String maDiem, int thangDiem10, String thangDiemChu, String ghiChu, String maMH, String maSV) {
        this.maDiem = maDiem;
        this.thangDiem10 = thangDiem10;
        this.thangDiemChu = thangDiemChu;
        this.ghiChu = ghiChu;
        this.maMH = maMH;
        this.maSV = maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaSV() {
        return maSV;
    }
    
    public String getMaDiem() {
        return maDiem;
    }

    public int getThangDiem10() {
        return thangDiem10;
    }

    public String getThangDiemChu() {
        return thangDiemChu;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaDiem(String maDiem) {
        this.maDiem = maDiem;
    }

    public void setThangDiem10(int thangDiem10) {
        this.thangDiem10 = thangDiem10;
    }

    public void setThangDiemChu(String thangDiemChu) {
        this.thangDiemChu = thangDiemChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }
    
}
