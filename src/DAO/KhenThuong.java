/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author nguye
 */
public class KhenThuong {
    private String maKT;
    private String danhHieu;
    private String ngayKhenThuong;

    public KhenThuong(String maKT, String danhHieu, String ngayKhenThuong) {
        this.maKT = maKT;
        this.danhHieu = danhHieu;
        this.ngayKhenThuong = ngayKhenThuong;
    }

    public String getMaKT() {
        return maKT;
    }

    public String getDanhHieu() {
        return danhHieu;
    }

    public String getNgayKhenThuong() {
        return ngayKhenThuong;
    }

    public void setMaKT(String maKT) {
        this.maKT = maKT;
    }

    public void setDanhHieu(String danhHieu) {
        this.danhHieu = danhHieu;
    }

    public void setNgayKhenThuong(String ngayKhenThuong) {
        this.ngayKhenThuong = ngayKhenThuong;
    }
    
}
