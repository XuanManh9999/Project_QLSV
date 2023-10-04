/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.Giao_Vien;
import Model.hendle_QLGV;
import java.util.ArrayList;
/**
 *
 * @author nguye
 */
public class hendle_ql_giao_vien {
    hendle_QLGV gv = new hendle_QLGV();
     public  boolean createGiaoVien(Giao_Vien gv1) {
        return gv.Create(gv1);
    }
    public  ArrayList<Giao_Vien> readGiaoVien() {
        return gv.Read();
    }
    public boolean deleteGiaoVien(String id) {
        return gv.Delete(id);
    }
    public  boolean updateGiaoVien(Giao_Vien gv1) {
        return gv.Update(gv1);
    }
}
