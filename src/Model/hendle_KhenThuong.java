/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import DAO.KhenThuong;
import java.util.ArrayList;
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
public class hendle_KhenThuong implements CRUD<KhenThuong>{
    private static  java.sql.Connection conn = Connect_DB.ConnectDB();
    @Override
    public boolean Create(KhenThuong obj) {
        try {
            String query = String.format("insert into khen_thuong values ('%s', '%s', '%s')", obj.getMaKT(), obj.getDanhHieu(), obj.getNgayKhenThuong()) ;
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch(Exception ex) {
            return false;
        }
    }

    @Override
    public ArrayList<KhenThuong> Read() {
        try {
            var query = "select * from khen_thuong";
            ArrayList<KhenThuong> dskt = new  ArrayList<KhenThuong>();
            var st = conn.createStatement();
            var ds = st.executeQuery(query);
            while (ds.next()) {
                KhenThuong kt = new KhenThuong(ds.getString(1), ds.getString(2), ds.getDate(3).toString());
                dskt.add(kt);
            }
            return dskt;
        } catch (SQLException ex) {
            Logger.getLogger(hendle_KhenThuong.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public boolean Update(KhenThuong obj) {
        try {
            String query = String.format("update  khen_thuong set danhhieu = '%s', ngaykhenthuong = '%s' where makt = '%s'",  obj.getDanhHieu(), obj.getNgayKhenThuong(), obj.getMaKT()) ;
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch(Exception ex) {
            return false;
        }
    }

    @Override
    public boolean Delete(String id) {
        try {
            String query = String.format("delete from khen_thuong where makt = '%s'",  id) ;
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch(Exception ex) {
            return false;
        }
    }

    @Override
    public ArrayList<KhenThuong> Search(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
