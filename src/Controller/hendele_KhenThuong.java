/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.KhenThuong;
import Model.hendle_KhenThuong;
import java.util.ArrayList;
/**
 *
 * @author nguye
 */
public class hendele_KhenThuong {
    hendle_KhenThuong main_kt = new hendle_KhenThuong();
    public boolean createKT(KhenThuong kt) {
        return main_kt.Create(kt);
    }
     public boolean updateKT(KhenThuong kt) {
        return main_kt.Update(kt);
    }
      public boolean deleteKT(String id) {
        return main_kt.Delete(id);
    }
      public  ArrayList<KhenThuong> getData() {
          return main_kt.Read();
      }
}
