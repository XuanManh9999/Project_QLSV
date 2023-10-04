/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguye
 */
import View.pnLogin;
import View.pnTrangChu;
import View.pnChuongTrinhDaoTao;
import View.pnQuanLyGiaoVien;
public class RunAPP {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new pnLogin().setVisible(true);
            }
        });
    }
}
