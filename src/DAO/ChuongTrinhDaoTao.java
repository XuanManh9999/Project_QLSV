/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author nguye
 */
public class ChuongTrinhDaoTao {
    private String maDT, tenCT, khoa, thoiGian;

    public ChuongTrinhDaoTao(String maDT, String tenCT, String khoa, String thoiGian) {
        this.maDT = maDT;
        this.tenCT = tenCT;
        this.khoa = khoa;
        this.thoiGian = thoiGian;
    }

    public ChuongTrinhDaoTao() {
    }

    public String getMaDT() {
        return maDT;
    }

    public String getTenCT() {
        return tenCT;
    }

    public String getKhoa() {
        return khoa;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public void setTenCT(String tenCT) {
        this.tenCT = tenCT;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }
    
}
