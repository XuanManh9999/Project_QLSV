/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import DAO.dang_ky;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
/**
 *
 * @author nguye
 */
public class hendle_DKHoc implements CRUD<dang_ky>{
    private static  java.sql.Connection conn = Connect_DB.ConnectDB();
    @Override
    public boolean Create(dang_ky obj) {
        try {
            String query = String.format("insert into dang_ky values('%s', '%s')", obj.getMaSV(), obj.getMaMH());
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        } catch (SQLException ex) {
            Logger.getLogger(hendle_DKHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ArrayList<dang_ky> Read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Update(dang_ky obj) {
         try {
            String query = String.format("update dang_ky set mamh = '%s' where masv = '%s'", obj.getMaMH(), obj.getMaSV());
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        } catch (SQLException ex) {
            Logger.getLogger(hendle_DKHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean Delete(String id) {
         try {
            String query = String.format("delete from dang_ky where masv = '%s'", id);
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        } catch (SQLException ex) {
            Logger.getLogger(hendle_DKHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public ResultSet getData() {
        try {
        String query = "select DISTINCT sinh_vien.maSV, sinh_vien.hoTen, mon_hoc.maMH, mon_hoc.tenMH from sinh_vien \n" +
        "INNER JOIN dang_ky on sinh_vien.maSV = dang_ky.maSV \n" +
        "INNER JOIN mon_hoc on dang_ky.maMH = mon_hoc.maMH";
            var st = conn.createStatement();
            return st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(hendle_DKHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     public ArrayList<String> getMaMH() {
        try {
            String query = "select mamh from mon_hoc";
            ArrayList<String> dsMACTDT = new ArrayList<String>();
            var st = conn.createStatement();
            var rs = st.executeQuery(query);
            while (rs.next()) {
                dsMACTDT.add(rs.getString(1));
            }
            return dsMACTDT;
        }catch (Exception ex) {
            return null;
        }
    }
    public ArrayList<dang_ky> Search(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
