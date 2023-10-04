/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.MonHoc;
import Model.hendle_QLMH;
import java.util.ArrayList;
/**
 *
 * @author nguye
 */
public class hendle_qlmh_controllor {
    hendle_QLMH qlmh = new hendle_QLMH();
    public boolean CreateMH(MonHoc mh) {
        return qlmh.Create(mh);
    }
    public boolean UpdateMH(MonHoc mh) {
        return qlmh.Update(mh);
    }
    public boolean DeleteMH(String mh) {
        return qlmh.Delete(mh);
    }
    public ArrayList<String> getCTDT() {
        return qlmh.getCTDT();
    }
    public ArrayList<DAO.MonHoc> ReadDL() {
        return qlmh.Read();
    }
}
