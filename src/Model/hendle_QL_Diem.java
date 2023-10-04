/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.Diem;
import com.mysql.cj.protocol.Resultset;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
/**
 *
 * @author nguye
 */
public class hendle_QL_Diem implements CRUD<Diem>{
    private static  java.sql.Connection conn = Connect_DB.ConnectDB();
    @Override
    public boolean Create(Diem obj) {
        try {
            String query = String.format("INSERT into diem VALUES('%s', '%s', '%s', %d, '%s', '%s')", obj.getMaDiem(), obj.getMaMH(), obj.getMaSV(), obj.getThangDiem10(), obj.getThangDiemChu(), obj.getGhiChu());
            var st= conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch (Exception ex) {
           return false;
        }
    }

    @Override
    public ArrayList<Diem> Read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public ResultSet Read_data() {
        try {
            var st = conn.createStatement();
            String query = "select DISTINCT sinh_vien.maSV, sinh_vien.hoTen,  mon_hoc.maMH, mon_hoc.tenMH, diem.maDiem, diem.thangDiem10, diem.thangDiemChu, diem.ghiChu from diem \n" +
"INNER JOIN mon_hoc on diem.maMH = mon_hoc.maMH\n" +
"INNER JOIN sinh_vien on diem.masv = sinh_vien.maSV";
            var data = st.executeQuery(query);
            return  data;
        } catch (SQLException ex) {
            Logger.getLogger(hendle_QL_Diem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public boolean Update(Diem obj) {
        try {
            String query = String.format("UPDATE diem set maMH = '%s', masv = '%s', thangDiem10 = %d, thangDiemChu = '%s', ghichu = '%s' where maDiem = '%s'",  obj.getMaMH(), obj.getMaSV(), obj.getThangDiem10(), obj.getThangDiemChu(), obj.getGhiChu(), obj.getMaDiem());
            var st= conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch (Exception ex) {
           return false;
        }
    }

    @Override
    public boolean Delete(String id) {
       try {
            String query = String.format("delete from diem where madiem = '%s'", id);
            var st= conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch (Exception ex) {
           return false;
        }
    }
    public ArrayList<String> getMSV() {
        try {
            String query = "select masv from sinh_vien";
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
   
    @Override
    public ArrayList<Diem> Search(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
