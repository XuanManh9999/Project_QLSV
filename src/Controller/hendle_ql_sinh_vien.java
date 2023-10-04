/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.Sinh_Vien;
import Model.hendle_QL_SV;
import java.util.ArrayList;
/**
 *
 * @author nguye
 */
public class hendle_ql_sinh_vien {
    hendle_QL_SV qlsv = new hendle_QL_SV();
    public  boolean createSinh_Vien(Sinh_Vien sv) {
        return qlsv.Create(sv);
    }
    public  ArrayList<Sinh_Vien> readSinh_Vien() {
        return qlsv.Read();
    }
    public  ArrayList<Sinh_Vien> SearchSinh_Vien(String id) {
        return qlsv.Search(id);
    }
    public  ArrayList<Sinh_Vien> SearchSinh_Vien_name(String id) {
        return qlsv.Search_name(id);
    }
    public boolean deleteSinh_Vien(String id) {
        return qlsv.Delete(id);
    }
    public  boolean updateSinh_Vien(Sinh_Vien sv) {
        return qlsv.Update(sv);
    }
    public ArrayList<String> getMaDT() {
        return qlsv.getMaDT();
    }
}
