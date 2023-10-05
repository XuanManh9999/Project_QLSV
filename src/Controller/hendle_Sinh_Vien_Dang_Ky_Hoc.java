/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.dang_ky;
import Model.hendle_DKHoc;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author nguye
 */
public class hendle_Sinh_Vien_Dang_Ky_Hoc {
    hendle_DKHoc dkHoc = new hendle_DKHoc();
    public boolean createDKH(dang_ky dk) {
        return dkHoc.Create(dk);
    }
    public boolean updateDKH(dang_ky dk) {
        return dkHoc.Update(dk);
    }
    public boolean deleteDKH(String id) {
        return dkHoc.Delete(id);
    }
    public ResultSet getDataDKH() {
        return dkHoc.getData();
    }
    public ArrayList<String> getMaMH() {
        return dkHoc.getMaMH();
    }
}
