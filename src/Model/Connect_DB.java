/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class Connect_DB {
     private static  java.sql.Connection conn;
      public static java.sql.Connection ConnectDB() {
         try { 
//            Class.forName("com.sun.jdi.connect.spi.Connection");
             conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/dbqlsv?useSSL=false", "root", "");
             System.out.println("Connect Done");
             return conn;
        }catch(Exception e) {
            e.printStackTrace();
        }
         return null;
    }
    public static void closeConnectDB() {
        conn = null;
    }
}
