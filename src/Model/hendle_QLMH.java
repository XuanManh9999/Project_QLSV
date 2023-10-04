/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.Giao_Vien;
import DAO.MonHoc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguye
 */
public class hendle_QLMH implements CRUD<DAO.MonHoc>{
    private static  java.sql.Connection conn = Connect_DB.ConnectDB();
    @Override
    public boolean Create(MonHoc mh) {
         try {
            String query = String.format("insert into mon_hoc values ('%s', '%s', %d, '%s', '%s')", mh.getMaMH(), mh.getTenMH(), mh.getSoTC(), mh.getThuocKhoa(), mh.getMaDT());
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        } catch (SQLException ex) {
                    return false; 
//            Logger.getLogger(hendle_QL_SV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<DAO.MonHoc> Read() {
        try {
            ArrayList<DAO.MonHoc> dsmh = new ArrayList<DAO.MonHoc>();
            String query = "select * from mon_hoc";
            var st = conn.createStatement();
            var rs = st.executeQuery(query);
//            Connect_DB.closeConnectDB();
            while (rs.next()) {
                DAO.MonHoc monHoc = new DAO.MonHoc(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),  rs.getString(5));
                dsmh.add(monHoc);
            }
            return dsmh;
        } catch (SQLException ex) {
            Logger.getLogger(hendle_QL_SV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean Update(MonHoc mh) {
        try {
            String query = String.format("update  mon_hoc set tenMH = '%s', sotc = %d, thuockhoa = '%s', madt = '%s' where mamh = '%s'", 
            mh.getTenMH(), mh.getSoTC(), mh.getThuocKhoa(),  mh.getMaDT(), mh.getMaMH());
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        } catch (SQLException ex) {
                    return false; 
//            Logger.getLogger(hendle_QL_SV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean Delete(String id) {
         try {
            String query = String.format("delete from mon_hoc where mamh = '%s'", id);
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        } catch (SQLException ex) {
                    return false;
        }
    }
    public ArrayList<String> getCTDT() {
        try {
            String query = "select madt from chuong_trinh_dao_tao";
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
            String query = "select madt from chuong_trinh_dao_tao";
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
    public ArrayList<MonHoc> Search(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
