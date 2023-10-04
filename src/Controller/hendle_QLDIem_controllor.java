/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.Diem;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author nguye
 */
public class hendle_QLDIem_controllor {
    Model.hendle_QL_Diem qldiem = new Model.hendle_QL_Diem();
      public  boolean createDiem(Diem ctdt) {
        return qldiem.Create(ctdt);
    }
    public ResultSet getData() {
        return qldiem.Read_data();
    }
    public boolean deleteDiem(String id) {
        return qldiem.Delete(id);
    }
    public  boolean updateDiem(Diem ctdt) {
        return qldiem.Update(ctdt);
    }
    public ArrayList<String> getMSV() {
        return qldiem.getMSV();
    }
    public ArrayList<String> getMaMH() {
        return qldiem.getMaMH();
    }
}
