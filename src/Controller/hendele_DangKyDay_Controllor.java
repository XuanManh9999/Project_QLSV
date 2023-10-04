/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.day;
import Model.hendle_GV_DK_DAY;
import java.sql.ResultSet;
/**
 *
 * @author nguye
 */
public class hendele_DangKyDay_Controllor {
    hendle_GV_DK_DAY dkday = new hendle_GV_DK_DAY();
    public boolean createDKDAY(day d) {
        return dkday.Create(d);
    }
    public boolean updateDKDAY(day d) {
        return dkday.Update(d);
    }
    public boolean deleteDKDAY(String id) {
        return dkday.Delete(id);
    }
    public ResultSet GetDaTA() {
        return dkday.getData();
    }
}
