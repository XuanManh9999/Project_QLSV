/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.ChuongTrinhDaoTao;
import DAO.Sinh_Vien;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class hendle_CTDT  implements CRUD<DAO.ChuongTrinhDaoTao>{
    private static  java.sql.Connection conn = Connect_DB.ConnectDB();

    @Override
    public boolean Create(ChuongTrinhDaoTao obj) {
        try {
            String query = String.format("insert into chuong_trinh_dao_tao values ('%s', '%s', '%s', '%s')", obj.getMaDT(), obj.getTenCT(), obj.getKhoa(), obj.getThoiGian());
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        } catch (SQLException ex) {
                    return false; 
//            Logger.getLogger(hendle_QL_SV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ChuongTrinhDaoTao> Read() {
        try {
            ArrayList<ChuongTrinhDaoTao> ctdt = new ArrayList<ChuongTrinhDaoTao>();
            String query = "select * from chuong_trinh_dao_tao";
            var st = conn.createStatement();
            var rs = st.executeQuery(query);
            Connect_DB.closeConnectDB();
            while (rs.next()) {
                ChuongTrinhDaoTao s = new ChuongTrinhDaoTao(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                ctdt.add(s);
            }
            return ctdt;
        } catch (SQLException ex) {
            Logger.getLogger(hendle_QL_SV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean Update(ChuongTrinhDaoTao obj) {
                try {
            String query = String.format("update  chuong_trinh_dao_tao set tenct = '%s', khoa = '%s', thoigian = '%s' where madt = '%s'", 
            obj.getTenCT(), obj.getKhoa(), obj.getThoiGian(), obj.getMaDT());
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
            String query = String.format("delete from chuong_trinh_dao_tao where maDT = '%s'", id);
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        } catch (SQLException ex) {
                    return false;
        }
    }

    @Override
    public ArrayList<ChuongTrinhDaoTao> Search(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
