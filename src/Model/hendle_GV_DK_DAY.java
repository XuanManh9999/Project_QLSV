/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.dang_ky;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author nguye
 */
public class hendle_GV_DK_DAY implements CRUD<DAO.day>{
    private static  java.sql.Connection conn = Connect_DB.ConnectDB();
    @Override
    public boolean Create(DAO.day obj) {
        try {
            String query = String.format("insert into day values ('%s', '%s')", obj.getMaGV(), obj.getMaMH());
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch (Exception ex) {
            return false;
        }
    }

    @Override
    public ArrayList<DAO.day> Read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public ResultSet getData() {
        try {
            String query = "select DISTINCT giaovien.maGV, giaovien.hoTen, giaovien.ngaySinh, mon_hoc.maMH, mon_hoc.tenMH from giaovien \n" +
            "INNER JOIN day on giaovien.maGV = day.maGV\n" +
            "INNER JOIN mon_hoc on mon_hoc.maMH = day.maMH";
            var st = conn.createStatement();
            return st.executeQuery(query);
        }catch (Exception ex) {
            return null;
        }
    }
    @Override
    public boolean Update(DAO.day obj) {
        try {
            String query = String.format("update day set mamh = '%s' where magv = '%s'", obj.getMaMH(), obj.getMaGV());
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch (Exception ex) {
            return false;
        }
    }

    @Override
    public boolean Delete(String id) {
        try {
            String query = String.format("delete from day where magv = '%s'", id);
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch (Exception ex) {
            return false;
        }
    }

    @Override
    public ArrayList<DAO.day> Search(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
