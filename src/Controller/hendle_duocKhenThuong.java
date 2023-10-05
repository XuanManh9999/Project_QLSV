/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.Duoc;
import Model.hendle_KhenThuong_to_sv;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author nguye
 */
public class hendle_duocKhenThuong {
    hendle_KhenThuong_to_sv main_dkt = new hendle_KhenThuong_to_sv();
    public boolean createDKT(Duoc d) {
        return main_dkt.Create(d);
    }
    public boolean updateDKT(Duoc d) {
        return main_dkt.Update(d);
    }
    public boolean deleteDKT(String id) {
        return main_dkt.Delete(id);
    }
    public ResultSet getData() {
        return main_dkt.getData();
    }
    public ArrayList<String> getMaKT() {
        return main_dkt.getMaKT();
    }
   
}
