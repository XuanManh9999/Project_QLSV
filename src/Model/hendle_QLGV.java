/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.Giao_Vien;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguye
 */
public class hendle_QLGV implements CRUD<Giao_Vien>{
    private static  java.sql.Connection conn = Connect_DB.ConnectDB();
    @Override
    public boolean Create(Giao_Vien gv) {
         try {
            String query = String.format("insert into giaovien values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')", gv.getMa(), gv.getHoTen(), gv.getNgaySinh(), gv.getDiaChi(), gv.getGioiTinh(), gv.getTrinhDo(), gv.getEmail(), gv.getSdt());
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        } catch (SQLException ex) {
                    return false; 
//            Logger.getLogger(hendle_QL_SV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Giao_Vien> Read() {
        try {
            ArrayList<Giao_Vien> dsGV = new ArrayList<Giao_Vien>();
            String query = "select * from giaovien";
            var st = conn.createStatement();
            var rs = st.executeQuery(query);
//            Connect_DB.closeConnectDB();
            while (rs.next()) {
                Giao_Vien s = new Giao_Vien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8));
                dsGV.add(s);
            }
            return dsGV;
        } catch (SQLException ex) {
            Logger.getLogger(hendle_QL_SV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean Update(Giao_Vien gv) {
        try {
            String query = String.format("update  giaovien set hoTen = '%s', ngaySinh = '%s', gioiTinh = '%s', diaChi = '%s', trinhDo = '%s', email = '%s', sdt = '%s' where magv = '%s'", 
            gv.getHoTen(), gv.getNgaySinh(),  gv.getGioiTinh(), gv.getDiaChi(), gv.getTrinhDo(), gv.getEmail(), gv.getSdt(), gv.getMa());
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
            String query = String.format("delete from giaovien where magv = '%s'", id);
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        } catch (SQLException ex) {
                    return false;
        }
    }

    @Override
    public ArrayList<Giao_Vien> Search(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}