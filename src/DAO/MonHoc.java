/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author nguye
 */
public class MonHoc {
    private String maMH;
    private String tenMH;
    private int soTC;
    private String thuocKhoa;
    private String maDT;
    public MonHoc() {
        
    }
    public MonHoc(String maMH, String tenMH, int soTC, String thuocKhoa, String maDT) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
        this.thuocKhoa = thuocKhoa;
        this.maDT = maDT;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public String getThuocKhoa() {
        return thuocKhoa;
    }



    public String getMaDT() {
        return maDT;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public void setThuocKhoa(String thuocKhoa) {
        this.thuocKhoa = thuocKhoa;
    }



    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }
    
}
