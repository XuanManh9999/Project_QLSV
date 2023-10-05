/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import DAO.Duoc;
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
public class hendle_KhenThuong_to_sv implements CRUD<Duoc>{
    private static  java.sql.Connection conn = Connect_DB.ConnectDB();
    @Override
    public boolean Create(Duoc obj) {
        try {
            String query = String.format("insert into duoc values ('%s', '%s')", obj.getMaSV(), obj.getMaKT()) ;
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch(Exception ex) {
            return false;
        }
    }

    @Override
    public ArrayList<Duoc> Read() {
        
        return null;
    }
    public ResultSet getData() {
        try {
            var query = "select DISTINCT sinh_vien.maSV, sinh_vien.hoTen, khen_thuong.maKT, khen_thuong.danhHieu, khen_thuong.ngayKhenThuong from sinh_vien\n" +
"            INNER JOIN duoc on sinh_vien.maSV = duoc.maSV\n" +
"            INNER JOIN khen_thuong on duoc.maKT = khen_thuong.maKT";
            var st = conn.createStatement();
            var ds = st.executeQuery(query);
            return ds;
        } catch (SQLException ex) {
            Logger.getLogger(hendle_KhenThuong_to_sv.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public boolean Update(Duoc obj) {
        try {
            String query = String.format("update  duoc set  makt = '%s' where masv = '%s'",  obj.getMaKT(), obj.getMaSV()) ;
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch(Exception ex) {
            return false;
        }
    }

    @Override
    public boolean Delete(String id) {
        try {
            String query = String.format("delete from duoc where masv = '%s'",  id) ;
            var st = conn.createStatement();
            return st.executeUpdate(query) > 0;
        }catch(Exception ex) {
            return false;
        }
    }
    public ArrayList<String> getMaKT() {
           try {
               String query = "select makt from khen_thuong";
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
    public ArrayList<Duoc> Search(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
