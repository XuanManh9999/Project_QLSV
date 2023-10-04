/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import DAO.Sinh_Vien;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.Result;
import java.sql.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author nguye
 */
public class hendle_QL_SV implements CRUD<Sinh_Vien>{
    private static  java.sql.Connection conn = Connect_DB.ConnectDB();
    // CRUD
    @Override
    public boolean Create(Sinh_Vien sv) {
         try {
            String query = String.format("insert into sinh_vien values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')", sv.getMa(), sv.getHoTen(), sv.getNgaySinh() , sv.getDiaChi(), sv.getGioiTinh(), sv.getEmail(), sv.getSdt(), sv.getTrangThai(), sv.getMaDT());
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        } catch (SQLException ex) {
                    return false; 
//            Logger.getLogger(hendle_QL_SV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Sinh_Vien> Read() {
        try {
            ArrayList<Sinh_Vien> dsSV = new ArrayList<Sinh_Vien>();
            String query = "select * from sinh_vien";
            var st = conn.createStatement();
            var rs = st.executeQuery(query);
            Connect_DB.closeConnectDB();
            while (rs.next()) {
                Sinh_Vien s = new Sinh_Vien(rs.getString(1), rs.getString(2), rs.getDate(3).toString(), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9));
                dsSV.add(s);
            }
            return dsSV;
        } catch (SQLException ex) {
            Logger.getLogger(hendle_QL_SV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean Update(Sinh_Vien sv) {
        try {
            String query = String.format("update  sinh_vien set hoTen = '%s', ngaySinh = '%s', gioiTinh = '%s', diaChi = '%s', email = '%s', sdt = '%s', trangThai = '%s', maDT = '%s' where masv = '%s'", 
            sv.getHoTen(), sv.getNgaySinh(),  sv.getDiaChi(), sv.getGioiTinh(), sv.getEmail(), sv.getSdt(), sv.getTrangThai(), sv.getMaDT(), sv.getMa());
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
            String query = String.format("delete from sinh_vien where masv = '%s'", id);
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        } catch (SQLException ex) {
                    return false;
        }
    }

    @Override
    public ArrayList<Sinh_Vien> Search(String id) {
        try {
            ArrayList<Sinh_Vien> dsSV = new ArrayList<Sinh_Vien>();
            String query = String.format("select * from sinh_vien where masv = '%s'", id);
            var st = conn.createStatement();
            var rs = st.executeQuery(query);
            Connect_DB.closeConnectDB();
            while (rs.next()) {
                Sinh_Vien s = new Sinh_Vien(rs.getString(1), rs.getString(2), rs.getDate(3).toString(), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9));
                dsSV.add(s);
            }
            return dsSV;
        } catch (SQLException ex) {
            Logger.getLogger(hendle_QL_SV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     public ArrayList<Sinh_Vien> Search_name(String id) {
        try {
            ArrayList<Sinh_Vien> dsSV = new ArrayList<Sinh_Vien>();
            String query = String.format("SELECT * FROM sinh_vien WHERE hoTen LIKE '%%%s%%'", id);
            var st = conn.createStatement();
            var rs = st.executeQuery(query);
            Connect_DB.closeConnectDB();
            while (rs.next()) {
                Sinh_Vien s = new Sinh_Vien(rs.getString(1), rs.getString(2), rs.getDate(3).toString(), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9));
                dsSV.add(s);
            }
            return dsSV;
        } catch (SQLException ex) {
            Logger.getLogger(hendle_QL_SV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     public ArrayList<String> getMaDT() {
          try {
            ArrayList<String> maDT = new ArrayList<String>();
            String query = "SELECT madt FROM chuong_trinh_dao_tao";
            var st = conn.createStatement();
            var rs = st.executeQuery(query);
            Connect_DB.closeConnectDB();
            while (rs.next()) {
                maDT.add(rs.getString(1));
            }
            return maDT;
        } catch (SQLException ex) {
            Logger.getLogger(hendle_QL_SV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
     }
    
}
