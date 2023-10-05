/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.hendle_QL_LichThi;
import DAO.Lich_Thi;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author nguye
 */
public class hendle_QLLT {
    hendle_QL_LichThi main_lt = new hendle_QL_LichThi();
      public  boolean createLT(Lich_Thi lt) {
        return main_lt.Create(lt);
    }
    public ResultSet getData() {
        return main_lt.Read_data();
    }
    public boolean deleteLT(String id) {
        return main_lt.Delete(id);
    }
    public  boolean updateLT(Lich_Thi lt) {
        return main_lt.Update(lt);
    }
    
    public ArrayList<String> getMaMH() {
        return main_lt.getMaMH();
    }
    public ResultSet search_TheoMaLT(String id) {
        return main_lt.Search_maLT(id);
    }
    public ResultSet search_TheoTenMon(String id) {
        return main_lt.Search_tenMon(id);
    }
}
