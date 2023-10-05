/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.Lich_Thi;
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
public class hendle_QL_LichThi implements CRUD<Lich_Thi>{
    private static  java.sql.Connection conn = Connect_DB.ConnectDB();
    @Override
    public boolean Create(Lich_Thi obj) {
        try {
            String query = String.format("INSERT into lich_thi VALUES('%s', '%s', '%s', '%s', '%s')", obj.getMaLT(), obj.getNgayThi(), obj.getPhongThi(), obj.getHinhThucThi(), obj.getMaMH());
            var st= conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch (Exception ex) {
           return false;
        }
    }

    @Override
    public ArrayList<Lich_Thi> Read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public ResultSet Read_data() {
        try {
            var st = conn.createStatement();
            String query = "select mon_hoc.maMH, mon_hoc.tenMH, mon_hoc.soTC, mon_hoc.thuocKhoa, lich_thi.maLT, lich_thi.ngayThi, lich_thi.phongThi, lich_thi.hinhThucThi from mon_hoc \n" +
"INNER JOIN lich_thi on mon_hoc.maMH = lich_thi.maMH";
            var data = st.executeQuery(query);
            return  data;
        } catch (SQLException ex) {
            Logger.getLogger(hendle_QL_LichThi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public boolean Update(Lich_Thi obj) {
        try {
            String query = String.format("UPDATE lich_thi set ngaythi = '%s', phongthi = '%s', hinhthucthi = '%s', mamh = '%s' where malt = '%s'",   obj.getNgayThi(), obj.getPhongThi(), obj.getHinhThucThi(), obj.getMaMH(), obj.getMaLT());
            var st= conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch (Exception ex) {
           return false;
        }
    }

    @Override
    public boolean Delete(String id) {
       try {
            String query = String.format("delete from lich_thi where malt = '%s'", id);
            var st= conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch (Exception ex) {
           return false;
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
    public ArrayList<Lich_Thi> Search(String id) {
         
        return null;
         
    }
    public ResultSet Search_tenMon(String id) {
         try {
            String query = String.format("select mon_hoc.maMH, mon_hoc.tenMH, mon_hoc.soTC, mon_hoc.thuocKhoa, lich_thi.maLT, lich_thi.ngayThi, lich_thi.phongThi, lich_thi.hinhThucThi from lich_thi \n" +
"INNER JOIN mon_hoc on lich_thi.maMH = mon_hoc.maMH where mon_hoc.tenMH like '%%%s%%';", id);
            var st = conn.createStatement();
            var rs = st.executeQuery(query);
            return rs;
        }catch (Exception ex) {
            return null;
        }
    }
    public ResultSet Search_maLT(String id) {
         try {
            String query = String.format("select mon_hoc.maMH, mon_hoc.tenMH, mon_hoc.soTC, mon_hoc.thuocKhoa, lich_thi.maLT, lich_thi.ngayThi, lich_thi.phongThi, lich_thi.hinhThucThi from lich_thi \n" +
"INNER JOIN mon_hoc on lich_thi.maMH = mon_hoc.maMH where lich_thi.maLT = '%s'", id);
            var st = conn.createStatement();
            var rs = st.executeQuery(query);
            return rs;
        }catch (Exception ex) {
            return null;
        }
    }
}
