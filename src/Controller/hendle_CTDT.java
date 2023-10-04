/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.ChuongTrinhDaoTao;
import java.util.ArrayList;
/**
 *
 * @author nguye
 */
public class hendle_CTDT {
    Model.hendle_CTDT ct = new Model.hendle_CTDT();
      public  boolean createCTDT(ChuongTrinhDaoTao ctdt) {
        return ct.Create(ctdt);
    }
    public  ArrayList<ChuongTrinhDaoTao> readCTDT() {
        return ct.Read();
    }
    public boolean deleteCTDT(String id) {
        return ct.Delete(id);
    }
    public  boolean updateCTDT(ChuongTrinhDaoTao ctdt) {
        return ct.Update(ctdt);
    }
}
